package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.KeyType
import typings.reactNavigationRouters.anon.NameParams
import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.Action
import typings.reactNavigationRouters.libTypescriptSrcDrawerRouterMod.DrawerActionType
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.DefaultRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationRoute
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.JUMP_TO
import typings.reactNavigationRouters.reactNavigationRoutersStrings.tab
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcTabRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[TabNavigationState[ParamListBase], Action | TabActionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasInitialRouteNameBackBehavior.asInstanceOf[js.Any]).asInstanceOf[Router[TabNavigationState[ParamListBase], Action | TabActionType]]
  
  object TabActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", "TabActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.firstRoute
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.history
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.order
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.none
  */
  trait BackBehavior extends StObject
  object BackBehavior {
    
    inline def firstRoute: typings.reactNavigationRouters.reactNavigationRoutersStrings.firstRoute = "firstRoute".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.firstRoute]
    
    inline def history: typings.reactNavigationRouters.reactNavigationRoutersStrings.history = "history".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.history]
    
    inline def initialRoute: typings.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute = "initialRoute".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute]
    
    inline def none: typings.reactNavigationRouters.reactNavigationRoutersStrings.none = "none".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.none]
    
    inline def order: typings.reactNavigationRouters.reactNavigationRoutersStrings.order = "order".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.order]
  }
  
  trait TabActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Jump to an existing tab.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] */ js.Any
    ): Unit
  }
  object TabActionHelpers {
    
    inline def apply[ParamList /* <: ParamListBase */](
      jumpTo: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] */ js.Any => Unit
    ): TabActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo))
      __obj.asInstanceOf[TabActionHelpers[ParamList]]
    }
    
    extension [Self <: TabActionHelpers[?], ParamList /* <: ParamListBase */](x: Self & TabActionHelpers[ParamList]) {
      
      inline def setJumpTo(
        value: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] */ js.Any => Unit
      ): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    }
  }
  
  trait TabActionType
    extends StObject
       with DrawerActionType {
    
    var payload: NameParams
    
    var source: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var `type`: JUMP_TO
  }
  object TabActionType {
    
    inline def apply(payload: NameParams): TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JUMP_TO")
      __obj.asInstanceOf[TabActionType]
    }
    
    extension [Self <: TabActionType](x: Self) {
      
      inline def setPayload(value: NameParams): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: JUMP_TO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<ParamList>, 'history'> & {  type :'tab',   history :std.Array<{  type :'route',   key :string}>} */
  trait TabNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys.
      */
    var history: js.Array[KeyType]
    
    var index: Double
    
    var key: String
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]]
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    
    var stale: `false`
    
    /**
      * Type of the router, in this case, it's tab.
      */
    var `type`: String & tab
  }
  object TabNavigationState {
    
    inline def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      `type`: String & tab
    ): TabNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNavigationState[ParamList]]
    }
    
    extension [Self <: TabNavigationState[?], ParamList /* <: ParamListBase */](x: Self & TabNavigationState[ParamList]) {
      
      inline def setHistory(value: js.Array[KeyType]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: KeyType*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setType(value: String & tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabRouterOptions
    extends StObject
       with DefaultRouterOptions[String] {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.undefined
  }
  object TabRouterOptions {
    
    inline def apply(): TabRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabRouterOptions]
    }
    
    extension [Self <: TabRouterOptions](x: Self) {
      
      inline def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      inline def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    }
  }
}
