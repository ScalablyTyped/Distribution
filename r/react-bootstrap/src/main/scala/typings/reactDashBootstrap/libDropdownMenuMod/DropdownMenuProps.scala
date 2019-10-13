package typings.reactDashBootstrap.libDropdownMenuMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps
  extends AllHTMLAttributes[DropdownMenu]
     with ClassAttributes[DropdownMenu] {
  var labelledBy: js.UndefOr[String | Double] = js.undefined
  var onClose: js.UndefOr[js.Function] = js.undefined
  @JSName("onSelect")
  var onSelect_DropdownMenuProps: js.UndefOr[SelectCallback] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object DropdownMenuProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[DropdownMenu] = null,
    ClassAttributes: ClassAttributes[DropdownMenu] = null,
    labelledBy: String | Double = null,
    onClose: js.Function = null,
    onSelect: SelectCallback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

