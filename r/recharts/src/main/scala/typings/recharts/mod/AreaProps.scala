package typings.recharts.mod

import typings.d3Path.mod.Path_
import typings.d3Shape.mod.CurveGenerator
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.anon.DotPropspayloadany
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
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent recharts.recharts.EventAttributes */
/* Inlined parent std.Partial<recharts.recharts.PresentationAttributes<number, number>> */
/* Inlined parent recharts.recharts.Animatable */
@js.native
trait AreaProps extends js.Object {
  
  var activeDot: js.UndefOr[Boolean | js.Object | ReactElement | ContentRenderer[_]] = js.native
  
  var alignmentBaseline: js.UndefOr[String] = js.native
  
  var angle: js.UndefOr[Double] = js.native
  
  var animationBegin: js.UndefOr[Double] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationEasing: js.UndefOr[AnimationEasingType] = js.native
  
  var animationId: js.UndefOr[Double] = js.native
  
  var baseLine: js.UndefOr[Double | js.Array[_]] = js.native
  
  var baselineShift: js.UndefOr[String] = js.native
  
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var className: js.UndefOr[String] = js.native
  
  var clip: js.UndefOr[String] = js.native
  
  var clipPath: js.UndefOr[String] = js.native
  
  var clipRule: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colorInterpolation: js.UndefOr[String] = js.native
  
  var colorInterpolationFilters: js.UndefOr[String] = js.native
  
  var colorProfile: js.UndefOr[String] = js.native
  
  var colorRendering: js.UndefOr[String] = js.native
  
  var connectNulls: js.UndefOr[Boolean] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var dataKey: DataKey = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var display: js.UndefOr[String] = js.native
  
  var dominantBaseline: js.UndefOr[String] = js.native
  
  var dot: js.UndefOr[Boolean | js.Object | ReactElement | ContentRenderer[DotPropspayloadany]] = js.native
  
  var dx: js.UndefOr[Double] = js.native
  
  var dy: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double | String] = js.native
  
  var fillRule: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var floodColor: js.UndefOr[String] = js.native
  
  var floodOpacity: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  
  var fontStretch: js.UndefOr[String] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var fontVariant: js.UndefOr[String] = js.native
  
  var fontWeight: js.UndefOr[
    normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
  ] = js.native
  
  var glyphOrientationVertical: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hide: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var imageRendering: js.UndefOr[auto | optimizeSpeed | optimizeQuality | inherit] = js.native
  
  var isAnimationActive: js.UndefOr[Boolean] = js.native
  
  var isRange: js.UndefOr[Boolean] = js.native
  
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.native
  
  var kerning: js.UndefOr[Double | String] = js.native
  
  var label: js.UndefOr[Boolean | js.Object | ContentRenderer[_] | ReactElement] = js.native
  
  var layout: js.UndefOr[LayoutType] = js.native
  
  var legendType: js.UndefOr[LegendType] = js.native
  
  var letterSpacing: js.UndefOr[String] = js.native
  
  var lightingColor: js.UndefOr[String] = js.native
  
  var markerEnd: js.UndefOr[String] = js.native
  
  var markerMid: js.UndefOr[String] = js.native
  
  var markerStart: js.UndefOr[String] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String | Double] = js.native
  
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.native
  
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.native
  
  var onClick: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseDown: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseMove: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseOut: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseOver: js.UndefOr[RechartsFunction] = js.native
  
  var onMouseUp: js.UndefOr[RechartsFunction] = js.native
  
  var onTouchCancel: js.UndefOr[RechartsFunction] = js.native
  
  var onTouchEnd: js.UndefOr[RechartsFunction] = js.native
  
  var onTouchMove: js.UndefOr[RechartsFunction] = js.native
  
  var onTouchStart: js.UndefOr[RechartsFunction] = js.native
  
  var opacity: js.UndefOr[Double | String] = js.native
  
  var overflow: js.UndefOr[String] = js.native
  
  var pointerEvents: js.UndefOr[String] = js.native
  
  var points: js.UndefOr[js.Array[Point]] = js.native
  
  var r: js.UndefOr[Double] = js.native
  
  var shapeRendering: js.UndefOr[auto | optimizeSpeed | crispEdges | geometricPrecision | inherit] = js.native
  
  var stackId: js.UndefOr[String | Double] = js.native
  
  var stopColor: js.UndefOr[String] = js.native
  
  var stopOpacity: js.UndefOr[Double | String] = js.native
  
  var stroke: js.UndefOr[Double | String] = js.native
  
  var strokeDasharray: js.UndefOr[String] = js.native
  
  var strokeDashoffset: js.UndefOr[Double | String] = js.native
  
  var strokeLinecap: js.UndefOr[String] = js.native
  
  var strokeLinejoin: js.UndefOr[String] = js.native
  
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  
  var strokeWidth: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var textAnchor: js.UndefOr[String] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
  
  var textRendering: js.UndefOr[auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit] = js.native
  
  var transform: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[LineType] = js.native
  
  var unicodeBidi: js.UndefOr[String] = js.native
  
  var unit: js.UndefOr[String | Double] = js.native
  
  var visibility: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var wordSpacing: js.UndefOr[Double | String] = js.native
  
  var writingMode: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xAxis: js.UndefOr[js.Object] = js.native
  
  var xAxisId: js.UndefOr[String | Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yAxis: js.UndefOr[js.Object] = js.native
  
  var yAxisId: js.UndefOr[String | Double] = js.native
}
object AreaProps {
  
