package typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EVENT_TYPE extends js.Object

@JSImport("react-infinite-calendar", "EVENT_TYPE")
@js.native
object EVENT_TYPE extends js.Object {
  @js.native
  sealed trait END extends EVENT_TYPE
  
  @js.native
  sealed trait HOVER extends EVENT_TYPE
  
  @js.native
  sealed trait START extends EVENT_TYPE
  
  /* 1 */ val END: typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod.EVENT_TYPE.END with Double = js.native
  /* 0 */ val HOVER: typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod.EVENT_TYPE.HOVER with Double = js.native
  /* 1 */ val START: typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod.EVENT_TYPE.START with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EVENT_TYPE with Double] = js.native
}

