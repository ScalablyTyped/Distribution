package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationRoute extends StObject {
  
  var navigation: js.Any = js.native
  
  var route: RouteProp[ParamListBase, String] = js.native
}
object NavigationRoute {
  
  @scala.inline
  def apply(navigation: js.Any, route: RouteProp[ParamListBase, String]): NavigationRoute = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationRoute]
  }
  
  @scala.inline
  implicit class NavigationRouteMutableBuilder[Self <: NavigationRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: js.Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: RouteProp[ParamListBase, String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
