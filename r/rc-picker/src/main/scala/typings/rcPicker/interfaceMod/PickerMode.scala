package typings.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<rc-picker.rc-picker/lib/interface.PanelMode, 'datetime' | 'decade'> */
/* Rewritten from type alias, can be one of: 
  - typings.rcPicker.rcPickerStrings.month
  - typings.rcPicker.rcPickerStrings.date
  - typings.rcPicker.rcPickerStrings.year
  - typings.rcPicker.rcPickerStrings.week
  - typings.rcPicker.rcPickerStrings.time
*/
trait PickerMode extends js.Object

object PickerMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.rcPicker.rcPickerStrings.date = this.cast("date")
  @scala.inline
  def month: typings.rcPicker.rcPickerStrings.month = this.cast("month")
  @scala.inline
  def time: typings.rcPicker.rcPickerStrings.time = this.cast("time")
  @scala.inline
  def week: typings.rcPicker.rcPickerStrings.week = this.cast("week")
  @scala.inline
  def year: typings.rcPicker.rcPickerStrings.year = this.cast("year")
}

