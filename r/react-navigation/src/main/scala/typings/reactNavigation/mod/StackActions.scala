package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackActions {
  
  @JSImport("react-navigation", "StackActions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation", "StackActions.COMPLETE_TRANSITION")
  @js.native
  val COMPLETE_TRANSITION: "Navigation/COMPLETE_TRANSITION" = js.native
  
  @JSImport("react-navigation", "StackActions.POP")
  @js.native
  val POP_ : "Navigation/POP" = js.native
  
  @JSImport("react-navigation", "StackActions.POP_TO_TOP")
  @js.native
  val POP_TO_TOP: "Navigation/POP_TO_TOP" = js.native
  
  @JSImport("react-navigation", "StackActions.PUSH")
  @js.native
  val PUSH_ : "Navigation/PUSH" = js.native
  
  @JSImport("react-navigation", "StackActions.REPLACE")
  @js.native
  val REPLACE_ : "Navigation/REPLACE" = js.native
  
  @JSImport("react-navigation", "StackActions.RESET")
  @js.native
  val RESET_ : "Navigation/RESET" = js.native
  
  inline def completeTransition(): NavigationCompleteTransitionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("completeTransition")().asInstanceOf[NavigationCompleteTransitionAction]
  inline def completeTransition(payload: NavigationCompleteTransitionActionPayload): NavigationCompleteTransitionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("completeTransition")(payload.asInstanceOf[js.Any]).asInstanceOf[NavigationCompleteTransitionAction]
  
  inline def pop(): NavigationPopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[NavigationPopAction]
  inline def pop(options: NavigationPopActionPayload): NavigationPopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationPopAction]
  
  inline def popToTop(): NavigationPopToTopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")().asInstanceOf[NavigationPopToTopAction]
  inline def popToTop(options: NavigationPopToTopActionPayload): NavigationPopToTopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationPopToTopAction]
  
  inline def push(options: NavigationPushActionPayload): NavigationPushAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationPushAction]
  
  inline def replace(options: NavigationReplaceActionPayload): NavigationReplaceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationReplaceAction]
  
  inline def reset(options: NavigationResetActionPayload): NavigationResetAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationResetAction]
}
