package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderReturn")
@js.native
class OrderReturn () extends js.Object {
  /**
    * Aggregate monetary value being returned by this Return entry.
    */
  var return_amounts: js.UndefOr[OrderMoneyAmounts] = js.native
  /**
    * Collection of discounts which are being returned.
    */
  var return_discounts: js.UndefOr[js.Array[OrderReturnDiscount]] = js.native
  /**
    * Collection of line items which are being returned.
    */
  var return_line_items: js.UndefOr[js.Array[OrderReturnLineItem]] = js.native
  /**
    * Collection of taxes which are being returned.
    */
  var return_taxes: js.UndefOr[js.Array[OrderReturnTax]] = js.native
  /**
    * A positive or negative rounding adjustment to the total value being returned. Commonly used to apply Cash Rounding
    * when the minimum unit of account is smaller than the lowest physical denomination of currency.
    */
  var rounding_adjustment: js.UndefOr[OrderRoundingAdjustment] = js.native
  /**
    * Order which contains the original sale of these returned line items. This will be unset for unlinked returns.
    */
  var source_order_id: js.UndefOr[String] = js.native
  /**
    * The return's Unique identifier, unique only within this order. This field is read-only.
    */
  var uid: js.UndefOr[String] = js.native
}

