package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuExposed extends StObject {
  
  var attribute: String
  
  var defaultRefinement: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  var showMore: js.UndefOr[Boolean] = js.undefined
  
  var showMoreLimit: js.UndefOr[Double] = js.undefined
  
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object MenuExposed {
  
  inline def apply(attribute: String): MenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuExposed]
  }
  
  extension [Self <: MenuExposed](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setShowMore(value: Boolean): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
    
    inline def setShowMoreLimit(value: Double): Self = StObject.set(x, "showMoreLimit", value.asInstanceOf[js.Any])
    
    inline def setShowMoreLimitUndefined: Self = StObject.set(x, "showMoreLimit", js.undefined)
    
    inline def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    inline def setTransformItems(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}
