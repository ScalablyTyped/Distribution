package typings.primereact.dataViewMod

import typings.primereact.anon.Rows
import typings.primereact.primereactStrings.grid
import typings.primereact.primereactStrings.list
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataViewProps extends js.Object {
  
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var currentPageReportTemplate: js.UndefOr[String] = js.native
  
  var emptyMessage: js.UndefOr[String] = js.native
  
  var first: js.UndefOr[Double] = js.native
  
  var footer: js.UndefOr[Element | String] = js.native
  
  var header: js.UndefOr[Element | String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var itemTemplate: js.UndefOr[js.Function2[/* item */ js.Any, /* layout */ grid | list, js.UndefOr[Element]]] = js.native
  
  var layout: js.UndefOr[String] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var loadingIcon: js.UndefOr[String] = js.native
  
  var onPage: js.UndefOr[js.Function1[/* e */ Rows, Unit]] = js.native
  
  var pageLinkSize: js.UndefOr[Double] = js.native
  
  var paginator: js.UndefOr[Boolean] = js.native
  
  var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.native
  
  var paginatorLeft: js.UndefOr[js.Any] = js.native
  
  var paginatorPosition: js.UndefOr[String] = js.native
  
  var paginatorRight: js.UndefOr[js.Any] = js.native
  
  var paginatorTemplate: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  
  var sortField: js.UndefOr[String] = js.native
  
  var sortOrder: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var totalRecords: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
}
object DataViewProps {
  
  @scala.inline
  def apply(): DataViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewProps]
  }
  
  @scala.inline
  implicit class DataViewPropsOps[Self <: DataViewProps] (val x: Self) extends AnyVal {
    
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
    def setAlwaysShowPaginator(value: Boolean): Self = this.set("alwaysShowPaginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysShowPaginator: Self = this.set("alwaysShowPaginator", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCurrentPageReportTemplate(value: String): Self = this.set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageReportTemplate: Self = this.set("currentPageReportTemplate", js.undefined)
    
    @scala.inline
    def setEmptyMessage(value: String): Self = this.set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyMessage: Self = this.set("emptyMessage", js.undefined)
    
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setFooter(value: Element | String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: Element | String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLoadingIcon(value: String): Self = this.set("loadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIcon: Self = this.set("loadingIcon", js.undefined)
    
    @scala.inline
    def setOnPage(value: /* e */ Rows => Unit): Self = this.set("onPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPage: Self = this.set("onPage", js.undefined)
    
    @scala.inline
    def setPageLinkSize(value: Double): Self = this.set("pageLinkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLinkSize: Self = this.set("pageLinkSize", js.undefined)
    
    @scala.inline
    def setPaginator(value: Boolean): Self = this.set("paginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginator: Self = this.set("paginator", js.undefined)
    
    @scala.inline
    def setPaginatorDropdownAppendTo(value: js.Any): Self = this.set("paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginatorDropdownAppendTo: Self = this.set("paginatorDropdownAppendTo", js.undefined)
    
    @scala.inline
    def setPaginatorLeft(value: js.Any): Self = this.set("paginatorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginatorLeft: Self = this.set("paginatorLeft", js.undefined)
    
    @scala.inline
    def setPaginatorPosition(value: String): Self = this.set("paginatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginatorPosition: Self = this.set("paginatorPosition", js.undefined)
    
    @scala.inline
    def setPaginatorRight(value: js.Any): Self = this.set("paginatorRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginatorRight: Self = this.set("paginatorRight", js.undefined)
    
    @scala.inline
    def setPaginatorTemplate(value: String): Self = this.set("paginatorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginatorTemplate: Self = this.set("paginatorTemplate", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRowsPerPageOptionsVarargs(value: Double*): Self = this.set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def setRowsPerPageOptions(value: js.Array[Double]): Self = this.set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsPerPageOptions: Self = this.set("rowsPerPageOptions", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: Double): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTotalRecords(value: Double): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
