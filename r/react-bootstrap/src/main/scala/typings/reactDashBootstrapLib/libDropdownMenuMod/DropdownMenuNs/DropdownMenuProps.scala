package typings
package reactDashBootstrapLib.libDropdownMenuMod.DropdownMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libDropdownMenuMod.DropdownMenu] {
  var labelledBy: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var onClose: js.UndefOr[js.Function] = js.undefined
  @JSName("onSelect")
  var onSelect_DropdownMenuProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
}

object DropdownMenuProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libDropdownMenuMod.DropdownMenu] = null,
    labelledBy: java.lang.String | scala.Double = null,
    onClose: js.Function = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

