package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row edit event.
  * @see {@link DataTableProps.onRowEditInit}, {@link DataTableProps.onRowEditChange}, {@link DataTableProps.onRowEditCancel}
  * @extends DataTableRowEvent
  * @event
  */
trait DataTableRowEditEvent
  extends StObject
     with DataTableRowEvent {
  
  /**
    * Index of the row.
    */
  var index: Double
}
object DataTableRowEditEvent {
  
  inline def apply(data: DataTableValue, index: Double, originalEvent: SyntheticEvent[Element, Event]): DataTableRowEditEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEditEvent] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
