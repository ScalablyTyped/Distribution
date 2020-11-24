package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderLineItemAppliedDiscount")
@js.native
class OrderLineItemAppliedDiscount () extends js.Object {
  
  /**
    * The amount of money applied by the discount to the line item.
    */
  var applied_money: js.UndefOr[Money] = js.native
  
  /**
    * The `uid` of the discount the applied discount represents. Must reference a discount present in the
    * `order.discounts` field. This field is immutable. To change which discounts apply to a line item, you must delete
    * the discount and re-add it as a new `OrderLineItemAppliedDiscount`.
    */
  var discount_uid: String = js.native
  
  /**
    * Unique ID that identifies the applied discount only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}
