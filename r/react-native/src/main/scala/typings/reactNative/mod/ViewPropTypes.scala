package typings.reactNative.mod

import typings.propTypes.mod.Validator
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "ViewPropTypes")
@js.native
object ViewPropTypes extends js.Object {
  var accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  var accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  var accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  var accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  var accessibilityTraits: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  var accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var collapsable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var hitSlop: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  var isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]] = js.native
  var onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  var onResponderEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderGrant: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderReject: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderRelease: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderTerminate: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onResponderTerminationRequest: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  var onStartShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  var pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  var removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
}

