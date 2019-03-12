package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends TextSpecificProps {
  var dx: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var dy: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var opacity: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    alignmentBaseline: AlignmentBaseline = null,
    baselineShift: BaselineShift = null,
    clipPath: java.lang.String = null,
    clipRule: FillRule = null,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dx: reactDashNativeDashSvgLib.NumberProp = null,
    dy: reactDashNativeDashSvgLib.NumberProp = null,
    fill: reactDashNativeDashSvgLib.int32ARGBColor | reactDashNativeDashSvgLib.rgbaArray | java.lang.String = null,
    fillOpacity: reactDashNativeDashSvgLib.NumberProp = null,
    fillRule: FillRule = null,
    font: FontObject = null,
    fontData: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    fontFamily: java.lang.String = null,
    fontFeatureSettings: java.lang.String = null,
    fontSize: reactDashNativeDashSvgLib.NumberProp = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontWeight: FontWeight = null,
    id: java.lang.String = null,
    kerning: reactDashNativeDashSvgLib.NumberProp = null,
    lengthAdjust: LengthAdjust = null,
    letterSpacing: reactDashNativeDashSvgLib.NumberProp = null,
    mask: java.lang.String = null,
    onLongPress: /* event */ js.Any => _ = null,
    onMoveShouldSetResponder: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Boolean = null,
    onPress: /* event */ js.Any => _ = null,
    onPressIn: /* event */ js.Any => _ = null,
    onPressOut: /* event */ js.Any => _ = null,
    onResponderEnd: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderGrant: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderMove: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderReject: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderRelease: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderStart: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderTerminate: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onResponderTerminationRequest: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponder: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponderCapture: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Boolean = null,
    opacity: reactDashNativeDashSvgLib.NumberProp = null,
    origin: reactDashNativeDashSvgLib.NumberProp = null,
    originX: reactDashNativeDashSvgLib.NumberProp = null,
    originY: reactDashNativeDashSvgLib.NumberProp = null,
    pointerEvents: reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.`box-none` | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.none | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.`box-only` | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.auto = null,
    rotate: reactDashNativeDashSvgLib.NumberProp = null,
    rotation: reactDashNativeDashSvgLib.NumberProp = null,
    scale: reactDashNativeDashSvgLib.NumberProp = null,
    scaleX: reactDashNativeDashSvgLib.NumberProp = null,
    scaleY: reactDashNativeDashSvgLib.NumberProp = null,
    skew: reactDashNativeDashSvgLib.NumberProp = null,
    skewX: reactDashNativeDashSvgLib.NumberProp = null,
    skewY: reactDashNativeDashSvgLib.NumberProp = null,
    stroke: reactDashNativeDashSvgLib.int32ARGBColor | reactDashNativeDashSvgLib.rgbaArray | java.lang.String = null,
    strokeDasharray: js.Array[reactDashNativeDashSvgLib.NumberProp] | reactDashNativeDashSvgLib.NumberProp = null,
    strokeDashoffset: reactDashNativeDashSvgLib.NumberProp = null,
    strokeLinecap: Linecap = null,
    strokeLinejoin: Linejoin = null,
    strokeMiterlimit: reactDashNativeDashSvgLib.NumberProp = null,
    strokeOpacity: reactDashNativeDashSvgLib.NumberProp = null,
    strokeWidth: reactDashNativeDashSvgLib.NumberProp = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    textLength: reactDashNativeDashSvgLib.NumberProp = null,
    transform: reactDashNativeDashSvgLib.ColumnMajorTransformMatrix | java.lang.String | TransformObject = null,
    translate: reactDashNativeDashSvgLib.NumberProp = null,
    translateX: reactDashNativeDashSvgLib.NumberProp = null,
    translateY: reactDashNativeDashSvgLib.NumberProp = null,
    vectorEffect: reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.none | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.`non-scaling-stroke` | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.nonScalingStroke | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.default | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.inherit | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.uri = null,
    verticalAlign: reactDashNativeDashSvgLib.NumberProp = null,
    wordSpacing: reactDashNativeDashSvgLib.NumberProp = null,
    x: reactDashNativeDashSvgLib.NumberProp = null,
    y: reactDashNativeDashSvgLib.NumberProp = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline)
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule)
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontData != null) __obj.updateDynamic("fontData")(fontData)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (fontVariantLigatures != null) __obj.updateDynamic("fontVariantLigatures")(fontVariantLigatures)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust)
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
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
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap)
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin)
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
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
    __obj.asInstanceOf[TextProps]
  }
}

