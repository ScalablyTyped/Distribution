package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.Keyof
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigation extends StObject {
  
  var navigation: NavigationProp[ParamListBase, String, js.UndefOr[String], Any, Any, Any]
  
  var route: RouteProp[ParamListBase, Keyof[ParamListBase]]
}
object Navigation {
  
  inline def apply(
    navigation: NavigationProp[ParamListBase, String, js.UndefOr[String], Any, Any, Any],
    route: RouteProp[ParamListBase, Keyof[ParamListBase]]
  ): Navigation = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
  
  extension [Self <: Navigation](x: Self) {
    
    inline def setNavigation(value: NavigationProp[ParamListBase, String, js.UndefOr[String], Any, Any, Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamListBase, Keyof[ParamListBase]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
