package typings.reactNativeCalendarPicker.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarPicker
  extends Component[CalendarPickerProps, js.Object, js.Any] {
  def handleOnPressDay(day: Double): Unit = js.native
  def handleOnPressNext(): Unit = js.native
  def handleOnPressPrevious(): Unit = js.native
  def resetSelections(): Unit = js.native
}

