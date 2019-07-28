package typings.atStorybookComponents.distButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var containsIcon: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inForm: js.UndefOr[Boolean] = js.undefined
  var isLink: js.UndefOr[Boolean] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var small: js.UndefOr[Boolean] = js.undefined
  var tertiary: js.UndefOr[Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    containsIcon: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inForm: js.UndefOr[Boolean] = js.undefined,
    isLink: js.UndefOr[Boolean] = js.undefined,
    outline: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    tertiary: js.UndefOr[Boolean] = js.undefined
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

