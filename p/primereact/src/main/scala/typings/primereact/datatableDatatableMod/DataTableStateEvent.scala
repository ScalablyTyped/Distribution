package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom state event containing page, filter and sort states.
  * @see {@link DataTableProps.onFilter}
  * @see {@link DataTableProps.onSort}
  * @see {@link DataTableProps.onPage}
  * @event
  */
trait DataTableStateEvent
  extends StObject
     with DataTablePageEvent
     with DataTableFilterEvent
     with DataTableSortEvent
object DataTableStateEvent {
  
  inline def apply(filters: DataTableFilterMeta, first: Double, rows: Double, sortField: String): DataTableStateEvent = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableStateEvent]
  }
}
