package typings.reactNativeDrawer.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ScaledSize
import typings.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typings.reactNativeDrawer.reactNativeDrawerStrings.closed
import typings.reactNativeDrawer.reactNativeDrawerStrings.displace
import typings.reactNativeDrawer.reactNativeDrawerStrings.left
import typings.reactNativeDrawer.reactNativeDrawerStrings.open
import typings.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typings.reactNativeDrawer.reactNativeDrawerStrings.right
import typings.reactNativeDrawer.reactNativeDrawerStrings.static
import typings.reactNativeDrawer.reactNativeDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProperties extends js.Object {
  /**
    * Toggle drawer when double tap occurs within pan mask?
    */
  var acceptDoubleTap: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow for drawer pan (on touch drag). Set to false to effectively
    * disable the drawer while still allowing programmatic control
    */
  var acceptPan: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow Pan when drawer is 'open'
    */
  var acceptPanOnDrawer: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggle drawer when any tap occurs within pan mask?
    */
  var acceptTap: js.UndefOr[Boolean] = js.undefined
  // Gestures
  /**
    * If true, will capture all gestures inside of the pan mask. If 'open' will
    * only capture when drawer is open
    */
  var captureGestures: js.UndefOr[Boolean | open | closed] = js.undefined
  /**
    * Same as openDrawerOffset, except defines left hand margin when drawer is closed
    */
  var closedDrawerOffset: js.UndefOr[js.Function0[Double] | Double] = js.undefined
  // Important
  /**
    * Menu component
    */
  var content: js.UndefOr[ReactNode] = js.undefined
  /**
    * If true the drawer can not be opened and will not respond to pans
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
    */
  var elevation: js.UndefOr[Double] = js.undefined
  /**
    * Initialize with drawer open
    */
  var initializeOpen: js.UndefOr[Double] = js.undefined
  /**
    * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
    */
  var negotiatePan: js.UndefOr[Boolean] = js.undefined
  /**
    * Will be called immediately after the drawer has entered the closed state
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Ccallback fired at the start of a close animation
    */
  var onCloseStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired when a drag gesture starts.
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Event Handlers
  /**
    * Will be called immediately after the drawer has entered the open state
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired at the start of an open animation
    */
  var onOpenStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If true will trigger drawer open, if false will trigger close.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
    * the drawer is open. Or, can be function which returns offset
    */
  var openDrawerOffset: js.UndefOr[(js.Function1[/* viewport */ ScaledSize, Double]) | Double] = js.undefined
  /**
    * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
    */
  var panCloseMask: js.UndefOr[Double] = js.undefined
  /**
    * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
    */
  var panOpenMask: js.UndefOr[Double] = js.undefined
  // Additional Configurations
  /**
    * Ratio of screen width that must be travelled to trigger a drawer open/close
    */
  var panThreshold: js.UndefOr[Double] = js.undefined
  /**
    * which side the drawer should be on.
    */
  var side: js.UndefOr[left | right | top | bottom] = js.undefined
  /**
    * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
    */
  var styles: js.UndefOr[DrawerStyles] = js.undefined
  /**
    * Same as acceptTap, except only for close
    */
  var tapToClose: js.UndefOr[Boolean] = js.undefined
  /**
    * The duration of the open/close animation
    */
  var tweenDuration: js.UndefOr[Double] = js.undefined
  /**
    *  A easing type supported by tween-functions
    */
  var tweenEasing: js.UndefOr[TweenFunctions] = js.undefined
  // Animation / Tween
  /**
    * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
    * native props to be set on the constituent views
    */
  var tweenHandler: js.UndefOr[js.Function1[/* ratio */ Double, NestedViewStyles]] = js.undefined
  /**
    * Type of drawer
    */
  var `type`: js.UndefOr[displace | overlay | static] = js.undefined
  /**
    * if true will run InteractionManager for open/close animations.
    */
  var useInteractionManager: js.UndefOr[Boolean] = js.undefined
}

object DrawerProperties {
  @scala.inline
  def apply(
    acceptDoubleTap: js.UndefOr[Boolean] = js.undefined,
    acceptPan: js.UndefOr[Boolean] = js.undefined,
    acceptPanOnDrawer: js.UndefOr[Boolean] = js.undefined,
    acceptTap: js.UndefOr[Boolean] = js.undefined,
    captureGestures: Boolean | open | closed = null,
    closedDrawerOffset: js.Function0[Double] | Double = null,
    content: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elevation: Int | Double = null,
    initializeOpen: Int | Double = null,
    negotiatePan: js.UndefOr[Boolean] = js.undefined,
    onClose: () => Unit = null,
    onCloseStart: () => Unit = null,
    onDragStart: () => Unit = null,
    onOpen: () => Unit = null,
    onOpenStart: () => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openDrawerOffset: (js.Function1[/* viewport */ ScaledSize, Double]) | Double = null,
    panCloseMask: Int | Double = null,
    panOpenMask: Int | Double = null,
    panThreshold: Int | Double = null,
    side: left | right | top | bottom = null,
    styles: DrawerStyles = null,
    tapToClose: js.UndefOr[Boolean] = js.undefined,
    tweenDuration: Int | Double = null,
    tweenEasing: TweenFunctions = null,
    tweenHandler: /* ratio */ Double => NestedViewStyles = null,
    `type`: displace | overlay | static = null,
    useInteractionManager: js.UndefOr[Boolean] = js.undefined
  ): DrawerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptDoubleTap)) __obj.updateDynamic("acceptDoubleTap")(acceptDoubleTap.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptPan)) __obj.updateDynamic("acceptPan")(acceptPan.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptPanOnDrawer)) __obj.updateDynamic("acceptPanOnDrawer")(acceptPanOnDrawer.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptTap)) __obj.updateDynamic("acceptTap")(acceptTap.asInstanceOf[js.Any])
    if (captureGestures != null) __obj.updateDynamic("captureGestures")(captureGestures.asInstanceOf[js.Any])
    if (closedDrawerOffset != null) __obj.updateDynamic("closedDrawerOffset")(closedDrawerOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (initializeOpen != null) __obj.updateDynamic("initializeOpen")(initializeOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiatePan)) __obj.updateDynamic("negotiatePan")(negotiatePan.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(js.Any.fromFunction0(onCloseStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(js.Any.fromFunction0(onOpenStart))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (openDrawerOffset != null) __obj.updateDynamic("openDrawerOffset")(openDrawerOffset.asInstanceOf[js.Any])
    if (panCloseMask != null) __obj.updateDynamic("panCloseMask")(panCloseMask.asInstanceOf[js.Any])
    if (panOpenMask != null) __obj.updateDynamic("panOpenMask")(panOpenMask.asInstanceOf[js.Any])
    if (panThreshold != null) __obj.updateDynamic("panThreshold")(panThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToClose)) __obj.updateDynamic("tapToClose")(tapToClose.asInstanceOf[js.Any])
    if (tweenDuration != null) __obj.updateDynamic("tweenDuration")(tweenDuration.asInstanceOf[js.Any])
    if (tweenEasing != null) __obj.updateDynamic("tweenEasing")(tweenEasing.asInstanceOf[js.Any])
    if (tweenHandler != null) __obj.updateDynamic("tweenHandler")(js.Any.fromFunction1(tweenHandler))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useInteractionManager)) __obj.updateDynamic("useInteractionManager")(useInteractionManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProperties]
  }
}

