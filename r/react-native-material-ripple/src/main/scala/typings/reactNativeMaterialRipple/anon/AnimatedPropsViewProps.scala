package typings.reactNativeMaterialRipple.anon

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native.react-native.Animated.AnimatedProps<react-native.react-native.ViewProps> */
@js.native
trait AnimatedPropsViewProps extends js.Object {
  
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
  implicit class AnimatedPropsViewPropsOps[Self <: AnimatedPropsViewProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActionsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityActions(
      value: WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
    ): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsNull: Self = this.set("accessibilityActions", null)
    
    @scala.inline
    def setAccessibilityComponentTypeFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityComponentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityComponentType(
      value: (WithAnimatedValue[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]) | none | button | radiobutton_checked | radiobutton_unchecked | (TAugmentRef[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]])
    ): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentTypeNull: Self = this.set("accessibilityComponentType", null)
    
    @scala.inline
    def setAccessibilityElementsHiddenFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityElementsHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityElementsHidden(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHiddenNull: Self = this.set("accessibilityElementsHidden", null)
    
    @scala.inline
    def setAccessibilityHintFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityHint(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityHintNull: Self = this.set("accessibilityHint", null)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityIgnoresInvertColors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsNull: Self = this.set("accessibilityIgnoresInvertColors", null)
    
    @scala.inline
    def setAccessibilityLabelFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityLabel(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLabelNull: Self = this.set("accessibilityLabel", null)
    
    @scala.inline
    def setAccessibilityLiveRegionFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityLiveRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityLiveRegion(
      value: (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
    ): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegionNull: Self = this.set("accessibilityLiveRegion", null)
    
    @scala.inline
    def setAccessibilityRoleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityRole(
      value: WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
    ): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityRoleNull: Self = this.set("accessibilityRole", null)
    
    @scala.inline
    def setAccessibilityStateFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityState(
      value: WithAnimatedValue[js.UndefOr[AccessibilityState]] | AccessibilityState | TAugmentRef[js.UndefOr[AccessibilityState]]
    ): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityStateNull: Self = this.set("accessibilityState", null)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraitsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityTraits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityTraits(
      value: (WithAnimatedValue[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]) | AccessibilityTrait | js.Array[AccessibilityTrait] | (TAugmentRef[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]])
    ): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsNull: Self = this.set("accessibilityTraits", null)
    
    @scala.inline
    def setAccessibilityValueFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityValue(
      value: WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
    ): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityValueNull: Self = this.set("accessibilityValue", null)
    
    @scala.inline
    def setAccessibilityViewIsModalFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessibilityViewIsModal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityViewIsModal(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModalNull: Self = this.set("accessibilityViewIsModal", null)
    
    @scala.inline
    def setAccessibleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("accessible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessible(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setAccessibleNull: Self = this.set("accessible", null)
    
    @scala.inline
    def setCollapsableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("collapsable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapsable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    
    @scala.inline
    def setCollapsableNull: Self = this.set("collapsable", null)
    
    @scala.inline
    def setFocusableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("focusable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setFocusableNull: Self = this.set("focusable", null)
    
    @scala.inline
    def setHasTVPreferredFocusFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("hasTVPreferredFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasTVPreferredFocus(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocusNull: Self = this.set("hasTVPreferredFocus", null)
    
    @scala.inline
    def setHitSlopFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("hitSlop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHitSlop(value: WithAnimatedValue[js.UndefOr[Insets]] | Insets | TAugmentRef[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setHitSlopNull: Self = this.set("hitSlop", null)
    
    @scala.inline
    def setImportantForAccessibilityFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("importantForAccessibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImportantForAccessibility(
      value: (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
    ): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setImportantForAccessibilityNull: Self = this.set("importantForAccessibility", null)
    
    @scala.inline
    def setIsTVSelectableFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("isTVSelectable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsTVSelectable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    
    @scala.inline
    def setIsTVSelectableNull: Self = this.set("isTVSelectable", null)
    
    @scala.inline
    def setNativeIDFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("nativeID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNativeID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNativeIDNull: Self = this.set("nativeID", null)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositingFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("needsOffscreenAlphaCompositing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositingNull: Self = this.set("needsOffscreenAlphaCompositing", null)
    
    @scala.inline
    def setOnAccessibilityActionFunction1(value: (/* event */ AccessibilityActionEvent) | js.Any | LegacyRef[js.Any] | Null => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityAction(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
    ): Self = this.set("onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityActionNull: Self = this.set("onAccessibilityAction", null)
    
    @scala.inline
    def setOnAccessibilityEscapeFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityEscapeFunction0(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityEscape(
      value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
    ): Self = this.set("onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscapeNull: Self = this.set("onAccessibilityEscape", null)
    
    @scala.inline
    def setOnAccessibilityTapFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityTapFunction0(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityTap(
      value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
    ): Self = this.set("onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTapNull: Self = this.set("onAccessibilityTap", null)
    
    @scala.inline
    def setOnLayoutFunction1(value: js.Any | (/* event */ LayoutChangeEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayout(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
    ): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnLayoutNull: Self = this.set("onLayout", null)
    
    @scala.inline
    def setOnMagicTapFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("onMagicTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMagicTapFunction0(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMagicTap(
      value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
    ): Self = this.set("onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMagicTapNull: Self = this.set("onMagicTap", null)
    
    @scala.inline
    def setOnMoveShouldSetResponderFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveShouldSetResponder(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = this.set("onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderNull: Self = this.set("onMoveShouldSetResponder", null)
    
    @scala.inline
    def setOnMoveShouldSetResponderCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = this.set("onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderCaptureNull: Self = this.set("onMoveShouldSetResponderCapture", null)
    
    @scala.inline
    def setOnResponderEndFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderEnd(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderEndNull: Self = this.set("onResponderEnd", null)
    
    @scala.inline
    def setOnResponderGrantFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderGrant(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderGrantNull: Self = this.set("onResponderGrant", null)
    
    @scala.inline
    def setOnResponderMoveFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderMove(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderMoveNull: Self = this.set("onResponderMove", null)
    
    @scala.inline
    def setOnResponderRejectFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderReject(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRejectNull: Self = this.set("onResponderReject", null)
    
    @scala.inline
    def setOnResponderReleaseFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderRelease(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderReleaseNull: Self = this.set("onResponderRelease", null)
    
    @scala.inline
    def setOnResponderStartFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderStart(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderStartNull: Self = this.set("onResponderStart", null)
    
    @scala.inline
    def setOnResponderTerminateFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderTerminate(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onResponderTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminateNull: Self = this.set("onResponderTerminate", null)
    
    @scala.inline
    def setOnResponderTerminationRequestFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderTerminationRequest(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = this.set("onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequestNull: Self = this.set("onResponderTerminationRequest", null)
    
    @scala.inline
    def setOnStartShouldSetResponderFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartShouldSetResponder(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = this.set("onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderNull: Self = this.set("onStartShouldSetResponder", null)
    
    @scala.inline
    def setOnStartShouldSetResponderCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Boolean | Unit): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]) | (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = this.set("onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderCaptureNull: Self = this.set("onStartShouldSetResponderCapture", null)
    
    @scala.inline
    def setOnTouchCancelFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancel(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchCancelNull: Self = this.set("onTouchCancel", null)
    
    @scala.inline
    def setOnTouchEndFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndNull: Self = this.set("onTouchEnd", null)
    
    @scala.inline
    def setOnTouchEndCaptureFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCapture(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndCaptureNull: Self = this.set("onTouchEndCapture", null)
    
    @scala.inline
    def setOnTouchMoveFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMove(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchMoveNull: Self = this.set("onTouchMove", null)
    
    @scala.inline
    def setOnTouchStartFunction1(value: js.Any | (/* event */ GestureResponderEvent) | LegacyRef[js.Any] | Null => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTouchStartNull: Self = this.set("onTouchStart", null)
    
    @scala.inline
    def setPointerEventsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("pointerEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointerEvents(
      value: (WithAnimatedValue[js.UndefOr[`box-none` | none | `box-only` | auto]]) | `box-none` | none | `box-only` | auto | (TAugmentRef[js.UndefOr[`box-none` | none | `box-only` | auto]])
    ): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPointerEventsNull: Self = this.set("pointerEvents", null)
    
    @scala.inline
    def setRemoveClippedSubviewsFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("removeClippedSubviews", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClippedSubviews(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviewsNull: Self = this.set("removeClippedSubviews", null)
    
    @scala.inline
    def setRenderToHardwareTextureAndroidFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("renderToHardwareTextureAndroid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroidNull: Self = this.set("renderToHardwareTextureAndroid", null)
    
    @scala.inline
    def setShouldRasterizeIOSFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("shouldRasterizeIOS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldRasterizeIOS(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOSNull: Self = this.set("shouldRasterizeIOS", null)
    
    @scala.inline
    def setStyleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("style", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(
      value: WithAnimatedValue[js.UndefOr[StyleProp[ViewStyle]]] | StyleProp[ViewStyle] | TAugmentRef[js.UndefOr[StyleProp[ViewStyle]]]
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTestIDFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("testID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTestIDNull: Self = this.set("testID", null)
    
    @scala.inline
    def setTvParallaxMagnificationFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("tvParallaxMagnification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTvParallaxMagnification(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnificationNull: Self = this.set("tvParallaxMagnification", null)
    
    @scala.inline
    def setTvParallaxPropertiesFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("tvParallaxProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTvParallaxProperties(
      value: WithAnimatedValue[js.UndefOr[TVParallaxProperties]] | TVParallaxProperties | TAugmentRef[js.UndefOr[TVParallaxProperties]]
    ): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxPropertiesNull: Self = this.set("tvParallaxProperties", null)
    
    @scala.inline
    def setTvParallaxShiftDistanceXFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("tvParallaxShiftDistanceX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceXNull: Self = this.set("tvParallaxShiftDistanceX", null)
    
    @scala.inline
    def setTvParallaxShiftDistanceYFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("tvParallaxShiftDistanceY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceYNull: Self = this.set("tvParallaxShiftDistanceY", null)
    
    @scala.inline
    def setTvParallaxTiltAngleFunction1(value: /* instance */ (js.Any | LegacyRef[js.Any]) | Null => Unit): Self = this.set("tvParallaxTiltAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTvParallaxTiltAngle(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngleNull: Self = this.set("tvParallaxTiltAngle", null)
  }
}
