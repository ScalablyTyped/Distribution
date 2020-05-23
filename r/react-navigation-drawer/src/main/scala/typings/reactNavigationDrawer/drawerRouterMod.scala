package typings.reactNavigationDrawer

import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigationDrawer.anon.GetActionCreators
import typings.reactNavigationDrawer.anon.InitialRouteName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerRouter", JSImport.Namespace)
@js.native
object drawerRouterMod extends js.Object {
  def default(routeConfigs: NavigationRouteConfigMap[_, _, _]): GetActionCreators = js.native
  def default(routeConfigs: NavigationRouteConfigMap[_, _, _], config: InitialRouteName): GetActionCreators = js.native
}

