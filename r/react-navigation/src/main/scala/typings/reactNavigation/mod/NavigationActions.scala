package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typings.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typings.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "NavigationActions")
@js.native
object NavigationActions extends js.Object {
  @JSName("BACK")
  val BACK_ : NavigationSlashBACK = js.native
  @JSName("INIT")
  val INIT_ : NavigationSlashINIT = js.native
  @JSName("NAVIGATE")
  val NAVIGATE_ : NavigationSlashNAVIGATE = js.native
  val SET_PARAMS: NavigationSlashSET_PARAMS = js.native
  def back(): NavigationBackAction = js.native
  def back(options: NavigationBackActionPayload): NavigationBackAction = js.native
  def init(): NavigationInitAction = js.native
  def init(options: NavigationInitActionPayload): NavigationInitAction = js.native
  def navigate(options: NavigationNavigateActionPayload): NavigationNavigateAction = js.native
  def setParams(options: NavigationSetParamsActionPayload): NavigationSetParamsAction = js.native
}

