package typings
package reactDashBootstrapLib.libPaginationItemMod.PaginationItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationItemMod.PaginationItem] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
}

object PaginationItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationItemMod.PaginationItem] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationItemProps]
  }
}

