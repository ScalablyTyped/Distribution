package typings.primereact.treetableTreetableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableSortParams extends StObject {
  
  var multiSortMeta: TreeTableMultiSortMetaType
  
  var sortField: String
  
  var sortOrder: TreeTableSortOrderType
}
object TreeTableSortParams {
  
  inline def apply(sortField: String): TreeTableSortParams = {
    val __obj = js.Dynamic.literal(sortField = sortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableSortParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeTableSortParams] (val x: Self) extends AnyVal {
    
    inline def setMultiSortMeta(value: TreeTableMultiSortMetaType): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMetaNull: Self = StObject.set(x, "multiSortMeta", null)
    
    inline def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
    
    inline def setMultiSortMetaVarargs(value: TreeTableSortMeta*): Self = StObject.set(x, "multiSortMeta", js.Array(value*))
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: TreeTableSortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
