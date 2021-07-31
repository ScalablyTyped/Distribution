package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import typings.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import typings.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import typings.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackActions {
  
  @JSImport("react-navigation", "StackActions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation", "StackActions.COMPLETE_TRANSITION")
  @js.native
  val COMPLETE_TRANSITION: NavigationSlashCOMPLETE_TRANSITION = js.native
  
  @JSImport("react-navigation", "StackActions.POP")
  @js.native
  val POP_ : NavigationSlashPOP = js.native
  
  @JSImport("react-navigation", "StackActions.POP_TO_TOP")
  @js.native
  val POP_TO_TOP: NavigationSlashPOP_TO_TOP = js.native
  
  @JSImport("react-navigation", "StackActions.PUSH")
  @js.native
  val PUSH_ : NavigationSlashPUSH = js.native
  
  @JSImport("react-navigation", "StackActions.REPLACE")
  @js.native
  val REPLACE_ : NavigationSlashREPLACE = js.native
  
  @JSImport("react-navigation", "StackActions.RESET")
  @js.native
  val RESET_ : NavigationSlashRESET = js.native
  
  @scala.inline
  def completeTransition(): NavigationCompleteTransitionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("completeTransition")().asInstanceOf[NavigationCompleteTransitionAction]
  @scala.inline
  def completeTransition(payload: NavigationCompleteTransitionActionPayload): NavigationCompleteTransitionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("completeTransition")(payload.asInstanceOf[js.Any]).asInstanceOf[NavigationCompleteTransitionAction]
  
  @scala.inline
  def pop(): NavigationPopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[NavigationPopAction]
  @scala.inline
  def pop(options: NavigationPopActionPayload): NavigationPopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationPopAction]
  
  @scala.inline
  def popToTop(): NavigationPopToTopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")().asInstanceOf[NavigationPopToTopAction]
  @scala.inline
  def popToTop(options: NavigationPopToTopActionPayload): NavigationPopToTopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationPopToTopAction]
  
  @scala.inline
  def push(options: NavigationPushActionPayload): NavigationPushAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationPushAction]
  
  @scala.inline
  def replace(options: NavigationReplaceActionPayload): NavigationReplaceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationReplaceAction]
  
  @scala.inline
  def reset(options: NavigationResetActionPayload): NavigationResetAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationResetAction]
}
