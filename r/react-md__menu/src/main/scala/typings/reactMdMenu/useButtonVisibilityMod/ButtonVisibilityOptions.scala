package typings.reactMdMenu.useButtonVisibilityMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactMdMenu.useVisibilityMod.VisibilityOptions
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonVisibilityOptions extends VisibilityOptions {
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
}

object ButtonVisibilityOptions {
  @scala.inline
  def apply(): ButtonVisibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonVisibilityOptions]
  }
  @scala.inline
  implicit class ButtonVisibilityOptionsOps[Self <: ButtonVisibilityOptions] (val x: Self) extends AnyVal {
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
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
  
}

