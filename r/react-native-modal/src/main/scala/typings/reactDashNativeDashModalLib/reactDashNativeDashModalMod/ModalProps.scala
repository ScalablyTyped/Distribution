package typings
package reactDashNativeDashModalLib.reactDashNativeDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animationIn: js.UndefOr[AnimationConfig] = js.undefined
  var animationInTiming: js.UndefOr[scala.Double] = js.undefined
  var animationOut: js.UndefOr[AnimationConfig] = js.undefined
  var animationOutTiming: js.UndefOr[scala.Double] = js.undefined
  var avoidKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var backdropColor: js.UndefOr[java.lang.String] = js.undefined
  var backdropOpacity: js.UndefOr[scala.Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[scala.Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[scala.Double] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var deviceHeight: js.UndefOr[scala.Double] = js.undefined
  var deviceWidth: js.UndefOr[scala.Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var isVisible: scala.Boolean
  var onBackButtonPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[
    js.Function1[
      /* orientation */ reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.portrait | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.landscape, 
      scala.Unit
    ]
  ] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ scala.Double, scala.Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var presentationStyle: js.UndefOr[
    reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.fullScreen | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.pageSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.formSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.overFullScreen
  ] = js.undefined
  var propagateSwipe: js.UndefOr[scala.Boolean] = js.undefined
  var scrollOffset: js.UndefOr[scala.Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[scala.Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[
    reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.up | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.down | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.left | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.right
  ] = js.undefined
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    isVisible: scala.Boolean,
    animationIn: AnimationConfig = null,
    animationInTiming: scala.Int | scala.Double = null,
    animationOut: AnimationConfig = null,
    animationOutTiming: scala.Int | scala.Double = null,
    avoidKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    backdropColor: java.lang.String = null,
    backdropOpacity: scala.Int | scala.Double = null,
    backdropTransitionInTiming: scala.Int | scala.Double = null,
    backdropTransitionOutTiming: scala.Int | scala.Double = null,
    deviceHeight: scala.Int | scala.Double = null,
    deviceWidth: scala.Int | scala.Double = null,
    hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined,
    hideModalContentWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    onBackButtonPress: () => scala.Unit = null,
    onBackdropPress: () => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    onModalHide: () => scala.Unit = null,
    onModalShow: () => scala.Unit = null,
    onOrientationChange: /* orientation */ reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.portrait | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.landscape => scala.Unit = null,
    onShow: () => scala.Unit = null,
    onSwipeCancel: () => scala.Unit = null,
    onSwipeComplete: () => scala.Unit = null,
    onSwipeMove: /* percentageShown */ scala.Double => scala.Unit = null,
    onSwipeStart: () => scala.Unit = null,
    presentationStyle: reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.fullScreen | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.pageSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.formSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.overFullScreen = null,
    propagateSwipe: js.UndefOr[scala.Boolean] = js.undefined,
    scrollOffset: scala.Int | scala.Double = null,
    scrollOffsetMax: scala.Int | scala.Double = null,
    scrollTo: /* e */ js.Any => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.up | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.down | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.left | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.right = null,
    swipeThreshold: scala.Int | scala.Double = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible)
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationInTiming != null) __obj.updateDynamic("animationInTiming")(animationInTiming.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (animationOutTiming != null) __obj.updateDynamic("animationOutTiming")(animationOutTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard)
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor)
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (backdropTransitionInTiming != null) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.asInstanceOf[js.Any])
    if (backdropTransitionOutTiming != null) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated)
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating)
    if (onBackButtonPress != null) __obj.updateDynamic("onBackButtonPress")(js.Any.fromFunction0(onBackButtonPress))
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onModalHide != null) __obj.updateDynamic("onModalHide")(js.Any.fromFunction0(onModalHide))
    if (onModalShow != null) __obj.updateDynamic("onModalShow")(js.Any.fromFunction0(onModalShow))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onSwipeCancel != null) __obj.updateDynamic("onSwipeCancel")(js.Any.fromFunction0(onSwipeCancel))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction0(onSwipeComplete))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1(onSwipeMove))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSwipe)) __obj.updateDynamic("propagateSwipe")(propagateSwipe)
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

