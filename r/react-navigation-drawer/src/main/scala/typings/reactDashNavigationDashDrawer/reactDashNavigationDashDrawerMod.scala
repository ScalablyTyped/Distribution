package typings.reactDashNavigationDashDrawer

import typings.react.reactMod.Context
import typings.react.reactMod.RefObject
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRouteConfigMap
import typings.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerNavigatorItemsMod.default
import typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.Props
import typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.State
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashCLOSE_DRAWER
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashDRAWER_CLOSED
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashDRAWER_OPENED
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashMARK_DRAWER_ACTIVE
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashMARK_DRAWER_IDLE
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashMARK_DRAWER_SETTLING
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashOPEN_DRAWER
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.NavigationSlashTOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer", JSImport.Namespace)
@js.native
object reactDashNavigationDashDrawerMod extends js.Object {
  @js.native
  class DrawerItems () extends default
  
  @js.native
  class DrawerNavigatorItems () extends default
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @js.native
  class DrawerSidebar ()
    extends typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.DrawerSidebar
  
  @js.native
  class DrawerView ()
    extends typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.default
  
  val DrawerGestureContext: Context[RefObject[js.Any] | Null] = js.native
  val DrawerProgressContext: Context[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any) | Null
  ] = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _]): Anon_Action = js.native
  def DrawerRouter(routeConfigs: NavigationRouteConfigMap[_, _], config: Anon_InitialRouteName): Anon_Action = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
  def createDrawerNavigator(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ],
    config: CreateNavigatorConfigNavigationDrawerConfigNavigat
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
    var defaultProps: Anon_ActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerNavigatorItems extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_ActiveBackgroundColor = js.native
  }
  
  /* static members */
  @js.native
  object DrawerView extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_Lazy = js.native
    def getDerivedStateFromProps(nextProps: Props, prevState: State): Anon_Loaded = js.native
  }
  
}

