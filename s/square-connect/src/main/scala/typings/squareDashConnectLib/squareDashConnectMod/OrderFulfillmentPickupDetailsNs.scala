package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillmentPickupDetails")
@js.native
object OrderFulfillmentPickupDetailsNs extends js.Object {
  @js.native
  sealed trait ScheduleTypeEnum extends js.Object
  
  @js.native
  object ScheduleTypeEnum extends js.Object {
    @js.native
    sealed trait ASAP
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum
    
    @js.native
    sealed trait SCHEDULED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum
    
    /* "ASAP" */ val ASAP: ASAP with java.lang.String = js.native
    /* "SCHEDULED" */ val SCHEDULED: SCHEDULED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum with java.lang.String
      ] = js.native
  }
  
}

