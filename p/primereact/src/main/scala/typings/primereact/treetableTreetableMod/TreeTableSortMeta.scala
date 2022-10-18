package typings.primereact.treetableTreetableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableSortMeta extends StObject {
  
  var field: String
  
  var order: TreeTableSortOrderType
}
object TreeTableSortMeta {
  
  inline def apply(field: String): TreeTableSortMeta = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableSortMeta]
  }
  
  extension [Self <: TreeTableSortMeta](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: TreeTableSortOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
