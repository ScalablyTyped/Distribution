package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  pageCount :number,   manualPagination :boolean,   autoResetPage :boolean | undefined,   paginateExpandedRows :boolean}> */
@js.native
trait UsePaginationOptions[D /* <: js.Object */] extends js.Object {
  
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
  implicit class UsePaginationOptionsOps[Self <: UsePaginationOptions[_], D /* <: js.Object */] (val x: Self with UsePaginationOptions[D]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoResetPage(value: Boolean): Self = this.set("autoResetPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResetPage: Self = this.set("autoResetPage", js.undefined)
    
    @scala.inline
    def setManualPagination(value: Boolean): Self = this.set("manualPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualPagination: Self = this.set("manualPagination", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    
    @scala.inline
    def setPaginateExpandedRows(value: Boolean): Self = this.set("paginateExpandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginateExpandedRows: Self = this.set("paginateExpandedRows", js.undefined)
  }
}
