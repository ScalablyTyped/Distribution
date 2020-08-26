package typings.reactNativeSvgCharts.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNativeSvg.mod.AlignmentBaseline
import typings.reactNativeSvg.mod.BaselineShift
import typings.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.mod.FillRule
import typings.reactNativeSvg.mod.FontObject
import typings.reactNativeSvg.mod.FontStretch
import typings.reactNativeSvg.mod.FontStyle
import typings.reactNativeSvg.mod.FontVariant
import typings.reactNativeSvg.mod.FontVariantLigatures
import typings.reactNativeSvg.mod.FontWeight
import typings.reactNativeSvg.mod.LengthAdjust
import typings.reactNativeSvg.mod.Linecap
import typings.reactNativeSvg.mod.Linejoin
import typings.reactNativeSvg.mod.NumberArray
import typings.reactNativeSvg.mod.NumberProp
import typings.reactNativeSvg.mod.TextAnchor
import typings.reactNativeSvg.mod.TextDecoration
import typings.reactNativeSvg.mod.TransformObject
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-none`
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-only`
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.`non-scaling-stroke`
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.auto
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.default
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.inherit
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.nonScalingStroke
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.none
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-svg.react-native-svg.TextProps> */
@js.native
trait PartialTextProps extends js.Object {
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  var baselineShift: js.UndefOr[BaselineShift] = js.native
  var clipPath: js.UndefOr[String] = js.native
  var clipRule: js.UndefOr[FillRule] = js.native
  var delayLongPress: js.UndefOr[Double] = js.native
  var delayPressIn: js.UndefOr[Double] = js.native
  var delayPressOut: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dx: js.UndefOr[NumberArray] = js.native
  var dy: js.UndefOr[NumberArray] = js.native
  var fill: js.UndefOr[typings.reactNativeSvg.mod.Color] = js.native
  var fillOpacity: js.UndefOr[NumberProp] = js.native
  var fillRule: js.UndefOr[FillRule] = js.native
  var font: js.UndefOr[FontObject] = js.native
  var fontData: js.UndefOr[Null | StringDictionary[js.Any]] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontFeatureSettings: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[NumberProp] = js.native
  var fontStretch: js.UndefOr[FontStretch] = js.native
  var fontStyle: js.UndefOr[FontStyle] = js.native
  var fontVariant: js.UndefOr[FontVariant] = js.native
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.native
  var fontVariationSettings: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[FontWeight] = js.native
  var id: js.UndefOr[String] = js.native
  var inlineSize: js.UndefOr[NumberProp] = js.native
  var kerning: js.UndefOr[NumberProp] = js.native
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.native
  var letterSpacing: js.UndefOr[NumberProp] = js.native
  var marker: js.UndefOr[String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var mask: js.UndefOr[String] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var opacity: js.UndefOr[NumberProp] = js.native
  var origin: js.UndefOr[NumberArray] = js.native
  var originX: js.UndefOr[NumberProp] = js.native
  var originY: js.UndefOr[NumberProp] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var rotate: js.UndefOr[NumberArray] = js.native
  var rotation: js.UndefOr[NumberProp] = js.native
  var scale: js.UndefOr[NumberArray] = js.native
  var scaleX: js.UndefOr[NumberProp] = js.native
  var scaleY: js.UndefOr[NumberProp] = js.native
  var skew: js.UndefOr[NumberArray] = js.native
  var skewX: js.UndefOr[NumberProp] = js.native
  var skewY: js.UndefOr[NumberProp] = js.native
  var stroke: js.UndefOr[typings.reactNativeSvg.mod.Color] = js.native
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.native
  var strokeDashoffset: js.UndefOr[NumberProp] = js.native
  var strokeLinecap: js.UndefOr[Linecap] = js.native
  var strokeLinejoin: js.UndefOr[Linejoin] = js.native
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.native
  var strokeOpacity: js.UndefOr[NumberProp] = js.native
  var strokeWidth: js.UndefOr[NumberProp] = js.native
  var textAnchor: js.UndefOr[TextAnchor] = js.native
  var textDecoration: js.UndefOr[TextDecoration] = js.native
  var textLength: js.UndefOr[NumberProp] = js.native
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.native
  var translate: js.UndefOr[NumberArray] = js.native
  var translateX: js.UndefOr[NumberProp] = js.native
  var translateY: js.UndefOr[NumberProp] = js.native
  var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.native
  var verticalAlign: js.UndefOr[NumberProp] = js.native
  var wordSpacing: js.UndefOr[NumberProp] = js.native
  var x: js.UndefOr[NumberArray] = js.native
  var y: js.UndefOr[NumberArray] = js.native
}

object PartialTextProps {
  @scala.inline
  def apply(): PartialTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTextProps]
  }
  @scala.inline
  implicit class PartialTextPropsOps[Self <: PartialTextProps] (val x: Self) extends AnyVal {
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
    def setAlignmentBaseline(value: AlignmentBaseline): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    @scala.inline
    def setBaselineShiftVarargs(value: NumberProp*): Self = this.set("baselineShift", js.Array(value :_*))
    @scala.inline
    def setBaselineShift(value: BaselineShift): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    @scala.inline
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    @scala.inline
    def setClipRule(value: FillRule): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    @scala.inline
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    @scala.inline
    def setDelayPressIn(value: Double): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    @scala.inline
    def setDelayPressOut(value: Double): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDxVarargs(value: NumberProp*): Self = this.set("dx", js.Array(value :_*))
    @scala.inline
    def setDx(value: NumberArray): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDyVarargs(value: NumberProp*): Self = this.set("dy", js.Array(value :_*))
    @scala.inline
    def setDy(value: NumberArray): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setFillVarargs(value: Double*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: typings.reactNativeSvg.mod.Color): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: NumberProp): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: FillRule): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setFont(value: FontObject): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontData(value: StringDictionary[js.Any]): Self = this.set("fontData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontData: Self = this.set("fontData", js.undefined)
    @scala.inline
    def setFontDataNull: Self = this.set("fontData", null)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontFeatureSettings(value: String): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    @scala.inline
    def setFontSize(value: NumberProp): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStretch(value: FontStretch): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontVariant(value: FontVariant): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontVariantLigatures(value: FontVariantLigatures): Self = this.set("fontVariantLigatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariantLigatures: Self = this.set("fontVariantLigatures", js.undefined)
    @scala.inline
    def setFontVariationSettings(value: String): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlineSize(value: NumberProp): Self = this.set("inlineSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineSize: Self = this.set("inlineSize", js.undefined)
    @scala.inline
    def setKerning(value: NumberProp): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    @scala.inline
    def setLengthAdjust(value: LengthAdjust): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", js.undefined)
    @scala.inline
    def setLetterSpacing(value: NumberProp): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
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
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    @scala.inline
    def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    @scala.inline
    def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    @scala.inline
    def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    @scala.inline
    def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    @scala.inline
    def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    @scala.inline
    def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    @scala.inline
    def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOpacity(value: NumberProp): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOriginVarargs(value: NumberProp*): Self = this.set("origin", js.Array(value :_*))
    @scala.inline
    def setOrigin(value: NumberArray): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOriginX(value: NumberProp): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginX: Self = this.set("originX", js.undefined)
    @scala.inline
    def setOriginY(value: NumberProp): Self = this.set("originY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginY: Self = this.set("originY", js.undefined)
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setRotateVarargs(value: NumberProp*): Self = this.set("rotate", js.Array(value :_*))
    @scala.inline
    def setRotate(value: NumberArray): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRotation(value: NumberProp): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScaleVarargs(value: NumberProp*): Self = this.set("scale", js.Array(value :_*))
    @scala.inline
    def setScale(value: NumberArray): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleX(value: NumberProp): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: NumberProp): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setSkewVarargs(value: NumberProp*): Self = this.set("skew", js.Array(value :_*))
    @scala.inline
    def setSkew(value: NumberArray): Self = this.set("skew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkew: Self = this.set("skew", js.undefined)
    @scala.inline
    def setSkewX(value: NumberProp): Self = this.set("skewX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    @scala.inline
    def setSkewY(value: NumberProp): Self = this.set("skewY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    @scala.inline
    def setStrokeVarargs(value: Double*): Self = this.set("stroke", js.Array(value :_*))
    @scala.inline
    def setStroke(value: typings.reactNativeSvg.mod.Color): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDasharrayVarargs(value: NumberProp*): Self = this.set("strokeDasharray", js.Array(value :_*))
    @scala.inline
    def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeDashoffset(value: NumberProp): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: Linecap): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoin(value: Linejoin): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimit(value: NumberProp): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: NumberProp): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: NumberProp): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTextAnchor(value: TextAnchor): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    @scala.inline
    def setTextDecoration(value: TextDecoration): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextLength(value: NumberProp): Self = this.set("textLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
    @scala.inline
    def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTranslateVarargs(value: NumberProp*): Self = this.set("translate", js.Array(value :_*))
    @scala.inline
    def setTranslate(value: NumberArray): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setTranslateX(value: NumberProp): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: NumberProp): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    @scala.inline
    def setVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
    @scala.inline
    def setVerticalAlign(value: NumberProp): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWordSpacing(value: NumberProp): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    @scala.inline
    def setXVarargs(value: NumberProp*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setX(value: NumberArray): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setYVarargs(value: NumberProp*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: NumberArray): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

