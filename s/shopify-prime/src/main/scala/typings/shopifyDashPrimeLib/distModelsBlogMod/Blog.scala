package typings
package shopifyDashPrimeLib.distModelsBlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blog
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * Indicates whether readers can post comments to the blog and if comments are moderated or not. Possible values are:
    * "no" (default): Readers cannot post comments to blog articles.
    * "moderate": Readers can post comments to blog articles, but comments must be moderated before they appear.
    * "yes": Readers can post comments to blog articles without moderation.
    */
  var commentable: js.UndefOr[shopifyDashPrimeLib.distEnumsBlogUnderscoreCommentableMod.BlogCommentable] = js.undefined
  /**
    * The date and time the blog was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Feedburner is a web feed management provider and can be enabled to provide custom RSS feeds for Shopify bloggers. This property will default to blank or null unless feedburner is enabled through the shop admin.
    * Shopify does not document the value type for this property.
    */
  var feedburner: js.UndefOr[js.Any] = js.undefined
  /**
    * URL to the feedburner location for blogs that have enabled feedburner through their store admin.
    */
  var feedburner_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-friendly unique string for a blog automatically generated from its title. This handle is used by the Liquid templating language to refer to the blog.
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[java.lang.String] = js.undefined
  /**
    * States the name of the template a blog is using if it is using an alternate template. If a blog is using the default blog.liquid template, the value returned is "null".
    */
  var template_suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the blog.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when changes were last made to the blog's properties. Note that this is not updated when creating, modifying or deleting articles in the blog.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object Blog {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    commentable: shopifyDashPrimeLib.distEnumsBlogUnderscoreCommentableMod.BlogCommentable = null,
    created_at: java.lang.String = null,
    feedburner: js.Any = null,
    feedburner_url: java.lang.String = null,
    handle: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    tags: java.lang.String = null,
    template_suffix: java.lang.String = null,
    title: java.lang.String = null,
    updated_at: java.lang.String = null
  ): Blog = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (commentable != null) __obj.updateDynamic("commentable")(commentable.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (feedburner != null) __obj.updateDynamic("feedburner")(feedburner)
    if (feedburner_url != null) __obj.updateDynamic("feedburner_url")(feedburner_url)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[Blog]
  }
}

