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
    floatingLabelAniDuration: Int | Double = null,
    floatingLabelBottomMargin: Int | Double = null,
    floatingLabelEnabled: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFont: font = null
  ): FloatingLabelProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (floatingLabelAniDuration != null) __obj.updateDynamic("floatingLabelAniDuration")(floatingLabelAniDuration.asInstanceOf[js.Any])
    if (floatingLabelBottomMargin != null) __obj.updateDynamic("floatingLabelBottomMargin")(floatingLabelBottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelEnabled)) __obj.updateDynamic("floatingLabelEnabled")(floatingLabelEnabled.asInstanceOf[js.Any])
    if (floatingLabelFont != null) __obj.updateDynamic("floatingLabelFont")(floatingLabelFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingLabelProperties]
  }
}

