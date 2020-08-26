package typings.rcPicker.interfaceMod

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelRefProps extends js.Object {
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Boolean]] = js.native
}

object PanelRefProps {
  @scala.inline
  def apply(): PanelRefProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelRefProps]
  }
  @scala.inline
  implicit class PanelRefPropsOps[Self <: PanelRefProps] (val x: Self) extends AnyVal {
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
    def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Boolean): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
  
}

