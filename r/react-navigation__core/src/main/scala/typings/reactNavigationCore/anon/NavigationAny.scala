package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAny[ParamList /* <: ParamListBase */] extends StObject {
  
  var navigation: Any
  
  var route: RouteProp[ParamList, /* keyof ParamList */ String]
}
object NavigationAny {
  
  inline def apply[ParamList /* <: ParamListBase */](navigation: Any, route: RouteProp[ParamList, /* keyof ParamList */ String]): NavigationAny[ParamList] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAny[ParamList]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationAny[?], ParamList /* <: ParamListBase */] (val x: Self & NavigationAny[ParamList]) extends AnyVal {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamList, /* keyof ParamList */ String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
