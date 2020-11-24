package typings.primereact.dataTableMod

import typings.primereact.anon.Columns
import typings.primereact.anon.Data
import typings.primereact.anon.DataArray
import typings.primereact.anon.DataField
import typings.primereact.anon.DataIndex
import typings.primereact.anon.DataOriginalEvent
import typings.primereact.anon.Delta
import typings.primereact.anon.DragIndex
import typings.primereact.anon.Filters
import typings.primereact.anon.First
import typings.primereact.anon.MultiSortMeta
import typings.primereact.anon.Type
import typings.primereact.anon.Value
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTableProps extends js.Object {
  
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
  
  var autoLayout: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnResizeMode: js.UndefOr[String] = js.native
  
  var compareSelectionBy: js.UndefOr[String] = js.native
  
  var contextMenuSelection: js.UndefOr[js.Any] = js.native
  
  var csvSeparator: js.UndefOr[String] = js.native
  
  var currentPageReportTemplate: js.UndefOr[String] = js.native
  
  var customRestoreState: js.UndefOr[js.Function0[_]] = js.native
  
  var customSaveState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  
  var dataKey: js.UndefOr[String] = js.native
  
  var defaultSortOrder: js.UndefOr[Double] = js.native
  
  var editMode: js.UndefOr[String] = js.native
  
  var emptyMessage: js.UndefOr[js.Any] = js.native
  
  var expandableRowGroups: js.UndefOr[Boolean] = js.native
  
  var expandedRows: js.UndefOr[js.Array[_]] = js.native
  
  var exportFilename: js.UndefOr[String] = js.native
  
  var exportFunction: js.UndefOr[js.Function1[/* e */ DataField, _]] = js.native
  
  var filterLocale: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[js.Object] = js.native
  
  var first: js.UndefOr[Double] = js.native
  
  var footer: js.UndefOr[js.Any] = js.native
  
  var footerColumnGroup: js.UndefOr[js.Any] = js.native
  
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.native
  
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.native
  
  var frozenValue: js.UndefOr[js.Array[_]] = js.native
  
  var frozenWidth: js.UndefOr[String] = js.native
  
  var globalFilter: js.UndefOr[js.Any] = js.native
  
  var groupField: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  var headerColumnGroup: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var loadingIcon: js.UndefOr[String] = js.native
  
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.native
  
  var onColReorder: js.UndefOr[js.Function1[/* e */ Columns, Unit]] = js.native
  
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.native
  
  var onContextMenu: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onFilter: js.UndefOr[js.Function1[/* e */ Filters, Unit]] = js.native
  
  var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
  
  var onRowClick: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  
  var onRowCollapse: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  
  var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  
  var onRowEditCancel: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  
  var onRowEditInit: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  
  var onRowEditSave: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  
  var onRowExpand: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  
  var onRowReorder: js.UndefOr[js.Function1[/* e */ DragIndex, Unit]] = js.native
  
  var onRowSelect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.native
  
  var onRowToggle: js.UndefOr[js.Function1[/* e */ DataArray, Unit]] = js.native
  
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.native
  
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  
  var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.native
  
  var onStateRestore: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  
  var onStateSave: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], Unit]] = js.native
  
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
  
  var pageLinkSize: js.UndefOr[Double] = js.native
  
  var paginator: js.UndefOr[Boolean] = js.native
  
  var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.native
  
  var paginatorLeft: js.UndefOr[js.Any] = js.native
  
  var paginatorPosition: js.UndefOr[String] = js.native
  
  var paginatorRight: js.UndefOr[js.Any] = js.native
  
  var paginatorTemplate: js.UndefOr[String] = js.native
  
  var removableSort: js.UndefOr[Boolean] = js.native
  
  var reorderableColumns: js.UndefOr[Boolean] = js.native
  
  var resizableColumns: js.UndefOr[Boolean] = js.native
  
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.native
  
  var rowEditorValidator: js.UndefOr[js.Function1[/* rowData */ js.Any, Boolean]] = js.native
  
  var rowExpansionTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.native
  
  var rowGroupFooterTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[ReactNode]]] = js.native
  
  var rowGroupHeaderTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[ReactNode]]] = js.native
  
  var rowGroupMode: js.UndefOr[String] = js.native
  
  var rowHover: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  
  var scrollHeight: js.UndefOr[String] = js.native
  
  var scrollable: js.UndefOr[Boolean] = js.native
  
  var selection: js.UndefOr[js.Any] = js.native
  
  var selectionMode: js.UndefOr[String] = js.native
  
  var showReorderElement: js.UndefOr[js.Function1[/* e */ Data, Boolean]] = js.native
  
  var showSelectionElement: js.UndefOr[js.Function1[/* e */ Data, Boolean]] = js.native
  
  var sortField: js.UndefOr[String] = js.native
  
  var sortMode: js.UndefOr[String] = js.native
  
  var sortOrder: js.UndefOr[Double] = js.native
  
  var stateKey: js.UndefOr[String] = js.native
  
  var stateStorage: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tabIndex: js.UndefOr[String] = js.native
  
  var tableClassName: js.UndefOr[String] = js.native
  
  var tableStyle: js.UndefOr[js.Object] = js.native
  
  var totalRecords: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
  
  var virtualRowHeight: js.UndefOr[Double] = js.native
  
  var virtualScroll: js.UndefOr[Boolean] = js.native
  
  var virtualScrollDelay: js.UndefOr[Double] = js.native
}
object DataTableProps {
  
