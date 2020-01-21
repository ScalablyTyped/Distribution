package typings.reactBootstrap.dropdownMenuMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
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
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

