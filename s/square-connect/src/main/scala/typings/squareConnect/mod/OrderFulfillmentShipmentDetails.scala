package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderFulfillmentShipmentDetails")
@js.native
class OrderFulfillmentShipmentDetails () extends StObject {
  
  /**
    * A description of why the shipment was canceled.
    */
  var cancel_reason: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating the shipment was canceled.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var canceled_at: js.UndefOr[String] = js.native
  
  /**
    * The shipping carrier being used to ship this fulfillment e.g. UPS, FedEx, USPS, etc.
    */
  var carrier: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the shipment is expected to be delivered to the shipping carrier.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var expected_shipped_at: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the shipment failed to be completed.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var failed_at: js.UndefOr[String] = js.native
  
  /**
    * A description of why the shipment failed to be completed.
    */
  var failure_reason: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `RESERVED` state.
    * Indicates that preparation of this shipment has begun. Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var in_progress_at: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `PREPARED` state.
    * Indicates that the fulfillment is packaged. Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var packaged_at: js.UndefOr[String] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when the shipment was requested.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var placed_at: js.UndefOr[String] = js.native
  
  /**
    * Information on the person meant to receive this shipment fulfillment.
    */
  var recipient: js.UndefOr[OrderFulfillmentRecipient] = js.native
  
  /**
    * The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `COMPLETED`state.
    * Indicates that the fulfillment has been given to the shipping carrier.
    * Must be in RFC3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var shipped_at: js.UndefOr[String] = js.native
  
  /**
    * A note with additional information for the shipping carrier.
    */
  var shipping_note: js.UndefOr[String] = js.native
  
  /**
    * A description of the type of shipping product purchased from the carrier. e.g. First Class, Priority, Express
    */
  var shipping_type: js.UndefOr[String] = js.native
  
  /**
    * The reference number provided by the carrier to track the shipment's progress.
    */
  var tracking_number: js.UndefOr[String] = js.native
  
  /**
    * A link to the tracking webpage on the carrier's website.
    */
  var tracking_url: js.UndefOr[String] = js.native
}
