package typings.atStorybookComponents.distTypographyLinkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkStylesProps extends js.Object {
  var inverse: js.UndefOr[Boolean] = js.undefined
  var isButton: js.UndefOr[Boolean] = js.undefined
  var nochrome: js.UndefOr[Boolean] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var tertiary: js.UndefOr[Boolean] = js.undefined
}

object LinkStylesProps {
  @scala.inline
  def apply(
    inverse: js.UndefOr[Boolean] = js.undefined,
    isButton: js.UndefOr[Boolean] = js.undefined,
    nochrome: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    tertiary: js.UndefOr[Boolean] = js.undefined
  ): LinkStylesProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton)
    if (!js.isUndefined(nochrome)) __obj.updateDynamic("nochrome")(nochrome)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary)
    __obj.asInstanceOf[LinkStylesProps]
  }
}

