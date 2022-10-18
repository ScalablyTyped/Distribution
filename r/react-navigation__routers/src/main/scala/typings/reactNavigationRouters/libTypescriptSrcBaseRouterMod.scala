package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.Readonlykeystringindexnum
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.CommonNavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcBaseRouterMod {
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object default {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/BaseRouter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateForAction")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State | PartialState[State] | Null]
    
    inline def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldActionChangeFocus")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
