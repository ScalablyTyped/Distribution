package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortMetaData extends StObject {
  
  var field: String
  
  var order: ColumnSortOrderType
}
object ColumnSortMetaData {
  
  inline def apply(field: String): ColumnSortMetaData = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSortMetaData]
  }
  
  extension [Self <: ColumnSortMetaData](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: ColumnSortOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
