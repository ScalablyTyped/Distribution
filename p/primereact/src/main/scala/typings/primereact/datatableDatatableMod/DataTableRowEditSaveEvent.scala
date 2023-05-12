package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row edit save event.
  * @see {@link DataTableProps.onRowEditSave}
  * @extends DataTableRowEditEvent
  */
trait DataTableRowEditSaveEvent
  extends StObject
     with DataTableRowEditEvent {
  
  /**
    * Whether the row is valid or not.
    */
  var valid: Boolean
}
object DataTableRowEditSaveEvent {
  
  inline def apply(data: DataTableValue, index: Double, originalEvent: SyntheticEvent[Element, Event], valid: Boolean): DataTableRowEditSaveEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditSaveEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEditSaveEvent] (val x: Self) extends AnyVal {
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
