package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom data selectable event.
  * @see {@link DataTableProps.isDataSelectable}
  * @event
  */
trait DataTableDataSelectableEvent extends StObject {
  
  /**
    * Original data of the row.
    */
  var data: DataTableValue
  
  /**
    * Index of the row.
    */
  var index: Double
}
object DataTableDataSelectableEvent {
  
  inline def apply(data: DataTableValue, index: Double): DataTableDataSelectableEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableDataSelectableEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableDataSelectableEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: DataTableValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
