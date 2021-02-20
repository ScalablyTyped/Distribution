package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.Readonlykeystringindexnum
import typings.reactNavigationRouters.typesMod.CommonNavigationAction
import typings.reactNavigationRouters.typesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseRouterMod {
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object default {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/BaseRouter", "default.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/BaseRouter", "default.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
}
