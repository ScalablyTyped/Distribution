package typings
package reactDashNativeDashModalboxLib.reactDashNativeDashModalboxMod

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
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * (Android only) Close modal when receiving back button event
    *
    * Default is false
    *
    */
  var backButtonClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If a backdrop is displayed behind the modal
    *
    * Default is true
    *
    */
  var backdrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Background color of the backdrop
    *
    * Default is black
    *
    */
  var backdropColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add an element in the backdrop (a close button for example)
    *
    * Default is null
    *
    */
  var backdropContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Opacity of the backdrop
    *
    * Default is 0.5
    *
    */
  var backdropOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the modal can be closed by pressing on the backdrop
    *
    * Default is true
    *
    */
  var backdropPressToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Default is false
    */
  var coverScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The direction modal enters from
    *
    * Default is bottom
    *
    */
  var entry: js.UndefOr[
    reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.top | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.bottom | java.lang.String
  ] = js.undefined
  /**
    * Checks if the modal is disabled
    *
    * Default is false
    *
    */
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Checks if the modal is open
    *
    * Default is false
    *
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
    *
    * Default is ios:22, android:0
    */
  var keyboardTopOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Event fired when the modal is closed and the animation is complete
    *
    */
  var onClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * When the state of the swipe to close feature has changed
    * (useful to change the content of the modal, display a message for example)
    *
    *
    */
  var onClosingState: js.UndefOr[js.Function1[/* state */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Event fired when the modal is opened and the animation is complete
    *
    */
  var onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The final position of the modal.
    * Accepts top, center or bottom
    *
    * Default is center
    *
    */
  var position: js.UndefOr[
    reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.top | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.center | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.bottom | java.lang.String
  ] = js.undefined
  /**
    * If the modal should appear open without animation upon first mount
    *
    * Default is false
    *
    */
  var startOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom styling for the content area
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * The height in pixels of the swipeable area
    *
    * Default is the Window Height
    *
    */
  var swipeArea: js.UndefOr[scala.Double] = js.undefined
  /**
    * The threshold to reach in pixels to close the modal
    *
    * Default is 50
    *
    */
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the modal can be closed by swiping
    *
    * Default is true
    *
    */
  var swipeToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables the hardware acceleration to animate the modal. Please note that enabling this can cause some flashes in a weird way when animating
    *
    * Default is true
    *
    */
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    backButtonClose: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    backdropColor: java.lang.String = null,
    backdropContent: reactLib.reactMod.ReactNs.ReactNode = null,
    backdropOpacity: scala.Int | scala.Double = null,
    backdropPressToClose: js.UndefOr[scala.Boolean] = js.undefined,
    coverScreen: js.UndefOr[scala.Boolean] = js.undefined,
    entry: reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.top | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.bottom | java.lang.String = null,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardTopOffset: scala.Int | scala.Double = null,
    onClosed: js.Function0[scala.Unit] = null,
    onClosingState: js.Function1[/* state */ scala.Boolean, scala.Unit] = null,
    onOpened: js.Function0[scala.Unit] = null,
    position: reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.top | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.center | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.bottom | java.lang.String = null,
    startOpen: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    swipeArea: scala.Int | scala.Double = null,
    swipeThreshold: scala.Int | scala.Double = null,
    swipeToClose: js.UndefOr[scala.Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(backButtonClose)) __obj.updateDynamic("backButtonClose")(backButtonClose)
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor)
    if (backdropContent != null) __obj.updateDynamic("backdropContent")(backdropContent.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropPressToClose)) __obj.updateDynamic("backdropPressToClose")(backdropPressToClose)
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen)
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (keyboardTopOffset != null) __obj.updateDynamic("keyboardTopOffset")(keyboardTopOffset.asInstanceOf[js.Any])
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onClosingState != null) __obj.updateDynamic("onClosingState")(onClosingState)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeArea != null) __obj.updateDynamic("swipeArea")(swipeArea.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeToClose)) __obj.updateDynamic("swipeToClose")(swipeToClose)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[ModalProps]
  }
}

