package typings.reactDashNativeDashModal.distModalMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.Animation
import typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.CustomAnimation
import typings.reactDashNativeDashModal.distTypesMod.Direction
import typings.reactDashNativeDashModal.distTypesMod.OnOrientationChange
import typings.reactDashNativeDashModal.distTypesMod.OrNull
import typings.reactDashNativeDashModal.distTypesMod.Orientation
import typings.reactDashNativeDashModal.distTypesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
  var animationInTiming: Double
  var animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
  var animationOutTiming: Double
  var avoidKeyboard: Boolean
  var backdropColor: String
  var backdropOpacity: Double
  var backdropTransitionInTiming: Double
  var backdropTransitionOutTiming: Double
  var children: ReactNode
  var coverScreen: Boolean
  var customBackdrop: ReactNode
  var deviceHeight: Double
  var deviceWidth: Double
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: Boolean
  var hideModalContentWhileAnimating: Boolean
  var isVisible: Boolean
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
  var propagateSwipe: Boolean
  var scrollHorizontal: Boolean
  var scrollOffset: Double
  var scrollOffsetMax: Double
  var scrollTo: OrNull[js.Function1[/* e */ _, Unit]]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
  var swipeThreshold: Double
  var useNativeDriver: Boolean
  def onBackButtonPress(): Unit
  def onBackdropPress(): Unit
  def onModalHide(): Unit
  def onModalShow(): Unit
  def onModalWillHide(): Unit
  def onModalWillShow(): Unit
}

object ModalProps {
  @scala.inline
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationInTiming: Double,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    deviceHeight: Double,
    deviceWidth: Double,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    onBackButtonPress: () => Unit,
    onBackdropPress: () => Unit,
    onModalHide: () => Unit,
    onModalShow: () => Unit,
    onModalWillHide: () => Unit,
    onModalWillShow: () => Unit,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    swipeThreshold: Double,
    useNativeDriver: Boolean,
    children: ReactNode = null,
    customBackdrop: ReactNode = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null,
    onOrientationChange: /* orientation */ NativeSyntheticEvent[js.Any] => Unit = null,
    onShow: () => Unit = null,
    onSwipeCancel: () => Unit = null,
    onSwipeComplete: /* params */ OnSwipeCompleteParams => Unit = null,
    onSwipeMove: /* percentageShown */ Double => Unit = null,
    onSwipeStart: () => Unit = null,
    presentationStyle: PresentationStyle = null,
    scrollTo: /* e */ _ => Unit = null,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onSwipeCancel != null) __obj.updateDynamic("onSwipeCancel")(js.Any.fromFunction0(onSwipeCancel))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction1(onSwipeComplete))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1(onSwipeMove))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1(scrollTo))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

