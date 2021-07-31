package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.commonActionsMod._ResetState
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.key
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Extract
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>, 'routes'> & {  routes :std.Array<std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.Route<string, object | undefined>, 'key'>>} */
trait OmitNavigationStateParamL
  extends StObject
     with _ResetState {
  
  var history: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var index: Double
  
  var key: String
  
  var routeNames: js.Array[
    Extract[
      /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
      String
    ]
  ]
  
  var routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]]
  
  var stale: `false`
  
  var `type`: String
}
object OmitNavigationStateParamL {
  
  @scala.inline
  def apply(
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
  ): OmitNavigationStateParamL = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitNavigationStateParamL]
  }
  
  @scala.inline
  implicit class OmitNavigationStateParamLMutableBuilder[Self <: OmitNavigationStateParamL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[js.Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNames(
      value: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ]
    ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(
      value: (Extract[
          /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
          String
        ])*
    ): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (Omit[Route[String, js.UndefOr[js.Object]], key])*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
