package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.native
  var date: stdLib.Date = js.native
  var label: java.lang.String = js.native
  var localizer: reactDashBigDashCalendarLib.Anon_Messages = js.native
  var view: View = js.native
  var views: ViewsProps = js.native
  def onNavigate(navigate: NavigateAction): scala.Unit = js.native
  def onNavigate(navigate: NavigateAction, date: stdLib.Date): scala.Unit = js.native
  def onView(view: View): scala.Unit = js.native
}

