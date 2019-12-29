package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashBACK
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashINIT
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashNAVIGATE
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "NavigationActions")
@js.native
object NavigationActions extends js.Object {
  val BACK: NavigationSlashBACK = js.native
  val INIT: NavigationSlashINIT = js.native
  val NAVIGATE: NavigationSlashNAVIGATE = js.native
  val SET_PARAMS: NavigationSlashSET_PARAMS = js.native
  def back(): NavigationBackAction = js.native
  def back(options: NavigationBackActionPayload): NavigationBackAction = js.native
  def init(): NavigationInitAction = js.native
  def init(options: NavigationInitActionPayload): NavigationInitAction = js.native
  def navigate(options: NavigationNavigateActionPayload): NavigationNavigateAction = js.native
  def setParams(options: NavigationSetParamsActionPayload): NavigationSetParamsAction = js.native
}

