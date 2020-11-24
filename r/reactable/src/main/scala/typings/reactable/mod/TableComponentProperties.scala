package typings.reactable.mod

import typings.reactable.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableComponentProperties[T] extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[js.Array[ColumnsType]] = js.native
  
  var currentPage: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[js.Array[T]] = js.native
  
  var defaultSort: js.UndefOr[Column] = js.native
  
  var filterBy: js.UndefOr[String] = js.native
  
  var filterable: js.UndefOr[js.Array[String]] = js.native
  
  var hideFilterInput: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  var noDataText: js.UndefOr[String] = js.native
  
  var onFilter: js.UndefOr[FilterMethodType] = js.native
  
  var pageButtonLimit: js.UndefOr[Double] = js.native
  
  var sortBy: js.UndefOr[Boolean] = js.native
  
  var sortable: js.UndefOr[js.Array[String] | Boolean] = js.native
}
object TableComponentProperties {
  
  @scala.inline
  def apply[T](): TableComponentProperties[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableComponentProperties[T]]
  }
  
  @scala.inline
  implicit class TableComponentPropertiesOps[Self <: TableComponentProperties[_], T] (val x: Self with TableComponentProperties[T]) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnsType*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnsType]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefaultSort(value: Column): Self = this.set("defaultSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSort: Self = this.set("defaultSort", js.undefined)
    
    @scala.inline
    def setFilterBy(value: String): Self = this.set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    
    @scala.inline
    def setFilterableVarargs(value: String*): Self = this.set("filterable", js.Array(value :_*))
    
    @scala.inline
    def setFilterable(value: js.Array[String]): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setHideFilterInput(value: Boolean): Self = this.set("hideFilterInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFilterInput: Self = this.set("hideFilterInput", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnFilter(value: /* text */ String => Unit): Self = this.set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    
    @scala.inline
    def setPageButtonLimit(value: Double): Self = this.set("pageButtonLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageButtonLimit: Self = this.set("pageButtonLimit", js.undefined)
    
    @scala.inline
    def setSortBy(value: Boolean): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortableVarargs(value: String*): Self = this.set("sortable", js.Array(value :_*))
    
    @scala.inline
    def setSortable(value: js.Array[String] | Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
}
