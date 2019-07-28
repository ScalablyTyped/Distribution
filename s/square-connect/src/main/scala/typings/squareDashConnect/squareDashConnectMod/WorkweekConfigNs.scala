package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "WorkweekConfig")
@js.native
object WorkweekConfigNs extends js.Object {
  @js.native
  sealed trait StartOfWeekEnum extends js.Object
  
  @js.native
  object StartOfWeekEnum extends js.Object {
    @js.native
    sealed trait FRI extends StartOfWeekEnum
    
    @js.native
    sealed trait MON extends StartOfWeekEnum
    
    @js.native
    sealed trait SAT extends StartOfWeekEnum
    
    @js.native
    sealed trait SUN extends StartOfWeekEnum
    
    @js.native
    sealed trait THU extends StartOfWeekEnum
    
    @js.native
    sealed trait TUE extends StartOfWeekEnum
    
    @js.native
    sealed trait WED extends StartOfWeekEnum
    
    /* "FRI" */ val FRI: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.FRI with String = js.native
    /* "MON" */ val MON: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.MON with String = js.native
    /* "SAT" */ val SAT: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.SAT with String = js.native
    /* "SUN" */ val SUN: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.SUN with String = js.native
    /* "THU" */ val THU: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.THU with String = js.native
    /* "TUE" */ val TUE: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.TUE with String = js.native
    /* "WED" */ val WED: typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum.WED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StartOfWeekEnum with String] = js.native
  }
  
}

