package typings.recharts.mod

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

/* Inlined parent std.Partial<recharts.recharts.PresentationAttributes<number, number>> */
@js.native
trait CellProps extends js.Object {
  var alignmentBaseline: js.UndefOr[String] = js.native
  var angle: js.UndefOr[Double] = js.native
  var baselineShift: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var clip: js.UndefOr[String] = js.native
  var clipPath: js.UndefOr[String] = js.native
  var clipRule: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var colorInterpolation: js.UndefOr[String] = js.native
  var colorInterpolationFilters: js.UndefOr[String] = js.native
  var colorProfile: js.UndefOr[String] = js.native
  var colorRendering: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var direction: js.UndefOr[String] = js.native
  var display: js.UndefOr[String] = js.native
  var dominantBaseline: js.UndefOr[String] = js.native
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
  var imageRendering: js.UndefOr[auto | optimizeSpeed | optimizeQuality | inherit] = js.native
  var kerning: js.UndefOr[Double | String] = js.native
  var letterSpacing: js.UndefOr[String] = js.native
  var lightingColor: js.UndefOr[String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var mask: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[RechartsFunction] = js.native
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.native
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.native
  var opacity: js.UndefOr[Double | String] = js.native
  var overflow: js.UndefOr[String] = js.native
  var pointerEvents: js.UndefOr[String] = js.native
  var r: js.UndefOr[Double] = js.native
  var shapeRendering: js.UndefOr[auto | optimizeSpeed | crispEdges | geometricPrecision | inherit] = js.native
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
  var unicodeBidi: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var wordSpacing: js.UndefOr[Double | String] = js.native
  var writingMode: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object CellProps {
  @scala.inline
  def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
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
    def setAlignmentBaseline(value: String): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
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
    def setImageRendering(value: auto | optimizeSpeed | optimizeQuality | inherit): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    @scala.inline
    def setKerning(value: Double | String): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
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
    def setOnClick(value: /* repeated */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
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
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setShapeRendering(value: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
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
    def setUnicodeBidi(value: String): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
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
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

