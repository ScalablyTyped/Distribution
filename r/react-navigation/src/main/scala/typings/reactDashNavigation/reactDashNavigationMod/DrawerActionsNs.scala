package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/CLOSE_DRAWER`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/OPEN_DRAWER`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/TOGGLE_DRAWER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "DrawerActions")
@js.native
object DrawerActionsNs extends js.Object {
  val CLOSE_DRAWER: `Navigation/CLOSE_DRAWER` = js.native
  val OPEN_DRAWER: `Navigation/OPEN_DRAWER` = js.native
  val TOGGLE_DRAWER: `Navigation/TOGGLE_DRAWER` = js.native
  def closeDrawer(): NavigationCloseDrawerAction = js.native
  def openDrawer(): NavigationOpenDrawerAction = js.native
  def toggleDrawer(): NavigationToggleDrawerAction = js.native
}

