package typings.reactNativeReanimated.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextProps
import typings.reactNativeReanimated.mod.Animated.AnimateStyle
import typings.reactNativeReanimated.mod.Animated.AnimatedNode
import typings.reactNativeReanimated.mod.Animated.StylesOrDefault
import typings.reactNativeReanimated.mod.BaseAnimationBuilder
import typings.reactNativeReanimated.mod.EntryAnimationsValues
import typings.reactNativeReanimated.mod.EntryExitAnimationFunction
import typings.reactNativeReanimated.mod.ExitAnimationsValues
import typings.reactNativeReanimated.mod.Keyframe
import typings.reactNativeReanimated.mod.LayoutAnimation
import typings.reactNativeReanimated.mod.LayoutAnimationFunction
import typings.reactNativeReanimated.mod.LayoutAnimationsValues
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`no-hide-descendants`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.all
import typings.reactNativeReanimated.reactNativeReanimatedStrings.assertive
import typings.reactNativeReanimated.reactNativeReanimatedStrings.auto
import typings.reactNativeReanimated.reactNativeReanimatedStrings.balanced
import typings.reactNativeReanimated.reactNativeReanimatedStrings.clip
import typings.reactNativeReanimated.reactNativeReanimatedStrings.email
import typings.reactNativeReanimated.reactNativeReanimatedStrings.full
import typings.reactNativeReanimated.reactNativeReanimatedStrings.head
import typings.reactNativeReanimated.reactNativeReanimatedStrings.highQuality
import typings.reactNativeReanimated.reactNativeReanimatedStrings.link
import typings.reactNativeReanimated.reactNativeReanimatedStrings.middle
import typings.reactNativeReanimated.reactNativeReanimatedStrings.no
import typings.reactNativeReanimated.reactNativeReanimatedStrings.none
import typings.reactNativeReanimated.reactNativeReanimatedStrings.normal
import typings.reactNativeReanimated.reactNativeReanimatedStrings.phoneNumber
import typings.reactNativeReanimated.reactNativeReanimatedStrings.polite
import typings.reactNativeReanimated.reactNativeReanimatedStrings.simple
import typings.reactNativeReanimated.reactNativeReanimatedStrings.tail
import typings.reactNativeReanimated.reactNativeReanimatedStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-reanimated.react-native-reanimated.Animated.AnimateProps<react-native.react-native.TextProps> */
trait AnimatePropsTextProps extends StObject {
  
  var accessibilityActions: js.UndefOr[
    js.Array[AccessibilityActionInfo] | AnimatedNode[js.UndefOr[js.Array[AccessibilityActionInfo]]]
  ] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityHint: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[
    String | js.Array[String] | (AnimatedNode[js.UndefOr[String | js.Array[String]]])
  ] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[
    none | polite | assertive | (AnimatedNode[js.UndefOr[none | polite | assertive]])
  ] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole | AnimatedNode[js.UndefOr[AccessibilityRole]]] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState | AnimatedNode[js.UndefOr[AccessibilityState]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue | AnimatedNode[js.UndefOr[AccessibilityValue]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var accessible: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var adjustsFontSizeToFit: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var allowFontScaling: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var android_hyphenationFrequency: js.UndefOr[normal | none | full | (AnimatedNode[js.UndefOr[normal | none | full]])] = js.undefined
  
  var animatedProps: js.UndefOr[PartialAnimatePropsTextPr] = js.undefined
  
  var children: js.UndefOr[ReactNode | AnimatedNode[js.UndefOr[ReactNode]]] = js.undefined
  
  var dataDetectorType: js.UndefOr[
    Null | phoneNumber | link | email | none | all | (AnimatedNode[js.UndefOr[Null | phoneNumber | link | email | none | all]])
  ] = js.undefined
  
  var disabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var ellipsizeMode: js.UndefOr[
    head | middle | tail | clip | (AnimatedNode[js.UndefOr[head | middle | tail | clip]])
  ] = js.undefined
  
  var entering: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var exiting: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var importantForAccessibility: js.UndefOr[
    auto | yes | no | `no-hide-descendants` | (AnimatedNode[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
  ] = js.undefined
  
  var layout: js.UndefOr[BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay] = js.undefined
  
  var lineBreakMode: js.UndefOr[
    head | middle | tail | clip | (AnimatedNode[js.UndefOr[head | middle | tail | clip]])
  ] = js.undefined
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null | (AnimatedNode[js.UndefOr[Double | Null]])] = js.undefined
  
  var minimumFontScale: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var nativeID: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var numberOfLines: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onLayout: js.UndefOr[
    (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
  ] = js.undefined
  
  var onLongPress: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onPress: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onPressIn: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onPressOut: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTextLayout: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
    ])
  ] = js.undefined
  
  var selectable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var selectionColor: js.UndefOr[ColorValue | AnimatedNode[js.UndefOr[ColorValue]]] = js.undefined
  
  var style: js.UndefOr[StyleProp[AnimateStyle[StylesOrDefault[TextProps]]]] = js.undefined
  
  var suppressHighlighting: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var testID: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var textBreakStrategy: js.UndefOr[
    simple | highQuality | balanced | (AnimatedNode[js.UndefOr[simple | highQuality | balanced]])
  ] = js.undefined
}
object AnimatePropsTextProps {
  
