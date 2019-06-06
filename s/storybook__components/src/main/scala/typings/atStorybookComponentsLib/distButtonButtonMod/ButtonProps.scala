package typings
package atStorybookComponentsLib.distButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var containsIcon: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inForm: js.UndefOr[scala.Boolean] = js.undefined
  var isLink: js.UndefOr[scala.Boolean] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var small: js.UndefOr[scala.Boolean] = js.undefined
  var tertiary: js.UndefOr[scala.Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    containsIcon: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inForm: js.UndefOr[scala.Boolean] = js.undefined,
    isLink: js.UndefOr[scala.Boolean] = js.undefined,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    small: js.UndefOr[scala.Boolean] = js.undefined,
    tertiary: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsIcon)) __obj.updateDynamic("containsIcon")(containsIcon)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(inForm)) __obj.updateDynamic("inForm")(inForm)
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary)
    __obj.asInstanceOf[ButtonProps]
  }
}

