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
@js.native
trait reactNativeModalContainerProps extends js.Object {
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  var accessibilityHint: js.UndefOr[String] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  var accessible: js.UndefOr[Boolean] = js.native
  var animationIn: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
  var animationInTiming: js.UndefOr[Double] = js.native
  var animationOut: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
  var animationOutTiming: js.UndefOr[Double] = js.native
  var avoidKeyboard: js.UndefOr[Boolean] = js.native
  var backdropColor: js.UndefOr[String] = js.native
  var backdropOpacity: js.UndefOr[Double] = js.native
  var backdropTransitionInTiming: js.UndefOr[Double] = js.native
  var backdropTransitionOutTiming: js.UndefOr[Double] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var collapsable: js.UndefOr[Boolean] = js.native
  var coverScreen: js.UndefOr[Boolean] = js.native
  var customBackdrop: js.UndefOr[ReactNode] = js.native
  var deviceHeight: js.UndefOr[Double] = js.native
  var deviceWidth: js.UndefOr[Double] = js.native
  var focusable: js.UndefOr[Boolean] = js.native
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Insets] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  var nativeID: js.UndefOr[String] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.native
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var presentationStyle: js.UndefOr[PresentationStyle] = js.native
  var propagateSwipe: js.UndefOr[Boolean] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  var scrollHorizontal: js.UndefOr[Boolean] = js.native
  var scrollOffset: js.UndefOr[Double] = js.native
  var scrollOffsetMax: js.UndefOr[Double] = js.native
  var scrollTo: js.UndefOr[OrNull[js.Function1[/* e */ _, Unit]]] = js.native
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.native
  var swipeThreshold: js.UndefOr[Double] = js.native
  var testID: js.UndefOr[String] = js.native
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object reactNativeModalContainerProps {
  @scala.inline
  def apply(): reactNativeModalContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[reactNativeModalContainerProps]
  }
  @scala.inline
  implicit class reactNativeModalContainerPropsOps[Self <: reactNativeModalContainerProps] (val x: Self) extends AnyVal {
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
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setAnimationIn(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationIn: Self = this.set("animationIn", js.undefined)
    @scala.inline
    def setAnimationInTiming(value: Double): Self = this.set("animationInTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationInTiming: Self = this.set("animationInTiming", js.undefined)
    @scala.inline
    def setAnimationOut(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = this.set("animationOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOut: Self = this.set("animationOut", js.undefined)
    @scala.inline
    def setAnimationOutTiming(value: Double): Self = this.set("animationOutTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOutTiming: Self = this.set("animationOutTiming", js.undefined)
    @scala.inline
    def setAvoidKeyboard(value: Boolean): Self = this.set("avoidKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidKeyboard: Self = this.set("avoidKeyboard", js.undefined)
    @scala.inline
    def setBackdropColor(value: String): Self = this.set("backdropColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropColor: Self = this.set("backdropColor", js.undefined)
    @scala.inline
    def setBackdropOpacity(value: Double): Self = this.set("backdropOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropOpacity: Self = this.set("backdropOpacity", js.undefined)
    @scala.inline
    def setBackdropTransitionInTiming(value: Double): Self = this.set("backdropTransitionInTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropTransitionInTiming: Self = this.set("backdropTransitionInTiming", js.undefined)
    @scala.inline
    def setBackdropTransitionOutTiming(value: Double): Self = this.set("backdropTransitionOutTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropTransitionOutTiming: Self = this.set("backdropTransitionOutTiming", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCollapsable(value: Boolean): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    @scala.inline
    def setCoverScreen(value: Boolean): Self = this.set("coverScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverScreen: Self = this.set("coverScreen", js.undefined)
    @scala.inline
    def setCustomBackdrop(value: ReactNode): Self = this.set("customBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomBackdrop: Self = this.set("customBackdrop", js.undefined)
    @scala.inline
    def setDeviceHeight(value: Double): Self = this.set("deviceHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceHeight: Self = this.set("deviceHeight", js.undefined)
    @scala.inline
    def setDeviceWidth(value: Double): Self = this.set("deviceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceWidth: Self = this.set("deviceWidth", js.undefined)
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    @scala.inline
    def setHardwareAccelerated(value: Boolean): Self = this.set("hardwareAccelerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareAccelerated: Self = this.set("hardwareAccelerated", js.undefined)
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBackdrop: Self = this.set("hasBackdrop", js.undefined)
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    @scala.inline
    def setHideModalContentWhileAnimating(value: Boolean): Self = this.set("hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideModalContentWhileAnimating: Self = this.set("hideModalContentWhileAnimating", js.undefined)
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    @scala.inline
    def setOnBackButtonPress(value: () => Unit): Self = this.set("onBackButtonPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackButtonPress: Self = this.set("onBackButtonPress", js.undefined)
    @scala.inline
    def setOnBackdropPress(value: () => Unit): Self = this.set("onBackdropPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackdropPress: Self = this.set("onBackdropPress", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    @scala.inline
    def setOnModalHide(value: () => Unit): Self = this.set("onModalHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnModalHide: Self = this.set("onModalHide", js.undefined)
    @scala.inline
    def setOnModalShow(value: () => Unit): Self = this.set("onModalShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnModalShow: Self = this.set("onModalShow", js.undefined)
    @scala.inline
    def setOnModalWillHide(value: () => Unit): Self = this.set("onModalWillHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnModalWillHide: Self = this.set("onModalWillHide", js.undefined)
    @scala.inline
    def setOnModalWillShow(value: () => Unit): Self = this.set("onModalWillShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnModalWillShow: Self = this.set("onModalWillShow", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOnOrientationChange(value: /* orientation */ NativeSyntheticEvent[js.Any] => Unit): Self = this.set("onOrientationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    @scala.inline
    def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    @scala.inline
    def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    @scala.inline
    def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    @scala.inline
    def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    @scala.inline
    def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    @scala.inline
    def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    @scala.inline
    def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    @scala.inline
    def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOnSwipeCancel(value: () => Unit): Self = this.set("onSwipeCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeCancel: Self = this.set("onSwipeCancel", js.undefined)
    @scala.inline
    def setOnSwipeComplete(value: /* params */ OnSwipeCompleteParams => Unit): Self = this.set("onSwipeComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeComplete: Self = this.set("onSwipeComplete", js.undefined)
    @scala.inline
    def setOnSwipeMove(value: /* percentageShown */ Double => Unit): Self = this.set("onSwipeMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeMove: Self = this.set("onSwipeMove", js.undefined)
    @scala.inline
    def setOnSwipeStart(value: () => Unit): Self = this.set("onSwipeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeStart: Self = this.set("onSwipeStart", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    @scala.inline
    def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setPresentationStyle(value: PresentationStyle): Self = this.set("presentationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationStyle: Self = this.set("presentationStyle", js.undefined)
    @scala.inline
    def setPropagateSwipe(value: Boolean): Self = this.set("propagateSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagateSwipe: Self = this.set("propagateSwipe", js.undefined)
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    @scala.inline
    def setScrollHorizontal(value: Boolean): Self = this.set("scrollHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHorizontal: Self = this.set("scrollHorizontal", js.undefined)
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    @scala.inline
    def setScrollOffsetMax(value: Double): Self = this.set("scrollOffsetMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOffsetMax: Self = this.set("scrollOffsetMax", js.undefined)
    @scala.inline
    def setScrollTo(value: /* e */ _ => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setScrollToNull: Self = this.set("scrollTo", null)
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setSupportedOrientationsVarargs(value: Orientation*): Self = this.set("supportedOrientations", js.Array(value :_*))
    @scala.inline
    def setSupportedOrientations(value: js.Array[Orientation]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setSwipeDirectionVarargs(value: Direction*): Self = this.set("swipeDirection", js.Array(value :_*))
    @scala.inline
    def setSwipeDirection(value: Direction | js.Array[Direction]): Self = this.set("swipeDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDirection: Self = this.set("swipeDirection", js.undefined)
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
  }
  
}

