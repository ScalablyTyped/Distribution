package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapCircleProps extends js.Object {
  var center: LatLng
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var lineCap: js.UndefOr[LineCapType] = js.undefined
  var lineDashPattern: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineDashPhase: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[LineJoinType] = js.undefined
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var radius: scala.Double
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapCircleProps {
  @scala.inline
  def apply(
    center: LatLng,
    radius: scala.Double,
    fillColor: java.lang.String = null,
    lineCap: LineCapType = null,
    lineDashPattern: js.Array[scala.Double] = null,
    lineDashPhase: scala.Int | scala.Double = null,
    lineJoin: LineJoinType = null,
    miterLimit: scala.Int | scala.Double = null,
    onPress: /* event */ MapEvent[js.Object] => scala.Unit = null,
    strokeColor: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): MapCircleProps = {
    val __obj = js.Dynamic.literal(center = center, radius = radius)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineDashPattern != null) __obj.updateDynamic("lineDashPattern")(lineDashPattern)
    if (lineDashPhase != null) __obj.updateDynamic("lineDashPhase")(lineDashPhase.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCircleProps]
  }
}

