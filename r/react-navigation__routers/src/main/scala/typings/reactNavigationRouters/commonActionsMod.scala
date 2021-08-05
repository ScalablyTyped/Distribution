package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.Key
import typings.reactNavigationRouters.anon.KeyParams
import typings.reactNavigationRouters.anon.Merge
import typings.reactNavigationRouters.anon.Name
import typings.reactNavigationRouters.anon.Params
import typings.reactNavigationRouters.reactNavigationRoutersStrings.key
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.PartialRoute
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Extract
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonActionsMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
  
  inline def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def navigate(route: KeyParams): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(route: Name): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
  inline def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.anon.Source
    - typings.reactNavigationRouters.anon.Payload
    - typings.reactNavigationRouters.anon.Target
    - typings.reactNavigationRouters.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    inline def Payload(payload: Key | Merge): typings.reactNavigationRouters.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NAVIGATE")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Payload]
    }
    
    inline def Source(): typings.reactNavigationRouters.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("GO_BACK")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Source]
    }
    
    inline def Target(): typings.reactNavigationRouters.anon.Target = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RESET")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.Target]
    }
    
    inline def Type(payload: Params): typings.reactNavigationRouters.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_PARAMS")
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
    
    inline def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      `type`: String
    ): typings.reactNavigationRouters.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.OmitNavigationStateParamL]
    }
    
    inline def PartialStateNavigationSta(
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
