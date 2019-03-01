package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStyle extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  var shadowOffset: js.UndefOr[reactDashNativeDashMaterialDashKitLib.Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[scala.Double] = js.undefined
  var shadowRadius: js.UndefOr[scala.Double] = js.undefined
}

object CardStyle {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffset: reactDashNativeDashMaterialDashKitLib.Anon_Height = null,
    shadowOpacity: scala.Int | scala.Double = null,
    shadowRadius: scala.Int | scala.Double = null
  ): CardStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardStyle]
  }
}

