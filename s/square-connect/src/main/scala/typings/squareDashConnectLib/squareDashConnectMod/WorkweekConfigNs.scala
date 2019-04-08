package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait FRI
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    @js.native
    sealed trait MON
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    @js.native
    sealed trait SAT
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    @js.native
    sealed trait SUN
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    @js.native
    sealed trait THU
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    @js.native
    sealed trait TUE
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    @js.native
    sealed trait WED
      extends squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
    
    /* "FRI" */ val FRI: FRI with java.lang.String = js.native
    /* "MON" */ val MON: MON with java.lang.String = js.native
    /* "SAT" */ val SAT: SAT with java.lang.String = js.native
    /* "SUN" */ val SUN: SUN with java.lang.String = js.native
    /* "THU" */ val THU: THU with java.lang.String = js.native
    /* "TUE" */ val TUE: TUE with java.lang.String = js.native
    /* "WED" */ val WED: WED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum with java.lang.String
      ] = js.native
  }
  
}

