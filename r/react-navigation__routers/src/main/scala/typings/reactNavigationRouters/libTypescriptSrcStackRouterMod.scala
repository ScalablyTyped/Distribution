package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.Count
import typings.reactNavigationRouters.anon.Name
import typings.reactNavigationRouters.anon.NameParams
import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.Action
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.DefaultRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationRoute
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcStackRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: StackRouterOptions): Router[StackNavigationState[ParamListBase], Action | StackActionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Router[StackNavigationState[ParamListBase], Action | StackActionType]]
  
  object StackActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[StackActionType]
    inline def pop(count: Double): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(count.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    
    inline def popToTop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")().asInstanceOf[StackActionType]
    
    inline def push(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    inline def push(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
    
    inline def replace(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    inline def replace(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
  }
  
  @js.native
  trait StackActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Pop a screen from the stack.
      */
    def pop(): Unit = js.native
    def pop(count: Double): Unit = js.native
    
    /**
      * Pop to the first route in the stack, dismissing all other screens.
      */
    def popToTop(): Unit = js.native
    
    /**
      * Push a new screen onto the stack.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    def push[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] */ js.Any
    ): Unit = js.native
    
    /**
      * Replace the current route with a new one.
      *
      * @param name Route name of the new route.
      * @param [params] Params object for the new route.
      */
    def replace[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] */ js.Any
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.anon.PayloadSource
    - typings.reactNavigationRouters.anon.TargetType
    - typings.reactNavigationRouters.anon.PayloadSourceTarget
    - typings.reactNavigationRouters.anon.SourceTargetType
  */
  trait StackActionType extends StObject
  object StackActionType {
    
    inline def PayloadSource(payload: Name): typings.reactNavigationRouters.anon.PayloadSource = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("REPLACE")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.PayloadSource]
    }
    
    inline def PayloadSourceTarget(payload: Count): typings.reactNavigationRouters.anon.PayloadSourceTarget = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("POP")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.PayloadSourceTarget]
    }
    
    inline def SourceTargetType(): typings.reactNavigationRouters.anon.SourceTargetType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("POP_TO_TOP")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.SourceTargetType]
    }
    
    inline def TargetType(payload: NameParams): typings.reactNavigationRouters.anon.TargetType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PUSH")
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.TargetType]
    }
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<ParamList> & {  type :'stack'} */
  trait StackNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    val history: js.UndefOr[js.Array[Any]] = js.undefined
    
    val index: Double
    
    val key: String
    
    val routeNames: js.Array[Extract[/* keyof ParamList */ String, String]]
    
    val routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    
    val stale: `false`
    
    /**
      * Type of the router, in this case, it's stack.
      */
    val `type`: String
  }
  object StackNavigationState {
    
    inline def apply[ParamList /* <: ParamListBase */](
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      `type`: String
    ): StackNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackNavigationState[?], ParamList /* <: ParamListBase */] (val x: Self & StackNavigationState[ParamList]) extends AnyVal {
      
      inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type StackRouterOptions = DefaultRouterOptions[String]
}
