package typings
package squareDashConnectLib.squareDashConnectMod

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
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of discounts applied to this line item. On read or retrieve, this list includes both item-level discounts
    * and any order-level discounts apportioned to this item. When creating an Order, set your item-level discounts in
    * this list.
    */
  var discounts: js.UndefOr[js.Array[OrderLineItemDiscount]] = js.native
  /**
    * The gross sales amount of money calculated as (item base price + modifiers price) * quantity.
    */
  var gross_sales_money: js.UndefOr[Money] = js.native
  /**
    * The [CatalogModifier](#type-catalogmodifier)s applied to this line item.
    */
  var modifiers: js.UndefOr[js.Array[OrderLineItemModifier]] = js.native
  /**
    * The name of the line item.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The note of the line item.
    */
  var note: js.UndefOr[java.lang.String] = js.native
  /**
    * The quantity purchased, as a string representation of a number.  This string must have a positive integer value.
    */
  var quantity: java.lang.String = js.native
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
    * The name of the variation applied to this line item.
    */
  var variation_name: js.UndefOr[java.lang.String] = js.native
}

