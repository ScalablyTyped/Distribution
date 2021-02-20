package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.KeyType
import typings.reactNavigationRouters.anon.NameParams
import typings.reactNavigationRouters.anon.`0`
import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.CLOSE_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.JUMP_TO
import typings.reactNavigationRouters.reactNavigationRoutersStrings.OPEN_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.TOGGLE_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.drawer
import typings.reactNavigationRouters.tabRouterMod.BackBehavior
import typings.reactNavigationRouters.tabRouterMod.TabActionType
import typings.reactNavigationRouters.typesMod.CommonNavigationAction
import typings.reactNavigationRouters.typesMod.NavigationRoute
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", JSImport.Default)
  @js.native
  def default(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  object DrawerActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/TabRouter.TabActionHelpers<ParamList> & {openDrawer (): void, closeDrawer (): void, toggleDrawer (): void} */
  @js.native
  trait DrawerActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Close the drawer sidebar.
      */
    def closeDrawer(): Unit = js.native
    
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
    ): Unit = js.native
    
    /**
      * Open the drawer sidebar.
      */
    def openDrawer(): Unit = js.native
    
    /**
      * Open the drawer sidebar if closed, or close if opened.
      */
    def toggleDrawer(): Unit = js.native
  }
  object DrawerActionHelpers {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      closeDrawer: () => Unit,
      jumpTo: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit,
      openDrawer: () => Unit,
      toggleDrawer: () => Unit
    ): DrawerActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), jumpTo = js.Any.fromFunction1(jumpTo), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
      __obj.asInstanceOf[DrawerActionHelpers[ParamList]]
    }
    
    @scala.inline
    implicit class DrawerActionHelpersMutableBuilder[Self <: DrawerActionHelpers[_], ParamList /* <: ParamListBase */] (val x: Self with DrawerActionHelpers[ParamList]) extends AnyVal {
      
      @scala.inline
      def setCloseDrawer(value: () => Unit): Self = StObject.set(x, "closeDrawer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJumpTo(
        value: (js.Tuple2[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
            ]) | js.Array[js.Any] => Unit
      ): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenDrawer(value: () => Unit): Self = StObject.set(x, "openDrawer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleDrawer(value: () => Unit): Self = StObject.set(x, "toggleDrawer", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.tabRouterMod.TabActionType
    - typings.reactNavigationRouters.anon.SourceTarget
  */
  trait DrawerActionType extends StObject
  object DrawerActionType {
    
    @scala.inline
    def SourceTarget(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): typings.reactNavigationRouters.anon.SourceTarget = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.anon.SourceTarget]
    }
    
    @scala.inline
    def TabActionType(payload: NameParams, `type`: JUMP_TO): typings.reactNavigationRouters.tabRouterMod.TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNavigationRouters.tabRouterMod.TabActionType]
    }
  }
  
  /* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/TabRouter.TabNavigationState<ParamList>, 'type' | 'history'> & {  type :'drawer',   history :std.Array<{  type :'route',   key :string} | {  type :'drawer'}>} */
  @js.native
  trait DrawerNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys and drawer open status.
      */
    var history: js.Array[KeyType | `0`] = js.native
    
    var index: Double = js.native
    
    var key: String = js.native
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    var stale: `false` = js.native
    
    /**
      * Type of the router, in this case, it's drawer.
      */
    var `type`: drawer = js.native
  }
  object DrawerNavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType | `0`],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: drawer
    ): DrawerNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class DrawerNavigationStateMutableBuilder[Self <: DrawerNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with DrawerNavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[KeyType | `0`]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryVarargs(value: (KeyType | `0`)*): Self = StObject.set(x, "history", js.Array(value :_*))
      
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
      def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/TabRouter.TabRouterOptions & {  openByDefault :boolean | undefined} */
  @js.native
  trait DrawerRouterOptions extends StObject {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.native
    
    /**
      * Name of the route to focus by on initial render.
      * If not specified, usually the first route is used.
      */
    var initialRouteName: js.UndefOr[String] = js.native
    
    var openByDefault: js.UndefOr[Boolean] = js.native
  }
  object DrawerRouterOptions {
    
    @scala.inline
    def apply(): DrawerRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerRouterOptions]
    }
    
    @scala.inline
    implicit class DrawerRouterOptionsMutableBuilder[Self <: DrawerRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setOpenByDefault(value: Boolean): Self = StObject.set(x, "openByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenByDefaultUndefined: Self = StObject.set(x, "openByDefault", js.undefined)
    }
  }
}
