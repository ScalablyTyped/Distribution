package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapPolylineProps extends js.Object {
  var coordinates: js.Array[LatLng]
  var fillColor: js.UndefOr[String] = js.undefined
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var lineCap: js.UndefOr[LineCapType] = js.undefined
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[LineJoinType] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeColors: js.UndefOr[js.Array[String]] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var tappable: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapPolylineProps {
  @scala.inline
  def apply(
    coordinates: js.Array[LatLng],
    fillColor: String = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    lineCap: LineCapType = null,
    lineDashPattern: js.Array[Double] = null,
    lineDashPhase: Int | Double = null,
    lineJoin: LineJoinType = null,
    miterLimit: Int | Double = null,
    onPress: /* event */ MapEvent[js.Object] => Unit = null,
    strokeColor: String = null,
    strokeColors: js.Array[String] = null,
    strokeWidth: Int | Double = null,
    tappable: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): MapPolylineProps = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineDashPattern != null) __obj.updateDynamic("lineDashPattern")(lineDashPattern)
    if (lineDashPhase != null) __obj.updateDynamic("lineDashPhase")(lineDashPhase.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeColors != null) __obj.updateDynamic("strokeColors")(strokeColors)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPolylineProps]
  }
}

