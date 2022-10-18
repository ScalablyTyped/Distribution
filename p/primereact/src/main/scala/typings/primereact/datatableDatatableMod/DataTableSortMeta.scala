package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableSortMeta extends StObject {
  
  var field: String
  
  var order: DataTableSortOrderType
}
object DataTableSortMeta {
  
  inline def apply(field: String): DataTableSortMeta = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSortMeta]
  }
  
  extension [Self <: DataTableSortMeta](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: DataTableSortOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
