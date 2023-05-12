package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row toggle event.
  * @see {@link DataTableProps.onRowToggle}
  * @event
  */
trait DataTableRowToggleEvent extends StObject {
  
  /**
    * Expanded rows.
    */
  var data: js.Array[Any] | DataTableExpandedRows
}
object DataTableRowToggleEvent {
  
  inline def apply(data: js.Array[Any] | DataTableExpandedRows): DataTableRowToggleEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowToggleEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowToggleEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Any] | DataTableExpandedRows): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
