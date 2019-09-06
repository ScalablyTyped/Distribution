package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FulfillmentStateEnum extends js.Object

@JSImport("square-connect", "FulfillmentStateEnum")
@js.native
object FulfillmentStateEnum extends js.Object {
  @js.native
  sealed trait CANCELED extends FulfillmentStateEnum
  
  @js.native
  sealed trait COMPLETED extends FulfillmentStateEnum
  
  @js.native
  sealed trait FAILED extends FulfillmentStateEnum
  
  @js.native
  sealed trait PREPARED extends FulfillmentStateEnum
  
  @js.native
  sealed trait PROPOSED extends FulfillmentStateEnum
  
  @js.native
  sealed trait RESERVED extends FulfillmentStateEnum
  
  /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.FulfillmentStateEnum.CANCELED with String = js.native
  /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.FulfillmentStateEnum.COMPLETED with String = js.native
  /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.FulfillmentStateEnum.FAILED with String = js.native
  /* "PREPARED" */ val PREPARED: typings.squareDashConnect.squareDashConnectMod.FulfillmentStateEnum.PREPARED with String = js.native
  /* "PROPOSED" */ val PROPOSED: typings.squareDashConnect.squareDashConnectMod.FulfillmentStateEnum.PROPOSED with String = js.native
  /* "RESERVED" */ val RESERVED: typings.squareDashConnect.squareDashConnectMod.FulfillmentStateEnum.RESERVED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FulfillmentStateEnum with String] = js.native
}

