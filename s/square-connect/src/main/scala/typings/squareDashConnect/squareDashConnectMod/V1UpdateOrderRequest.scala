package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1UpdateOrderRequest")
@js.native
class V1UpdateOrderRequest () extends js.Object {
  /**
    * The action to perform on the order (COMPLETE, CANCEL, or REFUND). See
    * [V1UpdateOrderRequestAction](#type-v1updateorderrequestaction) for possible values
    */
  var action: ActionEnum = js.native
  /**
    * A merchant-specified note about the canceling of the order. Only valid if action is CANCEL.
    */
  var canceled_note: js.UndefOr[String] = js.native
  /**
    * A merchant-specified note about the completion of the order. Only valid if action is COMPLETE.
    */
  var completed_note: js.UndefOr[String] = js.native
  /**
    * A merchant-specified note about the refunding of the order. Only valid if action is REFUND.
    */
  var refunded_note: js.UndefOr[String] = js.native
  /**
    * The tracking number of the shipment associated with the order. Only valid if action is COMPLETE.
    */
  var shipped_tracking_number: js.UndefOr[String] = js.native
}

