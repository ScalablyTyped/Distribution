package typings.primereact.columnColumnMod

import typings.primereact.primereactInts.`-1`
import typings.primereact.primereactInts.`0`
import typings.primereact.primereactInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortMetaData extends StObject {
  
  /**
    * Field name of the column.
    */
  var field: String
  
  /**
    * Sort order of the column.
    */
  var order: js.UndefOr[`1` | `0` | `-1` | Null] = js.undefined
}
object ColumnSortMetaData {
  
  inline def apply(field: String): ColumnSortMetaData = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSortMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSortMetaData] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: `1` | `0` | `-1`): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
