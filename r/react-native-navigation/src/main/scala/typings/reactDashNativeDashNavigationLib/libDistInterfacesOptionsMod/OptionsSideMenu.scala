package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsSideMenu extends js.Object {
  /**
       * Configure the left side menu
       */
  var left: js.UndefOr[SideMenuSide] = js.undefined
  /**
       * Configure how a user is allowed to open a drawer using gestures
       * #### (iOS specific)
       * @default 'entireScreen'
       */
  var openGestureMode: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.entireScreen | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.bezel
  ] = js.undefined
  /**
       * Configure the right side menu
       */
  var right: js.UndefOr[SideMenuSide] = js.undefined
}

