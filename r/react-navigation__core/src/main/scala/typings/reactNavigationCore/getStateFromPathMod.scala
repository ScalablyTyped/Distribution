package typings.reactNavigationCore

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import typings.reactNavigationCore.typesMod.PathConfigMap
import typings.reactNavigationRouters.typesMod.PartialRoute
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStateFromPathMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/getStateFromPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(path: String): js.UndefOr[ResultState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResultState]]
  @scala.inline
  def default(path: String, options: Options): js.UndefOr[ResultState] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResultState]]
  
  trait Options extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var screens: PathConfigMap
  }
  object Options {
    
    @scala.inline
    def apply(screens: PathConfigMap): Options = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers.PartialState<@react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>> & {  state :@react-navigation/core.@react-navigation/core/lib/typescript/src/getStateFromPath.ResultState | undefined} */
  trait ResultState extends StObject {
    
    var history: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    
    @scala.inline
    def apply(
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
    implicit class ResultStateMutableBuilder[Self <: ResultState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[js.Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
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
      def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
      
      @scala.inline
      def setRouteNamesVarargs(
        value: (Extract[
              /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
              String
            ])*
      ): Self = StObject.set(x, "routeNames", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(
        value: js.Array[
              PartialRoute[
                Route[
                  /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
                  js.UndefOr[js.Object]
                ]
              ]
            ]
      ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(
        value: (PartialRoute[
              Route[
                /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
                js.UndefOr[js.Object]
              ]
            ])*
      ): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      @scala.inline
      def setState(value: ResultState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
