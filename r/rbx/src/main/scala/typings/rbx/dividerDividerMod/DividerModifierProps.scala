package typings.rbx.dividerDividerMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerModifierProps extends js.Object {
  var children: js.UndefOr[String | Double] = js.undefined
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object DividerModifierProps {
  @scala.inline
  def apply(
    children: String | Double = null,
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): DividerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerModifierProps]
  }
}

