package typings.reactNativeSvg.anon

import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.BlurEvent
import typings.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.EdgeInsetsProp
import typings.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.FocusEvent
import typings.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.LayoutEvent
import typings.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.PressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-svg.react-native-svg/lib/typescript/ReactNativeSVG.web.BaseProps & {  x :react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp | undefined,   y :react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp | undefined,   translate :string | undefined} */
trait BasePropsxNumberPropundef extends StObject {
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityRole: js.UndefOr[String] = js.undefined
  
  var accessibilityState: js.UndefOr[js.Object] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[NumberProp] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[NumberProp] = js.undefined
  
  var hitSlop: js.UndefOr[EdgeInsetsProp] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ BlurEvent, Unit]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ PressEvent, js.Object]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent, Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutEvent, js.Object]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ PressEvent, js.Object]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ PressEvent, js.Object]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ PressEvent, js.Object]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ PressEvent, js.Object]] = js.undefined
  
  var originX: NumberProp
  
  var originY: NumberProp
  
  var pressRetentionOffset: js.UndefOr[EdgeInsetsProp] = js.undefined
  
  var rejectResponderTermination: js.UndefOr[Boolean] = js.undefined
  
  var rotation: NumberArray
  
  var scale: NumberArray
  
  var skewX: NumberProp
  
  var skewY: NumberProp
  
  var style: js.Iterable[js.Object]
  
  var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
  
  var translate: NumberArray & js.UndefOr[String]
  
  var translateX: NumberProp
  
  var translateY: NumberProp
  
  var x: js.UndefOr[NumberProp] = js.undefined
  
  var y: js.UndefOr[NumberProp] = js.undefined
}
object BasePropsxNumberPropundef {
  
  inline def apply(
    originX: NumberProp,
    originY: NumberProp,
    rotation: NumberArray,
    scale: NumberArray,
    skewX: NumberProp,
    skewY: NumberProp,
    style: js.Iterable[js.Object],
    translate: NumberArray & js.UndefOr[String],
    translateX: NumberProp,
    translateY: NumberProp
  ): BasePropsxNumberPropundef = {
    val __obj = js.Dynamic.literal(originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePropsxNumberPropundef]
  }
  
  extension [Self <: BasePropsxNumberPropundef](x: Self) {
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityRole(value: String): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: js.Object): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: NumberProp): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: NumberProp): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHitSlop(value: EdgeInsetsProp): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setOnBlur(value: /* e */ BlurEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: /* event */ PressEvent => js.Object): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: /* e */ FocusEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutEvent => js.Object): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(value: /* event */ PressEvent => js.Object): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: /* event */ PressEvent => js.Object): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressIn(value: /* event */ PressEvent => js.Object): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: /* event */ PressEvent => js.Object): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOriginX(value: NumberProp): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginY(value: NumberProp): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffset(value: EdgeInsetsProp): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    inline def setRejectResponderTermination(value: Boolean): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
    
    inline def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
    
    inline def setRotation(value: NumberArray): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationVarargs(value: NumberProp*): Self = StObject.set(x, "rotation", js.Array(value*))
    
    inline def setScale(value: NumberArray): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleVarargs(value: NumberProp*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setSkewX(value: NumberProp): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewY(value: NumberProp): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: js.Iterable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    inline def setTranslate(value: NumberArray & js.UndefOr[String]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateX(value: NumberProp): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: NumberProp): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
