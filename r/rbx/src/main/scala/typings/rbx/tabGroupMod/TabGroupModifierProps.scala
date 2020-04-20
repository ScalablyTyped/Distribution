package typings.rbx.tabGroupMod

import typings.rbx.rbxStrings.`toggle-rounded`
import typings.rbx.rbxStrings.boxed
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[boxed | toggle | `toggle-rounded`] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object TabGroupModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    kind: boxed | toggle | `toggle-rounded` = null,
    size: small | medium | large = null
  ): TabGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupModifierProps]
  }
}

