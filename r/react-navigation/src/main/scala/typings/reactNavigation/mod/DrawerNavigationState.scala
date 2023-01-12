package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerNavigationState
  extends StObject
     with NavigationState {
  
  var isDrawerOpen: Boolean
}
object DrawerNavigationState {
  
  inline def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): DrawerNavigationState = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawerNavigationState] (val x: Self) extends AnyVal {
    
    inline def setIsDrawerOpen(value: Boolean): Self = StObject.set(x, "isDrawerOpen", value.asInstanceOf[js.Any])
  }
}
