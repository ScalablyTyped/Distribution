package typings.shopifyDashPrime.distModelsArticleMod

import typings.shopifyDashPrime.distModelsArticleUnderscoreImageMod.ArticleImage
import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Article extends ShopifyObject {
  /**
    * The name of the author of this article
    */
  var author: js.UndefOr[String] = js.undefined
  /**
    * A unique numeric identifier for the blog containing the article.
    */
  var blog_id: js.UndefOr[Double] = js.undefined
  /**
    * The text of the body of the article, complete with HTML markup.
    */
  var body_html: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the article was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * A human-friendly unique string for an article automatically generated from its title. It is used in the article's URL.
    */
  var handle: js.UndefOr[String] = js.undefined
  /**
    * The article image.
    */
  var image: js.UndefOr[ArticleImage] = js.undefined
  /**
    * States whether or not the article is visible.
    */
  var published: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the article was published.
    */
  var published_at: js.UndefOr[String] = js.undefined
  /**
    * The text of the summary of the article, complete with HTML markup.
    */
  var summary_html: js.UndefOr[String] = js.undefined
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[String] = js.undefined
  /**
    * States the name of the template an article is using if it is using an alternate template. If an article is using the default article.liquid template, the value returned is null.
    */
  var template_suffix: js.UndefOr[String] = js.undefined
  /**
    * The title of the article.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the article was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * A unique numeric identifier for the author of the article.
    */
  var user_id: js.UndefOr[Double] = js.undefined
}

object Article {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    author: String = null,
    blog_id: Int | Double = null,
    body_html: String = null,
    created_at: String = null,
    handle: String = null,
    id: Int | Double = null,
    image: ArticleImage = null,
    published: js.UndefOr[Boolean] = js.undefined,
    published_at: String = null,
    summary_html: String = null,
    tags: String = null,
    template_suffix: String = null,
    title: String = null,
    updated_at: String = null,
    user_id: Int | Double = null
  ): Article = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (blog_id != null) __obj.updateDynamic("blog_id")(blog_id.asInstanceOf[js.Any])
    if (body_html != null) __obj.updateDynamic("body_html")(body_html.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (published_at != null) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (summary_html != null) __obj.updateDynamic("summary_html")(summary_html.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Article]
  }
}

