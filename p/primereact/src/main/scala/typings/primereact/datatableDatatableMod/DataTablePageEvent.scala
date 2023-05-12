package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom pagination event
  * @see {@link DataTableProps.onPage}
  * @event
  */
trait DataTablePageEvent
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Index of the first row.
    */
  var first: Double
  
  /**
    * The page number of the datatable.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Total number of pages.
    */
  var pageCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Rows per page.
    */
  var rows: Double
}
object DataTablePageEvent {
  
  inline def apply(first: Double, rows: Double): DataTablePageEvent = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTablePageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTablePageEvent] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
