package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`100`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`200`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`300`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`400`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`500`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`600`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`700`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`800`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.`900`
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.absolute
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.bold
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.normal
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[absolute | relative] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object CardTitleStyle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    fontSize: Int | Double = null,
    fontWeight: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null,
    left: Int | Double = null,
    padding: Int | Double = null,
    position: absolute | relative = null,
    top: Int | Double = null
  ): CardTitleStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTitleStyle]
  }
}

