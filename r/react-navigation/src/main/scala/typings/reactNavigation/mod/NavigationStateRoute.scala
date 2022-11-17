package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNavigation.mod.NavigationState because var conflicts: index, isTransitioning, key, params, routes. Inlined  */ trait NavigationStateRoute[NavigationLeafRouteParams]
  extends StObject
     with NavigationLeafRoute[NavigationLeafRouteParams]
object NavigationStateRoute {
  
  inline def apply[NavigationLeafRouteParams](
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationStateRoute[NavigationLeafRouteParams] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStateRoute[NavigationLeafRouteParams]]
  }
}
