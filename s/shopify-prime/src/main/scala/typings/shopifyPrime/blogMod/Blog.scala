package typings.shopifyPrime.blogMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.blogCommentableMod.BlogCommentable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blog extends ShopifyObject {
  /**
    * Indicates whether readers can post comments to the blog and if comments are moderated or not. Possible values are:
    * "no" (default): Readers cannot post comments to blog articles.
    * "moderate": Readers can post comments to blog articles, but comments must be moderated before they appear.
    * "yes": Readers can post comments to blog articles without moderation.
    */
  var commentable: js.UndefOr[BlogCommentable] = js.undefined
  /**
    * The date and time the blog was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * Feedburner is a web feed management provider and can be enabled to provide custom RSS feeds for Shopify bloggers. This property will default to blank or null unless feedburner is enabled through the shop admin.
    * Shopify does not document the value type for this property.
    */
  var feedburner: js.UndefOr[js.Any] = js.undefined
  /**
    * URL to the feedburner location for blogs that have enabled feedburner through their store admin.
    */
  var feedburner_url: js.UndefOr[String] = js.undefined
  /**
    * A human-friendly unique string for a blog automatically generated from its title. This handle is used by the Liquid templating language to refer to the blog.
    */
  var handle: js.UndefOr[String] = js.undefined
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[String] = js.undefined
  /**
    * States the name of the template a blog is using if it is using an alternate template. If a blog is using the default blog.liquid template, the value returned is "null".
    */
  var template_suffix: js.UndefOr[String] = js.undefined
  /**
    * The title of the blog.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The date and time when changes were last made to the blog's properties. Note that this is not updated when creating, modifying or deleting articles in the blog.
    */
  var updated_at: js.UndefOr[String] = js.undefined
}

object Blog {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    commentable: BlogCommentable = null,
    created_at: String = null,
    feedburner: js.Any = null,
    feedburner_url: String = null,
    handle: String = null,
    id: js.UndefOr[Double] = js.undefined,
    tags: String = null,
    template_suffix: String = null,
    title: String = null,
    updated_at: String = null
  ): Blog = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (commentable != null) __obj.updateDynamic("commentable")(commentable.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (feedburner != null) __obj.updateDynamic("feedburner")(feedburner.asInstanceOf[js.Any])
    if (feedburner_url != null) __obj.updateDynamic("feedburner_url")(feedburner_url.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blog]
  }
}

