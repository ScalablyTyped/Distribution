package typings.storybookComponents.buttonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends js.Object {
  var containsIcon: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inForm: js.UndefOr[Boolean] = js.native
  var isLink: js.UndefOr[Boolean] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
  var small: js.UndefOr[Boolean] = js.native
  var tertiary: js.UndefOr[Boolean] = js.native
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
    if (!js.isUndefined(containsIcon)) __obj.updateDynamic("containsIcon")(containsIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(inForm)) __obj.updateDynamic("inForm")(inForm.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

