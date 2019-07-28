package typings.reactDashDayDashPicker.typesDayPickerMod

import typings.react.reactMod.Component
import typings.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import typings.std.Date
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayPicker
  extends Component[DayPickerProps, js.Any, js.Any] {
  val dayPicker: HTMLDivElement = js.native
  def showMonth(month: Date): Unit = js.native
  def showNextMonth(): Unit = js.native
  def showNextYear(): Unit = js.native
  def showPreviousMonth(): Unit = js.native
  def showPreviousYear(): Unit = js.native
}

