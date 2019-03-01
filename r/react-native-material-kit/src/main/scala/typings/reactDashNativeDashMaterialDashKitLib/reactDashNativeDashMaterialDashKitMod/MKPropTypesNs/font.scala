package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.MKPropTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait font extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.normal | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.italic
  ] = js.undefined
  var fontWeight: js.UndefOr[
    reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.normal | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.bold | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`100` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`200` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`300` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`400` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`500` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`600` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`700` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`800` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`900`
  ] = js.undefined
}

object font {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.normal | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.italic = null,
    fontWeight: reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.normal | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.bold | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`100` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`200` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`300` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`400` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`500` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`600` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`700` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`800` | reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitLibStrings.`900` = null
  ): font = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[font]
  }
}

