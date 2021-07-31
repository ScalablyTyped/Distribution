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
  
  @scala.inline
  def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  @scala.inline
  implicit class FocusedMutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: NavigationRoute[NavigationParams]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
