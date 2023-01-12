package typings.reactTable.mod

import typings.reactTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseFiltersState[D /* <: js.Object */] extends StObject {
  
  var filters: Filters[D]
}
object UseFiltersState {
  
  inline def apply[D /* <: js.Object */](filters: Filters[D]): UseFiltersState[D] = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseFiltersState[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseFiltersState[?], D /* <: js.Object */] (val x: Self & UseFiltersState[D]) extends AnyVal {
    
    inline def setFilters(value: Filters[D]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Value[D]*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
