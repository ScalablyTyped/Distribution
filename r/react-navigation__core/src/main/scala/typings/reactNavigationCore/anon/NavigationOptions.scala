package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions[ScreenOptions /* <: js.Object */] extends StObject {
  
  var navigation: Any
  
  var options: ScreenOptions
  
  var route: RouteProp[ParamListBase, Keyof[ParamListBase]]
}
object NavigationOptions {
  
  inline def apply[ScreenOptions /* <: js.Object */](navigation: Any, options: ScreenOptions, route: RouteProp[ParamListBase, Keyof[ParamListBase]]): NavigationOptions[ScreenOptions] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions[ScreenOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationOptions[?], ScreenOptions /* <: js.Object */] (val x: Self & NavigationOptions[ScreenOptions]) extends AnyVal {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ScreenOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamListBase, Keyof[ParamListBase]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
