package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Order")
@js.native
class Order () extends js.Object {
  /**
    * Timestamp for when the order was closed. In RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var closed_at: js.UndefOr[java.lang.String] = js.native
  /**
    * Timestamp for when the order was created. In RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The [Customer](#type-customer) ID of the customer associated with the order.
    */
  var customer_id: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of discounts applied to this order. On read or retrieve, this list includes both order-level and
    * item-level discounts. When creating an Order, set your order-level discounts in this list.
    */
  var discounts: js.UndefOr[js.Array[OrderLineItemDiscount]] = js.native
  /**
    * Details on order fulfillment. Orders can only be created with at most one fulfillment.
    * However, orders returned by the API may contain multiple fulfillments.
    */
  var fulfillments: js.UndefOr[js.Array[OrderFulfillment]] = js.native
  /**
    * The order's unique ID. This value is only present for Order objects created by the Orders API through
    * the [CreateOrder](#endpoint-orders-createorder) endpoint.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The line items included in the order.
    */
  var line_items: js.UndefOr[js.Array[OrderLineItem]] = js.native
  /**
    * The ID of the merchant location this order is associated with.
    */
  var location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * Net money amounts (sale money - return money).
    */
  var net_amounts: js.UndefOr[OrderMoneyAmounts] = js.native
  /**
    * A client specified identifier to associate an entity in another system with this order.
    */
  var reference_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The Refunds that are part of this Order. This field is read-only.
    */
  var refunds: js.UndefOr[js.Array[Refund]] = js.native
  /**
    * Rollup of returned money amounts.
    */
  var return_amounts: js.UndefOr[OrderMoneyAmounts] = js.native
  /**
    * Collection of items from sale Orders being returned in this one. Normally part of an Itemized Return or Exchange.
    * There will be exactly one `Return` object per sale Order being referenced.
    */
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.native
  /**
    * A positive or negative rounding adjustment to the total of the order, commonly used to apply Cash Rounding when
    * the minimum unit of account is smaller than the lowest physical denomination of currency.
    */
  var rounding_adjustment: js.UndefOr[OrderRoundingAdjustment] = js.native
  /**
    * The origination details of the order.
    */
  var source: js.UndefOr[OrderSource] = js.native
  /**
    * The current state of the order. `OPEN`,`COMPLETED`,`CANCELED` See [OrderState](#type-orderstate) for possible values.
    */
  var state: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderNs.StateEnum] = js.native
  /**
    * A list of taxes applied to this order. On read or retrieve, this list includes both order-level and item-level
    * taxes. When creating an Order, set your order-level taxes in this list.
    */
  var taxes: js.UndefOr[js.Array[OrderLineItemTax]] = js.native
  /**
    * The Tenders which were used to pay for the Order. This field is read-only.
    */
  var tenders: js.UndefOr[js.Array[Tender]] = js.native
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
  /**
    * Timestamp for when the order was last updated. In RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var updated_at: js.UndefOr[java.lang.String] = js.native
}

