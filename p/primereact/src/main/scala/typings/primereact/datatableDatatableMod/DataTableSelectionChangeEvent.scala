package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom selection change event.
  * @see {@link DataTableProps.onSelectionChange}
  * @event
  */
trait DataTableSelectionChangeEvent[TValue /* <: DataTableValueArray */]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Browser event.
    */
  var originalEvent: SyntheticEvent[Element, Event]
  
  /**
    * Type of the selection.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Selection object.
    */
  var value: DataTableSelection[TValue]
}
object DataTableSelectionChangeEvent {
  
  inline def apply[TValue /* <: DataTableValueArray */](originalEvent: SyntheticEvent[Element, Event], value: DataTableSelection[TValue]): DataTableSelectionChangeEvent[TValue] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectionChangeEvent[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableSelectionChangeEvent[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableSelectionChangeEvent[TValue]) extends AnyVal {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: DataTableSelection[TValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: DataTableRowData[TValue]*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
