package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseGlobalFiltersState[D /* <: js.Object */] extends StObject {
  
  var globalFilter: Any
}
object UseGlobalFiltersState {
  
  inline def apply[D /* <: js.Object */](globalFilter: Any): UseGlobalFiltersState[D] = {
    val __obj = js.Dynamic.literal(globalFilter = globalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGlobalFiltersState[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseGlobalFiltersState[?], D /* <: js.Object */] (val x: Self & UseGlobalFiltersState[D]) extends AnyVal {
    
    inline def setGlobalFilter(value: Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
  }
}
