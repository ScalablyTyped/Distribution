package typings.reactTable.mod

import typings.reactTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseFiltersState[D /* <: js.Object */] extends StObject {
  
  var filters: Filters[D] = js.native
}
object UseFiltersState {
  
  @scala.inline
  def apply[D /* <: js.Object */](filters: Filters[D]): UseFiltersState[D] = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseFiltersState[D]]
  }
  
  @scala.inline
  implicit class UseFiltersStateMutableBuilder[Self <: UseFiltersState[_], D /* <: js.Object */] (val x: Self with UseFiltersState[D]) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Filters[D]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: Value[D]*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
