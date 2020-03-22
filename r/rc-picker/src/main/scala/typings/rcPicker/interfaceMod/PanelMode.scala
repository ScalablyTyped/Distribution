package typings.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcPicker.rcPickerStrings.time
  - typings.rcPicker.rcPickerStrings.date
  - typings.rcPicker.rcPickerStrings.week
  - typings.rcPicker.rcPickerStrings.month
  - typings.rcPicker.rcPickerStrings.year
  - typings.rcPicker.rcPickerStrings.decade
*/
trait PanelMode extends js.Object

object PanelMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.rcPicker.rcPickerStrings.date = this.cast("date")
  @scala.inline
  def decade: typings.rcPicker.rcPickerStrings.decade = this.cast("decade")
  @scala.inline
  def month: typings.rcPicker.rcPickerStrings.month = this.cast("month")
  @scala.inline
  def time: typings.rcPicker.rcPickerStrings.time = this.cast("time")
  @scala.inline
  def week: typings.rcPicker.rcPickerStrings.week = this.cast("week")
  @scala.inline
  def year: typings.rcPicker.rcPickerStrings.year = this.cast("year")
}

