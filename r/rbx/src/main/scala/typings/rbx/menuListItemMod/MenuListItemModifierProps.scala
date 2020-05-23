package typings.rbx.menuListItemMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuListItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var menu: js.UndefOr[ReactNode] = js.undefined
}

object MenuListItemModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, menu: ReactNode = null): MenuListItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListItemModifierProps]
  }
}

