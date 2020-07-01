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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DrawerItems () extends default
  
  @js.native
  class DrawerNavigatorItems () extends default
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @js.native
  class DrawerSidebar ()
    extends typings.reactNavigationDrawer.drawerSidebarMod.DrawerSidebar
  
  @js.native
  class DrawerView ()
    extends typings.reactNavigationDrawer.drawerViewMod.default
  
  val DrawerGestureContext: Context[RefObject[js.Any] | Null] = js.native
  val DrawerProgressContext: Context[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any) | Null
  ] = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _, _]): GetActionCreators = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _, _], config: InitialRouteName): GetActionCreators = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  @js.native
  object DrawerActions extends js.Object {
    val CLOSE_DRAWER: /* "Navigation/CLOSE_DRAWER" */ String = js.native
    val DRAWER_CLOSED: /* "Navigation/DRAWER_CLOSED" */ String = js.native
    val DRAWER_OPENED: /* "Navigation/DRAWER_OPENED" */ String = js.native
    val MARK_DRAWER_ACTIVE: /* "Navigation/MARK_DRAWER_ACTIVE" */ String = js.native
    val MARK_DRAWER_IDLE: /* "Navigation/MARK_DRAWER_IDLE" */ String = js.native
    val MARK_DRAWER_SETTLING: /* "Navigation/MARK_DRAWER_SETTLING" */ String = js.native
    val OPEN_DRAWER: /* "Navigation/OPEN_DRAWER" */ String = js.native
    val TOGGLE_DRAWER: /* "Navigation/TOGGLE_DRAWER" */ String = js.native
    def closeDrawer(): js.Any = js.native
    def closeDrawer(payload: js.Any): js.Any = js.native
    def openDrawer(): js.Any = js.native
    def openDrawer(payload: js.Any): js.Any = js.native
    def toggleDrawer(): js.Any = js.native
    def toggleDrawer(payload: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DrawerItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: ActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerNavigatorItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: ActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerView extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Lazy = js.native
    def getDerivedStateFromProps(nextProps: Props, prevState: State): Loaded = js.native
  }
  
}

