package typings.reactBigCalendar.mod

import typings.react.mod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-calendar", "Week")
@js.native
class Week ()
  extends Component[WeekProps, js.Object, js.Any]
/* static members */
@JSImport("react-big-calendar", "Week")
@js.native
object Week extends js.Object {
  
  def navigate(date: Date, action: NavigateAction): Date = js.native
  
  def range(date: Date): js.Array[Date] = js.native
  
  def title(date: Date): String = js.native
}
