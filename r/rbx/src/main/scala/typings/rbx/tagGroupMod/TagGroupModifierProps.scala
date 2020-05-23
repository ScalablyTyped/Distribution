package typings.rbx.tagGroupMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagGroupModifierProps extends js.Object {
  var gapless: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[medium | large] = js.undefined
}

object TagGroupModifierProps {
  @scala.inline
  def apply(gapless: js.UndefOr[Boolean] = js.undefined, size: medium | large = null): TagGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gapless)) __obj.updateDynamic("gapless")(gapless.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagGroupModifierProps]
  }
}

