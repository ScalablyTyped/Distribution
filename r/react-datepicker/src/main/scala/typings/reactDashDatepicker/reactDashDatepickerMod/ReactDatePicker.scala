package typings.reactDashDatepicker.reactDashDatepickerMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactDatePicker
  extends Component[ReactDatePickerProps, js.Object, js.Any] {
  def isCalendarOpen(): Boolean = js.native
  def setBlur(): Unit = js.native
  def setFocus(): Unit = js.native
  def setOpen(open: Boolean): Unit = js.native
  def setOpen(open: Boolean, skipSetBlur: Boolean): Unit = js.native
}

