package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.KeyType
import typings.reactNavigationRouters.anon.NameParams
import typings.reactNavigationRouters.anon.Status
import typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabActionHelpers
import typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabActionType
import typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.CommonNavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationRoute
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.CLOSE_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.OPEN_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.TOGGLE_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.drawer
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcDrawerRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction]]
  
  object DrawerActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[DrawerActionType]
    
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
    
    inline def openDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[DrawerActionType]
    
    inline def toggleDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[DrawerActionType]
  }
  
  trait DrawerActionHelpers[ParamList /* <: ParamListBase */]
    extends StObject
       with TabActionHelpers[ParamList] {
    
    /**
      * Close the drawer sidebar.
      */
    def closeDrawer(): Unit
    
    /**
      * Open the drawer sidebar.
      */
    def openDrawer(): Unit
    
    /**
      * Open the drawer sidebar if closed, or close if opened.
      */
    def toggleDrawer(): Unit
  }
  object DrawerActionHelpers {
    
    inline def apply[ParamList /* <: ParamListBase */](
      closeDrawer: () => Unit,
      jumpTo: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] */ js.Any => Unit,
      openDrawer: () => Unit,
      toggleDrawer: () => Unit
    ): DrawerActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), jumpTo = js.Any.fromFunction1(jumpTo), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
      __obj.asInstanceOf[DrawerActionHelpers[ParamList]]
    }
    
    extension [Self <: DrawerActionHelpers[?], ParamList /* <: ParamListBase */](x: Self & DrawerActionHelpers[ParamList]) {
      
      inline def setCloseDrawer(value: () => Unit): Self = StObject.set(x, "closeDrawer", js.Any.fromFunction0(value))
      
      inline def setOpenDrawer(value: () => Unit): Self = StObject.set(x, "openDrawer", js.Any.fromFunction0(value))
      
      inline def setToggleDrawer(value: () => Unit): Self = StObject.set(x, "toggleDrawer", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabActionType
    - typings.reactNavigationRouters.anon.SourceTarget
  */
  trait DrawerActionType extends StObject
  object DrawerActionType {
    
    inline def SourceTarget(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): typings.reactNavigationRouters.anon.SourceTarget = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.SourceTarget]
    }
    
    inline def TabActionType(payload: NameParams): typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JUMP_TO")
      __obj.asInstanceOf[typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabActionType]
    }
  }
  
  /* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/TabRouter.TabNavigationState<ParamList>, 'type' | 'history'> & {  type :'drawer',   default :@react-navigation/routers.@react-navigation/routers/lib/typescript/src/DrawerRouter.DrawerStatus,   history :std.Array<{  type :'route',   key :string} | {  type :'drawer',   status :@react-navigation/routers.@react-navigation/routers/lib/typescript/src/DrawerRouter.DrawerStatus}>} */
  trait DrawerNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Default status of the drawer.
      */
    var default: DrawerStatus
    
    /**
      * List of previously visited route keys and drawer open status.
      */
    var history: js.Array[KeyType | Status]
    
    var index: Double
    
    var key: String
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]]
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    
    var stale: `false`
    
    /**
      * Type of the router, in this case, it's drawer.
      */
    var `type`: drawer
  }
  object DrawerNavigationState {
    
    inline def apply[ParamList /* <: ParamListBase */](
      default: DrawerStatus,
      history: js.Array[KeyType | Status],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    ): DrawerNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")("drawer")
      __obj.asInstanceOf[DrawerNavigationState[ParamList]]
    }
    
    extension [Self <: DrawerNavigationState[?], ParamList /* <: ParamListBase */](x: Self & DrawerNavigationState[ParamList]) {
      
      inline def setDefault(value: DrawerStatus): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: js.Array[KeyType | Status]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: (KeyType | Status)*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawerRouterOptions
    extends StObject
       with TabRouterOptions {
    
    var defaultStatus: js.UndefOr[DrawerStatus] = js.undefined
  }
  object DrawerRouterOptions {
    
    inline def apply(): DrawerRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerRouterOptions]
    }
    
    extension [Self <: DrawerRouterOptions](x: Self) {
      
      inline def setDefaultStatus(value: DrawerStatus): Self = StObject.set(x, "defaultStatus", value.asInstanceOf[js.Any])
      
      inline def setDefaultStatusUndefined: Self = StObject.set(x, "defaultStatus", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.open
    - typings.reactNavigationRouters.reactNavigationRoutersStrings.closed
  */
  trait DrawerStatus extends StObject
  object DrawerStatus {
    
    inline def closed: typings.reactNavigationRouters.reactNavigationRoutersStrings.closed = "closed".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.closed]
    
    inline def open: typings.reactNavigationRouters.reactNavigationRoutersStrings.open = "open".asInstanceOf[typings.reactNavigationRouters.reactNavigationRoutersStrings.open]
  }
}
