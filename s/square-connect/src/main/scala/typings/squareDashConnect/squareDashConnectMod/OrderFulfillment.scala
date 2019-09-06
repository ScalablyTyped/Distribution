package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillment")
@js.native
class OrderFulfillment () extends js.Object {
  /**
    * Contains details for a pickup fulfillment. Required when fulfillment type is `PICKUP`.
    */
  var pickup_details: js.UndefOr[OrderFulfillmentPickupDetails] = js.native
  /**
    * Contains details for a shipment fulfillment. Required when fulfillment type is `SHIPMENT`.
    * A shipment fulfillment's relationship to fulfillment `state`:
    *  `PROPOSED`: A shipment is requested.
    *  `RESERVED`: Fulfillment accepted. Shipment processing.
    *  `PREPARED`: Shipment packaged. Shipping label created.
    *  `COMPLETED`: Package has been shipped.
    *  `CANCELED`: Shipment has been canceled.
    *  `FAILED`: Shipment has failed.
    */
  var shipment_details: js.UndefOr[OrderFulfillmentShipmentDetails] = js.native
  /**
    * The state of the fulfillment. See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values.
    */
  var state: js.UndefOr[FulfillmentStateEnum] = js.native
  /**
    * The type of the fulfillment. See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values.
    */
  var `type`: js.UndefOr[FulfillmentTypeEnum] = js.native
  /**
    * Unique ID that identifies the fulfillment only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}

