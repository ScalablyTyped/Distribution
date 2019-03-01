package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMenuStyle extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.absolute | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.relative
  ] = js.undefined
  var right: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object CardMenuStyle {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    position: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.absolute | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.relative = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): CardMenuStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardMenuStyle]
  }
}

