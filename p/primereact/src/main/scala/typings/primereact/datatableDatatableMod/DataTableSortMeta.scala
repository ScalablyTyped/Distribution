package typings.primereact.datatableDatatableMod

import typings.primereact.primereactInts.`-1`
import typings.primereact.primereactInts.`0`
import typings.primereact.primereactInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom datatable sort meta
  */
trait DataTableSortMeta extends StObject {
  
  /**
    * Column field to sort against.
    */
  var field: String
  
  /**
    * Sort order as integer.
    */
  var order: js.UndefOr[`1` | `0` | `-1` | Null] = js.undefined
}
object DataTableSortMeta {
  
  inline def apply(field: String): DataTableSortMeta = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSortMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableSortMeta] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: `1` | `0` | `-1`): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
