package typings.reactNavigationDrawer.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var focused: Boolean
  
  var route: NavigationRoute[NavigationParams]
}
object Focused {
  
  inline def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  extension [Self <: Focused](x: Self) {
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: NavigationRoute[NavigationParams]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
