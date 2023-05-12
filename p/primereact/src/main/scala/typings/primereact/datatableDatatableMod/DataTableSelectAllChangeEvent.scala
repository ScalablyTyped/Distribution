package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom select all change event.
  * @see {@link DataTableProps.onSelectAllChange}
  */
trait DataTableSelectAllChangeEvent extends StObject {
  
  /**
    * Whether all data is selected.
    */
  var checked: Boolean
  
  /**
    * Browser event.
    */
  var originalEvent: SyntheticEvent[Element, Event]
}
object DataTableSelectAllChangeEvent {
  
  inline def apply(checked: Boolean, originalEvent: SyntheticEvent[Element, Event]): DataTableSelectAllChangeEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectAllChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableSelectAllChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
