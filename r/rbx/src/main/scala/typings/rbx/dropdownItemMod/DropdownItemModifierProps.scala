package typings.rbx.dropdownItemMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object DropdownItemModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null
  ): DropdownItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[DropdownItemModifierProps]
  }
}

