package typings.rbx.navbarLinkMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarLinkModifierProps extends js.Object {
  var arrowless: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
}

object NavbarLinkModifierProps {
  @scala.inline
  def apply(): NavbarLinkModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarLinkModifierProps]
  }
  @scala.inline
  implicit class NavbarLinkModifierPropsOps[Self <: NavbarLinkModifierProps] (val x: Self) extends AnyVal {
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
    def setArrowless(value: Boolean): Self = this.set("arrowless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowless: Self = this.set("arrowless", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

