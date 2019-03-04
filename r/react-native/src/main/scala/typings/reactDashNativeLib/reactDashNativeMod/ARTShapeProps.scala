package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTShapeProps extends ARTRenderableMixin {
  var d: java.lang.String
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ARTShapeProps {
  @scala.inline
  def apply(
    d: java.lang.String,
    fill: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    originX: scala.Int | scala.Double = null,
    originY: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeCap: reactDashNativeLib.reactDashNativeLibStrings.butt | reactDashNativeLib.reactDashNativeLibStrings.square | reactDashNativeLib.reactDashNativeLibStrings.round = null,
    strokeDash: js.Array[scala.Double] = null,
    strokeJoin: reactDashNativeLib.reactDashNativeLibStrings.bevel | reactDashNativeLib.reactDashNativeLibStrings.miter | reactDashNativeLib.reactDashNativeLibStrings.round = null,
    strokeWidth: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ARTShapeProps = {
    val __obj = js.Dynamic.literal(d = d)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTShapeProps]
  }
}

