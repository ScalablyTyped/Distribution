package typings.primereact

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
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("primereact/components/datatable/DataTable", "DataTable")
  @js.native
  class DataTable protected ()
    extends Component[DataTableProps, js.Any, js.Any] {
    def this(props: DataTableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataTableProps, context: js.Any) = this()
    
    def closeEditingCell(): Unit = js.native
    
    def exportCSV(): Unit = js.native
    
    def filter[T](value: T, field: String, mode: String): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetColumnOrder(): Unit = js.native
  }
  
  trait DataTableProps extends StObject {
    
    var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
    
    var autoLayout: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnResizeMode: js.UndefOr[String] = js.undefined
    
    var compareSelectionBy: js.UndefOr[String] = js.undefined
    
    var contextMenuSelection: js.UndefOr[js.Any] = js.undefined
    
    var csvSeparator: js.UndefOr[String] = js.undefined
    
    var currentPageReportTemplate: js.UndefOr[String] = js.undefined
    
    var customRestoreState: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var customSaveState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
    
    var dataKey: js.UndefOr[String] = js.undefined
    
    var defaultSortOrder: js.UndefOr[Double] = js.undefined
    
    var editMode: js.UndefOr[String] = js.undefined
    
    var emptyMessage: js.UndefOr[js.Any] = js.undefined
    
    var expandableRowGroups: js.UndefOr[Boolean] = js.undefined
    
    var expandedRows: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var exportFilename: js.UndefOr[String] = js.undefined
    
    var exportFunction: js.UndefOr[js.Function1[/* e */ DataField, js.Any]] = js.undefined
    
    var filterLocale: js.UndefOr[String] = js.undefined
    
    var filters: js.UndefOr[js.Object] = js.undefined
    
    var first: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var frozenValue: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var frozenWidth: js.UndefOr[String] = js.undefined
    
    var globalFilter: js.UndefOr[js.Any] = js.undefined
    
    var groupField: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var headerColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingIcon: js.UndefOr[String] = js.undefined
    
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    var multiSortMeta: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var onColReorder: js.UndefOr[js.Function1[/* e */ Columns, Unit]] = js.undefined
    
    var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.undefined
    
    var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* e */ Filters, Unit]] = js.undefined
    
    var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
    
    var onRowClick: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.undefined
    
    var onRowCollapse: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.undefined
    
    var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.undefined
    
    var onRowEditCancel: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.undefined
    
    var onRowEditInit: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.undefined
    
    var onRowEditSave: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.undefined
    
    var onRowExpand: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.undefined
    
    var onRowReorder: js.UndefOr[js.Function1[/* e */ DragIndex, Unit]] = js.undefined
    
    var onRowSelect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.undefined
    
    var onRowToggle: js.UndefOr[js.Function1[/* e */ DataArray, Unit]] = js.undefined
    
    var onRowUnselect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.undefined
    
    var onStateRestore: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
    
    var onStateSave: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[js.Any], Unit]] = js.undefined
    
    var onVirtualScroll: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
    
    var pageLinkSize: js.UndefOr[Double] = js.undefined
    
    var paginator: js.UndefOr[Boolean] = js.undefined
    
    var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.undefined
    
    var paginatorLeft: js.UndefOr[js.Any] = js.undefined
    
    var paginatorPosition: js.UndefOr[String] = js.undefined
    
    var paginatorRight: js.UndefOr[js.Any] = js.undefined
    
    var paginatorTemplate: js.UndefOr[String] = js.undefined
    
    var removableSort: js.UndefOr[Boolean] = js.undefined
    
    var reorderableColumns: js.UndefOr[Boolean] = js.undefined
    
    var resizableColumns: js.UndefOr[Boolean] = js.undefined
    
    var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
    
    var rowEditorValidator: js.UndefOr[js.Function1[/* rowData */ js.Any, Boolean]] = js.undefined
    
    var rowExpansionTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var rowGroupFooterTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[ReactNode]]] = js.undefined
    
    var rowGroupHeaderTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[ReactNode]]] = js.undefined
    
    var rowGroupMode: js.UndefOr[String] = js.undefined
    
    var rowHover: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var scrollHeight: js.UndefOr[String] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var selection: js.UndefOr[js.Any] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var showReorderElement: js.UndefOr[js.Function1[/* e */ Data, Boolean]] = js.undefined
    
    var showSelectionElement: js.UndefOr[js.Function1[/* e */ Data, Boolean]] = js.undefined
    
    var sortField: js.UndefOr[String] = js.undefined
    
    var sortMode: js.UndefOr[String] = js.undefined
    
    var sortOrder: js.UndefOr[Double] = js.undefined
    
    var stateKey: js.UndefOr[String] = js.undefined
    
    var stateStorage: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[String] = js.undefined
    
    var tableClassName: js.UndefOr[String] = js.undefined
    
    var tableStyle: js.UndefOr[js.Object] = js.undefined
    
    var totalRecords: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var virtualRowHeight: js.UndefOr[Double] = js.undefined
    
    var virtualScroll: js.UndefOr[Boolean] = js.undefined
    
    var virtualScrollDelay: js.UndefOr[Double] = js.undefined
  }
  object DataTableProps {
    
    inline def apply(): DataTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableProps]
    }
    
    extension [Self <: DataTableProps](x: Self) {
      
      inline def setAlwaysShowPaginator(value: Boolean): Self = StObject.set(x, "alwaysShowPaginator", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowPaginatorUndefined: Self = StObject.set(x, "alwaysShowPaginator", js.undefined)
      
      inline def setAutoLayout(value: Boolean): Self = StObject.set(x, "autoLayout", value.asInstanceOf[js.Any])
      
      inline def setAutoLayoutUndefined: Self = StObject.set(x, "autoLayout", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnResizeMode(value: String): Self = StObject.set(x, "columnResizeMode", value.asInstanceOf[js.Any])
      
      inline def setColumnResizeModeUndefined: Self = StObject.set(x, "columnResizeMode", js.undefined)
      
      inline def setCompareSelectionBy(value: String): Self = StObject.set(x, "compareSelectionBy", value.asInstanceOf[js.Any])
      
      inline def setCompareSelectionByUndefined: Self = StObject.set(x, "compareSelectionBy", js.undefined)
      
      inline def setContextMenuSelection(value: js.Any): Self = StObject.set(x, "contextMenuSelection", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSelectionUndefined: Self = StObject.set(x, "contextMenuSelection", js.undefined)
      
      inline def setCsvSeparator(value: String): Self = StObject.set(x, "csvSeparator", value.asInstanceOf[js.Any])
      
      inline def setCsvSeparatorUndefined: Self = StObject.set(x, "csvSeparator", js.undefined)
      
      inline def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      inline def setCustomRestoreState(value: () => js.Any): Self = StObject.set(x, "customRestoreState", js.Any.fromFunction0(value))
      
      inline def setCustomRestoreStateUndefined: Self = StObject.set(x, "customRestoreState", js.undefined)
      
      inline def setCustomSaveState(value: /* state */ js.Any => Unit): Self = StObject.set(x, "customSaveState", js.Any.fromFunction1(value))
      
      inline def setCustomSaveStateUndefined: Self = StObject.set(x, "customSaveState", js.undefined)
      
      inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setDefaultSortOrder(value: Double): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      inline def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      inline def setEditMode(value: String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setEmptyMessage(value: js.Any): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      inline def setExpandableRowGroups(value: Boolean): Self = StObject.set(x, "expandableRowGroups", value.asInstanceOf[js.Any])
      
      inline def setExpandableRowGroupsUndefined: Self = StObject.set(x, "expandableRowGroups", js.undefined)
      
      inline def setExpandedRows(value: js.Array[js.Any]): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
      
      inline def setExpandedRowsVarargs(value: js.Any*): Self = StObject.set(x, "expandedRows", js.Array(value :_*))
      
      inline def setExportFilename(value: String): Self = StObject.set(x, "exportFilename", value.asInstanceOf[js.Any])
      
      inline def setExportFilenameUndefined: Self = StObject.set(x, "exportFilename", js.undefined)
      
      inline def setExportFunction(value: /* e */ DataField => js.Any): Self = StObject.set(x, "exportFunction", js.Any.fromFunction1(value))
      
      inline def setExportFunctionUndefined: Self = StObject.set(x, "exportFunction", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilters(value: js.Object): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterColumnGroup(value: js.Any): Self = StObject.set(x, "footerColumnGroup", value.asInstanceOf[js.Any])
      
      inline def setFooterColumnGroupUndefined: Self = StObject.set(x, "footerColumnGroup", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFrozenFooterColumnGroup(value: js.Any): Self = StObject.set(x, "frozenFooterColumnGroup", value.asInstanceOf[js.Any])
      
      inline def setFrozenFooterColumnGroupUndefined: Self = StObject.set(x, "frozenFooterColumnGroup", js.undefined)
      
      inline def setFrozenHeaderColumnGroup(value: js.Any): Self = StObject.set(x, "frozenHeaderColumnGroup", value.asInstanceOf[js.Any])
      
      inline def setFrozenHeaderColumnGroupUndefined: Self = StObject.set(x, "frozenHeaderColumnGroup", js.undefined)
      
      inline def setFrozenValue(value: js.Array[js.Any]): Self = StObject.set(x, "frozenValue", value.asInstanceOf[js.Any])
      
      inline def setFrozenValueUndefined: Self = StObject.set(x, "frozenValue", js.undefined)
      
      inline def setFrozenValueVarargs(value: js.Any*): Self = StObject.set(x, "frozenValue", js.Array(value :_*))
      
      inline def setFrozenWidth(value: String): Self = StObject.set(x, "frozenWidth", value.asInstanceOf[js.Any])
      
      inline def setFrozenWidthUndefined: Self = StObject.set(x, "frozenWidth", js.undefined)
      
      inline def setGlobalFilter(value: js.Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
      
      inline def setGlobalFilterUndefined: Self = StObject.set(x, "globalFilter", js.undefined)
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderColumnGroup(value: js.Any): Self = StObject.set(x, "headerColumnGroup", value.asInstanceOf[js.Any])
      
      inline def setHeaderColumnGroupUndefined: Self = StObject.set(x, "headerColumnGroup", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      inline def setMultiSortMeta(value: js.Array[js.Any]): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
      
      inline def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
      
      inline def setMultiSortMetaVarargs(value: js.Any*): Self = StObject.set(x, "multiSortMeta", js.Array(value :_*))
      
      inline def setOnColReorder(value: /* e */ Columns => Unit): Self = StObject.set(x, "onColReorder", js.Any.fromFunction1(value))
      
      inline def setOnColReorderUndefined: Self = StObject.set(x, "onColReorder", js.undefined)
      
      inline def setOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = StObject.set(x, "onColumnResizeEnd", js.Any.fromFunction1(value))
      
      inline def setOnColumnResizeEndUndefined: Self = StObject.set(x, "onColumnResizeEnd", js.undefined)
      
      inline def setOnContextMenu(value: /* e */ DataOriginalEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFilter(value: /* e */ Filters => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOnPage(value: /* e */ First => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
      
      inline def setOnPageUndefined: Self = StObject.set(x, "onPage", js.undefined)
      
      inline def setOnRowClick(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowCollapse(value: /* e */ DataOriginalEvent => Unit): Self = StObject.set(x, "onRowCollapse", js.Any.fromFunction1(value))
      
      inline def setOnRowCollapseUndefined: Self = StObject.set(x, "onRowCollapse", js.undefined)
      
      inline def setOnRowDoubleClick(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
      
      inline def setOnRowEditCancel(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowEditCancel", js.Any.fromFunction1(value))
      
      inline def setOnRowEditCancelUndefined: Self = StObject.set(x, "onRowEditCancel", js.undefined)
      
      inline def setOnRowEditInit(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowEditInit", js.Any.fromFunction1(value))
      
      inline def setOnRowEditInitUndefined: Self = StObject.set(x, "onRowEditInit", js.undefined)
      
      inline def setOnRowEditSave(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowEditSave", js.Any.fromFunction1(value))
      
      inline def setOnRowEditSaveUndefined: Self = StObject.set(x, "onRowEditSave", js.undefined)
      
      inline def setOnRowExpand(value: /* e */ DataOriginalEvent => Unit): Self = StObject.set(x, "onRowExpand", js.Any.fromFunction1(value))
      
      inline def setOnRowExpandUndefined: Self = StObject.set(x, "onRowExpand", js.undefined)
      
      inline def setOnRowReorder(value: /* e */ DragIndex => Unit): Self = StObject.set(x, "onRowReorder", js.Any.fromFunction1(value))
      
      inline def setOnRowReorderUndefined: Self = StObject.set(x, "onRowReorder", js.undefined)
      
      inline def setOnRowSelect(value: /* e */ Type => Unit): Self = StObject.set(x, "onRowSelect", js.Any.fromFunction1(value))
      
      inline def setOnRowSelectUndefined: Self = StObject.set(x, "onRowSelect", js.undefined)
      
      inline def setOnRowToggle(value: /* e */ DataArray => Unit): Self = StObject.set(x, "onRowToggle", js.Any.fromFunction1(value))
      
      inline def setOnRowToggleUndefined: Self = StObject.set(x, "onRowToggle", js.undefined)
      
      inline def setOnRowUnselect(value: /* e */ Type => Unit): Self = StObject.set(x, "onRowUnselect", js.Any.fromFunction1(value))
      
      inline def setOnRowUnselectUndefined: Self = StObject.set(x, "onRowUnselect", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnSort(value: /* e */ MultiSortMeta => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnStateRestore(value: /* state */ js.Any => Unit): Self = StObject.set(x, "onStateRestore", js.Any.fromFunction1(value))
      
      inline def setOnStateRestoreUndefined: Self = StObject.set(x, "onStateRestore", js.undefined)
      
      inline def setOnStateSave(value: /* state */ js.Any => Unit): Self = StObject.set(x, "onStateSave", js.Any.fromFunction1(value))
      
      inline def setOnStateSaveUndefined: Self = StObject.set(x, "onStateSave", js.undefined)
      
      inline def setOnValueChange(value: /* value */ js.Array[js.Any] => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setOnVirtualScroll(value: /* e */ First => Unit): Self = StObject.set(x, "onVirtualScroll", js.Any.fromFunction1(value))
      
      inline def setOnVirtualScrollUndefined: Self = StObject.set(x, "onVirtualScroll", js.undefined)
      
      inline def setPageLinkSize(value: Double): Self = StObject.set(x, "pageLinkSize", value.asInstanceOf[js.Any])
      
      inline def setPageLinkSizeUndefined: Self = StObject.set(x, "pageLinkSize", js.undefined)
      
      inline def setPaginator(value: Boolean): Self = StObject.set(x, "paginator", value.asInstanceOf[js.Any])
      
      inline def setPaginatorDropdownAppendTo(value: js.Any): Self = StObject.set(x, "paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
      
      inline def setPaginatorDropdownAppendToUndefined: Self = StObject.set(x, "paginatorDropdownAppendTo", js.undefined)
      
      inline def setPaginatorLeft(value: js.Any): Self = StObject.set(x, "paginatorLeft", value.asInstanceOf[js.Any])
      
      inline def setPaginatorLeftUndefined: Self = StObject.set(x, "paginatorLeft", js.undefined)
      
      inline def setPaginatorPosition(value: String): Self = StObject.set(x, "paginatorPosition", value.asInstanceOf[js.Any])
      
      inline def setPaginatorPositionUndefined: Self = StObject.set(x, "paginatorPosition", js.undefined)
      
      inline def setPaginatorRight(value: js.Any): Self = StObject.set(x, "paginatorRight", value.asInstanceOf[js.Any])
      
      inline def setPaginatorRightUndefined: Self = StObject.set(x, "paginatorRight", js.undefined)
      
      inline def setPaginatorTemplate(value: String): Self = StObject.set(x, "paginatorTemplate", value.asInstanceOf[js.Any])
      
      inline def setPaginatorTemplateUndefined: Self = StObject.set(x, "paginatorTemplate", js.undefined)
      
      inline def setPaginatorUndefined: Self = StObject.set(x, "paginator", js.undefined)
      
      inline def setRemovableSort(value: Boolean): Self = StObject.set(x, "removableSort", value.asInstanceOf[js.Any])
      
      inline def setRemovableSortUndefined: Self = StObject.set(x, "removableSort", js.undefined)
      
      inline def setReorderableColumns(value: Boolean): Self = StObject.set(x, "reorderableColumns", value.asInstanceOf[js.Any])
      
      inline def setReorderableColumnsUndefined: Self = StObject.set(x, "reorderableColumns", js.undefined)
      
      inline def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
      
      inline def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
      
      inline def setRowClassName(value: /* rowData */ js.Any => js.Object): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      inline def setRowEditorValidator(value: /* rowData */ js.Any => Boolean): Self = StObject.set(x, "rowEditorValidator", js.Any.fromFunction1(value))
      
      inline def setRowEditorValidatorUndefined: Self = StObject.set(x, "rowEditorValidator", js.undefined)
      
      inline def setRowExpansionTemplate(value: /* data */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "rowExpansionTemplate", js.Any.fromFunction1(value))
      
      inline def setRowExpansionTemplateUndefined: Self = StObject.set(x, "rowExpansionTemplate", js.undefined)
      
      inline def setRowGroupFooterTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode]): Self = StObject.set(x, "rowGroupFooterTemplate", js.Any.fromFunction2(value))
      
      inline def setRowGroupFooterTemplateUndefined: Self = StObject.set(x, "rowGroupFooterTemplate", js.undefined)
      
      inline def setRowGroupHeaderTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode]): Self = StObject.set(x, "rowGroupHeaderTemplate", js.Any.fromFunction2(value))
      
      inline def setRowGroupHeaderTemplateUndefined: Self = StObject.set(x, "rowGroupHeaderTemplate", js.undefined)
      
      inline def setRowGroupMode(value: String): Self = StObject.set(x, "rowGroupMode", value.asInstanceOf[js.Any])
      
      inline def setRowGroupModeUndefined: Self = StObject.set(x, "rowGroupMode", js.undefined)
      
      inline def setRowHover(value: Boolean): Self = StObject.set(x, "rowHover", value.asInstanceOf[js.Any])
      
      inline def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      inline def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setSelection(value: js.Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setShowReorderElement(value: /* e */ Data => Boolean): Self = StObject.set(x, "showReorderElement", js.Any.fromFunction1(value))
      
      inline def setShowReorderElementUndefined: Self = StObject.set(x, "showReorderElement", js.undefined)
      
      inline def setShowSelectionElement(value: /* e */ Data => Boolean): Self = StObject.set(x, "showSelectionElement", js.Any.fromFunction1(value))
      
      inline def setShowSelectionElementUndefined: Self = StObject.set(x, "showSelectionElement", js.undefined)
      
      inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      inline def setSortMode(value: String): Self = StObject.set(x, "sortMode", value.asInstanceOf[js.Any])
      
      inline def setSortModeUndefined: Self = StObject.set(x, "sortMode", js.undefined)
      
      inline def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setStateKey(value: String): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
      
      inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      
      inline def setStateStorage(value: String): Self = StObject.set(x, "stateStorage", value.asInstanceOf[js.Any])
      
      inline def setStateStorageUndefined: Self = StObject.set(x, "stateStorage", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTableClassName(value: String): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
      
      inline def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
      
      inline def setTableStyle(value: js.Object): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
      
      inline def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
      
      inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVirtualRowHeight(value: Double): Self = StObject.set(x, "virtualRowHeight", value.asInstanceOf[js.Any])
      
      inline def setVirtualRowHeightUndefined: Self = StObject.set(x, "virtualRowHeight", js.undefined)
      
      inline def setVirtualScroll(value: Boolean): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollDelay(value: Double): Self = StObject.set(x, "virtualScrollDelay", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollDelayUndefined: Self = StObject.set(x, "virtualScrollDelay", js.undefined)
      
      inline def setVirtualScrollUndefined: Self = StObject.set(x, "virtualScroll", js.undefined)
    }
  }
}
