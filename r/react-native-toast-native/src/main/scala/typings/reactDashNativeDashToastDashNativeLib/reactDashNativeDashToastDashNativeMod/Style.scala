package typings
package reactDashNativeDashToastDashNativeLib.reactDashNativeDashToastDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  // iOS-only
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var letterSpacing: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var lines: js.UndefOr[scala.Double] = js.undefined
  var paddingBottom: js.UndefOr[scala.Double] = js.undefined
  // Android-only
  var paddingLeft: js.UndefOr[scala.Double] = js.undefined
  var paddingRight: js.UndefOr[scala.Double] = js.undefined
  var paddingTop: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xOffset: js.UndefOr[scala.Double] = js.undefined
  var yOffset: js.UndefOr[scala.Double] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontWeight: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    letterSpacing: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    lines: scala.Int | scala.Double = null,
    paddingBottom: scala.Int | scala.Double = null,
    paddingLeft: scala.Int | scala.Double = null,
    paddingRight: scala.Int | scala.Double = null,
    paddingTop: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    xOffset: scala.Int | scala.Double = null,
    yOffset: scala.Int | scala.Double = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xOffset != null) __obj.updateDynamic("xOffset")(xOffset.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

