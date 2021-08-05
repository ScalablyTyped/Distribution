package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  disableGlobalFilter :boolean | undefined}> */
trait UseGlobalFiltersColumnOptions[D /* <: js.Object */] extends StObject {
  
  var disableGlobalFilter: js.UndefOr[Boolean] = js.undefined
}
object UseGlobalFiltersColumnOptions {
  
  inline def apply[D /* <: js.Object */](): UseGlobalFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersColumnOptions[D]]
  }
  
  extension [Self <: UseGlobalFiltersColumnOptions[?], D /* <: js.Object */](x: Self & UseGlobalFiltersColumnOptions[D]) {
    
    inline def setDisableGlobalFilter(value: Boolean): Self = StObject.set(x, "disableGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def setDisableGlobalFilterUndefined: Self = StObject.set(x, "disableGlobalFilter", js.undefined)
  }
}
