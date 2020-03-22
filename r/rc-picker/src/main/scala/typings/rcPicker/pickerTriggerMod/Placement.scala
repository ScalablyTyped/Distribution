package typings.rcPicker.pickerTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcPicker.rcPickerStrings.bottomLeft
  - typings.rcPicker.rcPickerStrings.bottomRight
  - typings.rcPicker.rcPickerStrings.topLeft
  - typings.rcPicker.rcPickerStrings.topRight
*/
trait Placement extends js.Object

object Placement {
  @scala.inline
  def bottomLeft: typings.rcPicker.rcPickerStrings.bottomLeft = this.cast("bottomLeft")
  @scala.inline
  def bottomRight: typings.rcPicker.rcPickerStrings.bottomRight = this.cast("bottomRight")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def topLeft: typings.rcPicker.rcPickerStrings.topLeft = this.cast("topLeft")
  @scala.inline
  def topRight: typings.rcPicker.rcPickerStrings.topRight = this.cast("topRight")
}

