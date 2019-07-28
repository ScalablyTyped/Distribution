package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItem")
@js.native
class OrderLineItem () extends js.Object {
  /**
    * The base price for a single unit of the line item.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  /**
    * The [CatalogItemVariation](#type-catalogitemvariation) id applied to this line item.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * A list of discounts applied to this line item.
    * On read or retrieve, this list includes both item-level discounts and any order-level discounts apportioned to this item.
    * When creating an Order, set your item-level discounts in this list.
    */
  var discounts: js.UndefOr[js.Array[OrderLineItemDiscount]] = js.native
  /**
    * The amount of money made in gross sales for this line item.
    * Calculated as the sum of the variation's total price and each modifier's total price.
    */
  var gross_sales_money: js.UndefOr[Money] = js.native
  /**
    * The [CatalogModifier](#type-catalogmodifier)s applied to this line item.
    */
  var modifiers: js.UndefOr[js.Array[OrderLineItemModifier]] = js.native
  /**
    * The name of the line item.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The note of the line item.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The quantity purchased, formatted as a decimal number. For example: "3".
    * Line items with a `quantity_unit` can have non-integer quantities. For example: "1.70000".
    * Orders Hub and older versions of Connect do not support non-integer quantities.
    * See [Decimal quantities with Orders hub and older versions of Connect](/more-apis/orders/overview#decimal-quantities).
    */
  var quantity: String = js.native
  /**
    * The unit and precision that this line item's quantity is measured in.
    */
  var quantity_unit: js.UndefOr[OrderQuantityUnit] = js.native
  /**
    * A list of taxes applied to this line item. On read or retrieve, this list includes both item-level taxes and any
    * order-level taxes apportioned to this item. When creating an Order, set your item-level taxes in this list.
    */
  var taxes: js.UndefOr[js.Array[OrderLineItemTax]] = js.native
  /**
    * The total discount amount of money to collect for the line item.
    */
  var total_discount_money: js.UndefOr[Money] = js.native
  /**
    * The total amount of money to collect for this line item.
    */
  var total_money: js.UndefOr[Money] = js.native
  /**
    * The total tax amount of money to collect for the line item.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
  /**
    * The line item's Unique identifier, unique only within this order. This field is read-only.
    */
  var uid: js.UndefOr[String] = js.native
  /**
    * The name of the variation applied to this line item.
    */
  var variation_name: js.UndefOr[String] = js.native
  /**
    * The total price of all item variations sold in this line item.
    * Calculated as `base_price_money` multiplied by `quantity`. Does not include modifiers.
    */
  var variation_total_price_money: js.UndefOr[Money] = js.native
}

