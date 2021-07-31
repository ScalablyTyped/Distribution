package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
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
import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.circle
import typings.recharts.rechartsStrings.crispEdges
import typings.recharts.rechartsStrings.geometricPrecision
import typings.recharts.rechartsStrings.inherit
import typings.recharts.rechartsStrings.inner
import typings.recharts.rechartsStrings.lighter
import typings.recharts.rechartsStrings.normal
import typings.recharts.rechartsStrings.number
import typings.recharts.rechartsStrings.optimizeLegibility
import typings.recharts.rechartsStrings.optimizeQuality
import typings.recharts.rechartsStrings.optimizeSpeed
import typings.recharts.rechartsStrings.outer
import typings.recharts.rechartsStrings.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent recharts.recharts.EventAttributes */
/* Inlined parent std.Partial<recharts.recharts.PresentationAttributes<number, number>> */
trait PolarAngleAxisProps extends StObject {
  
  var alignmentBaseline: js.UndefOr[String] = js.undefined
  
  var allowDuplicatedCategory: js.UndefOr[Boolean] = js.undefined
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var angleAxisId: js.UndefOr[String | Double] = js.undefined
  
  // this seems not being used by the lib.
  var axisLine: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var axisLineType: js.UndefOr[polygon | circle] = js.undefined
  
  var baselineShift: js.UndefOr[String] = js.undefined
  
  var clip: js.UndefOr[String] = js.undefined
  
  var clipPath: js.UndefOr[String] = js.undefined
  
  var clipRule: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colorInterpolation: js.UndefOr[String] = js.undefined
  
  var colorInterpolationFilters: js.UndefOr[String] = js.undefined
  
  var colorProfile: js.UndefOr[String] = js.undefined
  
  var colorRendering: js.UndefOr[String] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var cx: js.UndefOr[Double] = js.undefined
  
  var cy: js.UndefOr[Double] = js.undefined
  
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
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
  
  var imageRendering: js.UndefOr[auto | optimizeSpeed | optimizeQuality | inherit] = js.undefined
  
  var kerning: js.UndefOr[Double | String] = js.undefined
  
  var letterSpacing: js.UndefOr[String] = js.undefined
  
  var lightingColor: js.UndefOr[String] = js.undefined
  
  var markerEnd: js.UndefOr[String] = js.undefined
  
  var markerMid: js.UndefOr[String] = js.undefined
  
  var markerStart: js.UndefOr[String] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
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
  
  var orientation: js.UndefOr[inner | outer] = js.undefined
  
  var overflow: js.UndefOr[String] = js.undefined
  
  var pointerEvents: js.UndefOr[String] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Percentage | Double] = js.undefined
  
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  
  var shapeRendering: js.UndefOr[auto | optimizeSpeed | crispEdges | geometricPrecision | inherit] = js.undefined
  
  var stopColor: js.UndefOr[String] = js.undefined
  
  var stopOpacity: js.UndefOr[Double | String] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
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
  
  var tick: js.UndefOr[Boolean | ContentRenderer[js.Any] | js.Object | ReactElement] = js.undefined
  
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  
  var tickLine: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var ticks: js.UndefOr[js.Array[PolarAngleAxisTick]] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[number | category] = js.undefined
  
  var unicodeBidi: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wordSpacing: js.UndefOr[Double | String] = js.undefined
  
  var writingMode: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PolarAngleAxisProps {
  
  @scala.inline
  def apply(): PolarAngleAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolarAngleAxisProps]
  }
  
  @scala.inline
  implicit class PolarAngleAxisPropsMutableBuilder[Self <: PolarAngleAxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAllowDuplicatedCategory(value: Boolean): Self = StObject.set(x, "allowDuplicatedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDuplicatedCategoryUndefined: Self = StObject.set(x, "allowDuplicatedCategory", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleAxisId(value: String | Double): Self = StObject.set(x, "angleAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleAxisIdUndefined: Self = StObject.set(x, "angleAxisId", js.undefined)
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAxisLine(value: Boolean | js.Object): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLineType(value: polygon | circle): Self = StObject.set(x, "axisLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLineTypeUndefined: Self = StObject.set(x, "axisLineType", js.undefined)
    
    @scala.inline
    def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    @scala.inline
    def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolation(value: String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFilters(value: String): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorProfile(value: String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
    
    @scala.inline
    def setColorRendering(value: String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(
      value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setImageRendering(value: auto | optimizeSpeed | optimizeQuality | inherit): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    @scala.inline
    def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setOnClick(value: RechartsFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: RechartsFunction): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: RechartsFunction): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: RechartsFunction): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: RechartsFunction): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: RechartsFunction): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: RechartsFunction): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: RechartsFunction): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: RechartsFunction): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: RechartsFunction): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: RechartsFunction): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: RechartsFunction): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrientation(value: inner | outer): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRadius(value: Percentage | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setScale(value: ScaleType | RechartsFunction): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    @scala.inline
    def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: Double | String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextRendering(value: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    @scala.inline
    def setTick(value: Boolean | ContentRenderer[js.Any] | js.Object | ReactElement): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickFormatter(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    @scala.inline
    def setTickFunction1(value: js.Any => ReactNode): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickLine(value: Boolean | js.Object): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[PolarAngleAxisTick]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: PolarAngleAxisTick*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setType(value: number | category): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
