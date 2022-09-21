package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.ASAP
import typings.squareConnect.squareConnectStrings.SCHEDULED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderFulfillmentPickupDetails")
@js.native
open class OrderFulfillmentPickupDetails () extends StObject {
  
  /**
    * The [timestamp](#workingwithdates) indicating when the fulfillment was accepted.
    * In RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var accepted_at: js.UndefOr[String] = js.native
  
  /**
    * The duration of time after which an open and accepted pickup fulfillment will automatically move to the `COMPLETED` state.
    * Must be in RFC3339 duration format e.g., "P1W3D".
    * If not set, this pickup fulfillment will remain accepted until it is canceled or completed.
    */
  var auto_complete_duration: js.UndefOr[String] = js.native
  
  /**
    * A description of why the pickup was canceled. Max length: 100 characters.
    */
  var cancel_reason: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) in RFC3339 timestamp format.
    * e.g., "2016-09-04T23:59:33.123Z", indicating when the fulfillment was canceled.
    */
  var canceled_at: js.UndefOr[String] = js.native
  
  /**
    * Specific details for curbside pickup. Can only be populated if `is_curbside_pickup` is true.
    */
  var curbside_pickup_details: js.UndefOr[OrderFulfillmentPickupDetailsCurbsidePickupDetails] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the fulfillment expired.
    * In RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var expired_at: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when this fulfillment will expire if it is not accepted.
    * Must be in RFC 3339 format e.g., "2016-09-04T23:59:33.123Z". Expiration time can only be set up to 7 days in the future.
    * If `expires_at` is not set, this pickup fulfillment will be automatically accepted when placed.
    */
  var expires_at: js.UndefOr[String] = js.native
  
  /**
    * If true, indicates this pickup order is for curbside pickup, not in-store pickup.
    */
  var is_curbside_pickup: js.UndefOr[Boolean] = js.native
  
  /**
    * A note meant to provide additional instructions about the pickup fulfillment displayed in the Square Point of Sale and set by the API.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the fulfillment was picked up by the recipient.
    * In RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var picked_up_at: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) that represents the start of the pickup window.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z". For fulfillments with the schedule type `ASAP`,
    * this is automatically set to the current time plus the expected duration to prepare the fulfillment.
    */
  var pickup_at: js.UndefOr[String] = js.native
  
  /**
    * The window of time in which the order should be picked up after the `pickup_at` timestamp.
    * Must be in RFC3339 duration format, e.g., "P1W3D". Can be used as an informational guideline for merchants.
    */
  var pickup_window_duration: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the fulfillment was placed.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var placed_at: js.UndefOr[String] = js.native
  
  /**
    * The duration of time it takes to prepare this fulfillment. Must be in RFC3339 duration format, e.g., "P1W3D".
    */
  var prep_time_duration: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the fulfillment is marked as ready for pickup.
    * In RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var ready_at: js.UndefOr[String] = js.native
  
  /**
    * Information on the person meant to pick up this fulfillment from a physical location.
    */
  var recipient: js.UndefOr[OrderFulfillmentRecipient] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the fulfillment was rejected.
    * In RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var rejected_at: js.UndefOr[String] = js.native
  
  /**
    * The schedule type of the pickup fulfillment. Defaults to `SCHEDULED`.
    * See [OrderFulfillmentPickupDetailsScheduleType](#type-orderfulfillmentpickupdetailsscheduletype) for possible values.
    */
  var schedule_type: js.UndefOr[SCHEDULED | ASAP] = js.native
}
