package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchActions {
  
  @JSImport("react-navigation", "SwitchActions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation", "SwitchActions.JUMP_TO")
  @js.native
  val JUMP_TO: "Navigation/JUMP_TO" = js.native
  
  inline def jumpTo(options: NavigationJumpToActionPayload): NavigationJumpToAction = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(options.asInstanceOf[js.Any]).asInstanceOf[NavigationJumpToAction]
}
