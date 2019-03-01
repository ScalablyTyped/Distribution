package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionStyle extends js.Object {
  var borderStyle: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.solid | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.dotted | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.dashed
  ] = js.undefined
  var borderTopColor: js.UndefOr[java.lang.String] = js.undefined
  var borderTopWidth: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object CardActionStyle {
  @scala.inline
  def apply(
    borderStyle: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.solid | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.dotted | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.dashed = null,
    borderTopColor: java.lang.String = null,
    borderTopWidth: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null
  ): CardActionStyle = {
    val __obj = js.Dynamic.literal()
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor)
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardActionStyle]
  }
}

