package typings.rbx.navbarBurgerMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarBurgerModifierProps extends js.Object {
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object NavbarBurgerModifierProps {
  @scala.inline
  def apply(onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null): NavbarBurgerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[NavbarBurgerModifierProps]
  }
}

