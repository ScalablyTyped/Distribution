package typings.rbx.otherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherHelpersProps extends js.Object {
  var marginless: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  var unselectable: js.UndefOr[Boolean] = js.undefined
}

object OtherHelpersProps {
  @scala.inline
  def apply(
    marginless: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    relative: js.UndefOr[Boolean] = js.undefined,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    unselectable: js.UndefOr[Boolean] = js.undefined
  ): OtherHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherHelpersProps]
  }
}

