package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/COMPLETE_TRANSITION`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/POP_TO_TOP`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/POP`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/PUSH`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/REPLACE`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/RESET`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "StackActions")
@js.native
object StackActions extends js.Object {
  val COMPLETE_TRANSITION: `Navigation/COMPLETE_TRANSITION` = js.native
  val POP: `Navigation/POP` = js.native
  val POP_TO_TOP: `Navigation/POP_TO_TOP` = js.native
  val PUSH: `Navigation/PUSH` = js.native
  val REPLACE: `Navigation/REPLACE` = js.native
  val RESET: `Navigation/RESET` = js.native
  def completeTransition(payload: NavigationCompleteTransitionActionPayload): NavigationCompleteTransitionAction = js.native
  def pop(options: NavigationPopActionPayload): NavigationPopAction = js.native
  def popToTop(): NavigationPopToTopAction = js.native
  def popToTop(options: NavigationPopToTopActionPayload): NavigationPopToTopAction = js.native
  def push(options: NavigationPushActionPayload): NavigationPushAction = js.native
  def replace(options: NavigationReplaceActionPayload): NavigationReplaceAction = js.native
  def reset(options: NavigationResetActionPayload): NavigationResetAction = js.native
}

