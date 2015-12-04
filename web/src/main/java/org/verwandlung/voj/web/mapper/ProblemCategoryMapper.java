package org.verwandlung.voj.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;

import org.verwandlung.voj.web.model.ProblemCategory;

/**
 * ProblemCategory Data Access Object.
 * 
 * @author Xie Haozhe
 */
@CacheNamespace(implementation = org.mybatis.caches.ehcache.EhcacheCache.class)
public interface ProblemCategoryMapper {
	/**
	 * 获取全部的试题分类.
	 * @return 包含全部试题分类的列表
	 */
	public List<ProblemCategory> getProblemCategories();
	
    /**
     * 通过试题分类的唯一标识符获取试题分类对象.
     * @param problemCategoryId - 试题分类的唯一标识符
     * @return 预期的试题分类对象或空引用
     */
    public ProblemCategory getProblemCategoryUsingId(int problemCategoryId);
    
    /**
     * 通过试题分类的唯一英文缩写获取试题分类对象.
     * @param problemCategorySlug - 试题分类的唯一英文缩写
     * @return 预期的试题分类对象或空引用
     */
    public ProblemCategory getProblemCategoryUsingSlug(String problemCategorySlug);
    
    /**
     * 创建试题分类对象.
     * @param problemCategory - 待创建的试题分类对象
     */
    public void createProblemCategory(ProblemCategory problemCategory);
    
    /**
     * 更新试题分类对象.
     * @param problemCategory - 待更新的试题分类对象
     */
    public void updateProblemCategory(ProblemCategory problemCategory);
    
    /**
     * 删除试题分类对象.
     * @param problemCategoryId - 待删除试题分类对象的唯一标识符
     */
    public void deleteProblemCategory(int problemCategoryId);
}