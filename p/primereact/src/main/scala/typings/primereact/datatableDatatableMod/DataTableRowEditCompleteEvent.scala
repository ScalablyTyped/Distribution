package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row edit complete event.
  * @see {@link DataTableProps.onRowEditComplete}
  * @extends DataTableRowEvent
  * @event
  */
trait DataTableRowEditCompleteEvent
  extends StObject
     with DataTableRowEvent {
  
  /**
    * Column field.
    */
  var field: String
  
  /**
    * Current editing row data index.
    */
  var index: Double
  
  /**
    * Editing rows data.
    */
  var newData: DataTableValue
}
object DataTableRowEditCompleteEvent {
  
  inline def apply(
    data: DataTableValue,
    field: String,
    index: Double,
    newData: DataTableValue,
    originalEvent: SyntheticEvent[Element, Event]
  ): DataTableRowEditCompleteEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditCompleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEditCompleteEvent] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNewData(value: DataTableValue): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
  }
}
