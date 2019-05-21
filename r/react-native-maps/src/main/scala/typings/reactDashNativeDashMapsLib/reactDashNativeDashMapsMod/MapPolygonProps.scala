package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapPolygonProps extends js.Object {
  var coordinates: js.Array[LatLng]
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var geodesic: js.UndefOr[scala.Boolean] = js.undefined
  var holes: js.UndefOr[js.Array[js.Array[LatLng]]] = js.undefined
  var lineCap: js.UndefOr[LineCapType] = js.undefined
  var lineDashPattern: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineDashPhase: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[LineJoinType] = js.undefined
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var tappable: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapPolygonProps {
  @scala.inline
  def apply(
    coordinates: js.Array[LatLng],
    fillColor: java.lang.String = null,
    geodesic: js.UndefOr[scala.Boolean] = js.undefined,
    holes: js.Array[js.Array[LatLng]] = null,
    lineCap: LineCapType = null,
    lineDashPattern: js.Array[scala.Double] = null,
    lineDashPhase: scala.Int | scala.Double = null,
    lineJoin: LineJoinType = null,
    miterLimit: scala.Int | scala.Double = null,
    onPress: /* event */ MapEvent[js.Object] => scala.Unit = null,
    strokeColor: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    tappable: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): MapPolygonProps = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (holes != null) __obj.updateDynamic("holes")(holes)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineDashPattern != null) __obj.updateDynamic("lineDashPattern")(lineDashPattern)
    if (lineDashPhase != null) __obj.updateDynamic("lineDashPhase")(lineDashPhase.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPolygonProps]
  }
}

