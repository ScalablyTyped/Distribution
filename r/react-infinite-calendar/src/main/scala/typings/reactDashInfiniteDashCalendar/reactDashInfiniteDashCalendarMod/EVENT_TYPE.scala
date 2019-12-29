package typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EVENT_TYPE with Double] = js.native
  /* 1 */ @js.native
  object END extends TopLevel[END with Double]
  
  /* 0 */ @js.native
  object HOVER extends TopLevel[HOVER with Double]
  
  /* 1 */ @js.native
  object START extends TopLevel[START with Double]
  
}

