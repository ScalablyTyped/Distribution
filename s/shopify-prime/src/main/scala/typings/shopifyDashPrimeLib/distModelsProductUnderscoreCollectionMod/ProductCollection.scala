package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCollection
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The description of the collection, complete with HTML markup. Many templates
    * display this on their collection pages.
    */
  var body_html: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-friendly unique string for the collection automatically generated from its title. This is used in shop themes by the Liquid templating language to refer to the collection. Limit of 255 characters.
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Image associated with the collection. Valid values are:
    * - attachment: An image attached to a shop's theme returned as Base64-encoded binary data.
    * - src: Source URL that specifies the location of the image.
    */
  var image: js.UndefOr[shopifyDashPrimeLib.Anon_Attachment] = js.undefined
  /**
    * This can have two different types of values, depending on whether the collection has been published (i.e., made visible to customers):
    * - If the collection is published, this value is the date and time when it was published. The API returns this value in ISO 8601 format.
    * - If the collection is hidden (i.e., not published), this value is null. Changing a collection's status from published to hidden changes its published_at property to null.
    */
  var published_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The sales channels in which the collection is visible.
    * "published_scope": "global"
    */
  var published_scope: js.UndefOr[java.lang.String] = js.undefined
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
  var sort_order: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The suffix of the liquid template being used. By default, the original template is called product.liquid, without any suffix. Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the collection. Limit of 255 characters.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when the collection was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

