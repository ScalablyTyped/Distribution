package typings.reactNativeReanimated.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewProps
import typings.reactNativeReanimated.mod.Animated.AnimateProps
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
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`box-none`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`box-only`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`no-hide-descendants`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.assertive
import typings.reactNativeReanimated.reactNativeReanimatedStrings.auto
import typings.reactNativeReanimated.reactNativeReanimatedStrings.no
import typings.reactNativeReanimated.reactNativeReanimatedStrings.none
import typings.reactNativeReanimated.reactNativeReanimatedStrings.polite
import typings.reactNativeReanimated.reactNativeReanimatedStrings.yes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-reanimated.react-native-reanimated.Animated.AnimateProps<react-native.react-native.ViewProps>> */
trait PartialAnimatePropsViewPr extends StObject {
  
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
  
  var animatedProps: js.UndefOr[Partial[AnimateProps[ViewProps]]] = js.undefined
  
  var children: js.UndefOr[ReactNode | AnimatedNode[js.UndefOr[ReactNode]]] = js.undefined
  
  var collapsable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var entering: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var exiting: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var focusable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var hitSlop: js.UndefOr[Insets | AnimatedNode[js.UndefOr[Insets]]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[
    auto | yes | no | `no-hide-descendants` | (AnimatedNode[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
  ] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var layout: js.UndefOr[BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay] = js.undefined
  
  var nativeID: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onLayout: js.UndefOr[
    (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onPointerCancel: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerDown: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerEnter: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerLeave: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerMove: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerUp: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onResponderEnd: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderGrant: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderMove: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderReject: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderRelease: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderStart: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderTerminate: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onTouchCancel: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchEnd: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchMove: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchStart: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var pointerEvents: js.UndefOr[
    `box-none` | none | `box-only` | auto | (AnimatedNode[js.UndefOr[`box-none` | none | `box-only` | auto]])
  ] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var style: js.UndefOr[StyleProp[AnimateStyle[StylesOrDefault[ViewProps]]]] = js.undefined
  
  var testID: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties | AnimatedNode[js.UndefOr[TVParallaxProperties]]] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
}
object PartialAnimatePropsViewPr {
  
  inline def apply(): PartialAnimatePropsViewPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnimatePropsViewPr]
  }
  
  extension [Self <: PartialAnimatePropsViewPr](x: Self) {
    
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
    
    inline def setAnimatedProps(value: Partial[AnimateProps[ViewProps]]): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setAnimatedPropsUndefined: Self = StObject.set(x, "animatedProps", js.undefined)
    
    inline def setChildren(value: ReactNode | AnimatedNode[js.UndefOr[ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
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
    
    inline def setFocusable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets | AnimatedNode[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setImportantForAccessibility(
      value: auto | yes | no | `no-hide-descendants` | (AnimatedNode[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
    ): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setLayout(value: BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutFunction1(value: /* targetValues */ LayoutAnimationsValues => LayoutAnimation): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setNativeID(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
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
    
    inline def setOnMagicTap(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapFunction0(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCapture(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCaptureFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnPointerCancel(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnResponderEnd(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
    
    inline def setOnResponderEndFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
    
    inline def setOnResponderGrantFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
    
    inline def setOnResponderMoveFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
    
    inline def setOnResponderRejectFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
    
    inline def setOnResponderReleaseFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
    
    inline def setOnResponderStartFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminateFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminationRequestFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnStartShouldSetResponder(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCapture(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCaptureFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCapture(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCaptureFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setPointerEvents(
      value: `box-none` | none | `box-only` | auto | (AnimatedNode[js.UndefOr[`box-none` | none | `box-only` | auto]])
    ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setStyle(value: StyleProp[AnimateStyle[StylesOrDefault[ViewProps]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties | AnimatedNode[js.UndefOr[TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
  }
}
