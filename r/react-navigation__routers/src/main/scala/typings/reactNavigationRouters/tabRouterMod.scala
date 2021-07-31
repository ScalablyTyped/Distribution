package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.KeyType
import typings.reactNavigationRouters.anon.NameParams
import typings.reactNavigationRouters.anon.Payload
import typings.reactNavigationRouters.anon.PayloadSourceTargetType
import typings.reactNavigationRouters.anon.Source
import typings.reactNavigationRouters.anon.Type
import typings.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.JUMP_TO
import typings.reactNavigationRouters.reactNavigationRoutersStrings.tab
import typings.reactNavigationRouters.typesMod.DefaultRouterOptions
import typings.reactNavigationRouters.typesMod.NavigationRoute
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasInitialRouteNameBackBehavior.asInstanceOf[js.Any]).asInstanceOf[Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ]]
  
  object TabActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", "TabActions")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    @scala.inline
    def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.order
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.history
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.none
  */
  trait BackBehavior extends StObject
  object BackBehavior {
    
    @scala.inline
    def history: typings.reactNavigationRouters.reactNavigationRoutersStrings.history = "history".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.history]
    
    @scala.inline
    def initialRoute: typings.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute = "initialRoute".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute]
    
    @scala.inline
    def none: typings.reactNavigationRouters.reactNavigationRoutersStrings.none = "none".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.none]
    
    @scala.inline
    def order: typings.reactNavigationRouters.reactNavigationRoutersStrings.order = "order".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.order]
  }
  
  trait TabActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Jump to an existing tab.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit
  }
  object TabActionHelpers {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      jumpTo: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit
    ): TabActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo))
      __obj.asInstanceOf[TabActionHelpers[ParamList]]
    }
    
    @scala.inline
    implicit class TabActionHelpersMutableBuilder[Self <: TabActionHelpers[?], ParamList /* <: ParamListBase */] (val x: Self & TabActionHelpers[ParamList]) extends AnyVal {
      
      @scala.inline
      def setJumpTo(
        value: (js.Tuple2[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
            ]) | js.Array[js.Any] => Unit
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
    
    @scala.inline
    def apply(payload: NameParams): TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JUMP_TO")
      __obj.asInstanceOf[TabActionType]
    }
    
    @scala.inline
    implicit class TabActionTypeMutableBuilder[Self <: TabActionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: NameParams): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: JUMP_TO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
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
    
    @scala.inline
    implicit class TabNavigationStateMutableBuilder[Self <: TabNavigationState[?], ParamList /* <: ParamListBase */] (val x: Self & TabNavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[KeyType]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryVarargs(value: KeyType*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String & tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabRouterOptions
    extends StObject
       with DefaultRouterOptions[String] {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.undefined
  }
  object TabRouterOptions {
    
    @scala.inline
    def apply(): TabRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabRouterOptions]
    }
    
    @scala.inline
    implicit class TabRouterOptionsMutableBuilder[Self <: TabRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    }
  }
}
