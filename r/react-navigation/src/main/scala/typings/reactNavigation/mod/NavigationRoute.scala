package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.mod.NavigationLeafRoute[Params]
  - typings.reactNavigation.mod.NavigationStateRoute[Params]
*/
trait NavigationRoute[Params] extends StObject
object NavigationRoute {
  
  inline def NavigationLeafRoute[Params](
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): typings.reactNavigation.mod.NavigationLeafRoute[Params] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationLeafRoute[Params]]
  }
  
  inline def NavigationStateRoute[Params](
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): typings.reactNavigation.mod.NavigationStateRoute[Params] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationStateRoute[Params]]
  }
}
