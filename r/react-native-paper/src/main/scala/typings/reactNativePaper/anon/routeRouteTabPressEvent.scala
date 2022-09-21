package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  route :react-native-paper.react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigation.Route} & react-native-paper.react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigation.TabPressEvent */
trait routeRouteTabPressEvent extends StObject {
  
  var defaultPrevented: Boolean
  
  def preventDefault(): Unit
  
  var route: typings.reactNativePaper.bottomNavigationMod.Route
}
object routeRouteTabPressEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    preventDefault: () => Unit,
    route: typings.reactNativePaper.bottomNavigationMod.Route
  ): routeRouteTabPressEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[routeRouteTabPressEvent]
  }
  
  extension [Self <: routeRouteTabPressEvent](x: Self) {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setRoute(value: typings.reactNativePaper.bottomNavigationMod.Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
