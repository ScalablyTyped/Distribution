package typings.reactDashNativeDashModal.reactDashNativeDashModalMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashModal.reactDashNativeDashModalStrings.formSheet
import typings.reactDashNativeDashModal.reactDashNativeDashModalStrings.fullScreen
import typings.reactDashNativeDashModal.reactDashNativeDashModalStrings.landscape
import typings.reactDashNativeDashModal.reactDashNativeDashModalStrings.overFullScreen
import typings.reactDashNativeDashModal.reactDashNativeDashModalStrings.pageSheet
import typings.reactDashNativeDashModal.reactDashNativeDashModalStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animationIn: js.UndefOr[AnimationConfig] = js.undefined
  var animationInTiming: js.UndefOr[Double] = js.undefined
  var animationOut: js.UndefOr[AnimationConfig] = js.undefined
  var animationOutTiming: js.UndefOr[Double] = js.undefined
  var avoidKeyboard: js.UndefOr[Boolean] = js.undefined
  var backdropColor: js.UndefOr[String] = js.undefined
  var backdropOpacity: js.UndefOr[Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[Double] = js.undefined
  var children: ReactNode
  var coverScreen: js.UndefOr[Boolean] = js.undefined
  var customBackdrop: js.UndefOr[ReactNode] = js.undefined
  var deviceHeight: js.UndefOr[Double] = js.undefined
  var deviceWidth: js.UndefOr[Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var isVisible: Boolean
  var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[js.Function1[/* orientation */ portrait | landscape, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  var propagateSwipe: js.UndefOr[Boolean] = js.undefined
  var scrollHorizontal: js.UndefOr[Boolean] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    isVisible: Boolean,
    animationIn: AnimationConfig = null,
    animationInTiming: Int | Double = null,
    animationOut: AnimationConfig = null,
    animationOutTiming: Int | Double = null,
    avoidKeyboard: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropOpacity: Int | Double = null,
    backdropTransitionInTiming: Int | Double = null,
    backdropTransitionOutTiming: Int | Double = null,
    children: ReactNode = null,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    customBackdrop: ReactNode = null,
    deviceHeight: Int | Double = null,
    deviceWidth: Int | Double = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    onBackButtonPress: () => Unit = null,
    onBackdropPress: () => Unit = null,
    onDismiss: () => Unit = null,
    onModalHide: () => Unit = null,
    onModalShow: () => Unit = null,
    onModalWillHide: () => Unit = null,
    onModalWillShow: () => Unit = null,
    onOrientationChange: /* orientation */ portrait | landscape => Unit = null,
    onShow: () => Unit = null,
    onSwipeCancel: () => Unit = null,
    onSwipeComplete: () => Unit = null,
    onSwipeMove: /* percentageShown */ Double => Unit = null,
    onSwipeStart: () => Unit = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    propagateSwipe: js.UndefOr[Boolean] = js.undefined,
    scrollHorizontal: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: Int | Double = null,
    scrollOffsetMax: Int | Double = null,
    scrollTo: /* e */ js.Any => Unit = null,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null,
    swipeThreshold: Int | Double = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal(isVisible = isVisible)
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationInTiming != null) __obj.updateDynamic("animationInTiming")(animationInTiming.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (animationOutTiming != null) __obj.updateDynamic("animationOutTiming")(animationOutTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard)
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor)
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (backdropTransitionInTiming != null) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.asInstanceOf[js.Any])
    if (backdropTransitionOutTiming != null) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen)
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating)
    if (onBackButtonPress != null) __obj.updateDynamic("onBackButtonPress")(js.Any.fromFunction0(onBackButtonPress))
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onModalHide != null) __obj.updateDynamic("onModalHide")(js.Any.fromFunction0(onModalHide))
    if (onModalShow != null) __obj.updateDynamic("onModalShow")(js.Any.fromFunction0(onModalShow))
    if (onModalWillHide != null) __obj.updateDynamic("onModalWillHide")(js.Any.fromFunction0(onModalWillHide))
    if (onModalWillShow != null) __obj.updateDynamic("onModalWillShow")(js.Any.fromFunction0(onModalWillShow))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onSwipeCancel != null) __obj.updateDynamic("onSwipeCancel")(js.Any.fromFunction0(onSwipeCancel))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction0(onSwipeComplete))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1(onSwipeMove))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSwipe)) __obj.updateDynamic("propagateSwipe")(propagateSwipe)
    if (!js.isUndefined(scrollHorizontal)) __obj.updateDynamic("scrollHorizontal")(scrollHorizontal)
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (scrollOffsetMax != null) __obj.updateDynamic("scrollOffsetMax")(scrollOffsetMax.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1(scrollTo))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations)
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[ModalProps]
  }
}

