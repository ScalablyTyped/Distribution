package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGlobalFiltersState[D /* <: js.Object */] extends StObject {
  
  var globalFilter: js.Any = js.native
}
object UseGlobalFiltersState {
  
  @scala.inline
  def apply[D /* <: js.Object */](globalFilter: js.Any): UseGlobalFiltersState[D] = {
    val __obj = js.Dynamic.literal(globalFilter = globalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGlobalFiltersState[D]]
  }
  
  @scala.inline
  implicit class UseGlobalFiltersStateMutableBuilder[Self <: UseGlobalFiltersState[_], D /* <: js.Object */] (val x: Self with UseGlobalFiltersState[D]) extends AnyVal {
    
    @scala.inline
    def setGlobalFilter(value: js.Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
  }
}
