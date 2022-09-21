package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.Keyof
import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsRoute[ScreenOptions /* <: js.Object */] extends StObject {
  
  var navigation: Any
  
  var options: ScreenOptions
  
  var route: RouteProp[ParamListBase, Keyof[ParamListBase]]
}
object OptionsRoute {
  
  inline def apply[ScreenOptions /* <: js.Object */](navigation: Any, options: ScreenOptions, route: RouteProp[ParamListBase, Keyof[ParamListBase]]): OptionsRoute[ScreenOptions] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsRoute[ScreenOptions]]
  }
  
  extension [Self <: OptionsRoute[?], ScreenOptions /* <: js.Object */](x: Self & OptionsRoute[ScreenOptions]) {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ScreenOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamListBase, Keyof[ParamListBase]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
