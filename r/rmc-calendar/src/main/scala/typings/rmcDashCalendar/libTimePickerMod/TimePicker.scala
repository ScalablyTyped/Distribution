package typings.rmcDashCalendar.libTimePickerMod

import typings.react.reactMod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[PropsType, StateType, js.Any] {
  def getMaxTime(): js.UndefOr[Date] = js.native
  def getMaxTime(date: Date): js.UndefOr[Date] = js.native
  def getMinTime(): js.UndefOr[Date] = js.native
  def getMinTime(date: Date): js.UndefOr[Date] = js.native
  def onDateChange(date: Date): Unit = js.native
}

