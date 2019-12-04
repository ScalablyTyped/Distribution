package typings.rmcDashCalendar.libCalendarConfirmPanelMod

import typings.react.reactMod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPanel
  extends Component[ConfirmPanelPropsType, js.Object, js.Any] {
  def formatDate(date: Date): String = js.native
  def onConfirm(): Unit = js.native
}

