package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum
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
    sealed trait END_AT extends MatchShiftsByEnum
    
    @js.native
    sealed trait INTERSECTION extends MatchShiftsByEnum
    
    @js.native
    sealed trait START_AT extends MatchShiftsByEnum
    
    /* "END_AT" */ val END_AT: typings.squareDashConnect.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum.END_AT with String = js.native
    /* "INTERSECTION" */ val INTERSECTION: typings.squareDashConnect.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum.INTERSECTION with String = js.native
    /* "START_AT" */ val START_AT: typings.squareDashConnect.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum.START_AT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MatchShiftsByEnum with String] = js.native
  }
  
}

