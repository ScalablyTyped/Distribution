package typings.reactNativeMaterialRipple

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.LegacyRef
import typings.reactNative.mod.Animated.TAugmentRef
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.`box-none`
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.`box-only`
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.`no-hide-descendants`
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.assertive
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.auto
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.button
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.no
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.none
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.polite
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.radiobutton_checked
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.radiobutton_unchecked
import typings.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-native.react-native.Animated.AnimatedProps<react-native.react-native.ViewProps> */
  trait AnimatedPropsViewProps extends StObject {
    
    var accessibilityActions: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
      ] = js.undefined
    
    var accessibilityComponentType: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]) | none | button | radiobutton_checked | radiobutton_unchecked | (TAugmentRef[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]])
      ] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var accessibilityHint: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var accessibilityLabel: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
      ] = js.undefined
    
    var accessibilityRole: js.UndefOr[
        WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
      ] = js.undefined
    
    var accessibilityState: js.UndefOr[
        WithAnimatedValue[js.UndefOr[AccessibilityState]] | AccessibilityState | TAugmentRef[js.UndefOr[AccessibilityState]]
      ] = js.undefined
    
    var accessibilityTraits: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]) | AccessibilityTrait | js.Array[AccessibilityTrait] | (TAugmentRef[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]])
      ] = js.undefined
    
    var accessibilityValue: js.UndefOr[
        WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
      ] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var accessible: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var collapsable: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var focusable: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var hitSlop: js.UndefOr[WithAnimatedValue[js.UndefOr[Insets]] | Insets | TAugmentRef[js.UndefOr[Insets]]] = js.undefined
    
    var importantForAccessibility: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
      ] = js.undefined
    
    var isTVSelectable: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var nativeID: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
      ] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ] = js.undefined
    
    var onLayout: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
      ] = js.undefined
    
    var onMagicTap: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.undefined
    
    var onResponderEnd: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderGrant: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderMove: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderReject: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderRelease: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderStart: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderTerminate: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.undefined
    
    var onTouchCancel: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onTouchEnd: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onTouchMove: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var onTouchStart: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.undefined
    
    var pointerEvents: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[`box-none` | none | `box-only` | auto]]) | `box-none` | none | `box-only` | auto | (TAugmentRef[js.UndefOr[`box-none` | none | `box-only` | auto]])
      ] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var style: js.UndefOr[
        WithAnimatedValue[js.UndefOr[StyleProp[ViewStyle]]] | StyleProp[ViewStyle] | TAugmentRef[js.UndefOr[StyleProp[ViewStyle]]]
      ] = js.undefined
    
    var testID: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[
        WithAnimatedValue[js.UndefOr[TVParallaxProperties]] | TVParallaxProperties | TAugmentRef[js.UndefOr[TVParallaxProperties]]
      ] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.undefined
  }
  object AnimatedPropsViewProps {
    
    inline def apply(): AnimatedPropsViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedPropsViewProps]
    }
    
    extension [Self <: AnimatedPropsViewProps](x: Self) {
      
      inline def setAccessibilityActions(
        value: WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
      ): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityActions", js.Any.fromFunction1(value))
      
      inline def setAccessibilityActionsNull: Self = StObject.set(x, "accessibilityActions", null)
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      inline def setAccessibilityComponentType(
        value: (WithAnimatedValue[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]) | none | button | radiobutton_checked | radiobutton_unchecked | (TAugmentRef[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]])
      ): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityComponentTypeFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityComponentType", js.Any.fromFunction1(value))
      
      inline def setAccessibilityComponentTypeNull: Self = StObject.set(x, "accessibilityComponentType", null)
      
      inline def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      inline def setAccessibilityElementsHidden(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityElementsHidden", js.Any.fromFunction1(value))
      
      inline def setAccessibilityElementsHiddenNull: Self = StObject.set(x, "accessibilityElementsHidden", null)
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityHint", js.Any.fromFunction1(value))
      
      inline def setAccessibilityHintNull: Self = StObject.set(x, "accessibilityHint", null)
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.Any.fromFunction1(value))
      
      inline def setAccessibilityIgnoresInvertColorsNull: Self = StObject.set(x, "accessibilityIgnoresInvertColors", null)
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setAccessibilityLabelNull: Self = StObject.set(x, "accessibilityLabel", null)
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLiveRegion(
        value: (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
      ): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLiveRegion", js.Any.fromFunction1(value))
      
      inline def setAccessibilityLiveRegionNull: Self = StObject.set(x, "accessibilityLiveRegion", null)
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(
        value: WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
      ): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityRole", js.Any.fromFunction1(value))
      
      inline def setAccessibilityRoleNull: Self = StObject.set(x, "accessibilityRole", null)
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(
        value: WithAnimatedValue[js.UndefOr[AccessibilityState]] | AccessibilityState | TAugmentRef[js.UndefOr[AccessibilityState]]
      ): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityState", js.Any.fromFunction1(value))
      
      inline def setAccessibilityStateNull: Self = StObject.set(x, "accessibilityState", null)
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityTraits(
        value: (WithAnimatedValue[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]) | AccessibilityTrait | js.Array[AccessibilityTrait] | (TAugmentRef[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]])
      ): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTraitsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityTraits", js.Any.fromFunction1(value))
      
      inline def setAccessibilityTraitsNull: Self = StObject.set(x, "accessibilityTraits", null)
      
      inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      inline def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      inline def setAccessibilityValue(
        value: WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
      ): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityValue", js.Any.fromFunction1(value))
      
      inline def setAccessibilityValueNull: Self = StObject.set(x, "accessibilityValue", null)
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityViewIsModal", js.Any.fromFunction1(value))
      
      inline def setAccessibilityViewIsModalNull: Self = StObject.set(x, "accessibilityViewIsModal", null)
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessible", js.Any.fromFunction1(value))
      
      inline def setAccessibleNull: Self = StObject.set(x, "accessible", null)
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setCollapsable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "collapsable", js.Any.fromFunction1(value))
      
      inline def setCollapsableNull: Self = StObject.set(x, "collapsable", null)
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setFocusable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "focusable", js.Any.fromFunction1(value))
      
      inline def setFocusableNull: Self = StObject.set(x, "focusable", null)
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHasTVPreferredFocus(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "hasTVPreferredFocus", js.Any.fromFunction1(value))
      
      inline def setHasTVPreferredFocusNull: Self = StObject.set(x, "hasTVPreferredFocus", null)
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: WithAnimatedValue[js.UndefOr[Insets]] | Insets | TAugmentRef[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "hitSlop", js.Any.fromFunction1(value))
      
      inline def setHitSlopNull: Self = StObject.set(x, "hitSlop", null)
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(
        value: (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
      ): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "importantForAccessibility", js.Any.fromFunction1(value))
      
      inline def setImportantForAccessibilityNull: Self = StObject.set(x, "importantForAccessibility", null)
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIsTVSelectable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "isTVSelectable", js.Any.fromFunction1(value))
      
      inline def setIsTVSelectableNull: Self = StObject.set(x, "isTVSelectable", null)
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setNativeID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "nativeID", js.Any.fromFunction1(value))
      
      inline def setNativeIDNull: Self = StObject.set(x, "nativeID", null)
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.Any.fromFunction1(value))
      
      inline def setNeedsOffscreenAlphaCompositingNull: Self = StObject.set(x, "needsOffscreenAlphaCompositing", null)
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setOnAccessibilityAction(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
      ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
      
      inline def setOnAccessibilityActionFunction1(value: (/* event */ AccessibilityActionEvent) | js.Any | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionNull: Self = StObject.set(x, "onAccessibilityAction", null)
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(
        value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
      
      inline def setOnAccessibilityEscapeFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityEscapeNull: Self = StObject.set(x, "onAccessibilityEscape", null)
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(
        value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
      
      inline def setOnAccessibilityTapFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityTapNull: Self = StObject.set(x, "onAccessibilityTap", null)
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnLayout(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
      ): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
      
      inline def setOnLayoutFunction1(value: js.Any | (/* event */ LayoutChangeEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutNull: Self = StObject.set(x, "onLayout", null)
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnMagicTap(
        value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
      
      inline def setOnMagicTapFunction0(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction1(value))
      
      inline def setOnMagicTapNull: Self = StObject.set(x, "onMagicTap", null)
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMoveShouldSetResponder(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
      
      inline def setOnMoveShouldSetResponderCapture(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMoveShouldSetResponderCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureNull: Self = StObject.set(x, "onMoveShouldSetResponderCapture", null)
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderNull: Self = StObject.set(x, "onMoveShouldSetResponder", null)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnResponderEnd(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
      
      inline def setOnResponderEndFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      inline def setOnResponderEndNull: Self = StObject.set(x, "onResponderEnd", null)
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
      
      inline def setOnResponderGrantFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      inline def setOnResponderGrantNull: Self = StObject.set(x, "onResponderGrant", null)
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
      
      inline def setOnResponderMoveFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      inline def setOnResponderMoveNull: Self = StObject.set(x, "onResponderMove", null)
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
      
      inline def setOnResponderRejectFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      inline def setOnResponderRejectNull: Self = StObject.set(x, "onResponderReject", null)
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
      
      inline def setOnResponderReleaseFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      inline def setOnResponderReleaseNull: Self = StObject.set(x, "onResponderRelease", null)
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
      
      inline def setOnResponderStartFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      inline def setOnResponderStartNull: Self = StObject.set(x, "onResponderStart", null)
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
      
      inline def setOnResponderTerminateFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminateNull: Self = StObject.set(x, "onResponderTerminate", null)
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
      
      inline def setOnResponderTerminationRequestFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestNull: Self = StObject.set(x, "onResponderTerminationRequest", null)
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnStartShouldSetResponder(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
      
      inline def setOnStartShouldSetResponderCapture(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
      
      inline def setOnStartShouldSetResponderCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureNull: Self = StObject.set(x, "onStartShouldSetResponderCapture", null)
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderNull: Self = StObject.set(x, "onStartShouldSetResponder", null)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnTouchCancel(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelNull: Self = StObject.set(x, "onTouchCancel", null)
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCapture(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCaptureNull: Self = StObject.set(x, "onTouchEndCapture", null)
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndNull: Self = StObject.set(x, "onTouchEnd", null)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveNull: Self = StObject.set(x, "onTouchMove", null)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartNull: Self = StObject.set(x, "onTouchStart", null)
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPointerEvents(
        value: (WithAnimatedValue[js.UndefOr[`box-none` | none | `box-only` | auto]]) | `box-none` | none | `box-only` | auto | (TAugmentRef[js.UndefOr[`box-none` | none | `box-only` | auto]])
      ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "pointerEvents", js.Any.fromFunction1(value))
      
      inline def setPointerEventsNull: Self = StObject.set(x, "pointerEvents", null)
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setRemoveClippedSubviews(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "removeClippedSubviews", js.Any.fromFunction1(value))
      
      inline def setRemoveClippedSubviewsNull: Self = StObject.set(x, "removeClippedSubviews", null)
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "renderToHardwareTextureAndroid", js.Any.fromFunction1(value))
      
      inline def setRenderToHardwareTextureAndroidNull: Self = StObject.set(x, "renderToHardwareTextureAndroid", null)
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setShouldRasterizeIOS(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "shouldRasterizeIOS", js.Any.fromFunction1(value))
      
      inline def setShouldRasterizeIOSNull: Self = StObject.set(x, "shouldRasterizeIOS", null)
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setStyle(
        value: WithAnimatedValue[js.UndefOr[StyleProp[ViewStyle]]] | StyleProp[ViewStyle] | TAugmentRef[js.UndefOr[StyleProp[ViewStyle]]]
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "testID", js.Any.fromFunction1(value))
      
      inline def setTestIDNull: Self = StObject.set(x, "testID", null)
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTvParallaxMagnification(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxMagnificationFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxMagnification", js.Any.fromFunction1(value))
      
      inline def setTvParallaxMagnificationNull: Self = StObject.set(x, "tvParallaxMagnification", null)
      
      inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      inline def setTvParallaxProperties(
        value: WithAnimatedValue[js.UndefOr[TVParallaxProperties]] | TVParallaxProperties | TAugmentRef[js.UndefOr[TVParallaxProperties]]
      ): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxProperties", js.Any.fromFunction1(value))
      
      inline def setTvParallaxPropertiesNull: Self = StObject.set(x, "tvParallaxProperties", null)
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setTvParallaxShiftDistanceX(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceXFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxShiftDistanceX", js.Any.fromFunction1(value))
      
      inline def setTvParallaxShiftDistanceXNull: Self = StObject.set(x, "tvParallaxShiftDistanceX", null)
      
      inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      inline def setTvParallaxShiftDistanceY(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceYFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxShiftDistanceY", js.Any.fromFunction1(value))
      
      inline def setTvParallaxShiftDistanceYNull: Self = StObject.set(x, "tvParallaxShiftDistanceY", null)
      
      inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      inline def setTvParallaxTiltAngle(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxTiltAngleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxTiltAngle", js.Any.fromFunction1(value))
      
      inline def setTvParallaxTiltAngleNull: Self = StObject.set(x, "tvParallaxTiltAngle", null)
      
      inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    }
  }
  
  trait Disabled extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onRippleAnimation: js.UndefOr[
        js.Function2[/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit], Unit]
      ] = js.undefined
    
    var rippleCentered: js.UndefOr[Boolean] = js.undefined
    
    var rippleColor: js.UndefOr[String] = js.undefined
    
    var rippleContainerBorderRadius: js.UndefOr[Double] = js.undefined
    
    var rippleDuration: js.UndefOr[Double] = js.undefined
    
    var rippleFades: js.UndefOr[Boolean] = js.undefined
    
    var rippleOpacity: js.UndefOr[Double] = js.undefined
    
    var rippleSequential: js.UndefOr[Boolean] = js.undefined
    
    var rippleSize: js.UndefOr[Double] = js.undefined
  }
  object Disabled {
    
    inline def apply(): Disabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnRippleAnimation(value: (/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onRippleAnimation", js.Any.fromFunction2(value))
      
      inline def setOnRippleAnimationUndefined: Self = StObject.set(x, "onRippleAnimation", js.undefined)
      
      inline def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      inline def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleContainerBorderRadius(value: Double): Self = StObject.set(x, "rippleContainerBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setRippleContainerBorderRadiusUndefined: Self = StObject.set(x, "rippleContainerBorderRadius", js.undefined)
      
      inline def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      inline def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      inline def setRippleFades(value: Boolean): Self = StObject.set(x, "rippleFades", value.asInstanceOf[js.Any])
      
      inline def setRippleFadesUndefined: Self = StObject.set(x, "rippleFades", js.undefined)
      
      inline def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      inline def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      inline def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      inline def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      inline def setRippleSize(value: Double): Self = StObject.set(x, "rippleSize", value.asInstanceOf[js.Any])
      
      inline def setRippleSizeUndefined: Self = StObject.set(x, "rippleSize", js.undefined)
    }
  }
}
