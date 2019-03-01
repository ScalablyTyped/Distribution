package typings
package shopifyDashPrimeLib.distModelsArticleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Article
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The name of the author of this article
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A unique numeric identifier for the blog containing the article.
    */
  var blog_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text of the body of the article, complete with HTML markup.
    */
  var body_html: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when the article was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-friendly unique string for an article automatically generated from its title. It is used in the article's URL.
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The article image.
    */
  var image: js.UndefOr[shopifyDashPrimeLib.distModelsArticleUnderscoreImageMod.ArticleImage] = js.undefined
  /**
    * States whether or not the article is visible.
    */
  var published: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The date and time when the article was published.
    */
  var published_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text of the summary of the article, complete with HTML markup.
    */
  var summary_html: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[java.lang.String] = js.undefined
  /**
    * States the name of the template an article is using if it is using an alternate template. If an article is using the default article.liquid template, the value returned is null.
    */
  var template_suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the article.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when the article was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A unique numeric identifier for the author of the article.
    */
  var user_id: js.UndefOr[scala.Double] = js.undefined
}

object Article {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    author: java.lang.String = null,
    blog_id: scala.Int | scala.Double = null,
    body_html: java.lang.String = null,
    created_at: java.lang.String = null,
    handle: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    image: shopifyDashPrimeLib.distModelsArticleUnderscoreImageMod.ArticleImage = null,
    published: js.UndefOr[scala.Boolean] = js.undefined,
    published_at: java.lang.String = null,
    summary_html: java.lang.String = null,
    tags: java.lang.String = null,
    template_suffix: java.lang.String = null,
    title: java.lang.String = null,
    updated_at: java.lang.String = null,
    user_id: scala.Int | scala.Double = null
  ): Article = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (author != null) __obj.updateDynamic("author")(author)
    if (blog_id != null) __obj.updateDynamic("blog_id")(blog_id.asInstanceOf[js.Any])
    if (body_html != null) __obj.updateDynamic("body_html")(body_html)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    if (published_at != null) __obj.updateDynamic("published_at")(published_at)
    if (summary_html != null) __obj.updateDynamic("summary_html")(summary_html)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Article]
  }
}

