package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom selection change event for context menu.
  * @see {@link DataTableProps.onContextMenuSelectionChange}
  * @event
  */
trait DataTableContextMenuSelectionChangeEvent[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Browser event.
    */
  var originalEvent: SyntheticEvent[Element, Event]
  
  /**
    * Selection object.
    */
  var value: DataTableSelection[TValue]
}
object DataTableContextMenuSelectionChangeEvent {
  
  inline def apply[TValue /* <: DataTableValueArray */](originalEvent: SyntheticEvent[Element, Event], value: DataTableSelection[TValue]): DataTableContextMenuSelectionChangeEvent[TValue] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableContextMenuSelectionChangeEvent[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableContextMenuSelectionChangeEvent[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableContextMenuSelectionChangeEvent[TValue]) extends AnyVal {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DataTableSelection[TValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: DataTableRowData[TValue]*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
