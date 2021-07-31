package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteObjSpec extends StObject {
  
  /**
    * If set, cell edits will be handled remotely
    */
  var cellEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set deletion will be handled remotely
    */
  var dropRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, exporting CSV will be handled remotely
    */
  var exportCSV: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set filters will be handled remotely
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set insertions will be handled remotely
    */
  var insertRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set pagination will be handled remotely
    */
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set search will be handled remotely
    */
  var search: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set sorting will be handled remotely
    */
  var sort: js.UndefOr[Boolean] = js.undefined
}
object RemoteObjSpec {
  
  @scala.inline
  def apply(): RemoteObjSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteObjSpec]
  }
  
  @scala.inline
  implicit class RemoteObjSpecMutableBuilder[Self <: RemoteObjSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellEdit(value: Boolean): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
    
    @scala.inline
    def setDropRow(value: Boolean): Self = StObject.set(x, "dropRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropRowUndefined: Self = StObject.set(x, "dropRow", js.undefined)
    
    @scala.inline
    def setExportCSV(value: Boolean): Self = StObject.set(x, "exportCSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCSVUndefined: Self = StObject.set(x, "exportCSV", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setInsertRow(value: Boolean): Self = StObject.set(x, "insertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRowUndefined: Self = StObject.set(x, "insertRow", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
