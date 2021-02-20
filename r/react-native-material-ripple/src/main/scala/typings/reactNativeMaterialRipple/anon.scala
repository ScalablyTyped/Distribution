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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-native.react-native.Animated.AnimatedProps<react-native.react-native.ViewProps> */
  @js.native
  trait AnimatedPropsViewProps extends StObject {
    
    var accessibilityActions: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
      ] = js.native
    
    var accessibilityComponentType: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]) | none | button | radiobutton_checked | radiobutton_unchecked | (TAugmentRef[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]])
      ] = js.native
    
    var accessibilityElementsHidden: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var accessibilityHint: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.native
    
    var accessibilityIgnoresInvertColors: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var accessibilityLabel: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.native
    
    var accessibilityLiveRegion: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
      ] = js.native
    
    var accessibilityRole: js.UndefOr[
        WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
      ] = js.native
    
    var accessibilityState: js.UndefOr[
        WithAnimatedValue[js.UndefOr[AccessibilityState]] | AccessibilityState | TAugmentRef[js.UndefOr[AccessibilityState]]
      ] = js.native
    
    var accessibilityTraits: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]) | AccessibilityTrait | js.Array[AccessibilityTrait] | (TAugmentRef[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]])
      ] = js.native
    
    var accessibilityValue: js.UndefOr[
        WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
      ] = js.native
    
    var accessibilityViewIsModal: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var accessible: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var collapsable: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var focusable: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var hasTVPreferredFocus: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var hitSlop: js.UndefOr[WithAnimatedValue[js.UndefOr[Insets]] | Insets | TAugmentRef[js.UndefOr[Insets]]] = js.native
    
    var importantForAccessibility: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
      ] = js.native
    
    var isTVSelectable: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var nativeID: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.native
    
    var needsOffscreenAlphaCompositing: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var onAccessibilityAction: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
      ] = js.native
    
    var onAccessibilityEscape: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ] = js.native
    
    var onAccessibilityTap: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ] = js.native
    
    var onLayout: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
      ] = js.native
    
    var onMagicTap: js.UndefOr[
        WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ] = js.native
    
    var onMoveShouldSetResponder: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.native
    
    var onMoveShouldSetResponderCapture: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.native
    
    var onResponderEnd: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderGrant: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderMove: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderReject: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderRelease: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderStart: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderTerminate: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onResponderTerminationRequest: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.native
    
    var onStartShouldSetResponder: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.native
    
    var onStartShouldSetResponderCapture: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ] = js.native
    
    var onTouchCancel: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onTouchEnd: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onTouchEndCapture: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onTouchMove: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var onTouchStart: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ] = js.native
    
    var pointerEvents: js.UndefOr[
        (WithAnimatedValue[js.UndefOr[`box-none` | none | `box-only` | auto]]) | `box-none` | none | `box-only` | auto | (TAugmentRef[js.UndefOr[`box-none` | none | `box-only` | auto]])
      ] = js.native
    
    var removeClippedSubviews: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var renderToHardwareTextureAndroid: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var shouldRasterizeIOS: js.UndefOr[
        WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
      ] = js.native
    
    var style: js.UndefOr[
        WithAnimatedValue[js.UndefOr[StyleProp[ViewStyle]]] | StyleProp[ViewStyle] | TAugmentRef[js.UndefOr[StyleProp[ViewStyle]]]
      ] = js.native
    
    var testID: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.native
    
    var tvParallaxMagnification: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.native
    
    var tvParallaxProperties: js.UndefOr[
        WithAnimatedValue[js.UndefOr[TVParallaxProperties]] | TVParallaxProperties | TAugmentRef[js.UndefOr[TVParallaxProperties]]
      ] = js.native
    
    var tvParallaxShiftDistanceX: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.native
    
    var tvParallaxShiftDistanceY: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.native
    
    var tvParallaxTiltAngle: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.native
  }
  object AnimatedPropsViewProps {
    
    @scala.inline
    def apply(): AnimatedPropsViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedPropsViewProps]
    }
    
    @scala.inline
    implicit class AnimatedPropsViewPropsMutableBuilder[Self <: AnimatedPropsViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(
        value: WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
      ): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityActions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityActionsNull: Self = StObject.set(x, "accessibilityActions", null)
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(
        value: (WithAnimatedValue[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]) | none | button | radiobutton_checked | radiobutton_unchecked | (TAugmentRef[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]])
      ): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityComponentType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityComponentTypeNull: Self = StObject.set(x, "accessibilityComponentType", null)
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityElementsHidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityElementsHiddenNull: Self = StObject.set(x, "accessibilityElementsHidden", null)
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityHint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityHintNull: Self = StObject.set(x, "accessibilityHint", null)
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsNull: Self = StObject.set(x, "accessibilityIgnoresInvertColors", null)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityLabelNull: Self = StObject.set(x, "accessibilityLabel", null)
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(
        value: (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
      ): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLiveRegion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityLiveRegionNull: Self = StObject.set(x, "accessibilityLiveRegion", null)
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(
        value: WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
      ): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityRole", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityRoleNull: Self = StObject.set(x, "accessibilityRole", null)
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(
        value: WithAnimatedValue[js.UndefOr[AccessibilityState]] | AccessibilityState | TAugmentRef[js.UndefOr[AccessibilityState]]
      ): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityStateNull: Self = StObject.set(x, "accessibilityState", null)
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(
        value: (WithAnimatedValue[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]) | AccessibilityTrait | js.Array[AccessibilityTrait] | (TAugmentRef[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]])
      ): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityTraits", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityTraitsNull: Self = StObject.set(x, "accessibilityTraits", null)
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(
        value: WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
      ): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityValueNull: Self = StObject.set(x, "accessibilityValue", null)
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessibilityViewIsModal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibilityViewIsModalNull: Self = StObject.set(x, "accessibilityViewIsModal", null)
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "accessible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAccessibleNull: Self = StObject.set(x, "accessible", null)
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setCollapsable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "collapsable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsableNull: Self = StObject.set(x, "collapsable", null)
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setFocusable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "focusable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusableNull: Self = StObject.set(x, "focusable", null)
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "hasTVPreferredFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasTVPreferredFocusNull: Self = StObject.set(x, "hasTVPreferredFocus", null)
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: WithAnimatedValue[js.UndefOr[Insets]] | Insets | TAugmentRef[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "hitSlop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHitSlopNull: Self = StObject.set(x, "hitSlop", null)
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(
        value: (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
      ): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "importantForAccessibility", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImportantForAccessibilityNull: Self = StObject.set(x, "importantForAccessibility", null)
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setIsTVSelectable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTVSelectableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "isTVSelectable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsTVSelectableNull: Self = StObject.set(x, "isTVSelectable", null)
      
      @scala.inline
      def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      @scala.inline
      def setNativeID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "nativeID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNativeIDNull: Self = StObject.set(x, "nativeID", null)
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositing(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingNull: Self = StObject.set(x, "needsOffscreenAlphaCompositing", null)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
      ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAccessibilityActionFunction1(value: (/* event */ AccessibilityActionEvent) | js.Any | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionNull: Self = StObject.set(x, "onAccessibilityAction", null)
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(
        value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAccessibilityEscapeFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityEscapeNull: Self = StObject.set(x, "onAccessibilityEscape", null)
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(
        value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAccessibilityTapFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityTapNull: Self = StObject.set(x, "onAccessibilityTap", null)
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnLayout(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
      ): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLayoutFunction1(value: js.Any | (/* event */ LayoutChangeEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutNull: Self = StObject.set(x, "onLayout", null)
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnMagicTap(
        value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
      ): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMagicTapFunction0(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMagicTapNull: Self = StObject.set(x, "onMagicTap", null)
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureNull: Self = StObject.set(x, "onMoveShouldSetResponderCapture", null)
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderNull: Self = StObject.set(x, "onMoveShouldSetResponder", null)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderEndFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndNull: Self = StObject.set(x, "onResponderEnd", null)
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderGrantFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantNull: Self = StObject.set(x, "onResponderGrant", null)
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderMoveFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveNull: Self = StObject.set(x, "onResponderMove", null)
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderRejectFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectNull: Self = StObject.set(x, "onResponderReject", null)
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderReleaseFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseNull: Self = StObject.set(x, "onResponderRelease", null)
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderStartFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartNull: Self = StObject.set(x, "onResponderStart", null)
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderTerminateFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateNull: Self = StObject.set(x, "onResponderTerminate", null)
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponderTerminationRequestFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestNull: Self = StObject.set(x, "onResponderTerminationRequest", null)
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
      ): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureNull: Self = StObject.set(x, "onStartShouldSetResponderCapture", null)
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderNull: Self = StObject.set(x, "onStartShouldSetResponder", null)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchCancelFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelNull: Self = StObject.set(x, "onTouchCancel", null)
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchEndCapture(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchEndCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCaptureNull: Self = StObject.set(x, "onTouchEndCapture", null)
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndNull: Self = StObject.set(x, "onTouchEnd", null)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchMoveFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveNull: Self = StObject.set(x, "onTouchMove", null)
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(
        value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
      ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchStartFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartNull: Self = StObject.set(x, "onTouchStart", null)
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPointerEvents(
        value: (WithAnimatedValue[js.UndefOr[`box-none` | none | `box-only` | auto]]) | `box-none` | none | `box-only` | auto | (TAugmentRef[js.UndefOr[`box-none` | none | `box-only` | auto]])
      ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "pointerEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointerEventsNull: Self = StObject.set(x, "pointerEvents", null)
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "removeClippedSubviews", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClippedSubviewsNull: Self = StObject.set(x, "removeClippedSubviews", null)
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "renderToHardwareTextureAndroid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderToHardwareTextureAndroidNull: Self = StObject.set(x, "renderToHardwareTextureAndroid", null)
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "shouldRasterizeIOS", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRasterizeIOSNull: Self = StObject.set(x, "shouldRasterizeIOS", null)
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setStyle(
        value: WithAnimatedValue[js.UndefOr[StyleProp[ViewStyle]]] | StyleProp[ViewStyle] | TAugmentRef[js.UndefOr[StyleProp[ViewStyle]]]
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "testID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTestIDNull: Self = StObject.set(x, "testID", null)
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTvParallaxMagnification(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxMagnificationFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxMagnification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTvParallaxMagnificationNull: Self = StObject.set(x, "tvParallaxMagnification", null)
      
      @scala.inline
      def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      @scala.inline
      def setTvParallaxProperties(
        value: WithAnimatedValue[js.UndefOr[TVParallaxProperties]] | TVParallaxProperties | TAugmentRef[js.UndefOr[TVParallaxProperties]]
      ): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxPropertiesFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxProperties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTvParallaxPropertiesNull: Self = StObject.set(x, "tvParallaxProperties", null)
      
      @scala.inline
      def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceX(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceXFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxShiftDistanceX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTvParallaxShiftDistanceXNull: Self = StObject.set(x, "tvParallaxShiftDistanceX", null)
      
      @scala.inline
      def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceY(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceYFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxShiftDistanceY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTvParallaxShiftDistanceYNull: Self = StObject.set(x, "tvParallaxShiftDistanceY", null)
      
      @scala.inline
      def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      @scala.inline
      def setTvParallaxTiltAngle(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxTiltAngleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = StObject.set(x, "tvParallaxTiltAngle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTvParallaxTiltAngleNull: Self = StObject.set(x, "tvParallaxTiltAngle", null)
      
      @scala.inline
      def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    }
  }
  
  @js.native
  trait Disabled extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onRippleAnimation: js.UndefOr[
        js.Function2[/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit], Unit]
      ] = js.native
    
    var rippleCentered: js.UndefOr[Boolean] = js.native
    
    var rippleColor: js.UndefOr[String] = js.native
    
    var rippleContainerBorderRadius: js.UndefOr[Double] = js.native
    
    var rippleDuration: js.UndefOr[Double] = js.native
    
    var rippleFades: js.UndefOr[Boolean] = js.native
    
    var rippleOpacity: js.UndefOr[Double] = js.native
    
    var rippleSequential: js.UndefOr[Boolean] = js.native
    
    var rippleSize: js.UndefOr[Double] = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply(): Disabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnRippleAnimation(value: (/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onRippleAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRippleAnimationUndefined: Self = StObject.set(x, "onRippleAnimation", js.undefined)
      
      @scala.inline
      def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      @scala.inline
      def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      @scala.inline
      def setRippleContainerBorderRadius(value: Double): Self = StObject.set(x, "rippleContainerBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleContainerBorderRadiusUndefined: Self = StObject.set(x, "rippleContainerBorderRadius", js.undefined)
      
      @scala.inline
      def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      @scala.inline
      def setRippleFades(value: Boolean): Self = StObject.set(x, "rippleFades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleFadesUndefined: Self = StObject.set(x, "rippleFades", js.undefined)
      
      @scala.inline
      def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      @scala.inline
      def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      @scala.inline
      def setRippleSize(value: Double): Self = StObject.set(x, "rippleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleSizeUndefined: Self = StObject.set(x, "rippleSize", js.undefined)
    }
  }
}
