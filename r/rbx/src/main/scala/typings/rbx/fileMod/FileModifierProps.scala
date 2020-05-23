package typings.rbx.fileMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var boxed: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var hasName: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object FileModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    boxed: js.UndefOr[Boolean] = js.undefined,
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    hasName: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): FileModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(boxed)) __obj.updateDynamic("boxed")(boxed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasName)) __obj.updateDynamic("hasName")(hasName.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileModifierProps]
  }
}

