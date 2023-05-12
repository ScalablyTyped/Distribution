package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactInts.`-1`
import typings.primereact.primereactInts.`0`
import typings.primereact.primereactInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom sort event.
  * @see {@link DataTableProps.onSort}
  * @event
  */
trait DataTableSortEvent
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * MultiSort metadata.
    */
  var multiSortMeta: js.UndefOr[js.Array[DataTableSortMeta] | Null] = js.undefined
  
  /**
    * Field to sort against.
    */
  var sortField: String
  
  /**
    * Sort order as integer.
    */
  var sortOrder: js.UndefOr[`1` | `0` | `-1` | Null] = js.undefined
}
object DataTableSortEvent {
  
  inline def apply(sortField: String): DataTableSortEvent = {
    val __obj = js.Dynamic.literal(sortField = sortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSortEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableSortEvent] (val x: Self) extends AnyVal {
    
    inline def setMultiSortMeta(value: js.Array[DataTableSortMeta]): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMetaNull: Self = StObject.set(x, "multiSortMeta", null)
    
    inline def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
    
    inline def setMultiSortMetaVarargs(value: DataTableSortMeta*): Self = StObject.set(x, "multiSortMeta", js.Array(value*))
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: `1` | `0` | `-1`): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
