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
trait PartialTextProps extends js.Object {
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.undefined
  var baselineShift: js.UndefOr[BaselineShift] = js.undefined
  var clipPath: js.UndefOr[String] = js.undefined
  var clipRule: js.UndefOr[FillRule] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dx: js.UndefOr[NumberArray] = js.undefined
  var dy: js.UndefOr[NumberArray] = js.undefined
  var fill: js.UndefOr[typings.reactNativeSvg.mod.Color] = js.undefined
  var fillOpacity: js.UndefOr[NumberProp] = js.undefined
  var fillRule: js.UndefOr[FillRule] = js.undefined
  var font: js.UndefOr[FontObject] = js.undefined
  var fontData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontFeatureSettings: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[NumberProp] = js.undefined
  var fontStretch: js.UndefOr[FontStretch] = js.undefined
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  var fontVariant: js.UndefOr[FontVariant] = js.undefined
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.undefined
  var fontVariationSettings: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlineSize: js.UndefOr[NumberProp] = js.undefined
  var kerning: js.UndefOr[NumberProp] = js.undefined
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.undefined
  var letterSpacing: js.UndefOr[NumberProp] = js.undefined
  var marker: js.UndefOr[String] = js.undefined
  var markerEnd: js.UndefOr[String] = js.undefined
  var markerMid: js.UndefOr[String] = js.undefined
  var markerStart: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var opacity: js.UndefOr[NumberProp] = js.undefined
  var origin: js.UndefOr[NumberArray] = js.undefined
  var originX: js.UndefOr[NumberProp] = js.undefined
  var originY: js.UndefOr[NumberProp] = js.undefined
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  var rotate: js.UndefOr[NumberArray] = js.undefined
  var rotation: js.UndefOr[NumberProp] = js.undefined
  var scale: js.UndefOr[NumberArray] = js.undefined
  var scaleX: js.UndefOr[NumberProp] = js.undefined
  var scaleY: js.UndefOr[NumberProp] = js.undefined
  var skew: js.UndefOr[NumberArray] = js.undefined
  var skewX: js.UndefOr[NumberProp] = js.undefined
  var skewY: js.UndefOr[NumberProp] = js.undefined
  var stroke: js.UndefOr[typings.reactNativeSvg.mod.Color] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.undefined
  var strokeDashoffset: js.UndefOr[NumberProp] = js.undefined
  var strokeLinecap: js.UndefOr[Linecap] = js.undefined
  var strokeLinejoin: js.UndefOr[Linejoin] = js.undefined
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.undefined
  var strokeOpacity: js.UndefOr[NumberProp] = js.undefined
  var strokeWidth: js.UndefOr[NumberProp] = js.undefined
  var textAnchor: js.UndefOr[TextAnchor] = js.undefined
  var textDecoration: js.UndefOr[TextDecoration] = js.undefined
  var textLength: js.UndefOr[NumberProp] = js.undefined
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.undefined
  var translate: js.UndefOr[NumberArray] = js.undefined
  var translateX: js.UndefOr[NumberProp] = js.undefined
  var translateY: js.UndefOr[NumberProp] = js.undefined
  var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.undefined
  var verticalAlign: js.UndefOr[NumberProp] = js.undefined
  var wordSpacing: js.UndefOr[NumberProp] = js.undefined
  var x: js.UndefOr[NumberArray] = js.undefined
  var y: js.UndefOr[NumberArray] = js.undefined
}

object PartialTextProps {
  @scala.inline
  def apply(
    alignmentBaseline: AlignmentBaseline = null,
    baselineShift: BaselineShift = null,
    clipPath: String = null,
    clipRule: FillRule = null,
    delayLongPress: js.UndefOr[Double] = js.undefined,
    delayPressIn: js.UndefOr[Double] = js.undefined,
    delayPressOut: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dx: NumberArray = null,
    dy: NumberArray = null,
    fill: typings.reactNativeSvg.mod.Color = null,
    fillOpacity: NumberProp = null,
    fillRule: FillRule = null,
    font: FontObject = null,
    fontData: StringDictionary[js.Any] = null,
    fontFamily: String = null,
    fontFeatureSettings: String = null,
    fontSize: NumberProp = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontVariationSettings: String = null,
    fontWeight: FontWeight = null,
    id: String = null,
    inlineSize: NumberProp = null,
    kerning: NumberProp = null,
    lengthAdjust: LengthAdjust = null,
    letterSpacing: NumberProp = null,
    marker: String = null,
    markerEnd: String = null,
    markerMid: String = null,
    markerStart: String = null,
    mask: String = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onPressIn: /* event */ GestureResponderEvent => Unit = null,
    onPressOut: /* event */ GestureResponderEvent => Unit = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    opacity: NumberProp = null,
    origin: NumberArray = null,
    originX: NumberProp = null,
    originY: NumberProp = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    rotate: NumberArray = null,
    rotation: NumberProp = null,
    scale: NumberArray = null,
    scaleX: NumberProp = null,
    scaleY: NumberProp = null,
    skew: NumberArray = null,
    skewX: NumberProp = null,
    skewY: NumberProp = null,
    stroke: typings.reactNativeSvg.mod.Color = null,
    strokeDasharray: js.Array[NumberProp] | NumberProp = null,
    strokeDashoffset: NumberProp = null,
    strokeLinecap: Linecap = null,
    strokeLinejoin: Linejoin = null,
    strokeMiterlimit: NumberProp = null,
    strokeOpacity: NumberProp = null,
    strokeWidth: NumberProp = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    textLength: NumberProp = null,
    transform: ColumnMajorTransformMatrix | String | TransformObject = null,
    translate: NumberArray = null,
    translateX: NumberProp = null,
    translateY: NumberProp = null,
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri = null,
    verticalAlign: NumberProp = null,
    wordSpacing: NumberProp = null,
    x: NumberArray = null,
    y: NumberArray = null
  ): PartialTextProps = {
    val __obj = js.Dynamic.literal()
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (!js.isUndefined(delayLongPress)) __obj.updateDynamic("delayLongPress")(delayLongPress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressIn)) __obj.updateDynamic("delayPressIn")(delayPressIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressOut)) __obj.updateDynamic("delayPressOut")(delayPressOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontData != null) __obj.updateDynamic("fontData")(fontData.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantLigatures != null) __obj.updateDynamic("fontVariantLigatures")(fontVariantLigatures.asInstanceOf[js.Any])
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlineSize != null) __obj.updateDynamic("inlineSize")(inlineSize.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textLength != null) __obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTextProps]
  }
}

