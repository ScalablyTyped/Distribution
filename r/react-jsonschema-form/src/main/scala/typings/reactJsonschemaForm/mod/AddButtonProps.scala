package typings.reactJsonschemaForm.mod

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddButtonProps extends js.Object {
  var className: String = js.native
  var disabled: Boolean = js.native
  def onClick(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit = js.native
}

object AddButtonProps {
  @scala.inline
  def apply(
    className: String,
    disabled: Boolean,
    onClick: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[AddButtonProps]
  }
  @scala.inline
  implicit class AddButtonPropsOps[Self <: AddButtonProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
  }
  
}

