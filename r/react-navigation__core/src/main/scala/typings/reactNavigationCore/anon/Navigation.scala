package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
    
    inline def setNavigation(value: NavigationProp[ParamListBase, String, js.UndefOr[String], Any, Any, Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamListBase, Keyof[ParamListBase]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
