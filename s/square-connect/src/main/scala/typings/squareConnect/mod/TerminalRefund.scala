package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TerminalRefund")
@js.native
class TerminalRefund () extends StObject {
  
  /**
    * The amount of money, inclusive of `tax_money`, that the `TerminalRefund` should return.
    * This value is limited to the amount taken in the original payment minus any completed or pending refunds.
    */
  var amount_money: Money = js.native
  
  /**
    * Present if the status is `CANCELED`. See [ActionCancelReason](#type-actioncancelreason) for possible values.
    */
  var cancel_reason: js.UndefOr[String] = js.native
  
  /**
    * The time when the `TerminalRefund` was created as an RFC 3339 timestamp.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The duration as an RFC 3339 duration, after which the refund will be automatically canceled.
    * TerminalRefunds that are `PENDING` will be automatically `CANCELED` and have a cancellation reason of `TIMED_OUT`
    * Default: 5 minutes from creation. Maximum: 5 minutes.
    */
  var deadline_duration: js.UndefOr[String] = js.native
  
  /**
    * The unique Id of the device intended for this `TerminalRefund`. The Id can be retrieved from /v2/devices api.
    */
  var device_id: js.UndefOr[String] = js.native
  
  /**
    * A unique ID for this `TerminalRefund`
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The reference to the Square order id for the payment identified by the `payment_id`.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * Unique ID of the payment being refunded.
    */
  var payment_id: String = js.native
  
  /**
    * A description of the reason for the refund. Note: maximum 192 characters.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The reference to the payment refund created by completing this `TerminalRefund`.
    */
  var refund_id: js.UndefOr[String] = js.native
  
  /**
    * The status of the `TerminalRefund`. Options: `PENDING`, `IN\\_PROGRESS`, `CANCELED`, `COMPLETED`
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The time when the `TerminalRefund` was last updated as an RFC 3339 timestamp.
    */
  var updated_at: js.UndefOr[String] = js.native
}
