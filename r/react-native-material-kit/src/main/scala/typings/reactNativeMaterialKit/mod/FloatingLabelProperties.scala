package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.mod.MKPropTypes.font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingLabelProperties extends js.Object {
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var floatingLabelAniDuration: js.UndefOr[Double] = js.undefined
  var floatingLabelBottomMargin: js.UndefOr[Double] = js.undefined
  var floatingLabelEnabled: js.UndefOr[Boolean] = js.undefined
  var floatingLabelFont: js.UndefOr[font] = js.undefined
}

object FloatingLabelProperties {
  @scala.inline
  def apply(
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    floatingLabelAniDuration: js.UndefOr[Double] = js.undefined,
    floatingLabelBottomMargin: js.UndefOr[Double] = js.undefined,
    floatingLabelEnabled: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFont: font = null
  ): FloatingLabelProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelAniDuration)) __obj.updateDynamic("floatingLabelAniDuration")(floatingLabelAniDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelBottomMargin)) __obj.updateDynamic("floatingLabelBottomMargin")(floatingLabelBottomMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelEnabled)) __obj.updateDynamic("floatingLabelEnabled")(floatingLabelEnabled.get.asInstanceOf[js.Any])
    if (floatingLabelFont != null) __obj.updateDynamic("floatingLabelFont")(floatingLabelFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingLabelProperties]
  }
}

