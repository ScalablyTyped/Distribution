package typings.reactDashNativeDashModalbox.reactDashNativeDashModalboxMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashModalbox.reactDashNativeDashModalboxStrings.bottom
import typings.reactDashNativeDashModalbox.reactDashNativeDashModalboxStrings.center
import typings.reactDashNativeDashModalbox.reactDashNativeDashModalboxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  /**
    * Duration of the animation
    *
    * Default is 400ms
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * (Android only) Close modal when receiving back button event
    *
    * Default is false
    *
    */
  var backButtonClose: js.UndefOr[Boolean] = js.undefined
  /**
    * If a backdrop is displayed behind the modal
    *
    * Default is true
    *
    */
  var backdrop: js.UndefOr[Boolean] = js.undefined
  /**
    * Background color of the backdrop
    *
    * Default is black
    *
    */
  var backdropColor: js.UndefOr[String] = js.undefined
  /**
    * Add an element in the backdrop (a close button for example)
    *
    * Default is null
    *
    */
  var backdropContent: js.UndefOr[ReactNode] = js.undefined
  /**
    * Opacity of the backdrop
    *
    * Default is 0.5
    *
    */
  var backdropOpacity: js.UndefOr[Double] = js.undefined
  /**
    * If the modal can be closed by pressing on the backdrop
    *
    * Default is true
    *
    */
  var backdropPressToClose: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Default is false
    */
  var coverScreen: js.UndefOr[Boolean] = js.undefined
  /**
    * The direction modal enters from
    *
    * Default is bottom
    *
    */
  var entry: js.UndefOr[top | bottom | String] = js.undefined
  /**
    * Checks if the modal is disabled
    *
    * Default is false
    *
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Checks if the modal is open
    *
    * Default is false
    *
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
    *
    * Default is ios:22, android:0
    */
  var keyboardTopOffset: js.UndefOr[Double] = js.undefined
  /**
    * Event fired when the modal is closed and the animation is complete
    *
    */
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * When the state of the swipe to close feature has changed
    * (useful to change the content of the modal, display a message for example)
    *
    *
    */
  var onClosingState: js.UndefOr[js.Function1[/* state */ Boolean, Unit]] = js.undefined
  /**
    * Event fired when the modal is opened and the animation is complete
    *
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The final position of the modal.
    * Accepts top, center or bottom
    *
    * Default is center
    *
    */
  var position: js.UndefOr[top | center | bottom | String] = js.undefined
  /**
    * If the modal should appear open without animation upon first mount
    *
    * Default is false
    *
    */
  var startOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styling for the content area
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * The height in pixels of the swipeable area
    *
    * Default is the Window Height
    *
    */
  var swipeArea: js.UndefOr[Double] = js.undefined
  /**
    * The threshold to reach in pixels to close the modal
    *
    * Default is 50
    *
    */
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  /**
    * If the modal can be closed by swiping
    *
    * Default is true
    *
    */
  var swipeToClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables the hardware acceleration to animate the modal. Please note that enabling this can cause some flashes in a weird way when animating
    *
    * Default is true
    *
    */
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    backButtonClose: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropContent: ReactNode = null,
    backdropOpacity: Int | Double = null,
    backdropPressToClose: js.UndefOr[Boolean] = js.undefined,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    entry: top | bottom | String = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    keyboardTopOffset: Int | Double = null,
    onClosed: () => Unit = null,
    onClosingState: /* state */ Boolean => Unit = null,
    onOpened: () => Unit = null,
    position: top | center | bottom | String = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    swipeArea: Int | Double = null,
    swipeThreshold: Int | Double = null,
    swipeToClose: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(backButtonClose)) __obj.updateDynamic("backButtonClose")(backButtonClose.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropContent != null) __obj.updateDynamic("backdropContent")(backdropContent.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropPressToClose)) __obj.updateDynamic("backdropPressToClose")(backdropPressToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (keyboardTopOffset != null) __obj.updateDynamic("keyboardTopOffset")(keyboardTopOffset.asInstanceOf[js.Any])
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction0(onClosed))
    if (onClosingState != null) __obj.updateDynamic("onClosingState")(js.Any.fromFunction1(onClosingState))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction0(onOpened))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeArea != null) __obj.updateDynamic("swipeArea")(swipeArea.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeToClose)) __obj.updateDynamic("swipeToClose")(swipeToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

