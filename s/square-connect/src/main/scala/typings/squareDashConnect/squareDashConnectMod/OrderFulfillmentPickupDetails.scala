package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillmentPickupDetails")
@js.native
class OrderFulfillmentPickupDetails () extends js.Object {
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the fulfillment was accepted by the merchant.
    */
  var accepted_at: js.UndefOr[String] = js.native
  /**
    * The auto completion duration in RFC3339 duration format, e.g., "P1W3D". If set, an open and accepted pickup
    * fulfillment will automatically move to the `COMPLETED` state after this period of time. If not set, this pickup
    * fulfillment will remain accepted until it is canceled or completed.
    */
  var auto_complete_duration: js.UndefOr[String] = js.native
  /**
    * A description of why the pickup was canceled. Max length is 100 characters.
    */
  var cancel_reason: js.UndefOr[String] = js.native
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the fulfillment was canceled by the merchant or buyer.
    */
  var canceled_at: js.UndefOr[String] = js.native
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the fulfillment expired.
    */
  var expired_at: js.UndefOr[String] = js.native
  /**
    * The expiry [timestamp](#workingwithdates) in RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z". This timestamp
    * indicates when the pickup fulfillment will expire if it is not accepted by the merchant. Expiration time can only
    * be set up to 7 days in the future. If not set, this pickup fulfillment will be automatically accepted when placed.
    */
  var expires_at: js.UndefOr[String] = js.native
  /**
    * A general note about the pickup fulfillment.  Notes are useful for providing additional instructions and are
    * displayed in Square apps.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the fulfillment was picked up by the recipient.
    */
  var picked_up_at: js.UndefOr[String] = js.native
  /**
    * The pickup [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    * For fulfillments with the schedule type `ASAP`, this is automatically set to the current time plus the expected
    * duration to prepare the fulfillment. This represents the start of the pickup window.
    */
  var pickup_at: js.UndefOr[String] = js.native
  /**
    * The pickup window duration in RFC3339 duration format, e.g., "P1W3D". This duration represents the window of
    * time for which the order should be picked up after the `pickup_at` time. Can be used as an informational
    * guideline for merchants.
    */
  var pickup_window_duration: js.UndefOr[String] = js.native
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the fulfillment was placed.
    */
  var placed_at: js.UndefOr[String] = js.native
  /**
    * The preparation time duration in RFC3339 duration format, e.g., \"P1W3D\". This duration indicates how long it
    * takes the merchant to prepare this fulfillment.
    */
  var prep_time_duration: js.UndefOr[String] = js.native
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the merchant set the fulfillment as ready for pickup.
    */
  var ready_at: js.UndefOr[String] = js.native
  /**
    * The recipient of this pickup fulfillment.
    */
  var recipient: js.UndefOr[OrderFulfillmentRecipient] = js.native
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating
    * when the fulfillment was rejected.
    */
  var rejected_at: js.UndefOr[String] = js.native
  /**
    * The schedule type of the pickup fulfillment. Defaults to `SCHEDULED`.
    * See [OrderFulfillmentPickupDetailsScheduleType](#type-orderfulfillmentpickupdetailsscheduletype) for possible values.
    */
  var schedule_type: js.UndefOr[ScheduleTypeEnum] = js.native
}

