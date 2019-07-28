package typings.reactDashNativeDashToastDashNative.reactDashNativeDashToastDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  // iOS-only
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var paddingBottom: js.UndefOr[Double] = js.undefined
  // Android-only
  var paddingLeft: js.UndefOr[Double] = js.undefined
  var paddingRight: js.UndefOr[Double] = js.undefined
  var paddingTop: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xOffset: js.UndefOr[Double] = js.undefined
  var yOffset: js.UndefOr[Double] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    color: String = null,
    fontSize: Int | Double = null,
    fontWeight: String = null,
    height: Int | Double = null,
    letterSpacing: Int | Double = null,
    lineHeight: Int | Double = null,
    lines: Int | Double = null,
    paddingBottom: Int | Double = null,
    paddingLeft: Int | Double = null,
    paddingRight: Int | Double = null,
    paddingTop: Int | Double = null,
    width: Int | Double = null,
    xOffset: Int | Double = null,
    yOffset: Int | Double = null
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

