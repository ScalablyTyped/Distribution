package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleStyle extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontWeight: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.normal | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.bold | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`100` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`200` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`300` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`400` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`500` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`600` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`700` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`800` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`900`
  ] = js.undefined
  var left: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.absolute | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.relative
  ] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object CardTitleStyle {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontWeight: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.normal | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.bold | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`100` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`200` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`300` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`400` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`500` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`600` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`700` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`800` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`900` = null,
    left: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    position: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.absolute | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.relative = null,
    top: scala.Int | scala.Double = null
  ): CardTitleStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTitleStyle]
  }
}

