package typings.rcPicker.pickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerRefConfig extends js.Object {
  def blur(): Unit
  def focus(): Unit
}

object PickerRefConfig {
  @scala.inline
  def apply(blur: () => Unit, focus: () => Unit): PickerRefConfig = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[PickerRefConfig]
  }
}

