package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom context menu event.
  * @see {@link DataTableProps.onContextMenu}, {@link DataTableProps.onRowCollapse}, {@link DataTableProps.onRowExpand}
  * @event
  */
trait DataTableRowEvent extends StObject {
  
  /**
    * Original rows data.
    */
  var data: DataTableValue
  
  /**
    * Original event instance.
    */
  var originalEvent: SyntheticEvent[Element, Event]
}
object DataTableRowEvent {
  
  inline def apply(data: DataTableValue, originalEvent: SyntheticEvent[Element, Event]): DataTableRowEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: DataTableValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
