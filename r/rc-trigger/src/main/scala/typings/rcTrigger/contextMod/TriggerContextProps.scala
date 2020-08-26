package typings.rcTrigger.contextMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerContextProps extends js.Object {
  var onPopupMouseDown: MouseEventHandler[HTMLElement] = js.native
}

object TriggerContextProps {
  @scala.inline
  def apply(onPopupMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): TriggerContextProps = {
    val __obj = js.Dynamic.literal(onPopupMouseDown = js.Any.fromFunction1(onPopupMouseDown))
    __obj.asInstanceOf[TriggerContextProps]
  }
  @scala.inline
  implicit class TriggerContextPropsOps[Self <: TriggerContextProps] (val x: Self) extends AnyVal {
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
    def setOnPopupMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onPopupMouseDown", js.Any.fromFunction1(value))
  }
  
}

