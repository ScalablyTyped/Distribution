package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var navigation: js.Any = js.native
  
  var route: RouteProp[ParamList, RouteName] = js.native
}
object Route {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](navigation: js.Any, route: RouteProp[ParamList, RouteName]): Route[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route[_, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self with (Route[ParamList, RouteName])) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: js.Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: RouteProp[ParamList, RouteName]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
