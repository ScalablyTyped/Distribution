package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var location: ActionMetaLocation
  
  var navigation: js.UndefOr[NavigationAction] = js.undefined
  
  var notFoundPath: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[Query] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
}
object Meta {
  
  inline def apply(location: ActionMetaLocation): Meta = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: ActionMetaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: NavigationAction): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setNotFoundPath(value: String): Self = StObject.set(x, "notFoundPath", value.asInstanceOf[js.Any])
    
    inline def setNotFoundPathUndefined: Self = StObject.set(x, "notFoundPath", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
