package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FulfillmentTypeEnum extends js.Object

@JSImport("square-connect", "FulfillmentTypeEnum")
@js.native
object FulfillmentTypeEnum extends js.Object {
  @js.native
  sealed trait PICKUP extends FulfillmentTypeEnum
  
  @js.native
  sealed trait SHIPMENT extends FulfillmentTypeEnum
  
  /* "PICKUP" */ val PICKUP: typings.squareDashConnect.squareDashConnectMod.FulfillmentTypeEnum.PICKUP with String = js.native
  /* "SHIPMENT" */ val SHIPMENT: typings.squareDashConnect.squareDashConnectMod.FulfillmentTypeEnum.SHIPMENT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FulfillmentTypeEnum with String] = js.native
}

