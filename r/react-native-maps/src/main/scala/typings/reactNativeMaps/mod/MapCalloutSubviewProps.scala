package typings.reactNativeMaps.mod

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
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
import typings.reactNativeMaps.Anon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapCalloutSubviewProps extends ViewProps {
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[Anon1], Unit]] = js.undefined
}

object MapCalloutSubviewProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onPress: /* event */ MapEvent[Anon1] => Unit = null,
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
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null
  ): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
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
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
}

