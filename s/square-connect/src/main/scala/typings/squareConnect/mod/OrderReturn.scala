package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderReturn")
@js.native
class OrderReturn () extends StObject {
  
  /**
    * Aggregate monetary value being returned by this Return entry.
    */
  var return_amounts: js.UndefOr[OrderMoneyAmounts] = js.native
  
  /**
    * Collection of references to discounts being returned for an order, including the total applied discount amount to be returned.
    * The discounts must reference a top-level discount ID from the source order.
    */
  var return_discounts: js.UndefOr[js.Array[OrderReturnDiscount]] = js.native
  
  /**
    * Collection of line items which are being returned.
    */
  var return_line_items: js.UndefOr[js.Array[OrderReturnLineItem]] = js.native
  
  /**
    * Collection of service charges which are being returned.
    */
  var return_service_charges: js.UndefOr[js.Array[OrderReturnServiceCharge]] = js.native
  
  /**
    * Collection of references to taxes being returned for an order, including the total applied tax amount to be returned.
    * The taxes must reference a top-level tax ID from the source order.
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
    * Unique ID that identifies the return only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}
