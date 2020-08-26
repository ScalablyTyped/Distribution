package typings.reactMdForm.useIndeterminateCheckedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvidedIndeterminateControlledCheckboxProps[T /* <: String */] extends js.Object {
  var checked: Boolean = js.native
  var value: T = js.native
  def onChange(): Unit = js.native
}

object ProvidedIndeterminateControlledCheckboxProps {
  @scala.inline
  def apply[/* <: java.lang.String */ T](checked: Boolean, onChange: () => Unit, value: T): ProvidedIndeterminateControlledCheckboxProps[T] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedIndeterminateControlledCheckboxProps[T]]
  }
  @scala.inline
  implicit class ProvidedIndeterminateControlledCheckboxPropsOps[Self <: ProvidedIndeterminateControlledCheckboxProps[_], /* <: java.lang.String */ T] (val x: Self with ProvidedIndeterminateControlledCheckboxProps[T]) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

