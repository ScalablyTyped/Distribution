package typings.shopifyPrime.productCollectionMod

import typings.shopifyPrime.anon.Attachment
import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCollection extends ShopifyObject {
  /**
    * The description of the collection, complete with HTML markup. Many templates
    * display this on their collection pages.
    */
  var body_html: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for the collection automatically generated from its title. This is used in shop themes by the Liquid templating language to refer to the collection. Limit of 255 characters.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Image associated with the collection. Valid values are:
    * - attachment: An image attached to a shop's theme returned as Base64-encoded binary data.
    * - src: Source URL that specifies the location of the image.
    */
  var image: js.UndefOr[Attachment] = js.native
  /**
    * This can have two different types of values, depending on whether the collection has been published (i.e., made visible to customers):
    * - If the collection is published, this value is the date and time when it was published. The API returns this value in ISO 8601 format.
    * - If the collection is hidden (i.e., not published), this value is null. Changing a collection's status from published to hidden changes its published_at property to null.
    */
  var published_at: js.UndefOr[String] = js.native
  /**
    * The sales channels in which the collection is visible.
    * "published_scope": "global"
    */
  var published_scope: js.UndefOr[String] = js.native
  /**
    * The order in which products in the collection appear. Valid values are:
    *
    * - alpha-asc: Alphabetically, in ascending order (A - Z).
    * - alpha-desc: Alphabetically, in descending order (Z - A).
    * - best-selling: By best-selling products.
    * - created: By date created, in ascending order (oldest - newest).
    * - created-desc: By date created, in descending order (newest - oldest).
    * - manual: Order created by the shop owner.
    * - price-asc: By price, in ascending order (lowest - highest).
    * - price-desc: By price, in descending order (highest - lowest).
    */
  var sort_order: js.UndefOr[String] = js.native
  /**
    * The suffix of the liquid template being used. By default, the original template is called product.liquid, without any suffix. Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The name of the collection. Limit of 255 characters.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when the collection was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object ProductCollection {
  @scala.inline
  def apply(): ProductCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCollection]
  }
  @scala.inline
  implicit class ProductCollectionOps[Self <: ProductCollection] (val x: Self) extends AnyVal {
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
    def setBody_html(value: String): Self = this.set("body_html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_html: Self = this.set("body_html", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setImage(value: Attachment): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setPublished_at(value: String): Self = this.set("published_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at: Self = this.set("published_at", js.undefined)
    @scala.inline
    def setPublished_scope(value: String): Self = this.set("published_scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_scope: Self = this.set("published_scope", js.undefined)
    @scala.inline
    def setSort_order(value: String): Self = this.set("sort_order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort_order: Self = this.set("sort_order", js.undefined)
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

