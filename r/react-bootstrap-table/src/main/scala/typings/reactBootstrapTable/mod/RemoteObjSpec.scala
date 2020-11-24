package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteObjSpec extends js.Object {
  
  /**
    * If set, cell edits will be handled remotely
    */
  var cellEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * If set deletion will be handled remotely
    */
  var dropRow: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, exporting CSV will be handled remotely
    */
  var exportCSV: js.UndefOr[Boolean] = js.native
  
  /**
    * If set filters will be handled remotely
    */
  var filter: js.UndefOr[Boolean] = js.native
  
  /**
    * If set insertions will be handled remotely
    */
  var insertRow: js.UndefOr[Boolean] = js.native
  
  /**
    * If set pagination will be handled remotely
    */
  var pagination: js.UndefOr[Boolean] = js.native
  
  /**
    * If set search will be handled remotely
    */
  var search: js.UndefOr[Boolean] = js.native
  
  /**
    * If set sorting will be handled remotely
    */
  var sort: js.UndefOr[Boolean] = js.native
}
object RemoteObjSpec {
  
  @scala.inline
  def apply(): RemoteObjSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteObjSpec]
  }
  
  @scala.inline
  implicit class RemoteObjSpecOps[Self <: RemoteObjSpec] (val x: Self) extends AnyVal {
    
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
    def setCellEdit(value: Boolean): Self = this.set("cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    
    @scala.inline
    def setDropRow(value: Boolean): Self = this.set("dropRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropRow: Self = this.set("dropRow", js.undefined)
    
    @scala.inline
    def setExportCSV(value: Boolean): Self = this.set("exportCSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCSV: Self = this.set("exportCSV", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setInsertRow(value: Boolean): Self = this.set("insertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertRow: Self = this.set("insertRow", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
