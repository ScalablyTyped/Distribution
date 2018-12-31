package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductVariant
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The barcode, UPC or ISBN number for the product.
    */
  var barcode: java.lang.String
  /**
    * The competitors price for the same item.
    */
  var compare_at_price: js.UndefOr[js.Any] = js.undefined
  /**
    * The date and time when the product variant was created. The API returns this value in ISO 8601 format.
    */
  var created_at: java.lang.String
  /**
    * Service who is doing the fulfillment. Valid values are: manual
    */
  var fulfillment_service: java.lang.String
  /**
    * The weight of the product variant in grams.
    */
  var grams: scala.Double
  /**
    * The unique identifier for the inventory item, which is used in the Inventory API to query for inventory information.
    */
  var inventory_item_id: scala.Double
  /**
    * Specifies whether or not Shopify tracks the number of items in stock for this product variant.
    */
  var inventory_management: java.lang.String
  /**
    * Specifies whether or not customers are allowed to place an order for a product variant when it's out of stock
    */
  var inventory_policy: java.lang.String
  /**
    * The number of items in stock for this product variant.
    */
  var inventory_quantity: scala.Double
  /**
    * Custom properties that a shop owner can use to define product variants. Multiple options can exist. Options are represented as: option1, option2, option3 etc.
    */
  var option1: java.lang.String
  /**
    * The order of the product variant in the list of product variants. 1 is the first position. To reorder variants, update the product with the variants in the desired order. The position attribute on the variant will be ignored.
    */
  var position: scala.Double
  /**
    * The price of the product variant.
    */
  var price: scala.Double
  /**
    * The unique numeric identifier for the product.
    */
  var product_id: scala.Double
  /**
    * Specifies whether or not a customer needs to provide a shipping address when placing an order for this product variant.
    */
  var requires_shipping: scala.Boolean
  /**
    * A unique identifier for the product in the shop.
    */
  var sku: java.lang.String
  /**
    * Specifies whether or not a tax is charged when the product variant is sold.
    */
  var taxable: scala.Boolean
  /**
    * The title of the product variant.
    */
  var title: java.lang.String
  /**
    * The date and time when the product variant was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: java.lang.String
  /**
    * The weight of the product variant in the unit system specified with weight_unit.
    */
  var weight: scala.Double
  /**
    * The unit system that the product variant's weight is measure in. The weight_unit can be either "g", "kg, "oz", or "lb".
    */
  var weight_unit: java.lang.String
}

