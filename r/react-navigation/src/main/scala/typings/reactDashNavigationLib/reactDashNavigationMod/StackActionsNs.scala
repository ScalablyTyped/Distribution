package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "StackActions")
@js.native
object StackActionsNs extends js.Object {
  val COMPLETE_TRANSITION: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/COMPLETE_TRANSITION` = js.native
  val POP: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/POP` = js.native
  val POP_TO_TOP: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/POP_TO_TOP` = js.native
  val PUSH: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/PUSH` = js.native
  val REPLACE: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/REPLACE` = js.native
  val RESET: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/RESET` = js.native
  def completeTransition(payload: reactDashNavigationLib.reactDashNavigationMod.NavigationCompleteTransitionActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationCompleteTransitionAction = js.native
  def pop(options: reactDashNavigationLib.reactDashNavigationMod.NavigationPopActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationPopAction = js.native
  def popToTop(options: reactDashNavigationLib.reactDashNavigationMod.NavigationPopToTopActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationPopToTopAction = js.native
  def push(options: reactDashNavigationLib.reactDashNavigationMod.NavigationPushActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationPushAction = js.native
  def replace(options: reactDashNavigationLib.reactDashNavigationMod.NavigationReplaceActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationReplaceAction = js.native
  def reset(options: reactDashNavigationLib.reactDashNavigationMod.NavigationResetActionPayload): reactDashNavigationLib.reactDashNavigationMod.NavigationResetAction = js.native
}

