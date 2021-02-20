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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DataTableProps extends StObject {
    
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
    implicit class DataTablePropsMutableBuilder[Self <: DataTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowPaginator(value: Boolean): Self = StObject.set(x, "alwaysShowPaginator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowPaginatorUndefined: Self = StObject.set(x, "alwaysShowPaginator", js.undefined)
      
      @scala.inline
      def setAutoLayout(value: Boolean): Self = StObject.set(x, "autoLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLayoutUndefined: Self = StObject.set(x, "autoLayout", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumnResizeMode(value: String): Self = StObject.set(x, "columnResizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnResizeModeUndefined: Self = StObject.set(x, "columnResizeMode", js.undefined)
      
      @scala.inline
      def setCompareSelectionBy(value: String): Self = StObject.set(x, "compareSelectionBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareSelectionByUndefined: Self = StObject.set(x, "compareSelectionBy", js.undefined)
      
      @scala.inline
      def setContextMenuSelection(value: js.Any): Self = StObject.set(x, "contextMenuSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSelectionUndefined: Self = StObject.set(x, "contextMenuSelection", js.undefined)
      
      @scala.inline
      def setCsvSeparator(value: String): Self = StObject.set(x, "csvSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvSeparatorUndefined: Self = StObject.set(x, "csvSeparator", js.undefined)
      
      @scala.inline
      def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      @scala.inline
      def setCustomRestoreState(value: () => _): Self = StObject.set(x, "customRestoreState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCustomRestoreStateUndefined: Self = StObject.set(x, "customRestoreState", js.undefined)
      
      @scala.inline
      def setCustomSaveState(value: /* state */ js.Any => Unit): Self = StObject.set(x, "customSaveState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomSaveStateUndefined: Self = StObject.set(x, "customSaveState", js.undefined)
      
      @scala.inline
      def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      @scala.inline
      def setDefaultSortOrder(value: Double): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      @scala.inline
      def setEditMode(value: String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      @scala.inline
      def setEmptyMessage(value: js.Any): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      @scala.inline
      def setExpandableRowGroups(value: Boolean): Self = StObject.set(x, "expandableRowGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableRowGroupsUndefined: Self = StObject.set(x, "expandableRowGroups", js.undefined)
      
      @scala.inline
      def setExpandedRows(value: js.Array[_]): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
      
      @scala.inline
      def setExpandedRowsVarargs(value: js.Any*): Self = StObject.set(x, "expandedRows", js.Array(value :_*))
      
      @scala.inline
      def setExportFilename(value: String): Self = StObject.set(x, "exportFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportFilenameUndefined: Self = StObject.set(x, "exportFilename", js.undefined)
      
      @scala.inline
      def setExportFunction(value: /* e */ DataField => _): Self = StObject.set(x, "exportFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExportFunctionUndefined: Self = StObject.set(x, "exportFunction", js.undefined)
      
      @scala.inline
      def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Object): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterColumnGroup(value: js.Any): Self = StObject.set(x, "footerColumnGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterColumnGroupUndefined: Self = StObject.set(x, "footerColumnGroup", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFrozenFooterColumnGroup(value: js.Any): Self = StObject.set(x, "frozenFooterColumnGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenFooterColumnGroupUndefined: Self = StObject.set(x, "frozenFooterColumnGroup", js.undefined)
      
      @scala.inline
      def setFrozenHeaderColumnGroup(value: js.Any): Self = StObject.set(x, "frozenHeaderColumnGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenHeaderColumnGroupUndefined: Self = StObject.set(x, "frozenHeaderColumnGroup", js.undefined)
      
      @scala.inline
      def setFrozenValue(value: js.Array[_]): Self = StObject.set(x, "frozenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenValueUndefined: Self = StObject.set(x, "frozenValue", js.undefined)
      
      @scala.inline
      def setFrozenValueVarargs(value: js.Any*): Self = StObject.set(x, "frozenValue", js.Array(value :_*))
      
      @scala.inline
      def setFrozenWidth(value: String): Self = StObject.set(x, "frozenWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenWidthUndefined: Self = StObject.set(x, "frozenWidth", js.undefined)
      
      @scala.inline
      def setGlobalFilter(value: js.Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalFilterUndefined: Self = StObject.set(x, "globalFilter", js.undefined)
      
      @scala.inline
      def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColumnGroup(value: js.Any): Self = StObject.set(x, "headerColumnGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColumnGroupUndefined: Self = StObject.set(x, "headerColumnGroup", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      @scala.inline
      def setMultiSortMeta(value: js.Array[_]): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
      
      @scala.inline
      def setMultiSortMetaVarargs(value: js.Any*): Self = StObject.set(x, "multiSortMeta", js.Array(value :_*))
      
      @scala.inline
      def setOnColReorder(value: /* e */ Columns => Unit): Self = StObject.set(x, "onColReorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColReorderUndefined: Self = StObject.set(x, "onColReorder", js.undefined)
      
      @scala.inline
      def setOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = StObject.set(x, "onColumnResizeEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnResizeEndUndefined: Self = StObject.set(x, "onColumnResizeEnd", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* e */ DataOriginalEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* e */ Filters => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOnPage(value: /* e */ First => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageUndefined: Self = StObject.set(x, "onPage", js.undefined)
      
      @scala.inline
      def setOnRowClick(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      @scala.inline
      def setOnRowCollapse(value: /* e */ DataOriginalEvent => Unit): Self = StObject.set(x, "onRowCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowCollapseUndefined: Self = StObject.set(x, "onRowCollapse", js.undefined)
      
      @scala.inline
      def setOnRowDoubleClick(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
      
      @scala.inline
      def setOnRowEditCancel(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowEditCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowEditCancelUndefined: Self = StObject.set(x, "onRowEditCancel", js.undefined)
      
      @scala.inline
      def setOnRowEditInit(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowEditInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowEditInitUndefined: Self = StObject.set(x, "onRowEditInit", js.undefined)
      
      @scala.inline
      def setOnRowEditSave(value: /* e */ DataIndex => Unit): Self = StObject.set(x, "onRowEditSave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowEditSaveUndefined: Self = StObject.set(x, "onRowEditSave", js.undefined)
      
      @scala.inline
      def setOnRowExpand(value: /* e */ DataOriginalEvent => Unit): Self = StObject.set(x, "onRowExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowExpandUndefined: Self = StObject.set(x, "onRowExpand", js.undefined)
      
      @scala.inline
      def setOnRowReorder(value: /* e */ DragIndex => Unit): Self = StObject.set(x, "onRowReorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowReorderUndefined: Self = StObject.set(x, "onRowReorder", js.undefined)
      
      @scala.inline
      def setOnRowSelect(value: /* e */ Type => Unit): Self = StObject.set(x, "onRowSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSelectUndefined: Self = StObject.set(x, "onRowSelect", js.undefined)
      
      @scala.inline
      def setOnRowToggle(value: /* e */ DataArray => Unit): Self = StObject.set(x, "onRowToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowToggleUndefined: Self = StObject.set(x, "onRowToggle", js.undefined)
      
      @scala.inline
      def setOnRowUnselect(value: /* e */ Type => Unit): Self = StObject.set(x, "onRowUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowUnselectUndefined: Self = StObject.set(x, "onRowUnselect", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnSort(value: /* e */ MultiSortMeta => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      @scala.inline
      def setOnStateRestore(value: /* state */ js.Any => Unit): Self = StObject.set(x, "onStateRestore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateRestoreUndefined: Self = StObject.set(x, "onStateRestore", js.undefined)
      
      @scala.inline
      def setOnStateSave(value: /* state */ js.Any => Unit): Self = StObject.set(x, "onStateSave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateSaveUndefined: Self = StObject.set(x, "onStateSave", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Array[_] => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setOnVirtualScroll(value: /* e */ First => Unit): Self = StObject.set(x, "onVirtualScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVirtualScrollUndefined: Self = StObject.set(x, "onVirtualScroll", js.undefined)
      
      @scala.inline
      def setPageLinkSize(value: Double): Self = StObject.set(x, "pageLinkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLinkSizeUndefined: Self = StObject.set(x, "pageLinkSize", js.undefined)
      
      @scala.inline
      def setPaginator(value: Boolean): Self = StObject.set(x, "paginator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorDropdownAppendTo(value: js.Any): Self = StObject.set(x, "paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorDropdownAppendToUndefined: Self = StObject.set(x, "paginatorDropdownAppendTo", js.undefined)
      
      @scala.inline
      def setPaginatorLeft(value: js.Any): Self = StObject.set(x, "paginatorLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorLeftUndefined: Self = StObject.set(x, "paginatorLeft", js.undefined)
      
      @scala.inline
      def setPaginatorPosition(value: String): Self = StObject.set(x, "paginatorPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorPositionUndefined: Self = StObject.set(x, "paginatorPosition", js.undefined)
      
      @scala.inline
      def setPaginatorRight(value: js.Any): Self = StObject.set(x, "paginatorRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorRightUndefined: Self = StObject.set(x, "paginatorRight", js.undefined)
      
      @scala.inline
      def setPaginatorTemplate(value: String): Self = StObject.set(x, "paginatorTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorTemplateUndefined: Self = StObject.set(x, "paginatorTemplate", js.undefined)
      
      @scala.inline
      def setPaginatorUndefined: Self = StObject.set(x, "paginator", js.undefined)
      
      @scala.inline
      def setRemovableSort(value: Boolean): Self = StObject.set(x, "removableSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableSortUndefined: Self = StObject.set(x, "removableSort", js.undefined)
      
      @scala.inline
      def setReorderableColumns(value: Boolean): Self = StObject.set(x, "reorderableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderableColumnsUndefined: Self = StObject.set(x, "reorderableColumns", js.undefined)
      
      @scala.inline
      def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
      
      @scala.inline
      def setRowClassName(value: /* rowData */ js.Any => js.Object): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setRowEditorValidator(value: /* rowData */ js.Any => Boolean): Self = StObject.set(x, "rowEditorValidator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowEditorValidatorUndefined: Self = StObject.set(x, "rowEditorValidator", js.undefined)
      
      @scala.inline
      def setRowExpansionTemplate(value: /* data */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "rowExpansionTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowExpansionTemplateUndefined: Self = StObject.set(x, "rowExpansionTemplate", js.undefined)
      
      @scala.inline
      def setRowGroupFooterTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode]): Self = StObject.set(x, "rowGroupFooterTemplate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowGroupFooterTemplateUndefined: Self = StObject.set(x, "rowGroupFooterTemplate", js.undefined)
      
      @scala.inline
      def setRowGroupHeaderTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode]): Self = StObject.set(x, "rowGroupHeaderTemplate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowGroupHeaderTemplateUndefined: Self = StObject.set(x, "rowGroupHeaderTemplate", js.undefined)
      
      @scala.inline
      def setRowGroupMode(value: String): Self = StObject.set(x, "rowGroupMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupModeUndefined: Self = StObject.set(x, "rowGroupMode", js.undefined)
      
      @scala.inline
      def setRowHover(value: Boolean): Self = StObject.set(x, "rowHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      @scala.inline
      def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSelection(value: js.Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setShowReorderElement(value: /* e */ Data => Boolean): Self = StObject.set(x, "showReorderElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowReorderElementUndefined: Self = StObject.set(x, "showReorderElement", js.undefined)
      
      @scala.inline
      def setShowSelectionElement(value: /* e */ Data => Boolean): Self = StObject.set(x, "showSelectionElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowSelectionElementUndefined: Self = StObject.set(x, "showSelectionElement", js.undefined)
      
      @scala.inline
      def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      @scala.inline
      def setSortMode(value: String): Self = StObject.set(x, "sortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortModeUndefined: Self = StObject.set(x, "sortMode", js.undefined)
      
      @scala.inline
      def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setStateKey(value: String): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      
      @scala.inline
      def setStateStorage(value: String): Self = StObject.set(x, "stateStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateStorageUndefined: Self = StObject.set(x, "stateStorage", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTableClassName(value: String): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
      
      @scala.inline
      def setTableStyle(value: js.Object): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
      
      @scala.inline
      def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVirtualRowHeight(value: Double): Self = StObject.set(x, "virtualRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualRowHeightUndefined: Self = StObject.set(x, "virtualRowHeight", js.undefined)
      
      @scala.inline
      def setVirtualScroll(value: Boolean): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualScrollDelay(value: Double): Self = StObject.set(x, "virtualScrollDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualScrollDelayUndefined: Self = StObject.set(x, "virtualScrollDelay", js.undefined)
      
      @scala.inline
      def setVirtualScrollUndefined: Self = StObject.set(x, "virtualScroll", js.undefined)
    }
  }
}
