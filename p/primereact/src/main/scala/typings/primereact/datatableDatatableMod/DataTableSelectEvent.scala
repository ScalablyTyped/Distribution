package typings.primereact.datatableDatatableMod

import typings.primereact.primereactStrings.all
import typings.primereact.primereactStrings.cell
import typings.primereact.primereactStrings.checkbox
import typings.primereact.primereactStrings.radio
import typings.primereact.primereactStrings.row
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom select event.
  * @see {@link DataTableProps.onAllRowsSelect}, {@link DataTableProps.onRowSelect}
  * @event
  */
trait DataTableSelectEvent extends StObject {
  
  /**
    * Selected rows data.
    */
  var data: Any
  
  /**
    * Browser event.
    */
  var originalEvent: SyntheticEvent[Element, Event]
  
  /**
    * Type of the selection, valid value is "all".
    */
  var `type`: js.UndefOr[row | cell | checkbox | radio | all] = js.undefined
}
object DataTableSelectEvent {
  
  inline def apply(data: Any, originalEvent: SyntheticEvent[Element, Event]): DataTableSelectEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableSelectEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setType(value: row | cell | checkbox | radio | all): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
