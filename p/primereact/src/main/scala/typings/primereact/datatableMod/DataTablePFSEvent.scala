package typings.primereact.datatableMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTablePFSEvent
  extends StObject
     with DataTablePageParams
     with DataTableSortParams
     with DataTableFilterParams
     with /* key */ StringDictionary[Any]
object DataTablePFSEvent {
  
  inline def apply(filters: DataTableFilterMeta, first: Double, rows: Double, sortField: String): DataTablePFSEvent = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTablePFSEvent]
  }
}
