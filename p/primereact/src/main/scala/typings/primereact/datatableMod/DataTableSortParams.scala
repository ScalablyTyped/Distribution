package typings.primereact.datatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableSortParams extends StObject {
  
  var multiSortMeta: DataTableMultiSortMetaType
  
  var sortField: String
  
  var sortOrder: DataTableSortOrderType
}
object DataTableSortParams {
  
  inline def apply(sortField: String): DataTableSortParams = {
    val __obj = js.Dynamic.literal(sortField = sortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSortParams]
  }
  
  extension [Self <: DataTableSortParams](x: Self) {
    
    inline def setMultiSortMeta(value: DataTableMultiSortMetaType): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMetaNull: Self = StObject.set(x, "multiSortMeta", null)
    
    inline def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
    
    inline def setMultiSortMetaVarargs(value: DataTableSortMeta*): Self = StObject.set(x, "multiSortMeta", js.Array(value*))
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: DataTableSortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
