package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.bezel
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.entireScreen
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
  var openGestureMode: js.UndefOr[entireScreen | bezel] = js.undefined
  /**
    * Configure the right side menu
    */
  var right: js.UndefOr[SideMenuSide] = js.undefined
}

object OptionsSideMenu {
  @scala.inline
  def apply(
    left: SideMenuSide = null,
    openGestureMode: entireScreen | bezel = null,
    right: SideMenuSide = null
  ): OptionsSideMenu = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (openGestureMode != null) __obj.updateDynamic("openGestureMode")(openGestureMode.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSideMenu]
  }
}

