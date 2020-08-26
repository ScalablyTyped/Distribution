package typings.rbx.navbarBurgerMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarBurgerModifierProps extends js.Object {
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
}

object NavbarBurgerModifierProps {
  @scala.inline
  def apply(): NavbarBurgerModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarBurgerModifierProps]
  }
  @scala.inline
  implicit class NavbarBurgerModifierPropsOps[Self <: NavbarBurgerModifierProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

