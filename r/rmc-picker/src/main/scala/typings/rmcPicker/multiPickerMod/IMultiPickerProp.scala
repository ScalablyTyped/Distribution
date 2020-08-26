package typings.rmcPicker.multiPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiPickerProp extends js.Object {
  def getValue(): js.Any = js.native
}

object IMultiPickerProp {
  @scala.inline
  def apply(getValue: () => js.Any): IMultiPickerProp = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[IMultiPickerProp]
  }
  @scala.inline
  implicit class IMultiPickerPropOps[Self <: IMultiPickerProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
  }
  
}

