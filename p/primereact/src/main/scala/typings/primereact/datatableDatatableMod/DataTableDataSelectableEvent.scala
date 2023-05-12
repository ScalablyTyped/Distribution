package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom data selectable event.
  * @see {@link DataTableProps.isDataSelectable}
  * @event
  */
trait DataTableDataSelectableEvent[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Original data of the row.
    */
  var data: DataTableRowDataArray[TValue]
  
  /**
    * Index of the row.
    */
  var index: Double
}
object DataTableDataSelectableEvent {
  
  inline def apply[TValue /* <: DataTableValueArray */](data: DataTableRowDataArray[TValue], index: Double): DataTableDataSelectableEvent[TValue] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableDataSelectableEvent[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableDataSelectableEvent[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableDataSelectableEvent[TValue]) extends AnyVal {
    
    inline def setData(value: DataTableRowDataArray[TValue]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DataTableRowData[TValue]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
