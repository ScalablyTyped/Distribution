package typings.reactNavigationDrawer

import typings.react.mod.Context
import typings.react.mod.RefObject
import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.anon.ActiveBackgroundColor
import typings.reactNavigationDrawer.anon.GetActionCreators
import typings.reactNavigationDrawer.anon.InitialRouteName
import typings.reactNavigationDrawer.anon.Lazy
import typings.reactNavigationDrawer.anon.Loaded
import typings.reactNavigationDrawer.drawerNavigatorItemsMod.default
import typings.reactNavigationDrawer.drawerViewMod.Props
import typings.reactNavigationDrawer.drawerViewMod.State
import typings.reactNavigationDrawer.typesMod.NavigationDrawerConfig
import typings.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typings.reactNavigationDrawer.typesMod.NavigationDrawerProp
import typings.reactNavigationDrawer.typesMod.NavigationDrawerRouterConfig
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-navigation-drawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DrawerActions {
    
    @JSImport("react-navigation-drawer", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.CLOSE_DRAWER")
    @js.native
    val CLOSE_DRAWER: /* "Navigation/CLOSE_DRAWER" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.DRAWER_CLOSED")
    @js.native
    val DRAWER_CLOSED: /* "Navigation/DRAWER_CLOSED" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.DRAWER_OPENED")
    @js.native
    val DRAWER_OPENED: /* "Navigation/DRAWER_OPENED" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.MARK_DRAWER_ACTIVE")
    @js.native
    val MARK_DRAWER_ACTIVE: /* "Navigation/MARK_DRAWER_ACTIVE" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.MARK_DRAWER_IDLE")
    @js.native
    val MARK_DRAWER_IDLE: /* "Navigation/MARK_DRAWER_IDLE" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.MARK_DRAWER_SETTLING")
    @js.native
    val MARK_DRAWER_SETTLING: /* "Navigation/MARK_DRAWER_SETTLING" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.OPEN_DRAWER")
    @js.native
    val OPEN_DRAWER: /* "Navigation/OPEN_DRAWER" */ String = js.native
    
    @JSImport("react-navigation-drawer", "DrawerActions.TOGGLE_DRAWER")
    @js.native
    val TOGGLE_DRAWER: /* "Navigation/TOGGLE_DRAWER" */ String = js.native
    
    @scala.inline
    def closeDrawer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[js.Any]
    @scala.inline
    def closeDrawer(payload: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def openDrawer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[js.Any]
    @scala.inline
    def openDrawer(payload: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def toggleDrawer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[js.Any]
    @scala.inline
    def toggleDrawer(payload: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("react-navigation-drawer", "DrawerGestureContext")
  @js.native
  val DrawerGestureContext: Context[RefObject[js.Any] | Null] = js.native
  
  @JSImport("react-navigation-drawer", "DrawerItems")
  @js.native
  class DrawerItems () extends default
  /* static members */
  object DrawerItems {
    
    @JSImport("react-navigation-drawer", "DrawerItems")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerItems.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    @scala.inline
    def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer", "DrawerItems.defaultProps")
    @js.native
    def defaultProps: ActiveBackgroundColor = js.native
    @scala.inline
    def defaultProps_=(x: ActiveBackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-navigation-drawer", "DrawerNavigatorItems")
  @js.native
  class DrawerNavigatorItems () extends default
  /* static members */
  object DrawerNavigatorItems {
    
    @JSImport("react-navigation-drawer", "DrawerNavigatorItems")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerNavigatorItems.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    @scala.inline
    def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer", "DrawerNavigatorItems.defaultProps")
    @js.native
    def defaultProps: ActiveBackgroundColor = js.native
    @scala.inline
    def defaultProps_=(x: ActiveBackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-navigation-drawer", "DrawerProgressContext")
  @js.native
  val DrawerProgressContext: Context[Node | Null] = js.native
  
  @scala.inline
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[js.Any, js.Any, js.Any]): GetActionCreators = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[GetActionCreators]
  @scala.inline
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[js.Any, js.Any, js.Any], config: InitialRouteName): GetActionCreators = (^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[GetActionCreators]
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @JSImport("react-navigation-drawer", "DrawerSidebar")
  @js.native
  class DrawerSidebar ()
    extends typings.reactNavigationDrawer.drawerSidebarMod.default
  
  @JSImport("react-navigation-drawer", "DrawerView")
  @js.native
  class DrawerView ()
    extends typings.reactNavigationDrawer.drawerViewMod.default
  /* static members */
  object DrawerView {
    
    @JSImport("react-navigation-drawer", "DrawerView")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer", "DrawerView.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    @scala.inline
    def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer", "DrawerView.defaultProps")
    @js.native
    def defaultProps: Lazy = js.native
    @scala.inline
    def defaultProps_=(x: Lazy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: Props, prevState: State): Loaded = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[Loaded]
  }
  
  @scala.inline
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any], 
      js.Any
    ]
  ): NavigationNavigator[js.Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDrawerNavigator")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[js.Any, NavigationProp[NavigationState]]]
  @scala.inline
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any], 
      js.Any
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any]
    ]
  ): NavigationNavigator[js.Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDrawerNavigator")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[js.Any, NavigationProp[NavigationState]]]
}