  inline def apply(): AnimatePropsTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatePropsTextProps]
  }
  
  extension [Self <: AnimatePropsTextProps](x: Self) {
    
    inline def setAccessibilityActions(
      value: js.Array[AccessibilityActionInfo] | AnimatedNode[js.UndefOr[js.Array[AccessibilityActionInfo]]]
    ): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String] | (AnimatedNode[js.UndefOr[String | js.Array[String]]])): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive | (AnimatedNode[js.UndefOr[none | polite | assertive]])): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole | AnimatedNode[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState | AnimatedNode[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue | AnimatedNode[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAdjustsFontSizeToFit(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    inline def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    inline def setAllowFontScaling(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setAndroid_hyphenationFrequency(value: normal | none | full | (AnimatedNode[js.UndefOr[normal | none | full]])): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
    
    inline def setAnimatedProps(value: PartialAnimatePropsTextPr): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setAnimatedPropsUndefined: Self = StObject.set(x, "animatedProps", js.undefined)
    
    inline def setChildren(value: ReactNode | AnimatedNode[js.UndefOr[ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataDetectorType(
      value: phoneNumber | link | email | none | all | (AnimatedNode[js.UndefOr[Null | phoneNumber | link | email | none | all]])
    ): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    inline def setDisabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEllipsizeMode(value: head | middle | tail | clip | (AnimatedNode[js.UndefOr[head | middle | tail | clip]])): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setEntering(
      value: BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
    ): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setEnteringFunction1(
      value: (/* targetValues */ EntryAnimationsValues) | (/* targetValues */ ExitAnimationsValues) => LayoutAnimation
    ): Self = StObject.set(x, "entering", js.Any.fromFunction1(value))
    
    inline def setEnteringUndefined: Self = StObject.set(x, "entering", js.undefined)
    
    inline def setExiting(
      value: BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
    ): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
    
    inline def setExitingFunction1(
      value: (/* targetValues */ EntryAnimationsValues) | (/* targetValues */ ExitAnimationsValues) => LayoutAnimation
    ): Self = StObject.set(x, "exiting", js.Any.fromFunction1(value))
    
    inline def setExitingUndefined: Self = StObject.set(x, "exiting", js.undefined)
    
    inline def setImportantForAccessibility(
      value: auto | yes | no | `no-hide-descendants` | (AnimatedNode[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
    ): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setLayout(value: BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutFunction1(value: /* targetValues */ LayoutAnimationsValues => LayoutAnimation): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLineBreakMode(value: head | middle | tail | clip | (AnimatedNode[js.UndefOr[head | middle | tail | clip]])): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    inline def setMaxFontSizeMultiplier(value: Double | (AnimatedNode[js.UndefOr[Double | Null]])): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    inline def setMinimumFontScale(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    inline def setNativeID(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNumberOfLines(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnAccessibilityAction(
      value: (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
    ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityActionFunction1(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityEscapeFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityTapFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnLayout(
      value: (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
    ): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutFunction1(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnLongPressFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMagicTap(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapFunction0(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnPress(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressIn(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    inline def setOnPressInFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onPressOut", value.asInstanceOf[js.Any])
    
    inline def setOnPressOutFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnTextLayout(
      value: (js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
        ])
    ): Self = StObject.set(x, "onTextLayout", value.asInstanceOf[js.Any])
    
    inline def setOnTextLayoutFunction1(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Unit): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
    
    inline def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    inline def setSelectable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionColor(value: ColorValue | AnimatedNode[js.UndefOr[ColorValue]]): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setStyle(value: StyleProp[AnimateStyle[StylesOrDefault[TextProps]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuppressHighlighting(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    inline def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    inline def setTestID(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTextBreakStrategy(
      value: simple | highQuality | balanced | (AnimatedNode[js.UndefOr[simple | highQuality | balanced]])
    ): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
  }
}
