package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  pageCount :number,   manualPagination :boolean,   autoResetPage :boolean | undefined,   paginateExpandedRows :boolean}> */
trait UsePaginationOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetPage: js.UndefOr[Boolean] = js.undefined
  
  var manualPagination: js.UndefOr[Boolean] = js.undefined
  
  var pageCount: js.UndefOr[Double] = js.undefined
  
  var paginateExpandedRows: js.UndefOr[Boolean] = js.undefined
}
object UsePaginationOptions {
  
  inline def apply[D /* <: js.Object */](): UsePaginationOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsePaginationOptions[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsePaginationOptions[?], D /* <: js.Object */] (val x: Self & UsePaginationOptions[D]) extends AnyVal {
    
    inline def setAutoResetPage(value: Boolean): Self = StObject.set(x, "autoResetPage", value.asInstanceOf[js.Any])
    
    inline def setAutoResetPageUndefined: Self = StObject.set(x, "autoResetPage", js.undefined)
    
    inline def setManualPagination(value: Boolean): Self = StObject.set(x, "manualPagination", value.asInstanceOf[js.Any])
    
    inline def setManualPaginationUndefined: Self = StObject.set(x, "manualPagination", js.undefined)
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPaginateExpandedRows(value: Boolean): Self = StObject.set(x, "paginateExpandedRows", value.asInstanceOf[js.Any])
    
    inline def setPaginateExpandedRowsUndefined: Self = StObject.set(x, "paginateExpandedRows", js.undefined)
  }
}