  @scala.inline
  def apply(): DataTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableProps]
  }
  
  @scala.inline
  implicit class DataTablePropsOps[Self <: DataTableProps] (val x: Self) extends AnyVal {
    
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
    def setAutoLayout(value: Boolean): Self = this.set("autoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLayout: Self = this.set("autoLayout", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnResizeMode(value: String): Self = this.set("columnResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResizeMode: Self = this.set("columnResizeMode", js.undefined)
    
    @scala.inline
    def setCompareSelectionBy(value: String): Self = this.set("compareSelectionBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareSelectionBy: Self = this.set("compareSelectionBy", js.undefined)
    
    @scala.inline
    def setContextMenuSelection(value: js.Any): Self = this.set("contextMenuSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuSelection: Self = this.set("contextMenuSelection", js.undefined)
    
    @scala.inline
    def setCsvSeparator(value: String): Self = this.set("csvSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvSeparator: Self = this.set("csvSeparator", js.undefined)
    
    @scala.inline
    def setCurrentPageReportTemplate(value: String): Self = this.set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageReportTemplate: Self = this.set("currentPageReportTemplate", js.undefined)
    
    @scala.inline
    def setCustomRestoreState(value: () => _): Self = this.set("customRestoreState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCustomRestoreState: Self = this.set("customRestoreState", js.undefined)
    
    @scala.inline
    def setCustomSaveState(value: /* state */ js.Any => Unit): Self = this.set("customSaveState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomSaveState: Self = this.set("customSaveState", js.undefined)
    
    @scala.inline
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    
    @scala.inline
    def setDefaultSortOrder(value: Double): Self = this.set("defaultSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSortOrder: Self = this.set("defaultSortOrder", js.undefined)
    
    @scala.inline
    def setEditMode(value: String): Self = this.set("editMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    
    @scala.inline
    def setEmptyMessage(value: js.Any): Self = this.set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyMessage: Self = this.set("emptyMessage", js.undefined)
    
    @scala.inline
    def setExpandableRowGroups(value: Boolean): Self = this.set("expandableRowGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowGroups: Self = this.set("expandableRowGroups", js.undefined)
    
    @scala.inline
    def setExpandedRowsVarargs(value: js.Any*): Self = this.set("expandedRows", js.Array(value :_*))
    
    @scala.inline
    def setExpandedRows(value: js.Array[_]): Self = this.set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedRows: Self = this.set("expandedRows", js.undefined)
    
    @scala.inline
    def setExportFilename(value: String): Self = this.set("exportFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportFilename: Self = this.set("exportFilename", js.undefined)
    
    @scala.inline
    def setExportFunction(value: /* e */ DataField => _): Self = this.set("exportFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExportFunction: Self = this.set("exportFunction", js.undefined)
    
    @scala.inline
    def setFilterLocale(value: String): Self = this.set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterLocale: Self = this.set("filterLocale", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Object): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterColumnGroup(value: js.Any): Self = this.set("footerColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterColumnGroup: Self = this.set("footerColumnGroup", js.undefined)
    
    @scala.inline
    def setFrozenFooterColumnGroup(value: js.Any): Self = this.set("frozenFooterColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenFooterColumnGroup: Self = this.set("frozenFooterColumnGroup", js.undefined)
    
    @scala.inline
    def setFrozenHeaderColumnGroup(value: js.Any): Self = this.set("frozenHeaderColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenHeaderColumnGroup: Self = this.set("frozenHeaderColumnGroup", js.undefined)
    
    @scala.inline
    def setFrozenValueVarargs(value: js.Any*): Self = this.set("frozenValue", js.Array(value :_*))
    
    @scala.inline
    def setFrozenValue(value: js.Array[_]): Self = this.set("frozenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenValue: Self = this.set("frozenValue", js.undefined)
    
    @scala.inline
    def setFrozenWidth(value: String): Self = this.set("frozenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenWidth: Self = this.set("frozenWidth", js.undefined)
    
    @scala.inline
    def setGlobalFilter(value: js.Any): Self = this.set("globalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalFilter: Self = this.set("globalFilter", js.undefined)
    
    @scala.inline
    def setGroupField(value: String): Self = this.set("groupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupField: Self = this.set("groupField", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderColumnGroup(value: js.Any): Self = this.set("headerColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColumnGroup: Self = this.set("headerColumnGroup", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
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
    def setMetaKeySelection(value: Boolean): Self = this.set("metaKeySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaKeySelection: Self = this.set("metaKeySelection", js.undefined)
    
    @scala.inline
    def setMultiSortMetaVarargs(value: js.Any*): Self = this.set("multiSortMeta", js.Array(value :_*))
    
    @scala.inline
    def setMultiSortMeta(value: js.Array[_]): Self = this.set("multiSortMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSortMeta: Self = this.set("multiSortMeta", js.undefined)
    
    @scala.inline
    def setOnColReorder(value: /* e */ Columns => Unit): Self = this.set("onColReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnColReorder: Self = this.set("onColReorder", js.undefined)
    
    @scala.inline
    def setOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = this.set("onColumnResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnColumnResizeEnd: Self = this.set("onColumnResizeEnd", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* e */ DataOriginalEvent => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = this.set("onContextMenuSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenuSelectionChange: Self = this.set("onContextMenuSelectionChange", js.undefined)
    
    @scala.inline
    def setOnFilter(value: /* e */ Filters => Unit): Self = this.set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    
    @scala.inline
    def setOnPage(value: /* e */ First => Unit): Self = this.set("onPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPage: Self = this.set("onPage", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: /* e */ DataIndex => Unit): Self = this.set("onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowCollapse(value: /* e */ DataOriginalEvent => Unit): Self = this.set("onRowCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowCollapse: Self = this.set("onRowCollapse", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: /* e */ DataIndex => Unit): Self = this.set("onRowDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowDoubleClick: Self = this.set("onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowEditCancel(value: /* e */ DataIndex => Unit): Self = this.set("onRowEditCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowEditCancel: Self = this.set("onRowEditCancel", js.undefined)
    
    @scala.inline
    def setOnRowEditInit(value: /* e */ DataIndex => Unit): Self = this.set("onRowEditInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowEditInit: Self = this.set("onRowEditInit", js.undefined)
    
    @scala.inline
    def setOnRowEditSave(value: /* e */ DataIndex => Unit): Self = this.set("onRowEditSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowEditSave: Self = this.set("onRowEditSave", js.undefined)
    
    @scala.inline
    def setOnRowExpand(value: /* e */ DataOriginalEvent => Unit): Self = this.set("onRowExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowExpand: Self = this.set("onRowExpand", js.undefined)
    
    @scala.inline
    def setOnRowReorder(value: /* e */ DragIndex => Unit): Self = this.set("onRowReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowReorder: Self = this.set("onRowReorder", js.undefined)
    
    @scala.inline
    def setOnRowSelect(value: /* e */ Type => Unit): Self = this.set("onRowSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowSelect: Self = this.set("onRowSelect", js.undefined)
    
    @scala.inline
    def setOnRowToggle(value: /* e */ DataArray => Unit): Self = this.set("onRowToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowToggle: Self = this.set("onRowToggle", js.undefined)
    
    @scala.inline
    def setOnRowUnselect(value: /* e */ Type => Unit): Self = this.set("onRowUnselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowUnselect: Self = this.set("onRowUnselect", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: /* e */ Value => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnSort(value: /* e */ MultiSortMeta => Unit): Self = this.set("onSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    
    @scala.inline
    def setOnStateRestore(value: /* state */ js.Any => Unit): Self = this.set("onStateRestore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateRestore: Self = this.set("onStateRestore", js.undefined)
    
    @scala.inline
    def setOnStateSave(value: /* state */ js.Any => Unit): Self = this.set("onStateSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateSave: Self = this.set("onStateSave", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ js.Array[_] => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setOnVirtualScroll(value: /* e */ First => Unit): Self = this.set("onVirtualScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVirtualScroll: Self = this.set("onVirtualScroll", js.undefined)
    
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
    def setRemovableSort(value: Boolean): Self = this.set("removableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovableSort: Self = this.set("removableSort", js.undefined)
    
    @scala.inline
    def setReorderableColumns(value: Boolean): Self = this.set("reorderableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorderableColumns: Self = this.set("reorderableColumns", js.undefined)
    
    @scala.inline
    def setResizableColumns(value: Boolean): Self = this.set("resizableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizableColumns: Self = this.set("resizableColumns", js.undefined)
    
    @scala.inline
    def setRowClassName(value: /* rowData */ js.Any => js.Object): Self = this.set("rowClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
    
    @scala.inline
    def setRowEditorValidator(value: /* rowData */ js.Any => Boolean): Self = this.set("rowEditorValidator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowEditorValidator: Self = this.set("rowEditorValidator", js.undefined)
    
    @scala.inline
    def setRowExpansionTemplate(value: /* data */ js.Any => js.UndefOr[Element]): Self = this.set("rowExpansionTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowExpansionTemplate: Self = this.set("rowExpansionTemplate", js.undefined)
    
    @scala.inline
    def setRowGroupFooterTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode]): Self = this.set("rowGroupFooterTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRowGroupFooterTemplate: Self = this.set("rowGroupFooterTemplate", js.undefined)
    
    @scala.inline
    def setRowGroupHeaderTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode]): Self = this.set("rowGroupHeaderTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRowGroupHeaderTemplate: Self = this.set("rowGroupHeaderTemplate", js.undefined)
    
    @scala.inline
    def setRowGroupMode(value: String): Self = this.set("rowGroupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGroupMode: Self = this.set("rowGroupMode", js.undefined)
    
    @scala.inline
    def setRowHover(value: Boolean): Self = this.set("rowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHover: Self = this.set("rowHover", js.undefined)
    
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
    def setScrollHeight(value: String): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowReorderElement(value: /* e */ Data => Boolean): Self = this.set("showReorderElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShowReorderElement: Self = this.set("showReorderElement", js.undefined)
    
    @scala.inline
    def setShowSelectionElement(value: /* e */ Data => Boolean): Self = this.set("showSelectionElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShowSelectionElement: Self = this.set("showSelectionElement", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    
    @scala.inline
    def setSortMode(value: String): Self = this.set("sortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortMode: Self = this.set("sortMode", js.undefined)
    
    @scala.inline
    def setSortOrder(value: Double): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setStateKey(value: String): Self = this.set("stateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateKey: Self = this.set("stateKey", js.undefined)
    
    @scala.inline
    def setStateStorage(value: String): Self = this.set("stateStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateStorage: Self = this.set("stateStorage", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTableClassName(value: String): Self = this.set("tableClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableClassName: Self = this.set("tableClassName", js.undefined)
    
    @scala.inline
    def setTableStyle(value: js.Object): Self = this.set("tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStyle: Self = this.set("tableStyle", js.undefined)
    
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
    
    @scala.inline
    def setVirtualRowHeight(value: Double): Self = this.set("virtualRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualRowHeight: Self = this.set("virtualRowHeight", js.undefined)
    
    @scala.inline
    def setVirtualScroll(value: Boolean): Self = this.set("virtualScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualScroll: Self = this.set("virtualScroll", js.undefined)
    
    @scala.inline
    def setVirtualScrollDelay(value: Double): Self = this.set("virtualScrollDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualScrollDelay: Self = this.set("virtualScrollDelay", js.undefined)
  }
}
