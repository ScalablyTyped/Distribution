package typings.shopifyPrime.blogMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.blogCommentableMod.BlogCommentable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blog extends ShopifyObject {
  /**
    * Indicates whether readers can post comments to the blog and if comments are moderated or not. Possible values are:
    * "no" (default): Readers cannot post comments to blog articles.
    * "moderate": Readers can post comments to blog articles, but comments must be moderated before they appear.
    * "yes": Readers can post comments to blog articles without moderation.
    */
  var commentable: js.UndefOr[BlogCommentable] = js.native
  /**
    * The date and time the blog was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Feedburner is a web feed management provider and can be enabled to provide custom RSS feeds for Shopify bloggers. This property will default to blank or null unless feedburner is enabled through the shop admin.
    * Shopify does not document the value type for this property.
    */
  var feedburner: js.UndefOr[js.Any] = js.native
  /**
    * URL to the feedburner location for blogs that have enabled feedburner through their store admin.
    */
  var feedburner_url: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for a blog automatically generated from its title. This handle is used by the Liquid templating language to refer to the blog.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * States the name of the template a blog is using if it is using an alternate template. If a blog is using the default blog.liquid template, the value returned is "null".
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The title of the blog.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when changes were last made to the blog's properties. Note that this is not updated when creating, modifying or deleting articles in the blog.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Blog {
  @scala.inline
  def apply(): Blog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blog]
  }
  @scala.inline
  implicit class BlogOps[Self <: Blog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommentable(value: BlogCommentable): Self = this.set("commentable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentable: Self = this.set("commentable", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setFeedburner(value: js.Any): Self = this.set("feedburner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedburner: Self = this.set("feedburner", js.undefined)
    @scala.inline
    def setFeedburner_url(value: String): Self = this.set("feedburner_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedburner_url: Self = this.set("feedburner_url", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplate_suffix(value: String): Self = this.set("template_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_suffix: Self = this.set("template_suffix", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

