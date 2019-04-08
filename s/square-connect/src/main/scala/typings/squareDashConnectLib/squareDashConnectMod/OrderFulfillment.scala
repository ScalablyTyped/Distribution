package typings
package squareDashConnectLib.squareDashConnectMod

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
    * The state of the fulfillment.
    */
  var state: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum] = js.native
  /**
    * The type of the fulfillment.
    */
  var `type`: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.TypeEnum] = js.native
}

