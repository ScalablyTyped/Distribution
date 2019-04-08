package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Order")
@js.native
class Order () extends js.Object {
  /**
    * A list of discounts applied to this order. On read or retrieve, this list includes both order-level and
    * item-level discounts. When creating an Order, set your order-level discounts in this list.
    */
  var discounts: js.UndefOr[js.Array[OrderLineItemDiscount]] = js.native
  /**
    * Details on order fulfillment.  Orders can only be created with at most one fulfillment. However, orders returned
    * by the API may contain multiple fulfillments.
    */
  var fulfillments: js.UndefOr[js.Array[OrderFulfillment]] = js.native
  /**
    * The order's unique ID.  This value is only present for Order objects created by the Orders API through the
    * [CreateOrder](#endpoint-createorder) endpoint.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The line items included in the order.
    */
  var line_items: js.UndefOr[js.Array[OrderLineItem]] = js.native
  /**
    * The ID of the merchant location this order is associated with.
    */
  var location_id: java.lang.String = js.native
  /**
    * A client specified identifier to associate an entity in another system with this order.
    */
  var reference_id: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of taxes applied to this order. On read or retrieve, this list includes both order-level and item-level
    * taxes. When creating an Order, set your order-level taxes in this list.
    */
  var taxes: js.UndefOr[js.Array[OrderLineItemTax]] = js.native
  /**
    * The total discount amount of money to collect for the order.
    */
  var total_discount_money: js.UndefOr[Money] = js.native
  /**
    * The total amount of money to collect for the order.
    */
  var total_money: js.UndefOr[Money] = js.native
  /**
    * The total tax amount of money to collect for the order.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
}

