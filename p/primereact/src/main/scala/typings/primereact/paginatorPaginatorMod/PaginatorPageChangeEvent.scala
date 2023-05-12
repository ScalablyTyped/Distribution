package typings.primereact.paginatorPaginatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom page change event.
  * @see {@link PaginatorProps.onPageChange}
  * @event
  */
trait PaginatorPageChangeEvent extends StObject {
  
  /**
    * New page number
    */
  var first: Double
  
  /**
    * Number of rows to display in new page
    */
  var page: Double
  
  /**
    * Total number of pages
    */
  var pageCount: Double
  
  /**
    * Index of first record
    */
  var rows: Double
}
object PaginatorPageChangeEvent {
  
  inline def apply(first: Double, page: Double, pageCount: Double, rows: Double): PaginatorPageChangeEvent = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorPageChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorPageChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
