package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  pageCount :number,   manualPagination :boolean,   autoResetPage :boolean | undefined,   paginateExpandedRows :boolean}> */
@js.native
trait UsePaginationOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetPage: js.UndefOr[Boolean] = js.native
  
  var manualPagination: js.UndefOr[Boolean] = js.native
  
  var pageCount: js.UndefOr[Double] = js.native
  
  var paginateExpandedRows: js.UndefOr[Boolean] = js.native
}
object UsePaginationOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UsePaginationOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsePaginationOptions[D]]
  }
  
  @scala.inline
  implicit class UsePaginationOptionsMutableBuilder[Self <: UsePaginationOptions[_], D /* <: js.Object */] (val x: Self with UsePaginationOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAutoResetPage(value: Boolean): Self = StObject.set(x, "autoResetPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResetPageUndefined: Self = StObject.set(x, "autoResetPage", js.undefined)
    
    @scala.inline
    def setManualPagination(value: Boolean): Self = StObject.set(x, "manualPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualPaginationUndefined: Self = StObject.set(x, "manualPagination", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setPaginateExpandedRows(value: Boolean): Self = StObject.set(x, "paginateExpandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateExpandedRowsUndefined: Self = StObject.set(x, "paginateExpandedRows", js.undefined)
  }
}
