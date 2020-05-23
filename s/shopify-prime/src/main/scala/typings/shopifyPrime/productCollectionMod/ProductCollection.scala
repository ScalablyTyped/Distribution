package typings.shopifyPrime.productCollectionMod

import typings.shopifyPrime.anon.Attachment
import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCollection extends ShopifyObject {
  /**
    * The description of the collection, complete with HTML markup. Many templates
    * display this on their collection pages.
    */
  var body_html: js.UndefOr[String] = js.undefined
  /**
    * A human-friendly unique string for the collection automatically generated from its title. This is used in shop themes by the Liquid templating language to refer to the collection. Limit of 255 characters.
    */
  var handle: js.UndefOr[String] = js.undefined
  /**
    * Image associated with the collection. Valid values are:
    * - attachment: An image attached to a shop's theme returned as Base64-encoded binary data.
    * - src: Source URL that specifies the location of the image.
    */
  var image: js.UndefOr[Attachment] = js.undefined
  /**
    * This can have two different types of values, depending on whether the collection has been published (i.e., made visible to customers):
    * - If the collection is published, this value is the date and time when it was published. The API returns this value in ISO 8601 format.
    * - If the collection is hidden (i.e., not published), this value is null. Changing a collection's status from published to hidden changes its published_at property to null.
    */
  var published_at: js.UndefOr[String] = js.undefined
  /**
    * The sales channels in which the collection is visible.
    * "published_scope": "global"
    */
  var published_scope: js.UndefOr[String] = js.undefined
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
  var sort_order: js.UndefOr[String] = js.undefined
  /**
    * The suffix of the liquid template being used. By default, the original template is called product.liquid, without any suffix. Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.undefined
  /**
    * The name of the collection. Limit of 255 characters.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the collection was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.undefined
}

object ProductCollection {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    body_html: String = null,
    handle: String = null,
    id: js.UndefOr[Double] = js.undefined,
    image: Attachment = null,
    published_at: String = null,
    published_scope: String = null,
    sort_order: String = null,
    template_suffix: String = null,
    title: String = null,
    updated_at: String = null
  ): ProductCollection = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (body_html != null) __obj.updateDynamic("body_html")(body_html.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (published_at != null) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (published_scope != null) __obj.updateDynamic("published_scope")(published_scope.asInstanceOf[js.Any])
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCollection]
  }
}

