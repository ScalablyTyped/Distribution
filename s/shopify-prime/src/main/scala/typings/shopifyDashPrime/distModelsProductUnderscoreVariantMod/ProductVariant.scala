package typings.shopifyDashPrime.distModelsProductUnderscoreVariantMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductVariant extends ShopifyObject {
  /**
    * The barcode, UPC or ISBN number for the product.
    */
  var barcode: String
  /**
    * The competitors price for the same item.
    */
  var compare_at_price: js.UndefOr[js.Any] = js.undefined
  /**
    * The date and time when the product variant was created. The API returns this value in ISO 8601 format.
    */
  var created_at: String
  /**
    * Service who is doing the fulfillment. Valid values are: manual
    */
  var fulfillment_service: String
  /**
    * The weight of the product variant in grams.
    */
  var grams: Double
  /**
    * The unique identifier for the inventory item, which is used in the Inventory API to query for inventory information.
    */
  var inventory_item_id: Double
  /**
    * Specifies whether or not Shopify tracks the number of items in stock for this product variant.
    */
  var inventory_management: String
  /**
    * Specifies whether or not customers are allowed to place an order for a product variant when it's out of stock
    */
  var inventory_policy: String
  /**
    * The number of items in stock for this product variant.
    */
  var inventory_quantity: Double
  /**
    * Custom properties that a shop owner can use to define product variants. Multiple options can exist. Options are represented as: option1, option2, option3 etc.
    */
  var option1: String
  var option2: String | Null
  var option3: String | Null
  /**
    * The order of the product variant in the list of product variants. 1 is the first position. To reorder variants, update the product with the variants in the desired order. The position attribute on the variant will be ignored.
    */
  var position: Double
  /**
    * The price of the product variant.
    */
  var price: Double
  /**
    * The unique numeric identifier for the product.
    */
  var product_id: Double
  /**
    * Specifies whether or not a customer needs to provide a shipping address when placing an order for this product variant.
    */
  var requires_shipping: Boolean
  /**
    * A unique identifier for the product in the shop.
    */
  var sku: String
  /**
    * Specifies whether or not a tax is charged when the product variant is sold.
    */
  var taxable: Boolean
  /**
    * The title of the product variant.
    */
  var title: String
  /**
    * The date and time when the product variant was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: String
  /**
    * The weight of the product variant in the unit system specified with weight_unit.
    */
  var weight: Double
  /**
    * The unit system that the product variant's weight is measure in. The weight_unit can be either "g", "kg, "oz", or "lb".
    */
  var weight_unit: String
}

object ProductVariant {
  @scala.inline
  def apply(
    barcode: String,
    created_at: String,
    fulfillment_service: String,
    grams: Double,
    inventory_item_id: Double,
    inventory_management: String,
    inventory_policy: String,
    inventory_quantity: Double,
    option1: String,
    position: Double,
    price: Double,
    product_id: Double,
    requires_shipping: Boolean,
    sku: String,
    taxable: Boolean,
    title: String,
    updated_at: String,
    weight: Double,
    weight_unit: String,
    admin_graphql_api_id: String = null,
    compare_at_price: js.Any = null,
    id: Int | Double = null,
    option2: String = null,
    option3: String = null
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(barcode = barcode.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fulfillment_service = fulfillment_service.asInstanceOf[js.Any], grams = grams.asInstanceOf[js.Any], inventory_item_id = inventory_item_id.asInstanceOf[js.Any], inventory_management = inventory_management.asInstanceOf[js.Any], inventory_policy = inventory_policy.asInstanceOf[js.Any], inventory_quantity = inventory_quantity.asInstanceOf[js.Any], option1 = option1.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], requires_shipping = requires_shipping.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], taxable = taxable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_unit = weight_unit.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (compare_at_price != null) __obj.updateDynamic("compare_at_price")(compare_at_price.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (option2 != null) __obj.updateDynamic("option2")(option2.asInstanceOf[js.Any])
    if (option3 != null) __obj.updateDynamic("option3")(option3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductVariant]
  }
}

