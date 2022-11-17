package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationActions {
  
  @JSImport("react-navigation", "NavigationActions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation", "NavigationActions.BACK")
  @js.native
  val BACK_ : "Navigation/BACK" = js.native
  
  @JSImport("react-navigation", "NavigationActions.INIT")
  @js.native
  val INIT_ : "Navigation/INIT" = js.native
  
  @JSImport("react-navigation", "NavigationActions.NAVIGATE")
  @js.native
  val NAVIGATE_ : "Navigation/NAVIGATE" = js.native
  
  @JSImport("react-navigation", "NavigationActions.SET_PARAMS")
  @js.native
  val SET_PARAMS: "Navigation/SET_PARAMS" = js.native
  
  inline def back(): NavigationBackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[NavigationBackAction]
  inline def back(options: NavigationBackActionPayload): NavigationBackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationBackAction]
  
  inline def init(): NavigationInitAction = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[NavigationInitAction]
  inline def init(options: NavigationInitActionPayload): NavigationInitAction = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationInitAction]
  
  inline def navigate(options: NavigationNavigateActionPayload): NavigationNavigateAction = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigateAction]
  
  inline def setParams(options: NavigationSetParamsActionPayload): NavigationSetParamsAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationSetParamsAction]
}
