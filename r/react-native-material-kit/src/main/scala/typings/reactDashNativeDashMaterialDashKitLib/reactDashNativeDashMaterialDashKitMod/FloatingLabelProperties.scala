package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingLabelProperties extends js.Object {
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  var floatingLabelAniDuration: js.UndefOr[scala.Double] = js.undefined
  var floatingLabelBottomMargin: js.UndefOr[scala.Double] = js.undefined
  var floatingLabelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var floatingLabelFont: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.MKPropTypesNs.font
  ] = js.undefined
}

object FloatingLabelProperties {
  @scala.inline
  def apply(
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelAniDuration: scala.Int | scala.Double = null,
    floatingLabelBottomMargin: scala.Int | scala.Double = null,
    floatingLabelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelFont: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.MKPropTypesNs.font = null
  ): FloatingLabelProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (floatingLabelAniDuration != null) __obj.updateDynamic("floatingLabelAniDuration")(floatingLabelAniDuration.asInstanceOf[js.Any])
    if (floatingLabelBottomMargin != null) __obj.updateDynamic("floatingLabelBottomMargin")(floatingLabelBottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelEnabled)) __obj.updateDynamic("floatingLabelEnabled")(floatingLabelEnabled)
    if (floatingLabelFont != null) __obj.updateDynamic("floatingLabelFont")(floatingLabelFont)
    __obj.asInstanceOf[FloatingLabelProperties]
  }
}

