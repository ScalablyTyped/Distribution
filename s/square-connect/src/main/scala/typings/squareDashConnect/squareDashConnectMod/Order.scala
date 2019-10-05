package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.Order.StateEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Order")
@js.native
class Order () extends js.Object {
  /**
    * Timestamp for when the order was closed. In RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var closed_at: js.UndefOr[String] = js.native
  /**
    * Timestamp for when the order was created. In RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The [Customer](#type-customer) ID of the customer associated with the order.
    */
  var customer_id: js.UndefOr[String] = js.native
  /**
    * The list of all discounts associated with the order. Discounts can be scoped to either `ORDER` or `LINE_ITEM`.
    * For discounts scoped to `LINE_ITEM`, an `OrderLineItemAppliedDiscount` must be added to each line item that the
    * discount applies to. For discounts with `ORDER` scope, the server will generate an `OrderLineItemAppliedDiscount`
    * for every line item.
    * @note If `LINE_ITEM` scope is set on any discounts in this field, usage of the deprecated `line_items.discounts`
    * field will result in an error. Please use `line_items.applied_discounts` instead.
    */
  var discounts: js.UndefOr[js.Array[OrderLineItemDiscount]] = js.native
  /**
    * Details on order fulfillment. Orders can only be created with at most one fulfillment.
    * However, orders returned by the API may contain multiple fulfillments.
    */
  var fulfillments: js.UndefOr[js.Array[OrderFulfillment]] = js.native
  /**
    * The order's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The line items included in the order.
    */
  var line_items: js.UndefOr[js.Array[OrderLineItem]] = js.native
  /**
    * The ID of the merchant location this order is associated with.
    */
  var location_id: js.UndefOr[String] = js.native
  /**
    * Net money amounts (sale money - return money).
    */
  var net_amounts: js.UndefOr[OrderMoneyAmounts] = js.native
  /**
    * A client specified identifier to associate an entity in another system with this order.
    */
  var reference_id: js.UndefOr[String] = js.native
  /**
    * The Refunds that are part of this Order.
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
    * A list of service charges applied to the order.
    */
  var service_charges: js.UndefOr[js.Array[OrderServiceCharge]] = js.native
  /**
    * The origination details of the order.
    */
  var source: js.UndefOr[OrderSource] = js.native
  /**
    * The current state of the order. `OPEN`,`COMPLETED`,`CANCELED` See [OrderState](#type-orderstate) for possible values.
    */
  var state: js.UndefOr[StateEnum] = js.native
  /**
    * The list of all taxes associated with the order. Taxes can be scoped to either `ORDER` or `LINE_ITEM`.
    * For taxes with `LINE_ITEM` scope, an `OrderLineItemAppliedTax` must be added to each line item that the tax applies to.
    * For taxes with `ORDER` scope, the server will generate an `OrderLineItemAppliedTax` for every line item.
    * On reads, each tax in the list will include the total amount of that tax applied to the order.
    * @note If `LINE_ITEM` scope is set on any taxes in this field, usage of the deprecated `line_items.taxes`
    * field will result in an error. Please use `line_items.applied_taxes` instead.
    */
  var taxes: js.UndefOr[js.Array[OrderLineItemTax]] = js.native
  /**
    * The Tenders which were used to pay for the Order.
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
    * The total amount of money collected in service charges for the order.
    * @note `total_service_charge_money` is the sum of `applied_money` fields for each individual service charge.
    * Therefore, `total_service_charge_money` will only include inclusive tax amounts, not additive tax amounts.
    */
  var total_service_charge_money: js.UndefOr[Money] = js.native
  /**
    * The total tax amount of money to collect for the order.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
  /**
    * Timestamp for when the order was last updated. In RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * Version number which is incremented each time an update is committed to the order.
    * Orders that were not created through the API will not include a version and thus cannot be updated.
    * [Read more about working with versions](/orders-api/manage-orders#update-orders).
    */
  var version: js.UndefOr[Double] = js.native
}

@JSImport("square-connect", "Order")
@js.native
object Order extends js.Object {
  @js.native
  sealed trait StateEnum extends js.Object
  
  @js.native
  object StateEnum extends js.Object {
    @js.native
    sealed trait CANCELED extends StateEnum
    
    @js.native
    sealed trait COMPLETED extends StateEnum
    
    @js.native
    sealed trait OPEN extends StateEnum
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.Order.StateEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.Order.StateEnum.COMPLETED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.Order.StateEnum.OPEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StateEnum with String] = js.native
  }
  
}

