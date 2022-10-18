package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route[ParamList /* <: ParamListBase */] extends StObject {
  
  var navigation: Any
  
  var route: RouteProp[ParamList, Keyof[ParamList]]
}
object Route {
  
  inline def apply[ParamList /* <: ParamListBase */](navigation: Any, route: RouteProp[ParamList, Keyof[ParamList]]): Route[ParamList] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[ParamList]]
  }
  
  extension [Self <: Route[?], ParamList /* <: ParamListBase */](x: Self & Route[ParamList]) {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamList, Keyof[ParamList]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
