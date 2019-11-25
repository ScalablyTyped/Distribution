package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.PICKUP
  - typings.squareDashConnect.squareDashConnectStrings.SHIPMENT
*/
trait FulfillmentType extends js.Object

object FulfillmentType {
  @scala.inline
  def PICKUP: typings.squareDashConnect.squareDashConnectStrings.PICKUP = this.cast("PICKUP")
  @scala.inline
  def SHIPMENT: typings.squareDashConnect.squareDashConnectStrings.SHIPMENT = this.cast("SHIPMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

