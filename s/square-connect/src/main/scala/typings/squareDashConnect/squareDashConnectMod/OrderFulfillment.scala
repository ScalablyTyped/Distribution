package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum
import typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillment")
@js.native
class OrderFulfillment () extends js.Object {
  /**
    * Contains pickup-specific details. Required when fulfillment type is `PICKUP`.
    */
  var pickup_details: js.UndefOr[OrderFulfillmentPickupDetails] = js.native
  /**
    * The state of the fulfillment. See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values.
    */
  var state: js.UndefOr[StateEnum] = js.native
  /**
    * The type of the fulfillment. See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values.
    */
  var `type`: js.UndefOr[TypeEnum] = js.native
}

