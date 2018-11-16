package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "NavigationActions")
@js.native
object NavigationActionsNs extends js.Object {
  val BACK: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/BACK` = js.native
  val INIT: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/INIT` = js.native
  val NAVIGATE: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/NAVIGATE` = js.native
  val SET_PARAMS: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/SET_PARAMS` = js.native
  def back(): reactDashNavigationLib.reactDashNavigationMod.NavigationBackAction = js.native
  def back(options: reactDashNavigationLib.reactDashNavigationMod.NavigationBackActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationBackAction = js.native
  def init(): reactDashNavigationLib.reactDashNavigationMod.NavigationInitAction = js.native
  def init(options: reactDashNavigationLib.reactDashNavigationMod.NavigationInitActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationInitAction = js.native
  def navigate(options: reactDashNavigationLib.reactDashNavigationMod.NavigationNavigateActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationNavigateAction = js.native
  def setParams(options: reactDashNavigationLib.reactDashNavigationMod.NavigationSetParamsActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationSetParamsAction = js.native
}

