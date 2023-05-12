package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom filter event.
  * @see {@link DataTableProps.onFilter}
  * @event
  */
trait DataTableFilterEvent
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Collection of active filters.
    */
  var filters: DataTableFilterMeta
}
object DataTableFilterEvent {
  
  inline def apply(filters: DataTableFilterMeta): DataTableFilterEvent = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableFilterEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableFilterEvent] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DataTableFilterMeta): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
  }
}
