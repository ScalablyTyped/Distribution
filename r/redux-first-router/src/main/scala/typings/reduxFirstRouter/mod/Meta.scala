package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends StObject {
  
  var location: ActionMetaLocation = js.native
  
  var navigation: js.UndefOr[NavigationAction] = js.native
  
  var notFoundPath: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var search: js.UndefOr[String] = js.native
}
object Meta {
  
  @scala.inline
  def apply(location: ActionMetaLocation): Meta = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: ActionMetaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationAction): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setNotFoundPath(value: String): Self = StObject.set(x, "notFoundPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundPathUndefined: Self = StObject.set(x, "notFoundPath", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
