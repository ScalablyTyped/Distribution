package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BusinessHoursPeriod")
@js.native
object BusinessHoursPeriodNs extends js.Object {
  @js.native
  sealed trait DayOfWeekEnum extends js.Object
  
  @js.native
  object DayOfWeekEnum extends js.Object {
    @js.native
    sealed trait FRI extends DayOfWeekEnum
    
    @js.native
    sealed trait MON extends DayOfWeekEnum
    
    @js.native
    sealed trait SAT extends DayOfWeekEnum
    
    @js.native
    sealed trait SUN extends DayOfWeekEnum
    
    @js.native
    sealed trait THU extends DayOfWeekEnum
    
    @js.native
    sealed trait TUE extends DayOfWeekEnum
    
    @js.native
    sealed trait WED extends DayOfWeekEnum
    
    /* "FRI" */ val FRI: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.FRI with String = js.native
    /* "MON" */ val MON: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.MON with String = js.native
    /* "SAT" */ val SAT: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.SAT with String = js.native
    /* "SUN" */ val SUN: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.SUN with String = js.native
    /* "THU" */ val THU: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.THU with String = js.native
    /* "TUE" */ val TUE: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.TUE with String = js.native
    /* "WED" */ val WED: typings.squareDashConnect.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum.WED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DayOfWeekEnum with String] = js.native
  }
  
}

