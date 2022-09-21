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
  
  extension [Self <: UseGlobalFiltersState[?], D /* <: js.Object */](x: Self & UseGlobalFiltersState[D]) {
    
    inline def setGlobalFilter(value: Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
  }
}
