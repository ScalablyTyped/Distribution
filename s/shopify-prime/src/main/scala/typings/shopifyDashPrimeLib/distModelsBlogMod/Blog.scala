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

