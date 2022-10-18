package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var color: String
  
  var focused: Boolean
  
  var route: typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
}
object Focused {
  
  inline def apply(
    color: String,
    focused: Boolean,
    route: typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
  ): Focused = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  extension [Self <: Focused](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
