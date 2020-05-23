package typings.rbx.navbarLinkMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarLinkModifierProps extends js.Object {
  var arrowless: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object NavbarLinkModifierProps {
  @scala.inline
  def apply(
    arrowless: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null
  ): NavbarLinkModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowless)) __obj.updateDynamic("arrowless")(arrowless.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[NavbarLinkModifierProps]
  }
}

