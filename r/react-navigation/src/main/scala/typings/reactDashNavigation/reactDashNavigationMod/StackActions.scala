package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPOP
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPOP_TO_TOP
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPUSH
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashREPLACE
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashRESET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "StackActions")
@js.native
object StackActions extends js.Object {
  val COMPLETE_TRANSITION: NavigationSlashCOMPLETE_TRANSITION = js.native
  val POP: NavigationSlashPOP = js.native
  val POP_TO_TOP: NavigationSlashPOP_TO_TOP = js.native
  val PUSH: NavigationSlashPUSH = js.native
  val REPLACE: NavigationSlashREPLACE = js.native
  val RESET: NavigationSlashRESET = js.native
  def completeTransition(): NavigationCompleteTransitionAction = js.native
  def completeTransition(payload: NavigationCompleteTransitionActionPayload): NavigationCompleteTransitionAction = js.native
  def pop(options: NavigationPopActionPayload): NavigationPopAction = js.native
  def popToTop(): NavigationPopToTopAction = js.native
  def popToTop(options: NavigationPopToTopActionPayload): NavigationPopToTopAction = js.native
  def push(options: NavigationPushActionPayload): NavigationPushAction = js.native
  def replace(options: NavigationReplaceActionPayload): NavigationReplaceAction = js.native
  def reset(options: NavigationResetActionPayload): NavigationResetAction = js.native
}

