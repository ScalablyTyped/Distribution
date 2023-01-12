package typings.reactNavigationCore

import typings.reactNavigationCore.libTypescriptSrcTypesMod.PathConfigMap
import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialRoute
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcGetStateFromPathMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/getStateFromPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: js.Object */](path: String): js.UndefOr[ResultState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResultState]]
  inline def default[ParamList /* <: js.Object */](path: String, options: Options[ParamList]): js.UndefOr[ResultState] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResultState]]
  
  trait Options[ParamList /* <: js.Object */] extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var screens: PathConfigMap[ParamList]
  }
  object Options {
    
    inline def apply[ParamList /* <: js.Object */](screens: PathConfigMap[ParamList]): Options[ParamList] = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[ParamList]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], ParamList /* <: js.Object */] (val x: Self & Options[ParamList]) extends AnyVal {
      
      inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      inline def setScreens(value: PathConfigMap[ParamList]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers.PartialState<@react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>> & {  state :@react-navigation/core.@react-navigation/core/lib/typescript/src/getStateFromPath.ResultState | undefined} */
  trait ResultState extends StObject {
    
    var history: js.UndefOr[js.Array[Any]] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var routeNames: js.UndefOr[
        js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ]
      ] = js.undefined
    
    val routes: js.Array[
        PartialRoute[
          Route[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ]
      ]
    
    val stale: js.UndefOr[`true`] = js.undefined
    
    var state: js.UndefOr[ResultState] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResultState {
    
    inline def apply(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): ResultState = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultState] (val x: Self) extends AnyVal {
      
      inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRouteNames(
        value: js.Array[
              Extract[
                /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
                String
              ]
            ]
      ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
      
      inline def setRouteNamesVarargs(
        value: (Extract[
              /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
              String
            ])*
      ): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(
        value: js.Array[
              PartialRoute[
                Route[
                  /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
                  js.UndefOr[js.Object]
                ]
              ]
            ]
      ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(
        value: (PartialRoute[
              Route[
                /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
                js.UndefOr[js.Object]
              ]
            ])*
      ): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      inline def setState(value: ResultState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