  @scala.inline
  def apply(dataKey: DataKey): AreaProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaProps]
  }
  
  @scala.inline
  implicit class AreaPropsOps[Self <: AreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = this.set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKey(value: DataKey): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDotFunction1(value: _ => ReactNode): Self = this.set("activeDot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActiveDot(value: Boolean | js.Object | ReactElement | ContentRenderer[_]): Self = this.set("activeDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDot: Self = this.set("activeDot", js.undefined)
    
    @scala.inline
    def setAlignmentBaseline(value: String): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAnimationBegin(value: Double): Self = this.set("animationBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationBegin: Self = this.set("animationBegin", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: AnimationEasingType): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    
    @scala.inline
    def setAnimationId(value: Double): Self = this.set("animationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationId: Self = this.set("animationId", js.undefined)
    
    @scala.inline
    def setBaseLineVarargs(value: js.Any*): Self = this.set("baseLine", js.Array(value :_*))
    
    @scala.inline
    def setBaseLine(value: Double | js.Array[_]): Self = this.set("baseLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLine: Self = this.set("baseLine", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: String): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClip(value: String): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    
    @scala.inline
    def setClipRule(value: String): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: String): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorInterpolationFilters(value: String): Self = this.set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolationFilters: Self = this.set("colorInterpolationFilters", js.undefined)
    
    @scala.inline
    def setColorProfile(value: String): Self = this.set("colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorProfile: Self = this.set("colorProfile", js.undefined)
    
    @scala.inline
    def setColorRendering(value: String): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    
    @scala.inline
    def setConnectNulls(value: Boolean): Self = this.set("connectNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectNulls: Self = this.set("connectNulls", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: String): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    
    @scala.inline
    def setDotFunction1(value: DotPropspayloadany => ReactNode): Self = this.set("dot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDot(value: Boolean | js.Object | ReactElement | ContentRenderer[DotPropspayloadany]): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: String): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFloodColor(value: String): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: String): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontStretch(value: String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(
      value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
    ): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: String): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageRendering(value: auto | optimizeSpeed | optimizeQuality | inherit): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    
    @scala.inline
    def setIsAnimationActive(value: Boolean): Self = this.set("isAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnimationActive: Self = this.set("isAnimationActive", js.undefined)
    
    @scala.inline
    def setIsRange(value: Boolean): Self = this.set("isRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRange: Self = this.set("isRange", js.undefined)
    
    @scala.inline
    def setIsUpdateAnimationActive(value: Boolean): Self = this.set("isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUpdateAnimationActive: Self = this.set("isUpdateAnimationActive", js.undefined)
    
    @scala.inline
    def setKerning(value: Double | String): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setLabelFunction1(value: _ => ReactNode): Self = this.set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: Boolean | js.Object | ContentRenderer[_] | ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLayout(value: LayoutType): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLegendType(value: LegendType): Self = this.set("legendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendType: Self = this.set("legendType", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: String): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: String): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setName(value: String | Double): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: /* repeated */ js.Any => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: /* repeated */ js.Any => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: /* repeated */ js.Any => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* repeated */ js.Any => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* repeated */ js.Any => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* repeated */ js.Any => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    
    @scala.inline
    def setStackId(value: String | Double): Self = this.set("stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
    
    @scala.inline
    def setStopColor(value: String): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: Double | String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeDasharray(value: String): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: Double | String): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: String): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: String): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextRendering(value: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTypeFunction1(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: LineType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: String): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    
    @scala.inline
    def setUnit(value: String | Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: String): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXAxis(value: js.Object): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setXAxisId(value: String | Double): Self = this.set("xAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisId: Self = this.set("xAxisId", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYAxis(value: js.Object): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setYAxisId(value: String | Double): Self = this.set("yAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisId: Self = this.set("yAxisId", js.undefined)
  }
}
