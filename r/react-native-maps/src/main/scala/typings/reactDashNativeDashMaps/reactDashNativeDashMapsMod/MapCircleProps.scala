package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait MapCircleProps extends js.Object {
  var center: LatLng
  var fillColor: js.UndefOr[String] = js.undefined
  var lineCap: js.UndefOr[LineCapType] = js.undefined
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[LineJoinType] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  var radius: Double
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapCircleProps {
  @scala.inline
  def apply(
    center: LatLng,
    radius: Double,
    fillColor: String = null,
    lineCap: LineCapType = null,
    lineDashPattern: js.Array[Double] = null,
    lineDashPhase: Int | Double = null,
    lineJoin: LineJoinType = null,
    miterLimit: Int | Double = null,
    onPress: /* event */ MapEvent[js.Object] => Unit = null,
    strokeColor: String = null,
    strokeWidth: Int | Double = null,
    zIndex: Int | Double = null
  ): MapCircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDashPattern != null) __obj.updateDynamic("lineDashPattern")(lineDashPattern.asInstanceOf[js.Any])
    if (lineDashPhase != null) __obj.updateDynamic("lineDashPhase")(lineDashPhase.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCircleProps]
  }
}

