package typings.rmcPicker.multiPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiPickerProp extends js.Object {
  def getValue(): js.Any
}

object IMultiPickerProp {
  @scala.inline
  def apply(getValue: () => js.Any): IMultiPickerProp = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[IMultiPickerProp]
  }
}

