package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DrawerLayoutAndroidProps extends ViewProps {
  /**
       * Specifies the background color of the drawer. The default value
       * is white. If you want to set the opacity of the drawer, use rgba.
       * Example:
       * return (
       *   <DrawerLayoutAndroid drawerBackgroundColor="rgba(0,0,0,0.5)">
       *   </DrawerLayoutAndroid>
       *);
       */
  var drawerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specifies the lock mode of the drawer. The drawer can be locked
       * in 3 states:
       *
       * - unlocked (default), meaning that the drawer will respond
       *   (open/close) to touch gestures.
       *
       * - locked-closed, meaning that the drawer will stay closed and not
       *   respond to gestures.
       *
       * - locked-open, meaning that the drawer will stay opened and
       *   not respond to gestures. The drawer may still be opened and
       *   closed programmatically (openDrawer/closeDrawer).
       */
  var drawerLockMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.unlocked | reactDashNativeLib.reactDashNativeLibStrings.`locked-closed` | reactDashNativeLib.reactDashNativeLibStrings.`locked-open`
  ] = js.undefined
  /**
       * Specifies the side of the screen from which the drawer will slide in.
       * enum(DrawerLayoutAndroid.positions.Left, DrawerLayoutAndroid.positions.Right)
       */
  var drawerPosition: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specifies the width of the drawer, more precisely the width of the
       * view that be pulled in from the edge of the window.
       */
  var drawerWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Determines whether the keyboard gets dismissed in response to a drag.
       * - 'none' (the default), drags do not dismiss the keyboard.
       * - 'on-drag', the keyboard is dismissed when a drag begins.
       */
  var keyboardDismissMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`on-drag`
  ] = js.undefined
  /**
       * Function called whenever the navigation view has been closed.
       */
  var onDrawerClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Function called whenever the navigation view has been opened.
       */
  var onDrawerOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Function called whenever there is an interaction with the navigation view.
       */
  var onDrawerSlide: js.UndefOr[js.Function1[/* event */ DrawerSlideEvent, scala.Unit]] = js.undefined
  /**
       * Function called when the drawer state has changed.
       * The drawer can be in 3 states:
       * - idle, meaning there is no interaction with the navigation
       *   view happening at the time
       * - dragging, meaning there is currently an interaction with the
       *   navigation view
       * - settling, meaning that there was an interaction with the
       *   navigation view, and the navigation view is now finishing
       *   it's closing or opening animation
       */
  var onDrawerStateChanged: js.UndefOr[
    js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeLibStrings.Idle | reactDashNativeLib.reactDashNativeLibStrings.Dragging | reactDashNativeLib.reactDashNativeLibStrings.Settling, 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Make the drawer take the entire screen and draw the background of
       * the status bar to allow it to open over the status bar. It will
       * only have an effect on API 21+.
       */
  var statusBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The navigation view that will be rendered to the side of the
       * screen and can be pulled in.
       */
  def renderNavigationView(): reactLib.reactMod.Global.JSXNs.Element
}

