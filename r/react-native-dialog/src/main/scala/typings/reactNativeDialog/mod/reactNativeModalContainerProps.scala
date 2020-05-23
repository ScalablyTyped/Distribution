package typings.reactNativeDialog.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.Animation
import typings.reactNativeAnimatable.mod.CustomAnimation
import typings.reactNativeDialog.reactNativeDialogStrings.`box-none`
import typings.reactNativeDialog.reactNativeDialogStrings.`box-only`
import typings.reactNativeDialog.reactNativeDialogStrings.`no-hide-descendants`
import typings.reactNativeDialog.reactNativeDialogStrings.assertive
import typings.reactNativeDialog.reactNativeDialogStrings.auto
import typings.reactNativeDialog.reactNativeDialogStrings.button
import typings.reactNativeDialog.reactNativeDialogStrings.no
import typings.reactNativeDialog.reactNativeDialogStrings.none
import typings.reactNativeDialog.reactNativeDialogStrings.polite
import typings.reactNativeDialog.reactNativeDialogStrings.radiobutton_checked
import typings.reactNativeDialog.reactNativeDialogStrings.radiobutton_unchecked
import typings.reactNativeDialog.reactNativeDialogStrings.yes
import typings.reactNativeModal.modalMod.OnSwipeCompleteParams
import typings.reactNativeModal.typesMod.Direction
import typings.reactNativeModal.typesMod.OnOrientationChange
import typings.reactNativeModal.typesMod.OrNull
import typings.reactNativeModal.typesMod.Orientation
import typings.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-native-modal.react-native-modal.ModalProps, std.Exclude<keyof react-native-modal.react-native-modal.ModalProps, 'isVisible'>>> */
trait reactNativeModalContainerProps extends js.Object {
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var animationIn: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var animationInTiming: js.UndefOr[Double] = js.undefined
  var animationOut: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var animationOutTiming: js.UndefOr[Double] = js.undefined
  var avoidKeyboard: js.UndefOr[Boolean] = js.undefined
  var backdropColor: js.UndefOr[String] = js.undefined
  var backdropOpacity: js.UndefOr[Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var collapsable: js.UndefOr[Boolean] = js.undefined
  var coverScreen: js.UndefOr[Boolean] = js.undefined
  var customBackdrop: js.UndefOr[ReactNode] = js.undefined
  var deviceHeight: js.UndefOr[Double] = js.undefined
  var deviceWidth: js.UndefOr[Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  var nativeID: js.UndefOr[String] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
  var propagateSwipe: js.UndefOr[Boolean] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  var scrollHorizontal: js.UndefOr[Boolean] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[OrNull[js.Function1[/* e */ _, Unit]]] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object reactNativeModalContainerProps {
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
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationInTiming: js.UndefOr[Double] = js.undefined,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationOutTiming: js.UndefOr[Double] = js.undefined,
    avoidKeyboard: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropOpacity: js.UndefOr[Double] = js.undefined,
    backdropTransitionInTiming: js.UndefOr[Double] = js.undefined,
    backdropTransitionOutTiming: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    customBackdrop: ReactNode = null,
    deviceHeight: js.UndefOr[Double] = js.undefined,
    deviceWidth: js.UndefOr[Double] = js.undefined,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBackButtonPress: () => Unit = null,
    onBackdropPress: () => Unit = null,
    onDismiss: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onModalHide: () => Unit = null,
    onModalShow: () => Unit = null,
    onModalWillHide: () => Unit = null,
    onModalWillShow: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onOrientationChange: /* orientation */ NativeSyntheticEvent[js.Any] => Unit = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onShow: () => Unit = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onSwipeCancel: () => Unit = null,
    onSwipeComplete: /* params */ OnSwipeCompleteParams => Unit = null,
    onSwipeMove: /* percentageShown */ Double => Unit = null,
    onSwipeStart: () => Unit = null,
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    presentationStyle: PresentationStyle = null,
    propagateSwipe: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    scrollHorizontal: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: js.UndefOr[Double] = js.undefined,
    scrollOffsetMax: js.UndefOr[Double] = js.undefined,
    scrollTo: js.UndefOr[Null | (/* e */ _ => Unit)] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null,
    swipeThreshold: js.UndefOr[Double] = js.undefined,
    testID: String = null,
    tvParallaxMagnification: js.UndefOr[Double] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined,
    tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined,
    tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): reactNativeModalContainerProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (!js.isUndefined(animationInTiming)) __obj.updateDynamic("animationInTiming")(animationInTiming.get.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (!js.isUndefined(animationOutTiming)) __obj.updateDynamic("animationOutTiming")(animationOutTiming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard.get.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropOpacity)) __obj.updateDynamic("backdropOpacity")(backdropOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropTransitionInTiming)) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropTransitionOutTiming)) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.get.asInstanceOf[js.Any])
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceHeight)) __obj.updateDynamic("deviceHeight")(deviceHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceWidth)) __obj.updateDynamic("deviceWidth")(deviceWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.get.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.get.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBackButtonPress != null) __obj.updateDynamic("onBackButtonPress")(js.Any.fromFunction0(onBackButtonPress))
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onModalHide != null) __obj.updateDynamic("onModalHide")(js.Any.fromFunction0(onModalHide))
    if (onModalShow != null) __obj.updateDynamic("onModalShow")(js.Any.fromFunction0(onModalShow))
    if (onModalWillHide != null) __obj.updateDynamic("onModalWillHide")(js.Any.fromFunction0(onModalWillHide))
    if (onModalWillShow != null) __obj.updateDynamic("onModalWillShow")(js.Any.fromFunction0(onModalWillShow))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onSwipeCancel != null) __obj.updateDynamic("onSwipeCancel")(js.Any.fromFunction0(onSwipeCancel))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction1(onSwipeComplete))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1(onSwipeMove))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSwipe)) __obj.updateDynamic("propagateSwipe")(propagateSwipe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHorizontal)) __obj.updateDynamic("scrollHorizontal")(scrollHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffsetMax)) __obj.updateDynamic("scrollOffsetMax")(scrollOffsetMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTo)) __obj.updateDynamic("scrollTo")(if (scrollTo != null) js.Any.fromFunction1(scrollTo.asInstanceOf[/* e */ _ => Unit]) else null)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeThreshold)) __obj.updateDynamic("swipeThreshold")(swipeThreshold.get.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxMagnification)) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.get.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceX)) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceY)) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxTiltAngle)) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[reactNativeModalContainerProps]
  }
}

