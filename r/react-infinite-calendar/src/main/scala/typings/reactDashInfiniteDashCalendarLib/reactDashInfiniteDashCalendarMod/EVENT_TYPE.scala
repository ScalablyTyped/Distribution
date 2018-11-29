package typings
package reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EVENT_TYPE extends js.Object

@JSImport("react-infinite-calendar", "EVENT_TYPE")
@js.native
object EVENT_TYPE extends js.Object {
  @js.native
  sealed trait END
    extends reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.EVENT_TYPE
  
  @js.native
  sealed trait HOVER
    extends reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.EVENT_TYPE
  
  @js.native
  sealed trait START
    extends reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.EVENT_TYPE
  
  val END: END with scala.Double = js.native
  val HOVER: HOVER with scala.Double = js.native
  /* 1 */ val START: START with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.EVENT_TYPE with scala.Double
  ] = js.native
}

