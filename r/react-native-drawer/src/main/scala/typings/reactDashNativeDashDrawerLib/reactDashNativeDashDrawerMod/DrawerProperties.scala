package typings
package reactDashNativeDashDrawerLib.reactDashNativeDashDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DrawerProperties extends js.Object {
  /**
       * Toggle drawer when double tap occurs within pan mask?
       */
  var acceptDoubleTap: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Allow for drawer pan (on touch drag). Set to false to effectively
       * disable the drawer while still allowing programmatic control
       */
  var acceptPan: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Allow Pan when drawer is 'open'
       */
  var acceptPanOnDrawer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Toggle drawer when any tap occurs within pan mask?
       */
  var acceptTap: js.UndefOr[scala.Boolean] = js.undefined
  // Gestures
  /**
       * If true, will capture all gestures inside of the pan mask. If 'open' will
       * only capture when drawer is open
       */
  var captureGestures: js.UndefOr[
    scala.Boolean | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.open | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.closed
  ] = js.undefined
  /**
       * Same as openDrawerOffset, except defines left hand margin when drawer is closed
       */
  var closedDrawerOffset: js.UndefOr[js.Function0[scala.Double] | scala.Double] = js.undefined
  // Important
  /**
       * Menu component
       */
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * If true the drawer can not be opened and will not respond to pans
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
       */
  var elevation: js.UndefOr[scala.Double] = js.undefined
  /**
       * Initialize with drawer open
       */
  var initializeOpen: js.UndefOr[scala.Double] = js.undefined
  /**
       * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
       */
  var negotiatePan: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Will be called immediately after the drawer has entered the closed state
       */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Ccallback fired at the start of a close animation
       */
  var onCloseStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback fired when a drag gesture starts.
       */
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Event Handlers
  /**
       * Will be called immediately after the drawer has entered the open state
       */
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback fired at the start of an open animation
       */
  var onOpenStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If true will trigger drawer open, if false will trigger close.
       */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
       * the drawer is open. Or, can be function which returns offset
       */
  var openDrawerOffset: js.UndefOr[
    (js.Function1[/* viewport */ reactDashNativeLib.reactDashNativeMod.ScaledSize, scala.Double]) | scala.Double
  ] = js.undefined
  /**
       * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
       */
  var panCloseMask: js.UndefOr[scala.Double] = js.undefined
  /**
       * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
       */
  var panOpenMask: js.UndefOr[scala.Double] = js.undefined
  // Additional Configurations
  /**
       * Ratio of screen width that must be travelled to trigger a drawer open/close
       */
  var panThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
       * which side the drawer should be on.
       */
  var side: js.UndefOr[
    reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.left | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.right | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.top | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.bottom
  ] = js.undefined
  /**
       * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
       */
  var styles: js.UndefOr[DrawerStyles] = js.undefined
  /**
       * Same as acceptTap, except only for close
       */
  var tapToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The duration of the open/close animation
       */
  var tweenDuration: js.UndefOr[scala.Double] = js.undefined
  /**
       *  A easing type supported by tween-functions
       */
  var tweenEasing: js.UndefOr[TweenFunctions] = js.undefined
  // Animation / Tween
  /**
       * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
       * native props to be set on the constituent views
       */
  var tweenHandler: js.UndefOr[js.Function1[/* ratio */ scala.Double, NestedViewStyles]] = js.undefined
  /**
       * Type of drawer
       */
  var `type`: js.UndefOr[
    reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.displace | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.overlay | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.static
  ] = js.undefined
  /**
       * if true will run InteractionManager for open/close animations.
       */
  var useInteractionManager: js.UndefOr[scala.Boolean] = js.undefined
}

