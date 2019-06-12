package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftWorkday")
@js.native
object ShiftWorkdayNs extends js.Object {
  @js.native
  sealed trait MatchShiftsByEnum extends js.Object
  
  @js.native
  object MatchShiftsByEnum extends js.Object {
    @js.native
    sealed trait END_AT
      extends squareDashConnectLib.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum
    
    @js.native
    sealed trait INTERSECTION
      extends squareDashConnectLib.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum
    
    @js.native
    sealed trait START_AT
      extends squareDashConnectLib.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum
    
    /* "END_AT" */ val END_AT: END_AT with java.lang.String = js.native
    /* "INTERSECTION" */ val INTERSECTION: INTERSECTION with java.lang.String = js.native
    /* "START_AT" */ val START_AT: START_AT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum with java.lang.String
      ] = js.native
  }
  
}

