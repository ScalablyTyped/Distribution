package typings.reactNavigationDrawer

import typings.react.mod.Context
import typings.react.mod.RefObject
import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.drawerNavigatorItemsMod.default
import typings.reactNavigationDrawer.drawerViewMod.Props
import typings.reactNavigationDrawer.drawerViewMod.State
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashCLOSE_DRAWER
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashDRAWER_CLOSED
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashDRAWER_OPENED
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashMARK_DRAWER_ACTIVE
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashMARK_DRAWER_IDLE
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashMARK_DRAWER_SETTLING
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashOPEN_DRAWER
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashTOGGLE_DRAWER
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
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _, _]): AnonGetActionCreators = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _, _], config: AnonInitialRouteName): AnonGetActionCreators = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
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
  ): js.Any = js.native
  @js.native
  object DrawerActions extends js.Object {
    val CLOSE_DRAWER: NavigationSlashCLOSE_DRAWER = js.native
    val DRAWER_CLOSED: NavigationSlashDRAWER_CLOSED = js.native
    val DRAWER_OPENED: NavigationSlashDRAWER_OPENED = js.native
    val MARK_DRAWER_ACTIVE: NavigationSlashMARK_DRAWER_ACTIVE = js.native
    val MARK_DRAWER_IDLE: NavigationSlashMARK_DRAWER_IDLE = js.native
    val MARK_DRAWER_SETTLING: NavigationSlashMARK_DRAWER_SETTLING = js.native
    val OPEN_DRAWER: NavigationSlashOPEN_DRAWER = js.native
    val TOGGLE_DRAWER: NavigationSlashTOGGLE_DRAWER = js.native
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
    var defaultProps: AnonActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerNavigatorItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerView extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonLazy = js.native
    def getDerivedStateFromProps(nextProps: Props, prevState: State): AnonLoaded = js.native
  }
  
}

