package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum
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
    sealed trait ASAP extends ScheduleTypeEnum
    
    @js.native
    sealed trait SCHEDULED extends ScheduleTypeEnum
    
    /* "ASAP" */ val ASAP: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum.ASAP with String = js.native
    /* "SCHEDULED" */ val SCHEDULED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentPickupDetailsNs.ScheduleTypeEnum.SCHEDULED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ScheduleTypeEnum with String] = js.native
  }
  
}

