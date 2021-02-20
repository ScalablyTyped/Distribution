package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.Key
import typings.reactNavigationRouters.anon.KeyParams
import typings.reactNavigationRouters.anon.Merge
import typings.reactNavigationRouters.anon.Name
import typings.reactNavigationRouters.anon.Params
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.GO_BACK
import typings.reactNavigationRouters.reactNavigationRoutersStrings.NAVIGATE
import typings.reactNavigationRouters.reactNavigationRoutersStrings.RESET
import typings.reactNavigationRouters.reactNavigationRoutersStrings.SET_PARAMS
import typings.reactNavigationRouters.reactNavigationRoutersStrings.key
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.PartialRoute
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Extract
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonActionsMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "goBack")
  @js.native
  def goBack(): Action = js.native
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(name: String): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(name: String, params: js.Object): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(route: KeyParams): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(route: Name): Action = js.native
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "reset")
  @js.native
  def reset(): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "reset")
  @js.native
  def reset(state: ResetState): Action = js.native
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "setParams")
  @js.native
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.anon.Source
    - typings.reactNavigationRouters.anon.Payload
    - typings.reactNavigationRouters.anon.Target
    - typings.reactNavigationRouters.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def Payload(payload: Key | Merge, `type`: NAVIGATE): typings.reactNavigationRouters.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Payload]
    }
    
    @scala.inline
    def Source(`type`: GO_BACK): typings.reactNavigationRouters.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Source]
    }
    
    @scala.inline
    def Target(`type`: RESET): typings.reactNavigationRouters.anon.Target = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Target]
    }
    
    @scala.inline
    def Type(payload: Params, `type`: SET_PARAMS): typings.reactNavigationRouters.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.anon.PartialStateNavigationSta
    - typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase]
    - typings.reactNavigationRouters.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
  
  trait _ResetState extends StObject
  object _ResetState {
    
    @scala.inline
    def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      stale: `false`,
      `type`: String
    ): typings.reactNavigationRouters.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.OmitNavigationStateParamL]
    }
    
    @scala.inline
    def PartialStateNavigationSta(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): typings.reactNavigationRouters.anon.PartialStateNavigationSta = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.PartialStateNavigationSta]
    }
  }
}
