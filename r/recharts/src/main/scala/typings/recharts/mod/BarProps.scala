package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.SFC
import typings.recharts.rechartsNumbers.`100`
import typings.recharts.rechartsNumbers.`200`
import typings.recharts.rechartsNumbers.`300`
import typings.recharts.rechartsNumbers.`400`
import typings.recharts.rechartsNumbers.`500`
import typings.recharts.rechartsNumbers.`600`
import typings.recharts.rechartsNumbers.`700`
import typings.recharts.rechartsNumbers.`800`
import typings.recharts.rechartsNumbers.`900`
import typings.recharts.rechartsStrings.auto
import typings.recharts.rechartsStrings.bold
import typings.recharts.rechartsStrings.bolder
import typings.recharts.rechartsStrings.crispEdges
import typings.recharts.rechartsStrings.geometricPrecision
import typings.recharts.rechartsStrings.inherit
import typings.recharts.rechartsStrings.lighter
import typings.recharts.rechartsStrings.normal
import typings.recharts.rechartsStrings.optimizeLegibility
import typings.recharts.rechartsStrings.optimizeQuality
import typings.recharts.rechartsStrings.optimizeSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent recharts.recharts.EventAttributes */
/* Inlined parent std.Partial<recharts.recharts.PresentationAttributes<number, number>> */
/* Inlined parent recharts.recharts.Animatable */
trait BarProps extends js.Object {
  var alignmentBaseline: js.UndefOr[String] = js.undefined
  var angle: js.UndefOr[Double] = js.undefined
  var animationBegin: js.UndefOr[Double] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationEasing: js.UndefOr[AnimationEasingType] = js.undefined
  var animationId: js.UndefOr[Double] = js.undefined
  var background: js.UndefOr[Boolean | ReactElement | ContentRenderer[_] | js.Object] = js.undefined
  var barSize: js.UndefOr[Double] = js.undefined
  var baselineShift: js.UndefOr[String] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var className: js.UndefOr[String] = js.undefined
  var clip: js.UndefOr[String] = js.undefined
  var clipPath: js.UndefOr[String] = js.undefined
  var clipRule: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorInterpolation: js.UndefOr[String] = js.undefined
  var colorInterpolationFilters: js.UndefOr[String] = js.undefined
  var colorProfile: js.UndefOr[String] = js.undefined
  var colorRendering: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[BarData]] = js.undefined
  var dataKey: DataKey
  var direction: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var dominantBaseline: js.UndefOr[String] = js.undefined
  var dx: js.UndefOr[Double] = js.undefined
  var dy: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double | String] = js.undefined
  var fillRule: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var floodColor: js.UndefOr[String] = js.undefined
  var floodOpacity: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double | String] = js.undefined
  var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
  var fontStretch: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontVariant: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[
    normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
  ] = js.undefined
  var glyphOrientationVertical: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageRendering: js.UndefOr[auto | optimizeSpeed | optimizeQuality | inherit] = js.undefined
  var isAnimationActive: js.UndefOr[Boolean] = js.undefined
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined
  var kerning: js.UndefOr[Double | String] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/Bar
  var label: js.UndefOr[
    Boolean | Label | LabelProps | SFC[LabelProps] | ReactElement | ContentRenderer[_]
  ] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var letterSpacing: js.UndefOr[String] = js.undefined
  var lightingColor: js.UndefOr[String] = js.undefined
  var markerEnd: js.UndefOr[String] = js.undefined
  var markerMid: js.UndefOr[String] = js.undefined
  var markerStart: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var maxBarSize: js.UndefOr[Double] = js.undefined
  var minPointSize: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String | Double] = js.undefined
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.undefined
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseDown: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseMove: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseOut: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseOver: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseUp: js.UndefOr[RechartsFunction] = js.undefined
  var onTouchCancel: js.UndefOr[RechartsFunction] = js.undefined
  var onTouchEnd: js.UndefOr[RechartsFunction] = js.undefined
  var onTouchMove: js.UndefOr[RechartsFunction] = js.undefined
  var onTouchStart: js.UndefOr[RechartsFunction] = js.undefined
  var opacity: js.UndefOr[Double | String] = js.undefined
  var overflow: js.UndefOr[String] = js.undefined
  var pointerEvents: js.UndefOr[String] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var shape: js.UndefOr[ReactElement | ContentRenderer[RectangleProps]] = js.undefined
  var shapeRendering: js.UndefOr[auto | optimizeSpeed | crispEdges | geometricPrecision | inherit] = js.undefined
  var stackId: js.UndefOr[String | Double] = js.undefined
  var stopColor: js.UndefOr[String] = js.undefined
  var stopOpacity: js.UndefOr[Double | String] = js.undefined
  var stroke: js.UndefOr[Double | String] = js.undefined
  var strokeDasharray: js.UndefOr[String] = js.undefined
  var strokeDashoffset: js.UndefOr[Double | String] = js.undefined
  var strokeLinecap: js.UndefOr[String] = js.undefined
  var strokeLinejoin: js.UndefOr[String] = js.undefined
  var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
  var strokeOpacity: js.UndefOr[Double | String] = js.undefined
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var textAnchor: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
  var textRendering: js.UndefOr[auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var unicodeBidi: js.UndefOr[String] = js.undefined
  var unit: js.UndefOr[String | Double] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wordSpacing: js.UndefOr[Double | String] = js.undefined
  var writingMode: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[String | Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}

object BarProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    alignmentBaseline: String = null,
    angle: js.UndefOr[Double] = js.undefined,
    animationBegin: js.UndefOr[Double] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: AnimationEasingType = null,
    animationId: js.UndefOr[Double] = js.undefined,
    background: Boolean | ReactElement | ContentRenderer[_] | js.Object = null,
    barSize: js.UndefOr[Double] = js.undefined,
    baselineShift: String = null,
    className: String = null,
    clip: String = null,
    clipPath: String = null,
    clipRule: String = null,
    color: String = null,
    colorInterpolation: String = null,
    colorInterpolationFilters: String = null,
    colorProfile: String = null,
    colorRendering: String = null,
    cursor: String = null,
    data: js.Array[BarData] = null,
    direction: String = null,
    display: String = null,
    dominantBaseline: String = null,
    dx: js.UndefOr[Double] = js.undefined,
    dy: js.UndefOr[Double] = js.undefined,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: String = null,
    filter: String = null,
    floodColor: String = null,
    floodOpacity: String = null,
    font: String = null,
    fontFamily: String = null,
    fontSize: Double | String = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit = null,
    glyphOrientationVertical: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hide: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageRendering: auto | optimizeSpeed | optimizeQuality | inherit = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    kerning: Double | String = null,
    label: Boolean | Label | LabelProps | SFC[LabelProps] | ReactElement | ContentRenderer[_] = null,
    layout: LayoutType = null,
    legendType: LegendType = null,
    letterSpacing: String = null,
    lightingColor: String = null,
    markerEnd: String = null,
    markerMid: String = null,
    markerStart: String = null,
    mask: String = null,
    maxBarSize: js.UndefOr[Double] = js.undefined,
    minPointSize: js.UndefOr[Double] = js.undefined,
    name: String | Double = null,
    onAnimationEnd: /* repeated */ js.Any => Unit = null,
    onAnimationStart: /* repeated */ js.Any => Unit = null,
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseDown: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null,
    onMouseMove: /* repeated */ js.Any => Unit = null,
    onMouseOut: /* repeated */ js.Any => Unit = null,
    onMouseOver: /* repeated */ js.Any => Unit = null,
    onMouseUp: /* repeated */ js.Any => Unit = null,
    onTouchCancel: /* repeated */ js.Any => Unit = null,
    onTouchEnd: /* repeated */ js.Any => Unit = null,
    onTouchMove: /* repeated */ js.Any => Unit = null,
    onTouchStart: /* repeated */ js.Any => Unit = null,
    opacity: Double | String = null,
    overflow: String = null,
    pointerEvents: String = null,
    r: js.UndefOr[Double] = js.undefined,
    radius: Double | js.Array[Double] = null,
    shape: ReactElement | ContentRenderer[RectangleProps] = null,
    shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit = null,
    stackId: String | Double = null,
    stopColor: String = null,
    stopOpacity: Double | String = null,
    stroke: Double | String = null,
    strokeDasharray: String = null,
    strokeDashoffset: Double | String = null,
    strokeLinecap: String = null,
    strokeLinejoin: String = null,
    strokeMiterlimit: Double | String = null,
    strokeOpacity: Double | String = null,
    strokeWidth: Double | String = null,
    style: js.Object = null,
    textAnchor: String = null,
    textDecoration: String = null,
    textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit = null,
    transform: String = null,
    unicodeBidi: String = null,
    unit: String | Double = null,
    visibility: String = null,
    width: js.UndefOr[Double] = js.undefined,
    wordSpacing: Double | String = null,
    writingMode: String = null,
    x: js.UndefOr[Double] = js.undefined,
    xAxis: js.Object = null,
    xAxisId: String | Double = null,
    y: js.UndefOr[Double] = js.undefined,
    yAxis: js.Object = null,
    yAxisId: String | Double = null
  ): BarProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationBegin)) __obj.updateDynamic("animationBegin")(animationBegin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(animationId)) __obj.updateDynamic("animationId")(animationId.get.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(barSize)) __obj.updateDynamic("barSize")(barSize.get.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (!js.isUndefined(dx)) __obj.updateDynamic("dx")(dx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dy)) __obj.updateDynamic("dy")(dy.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive.get.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBarSize)) __obj.updateDynamic("maxBarSize")(maxBarSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPointSize)) __obj.updateDynamic("minPointSize")(minPointSize.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textRendering != null) __obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (unicodeBidi != null) __obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (writingMode != null) __obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProps]
  }
}

