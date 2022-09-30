package typings.reactNavigationDrawer

import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigationDrawer.anon.GetActionCreators
import typings.reactNavigationDrawer.anon.InitialRouteName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerRouterMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(routeConfigs: NavigationRouteConfigMap[Any, Any, Any]): GetActionCreators = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[GetActionCreators]
  inline def default(routeConfigs: NavigationRouteConfigMap[Any, Any, Any], config: InitialRouteName): GetActionCreators = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[GetActionCreators]
}
