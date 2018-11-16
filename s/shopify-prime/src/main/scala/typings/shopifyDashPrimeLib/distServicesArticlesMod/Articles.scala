package typings
package shopifyDashPrimeLib.distServicesArticlesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/articles", "Articles")
@js.native
class Articles protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Counts the articles on the given blog.
       * @param blogId Id of the blog that the articles belong to.
       * @param options Options for filtering the results.
       */
  def count(blogId: scala.Double): stdLib.Promise[scala.Double] = js.native
  /**
       * Counts the articles on the given blog.
       * @param blogId Id of the blog that the articles belong to.
       * @param options Options for filtering the results.
       */
  def count(
    blogId: scala.Double,
    options: shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.PublishedOptions
  ): stdLib.Promise[scala.Double] = js.native
  /**
       * Creates a new article.
       * @param blogId Id of the blog that the article will belong to.
       * @param article The article being created.
       */
  def create(blogId: scala.Double, article: shopifyDashPrimeLib.distModelsArticleMod.Article): stdLib.Promise[shopifyDashPrimeLib.distModelsArticleMod.Article] = js.native
  /**
       * Deletes the article with the given id.
       * @param blogId Id of the blog that the article belongs to.
       * @param articleId Id of the article to delete.
       */
  def delete(blogId: scala.Double, articleId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Gets an article with the given id.
       * @param blogId Id of the blog that the article belongs to.
       * @param articleId Id of the article being retrieved.
       * @param options Options for filtering the result.
       */
  def get(blogId: scala.Double, articleId: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsArticleMod.Article] = js.native
  /**
       * Gets an article with the given id.
       * @param blogId Id of the blog that the article belongs to.
       * @param articleId Id of the article being retrieved.
       * @param options Options for filtering the result.
       */
  def get(
    blogId: scala.Double,
    articleId: scala.Double,
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsArticleMod.Article] = js.native
  /**
       * Lists up to 250 articles for the given blog.
       * @param blogId Id of the blog that the articles belong to.
       * @param options Options for filtering the results.
       */
  def list(blogId: scala.Double): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsArticleMod.Article]] = js.native
  /**
       * Lists up to 250 articles for the given blog.
       * @param blogId Id of the blog that the articles belong to.
       * @param options Options for filtering the results.
       */
  def list(
    blogId: scala.Double,
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.PublishedOptions with shopifyDashPrimeLib.distOptionsArticlesMod.ArticleListOptions
  ): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsArticleMod.Article]] = js.native
  /**
       * Gets a list of all article authors.
       */
  def listAuthors(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Gets a list of all article tags.
       * @param options Options for filtering the results.
       */
  def listTags(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Gets a list of all article tags.
       * @param options Options for filtering the results.
       */
  def listTags(options: shopifyDashPrimeLib.distOptionsArticlesMod.ArticleTagListOptions): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Gets a list of all article tags for the given blog.
       * @param blogId Id of the blog that the tags belong to.
       * @param options Options for filtering the results.
       */
  def listTagsForBlog(blogId: scala.Double): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Gets a list of all article tags for the given blog.
       * @param blogId Id of the blog that the tags belong to.
       * @param options Options for filtering the results.
       */
  def listTagsForBlog(blogId: scala.Double, options: shopifyDashPrimeLib.distOptionsArticlesMod.ArticleTagListOptions): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Updates an article with the given id.
       * @param blogId Id of the blog that the article belongs to.
       * @param articleId Id of the article to update.
       * @param article The updated article.
       */
  def update(
    blogId: scala.Double,
    articleId: scala.Double,
    article: shopifyDashPrimeLib.distModelsArticleMod.Article
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsArticleMod.Article] = js.native
}

