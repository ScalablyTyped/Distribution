package typings.rbx.controlMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlModifierProps extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
  var iconLeft: js.UndefOr[Boolean] = js.undefined
  var iconRight: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object ControlModifierProps {
  @scala.inline
  def apply(
    expanded: js.UndefOr[Boolean] = js.undefined,
    iconLeft: js.UndefOr[Boolean] = js.undefined,
    iconRight: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): ControlModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconLeft)) __obj.updateDynamic("iconLeft")(iconLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlModifierProps]
  }
}

