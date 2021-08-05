package typings.primereact

import typings.primereact.anon.Delta
import typings.primereact.anon.DropIndex
import typings.primereact.anon.First
import typings.primereact.anon.MultiSortMeta
import typings.primereact.anon.Node
import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTableMod {
  
  @JSImport("primereact/components/treetable/TreeTable", "TreeTable")
  @js.native
  class TreeTable protected ()
    extends Component[TreeTableProps, js.Any, js.Any] {
    def this(props: TreeTableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TreeTableProps, context: js.Any) = this()
    
    def filter[T](value: T, field: String, mode: String): Unit = js.native
  }
  
  trait TreeTableProps extends StObject {
    
    var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
    
    var autoLayout: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnResizeMode: js.UndefOr[String] = js.undefined
    
    var contextMenuSelectionKey: js.UndefOr[js.Any] = js.undefined
    
    var currentPageReportTemplate: js.UndefOr[String] = js.undefined
    
    var defaultSortOrder: js.UndefOr[Double] = js.undefined
    
    var emptyMessage: js.UndefOr[String] = js.undefined
    
    var expandedKeys: js.UndefOr[js.Any] = js.undefined
    
    var filterLocale: js.UndefOr[String] = js.undefined
    
    var filterMode: js.UndefOr[String] = js.undefined
    
    var filters: js.UndefOr[js.Object] = js.undefined
    
    var first: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var frozenWidth: js.UndefOr[String] = js.undefined
    
    var globalFilter: js.UndefOr[js.Any] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var headerColumnGroup: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingIcon: js.UndefOr[String] = js.undefined
    
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    var multiSortMeta: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var onColReorder: js.UndefOr[js.Function1[/* e */ DropIndex, Unit]] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.undefined
    
    var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[js.Any], Unit]] = js.undefined
    
    var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
    
    var onRowClick: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
    
    var pageLinkSize: js.UndefOr[Double] = js.undefined
    
    var paginator: js.UndefOr[Boolean] = js.undefined
    
    var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.undefined
    
    var paginatorLeft: js.UndefOr[js.Any] = js.undefined
    
    var paginatorPosition: js.UndefOr[String] = js.undefined
    
    var paginatorRight: js.UndefOr[js.Any] = js.undefined
    
    var paginatorTemplate: js.UndefOr[String] = js.undefined
    
    var propagateSelectionDown: js.UndefOr[Boolean] = js.undefined
    
    var propagateSelectionUp: js.UndefOr[Boolean] = js.undefined
    
    var reorderableColumns: js.UndefOr[Boolean] = js.undefined
    
    var resizableColumns: js.UndefOr[Boolean] = js.undefined
    
    var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var scrollHeight: js.UndefOr[String] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var selectionKeys: js.UndefOr[js.Any] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var sortField: js.UndefOr[String] = js.undefined
    
    var sortMode: js.UndefOr[String] = js.undefined
    
    var sortOrder: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[String] = js.undefined
    
    var tableClassName: js.UndefOr[String] = js.undefined
    
    var tableStyle: js.UndefOr[js.Object] = js.undefined
    
    var totalRecords: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.Array[TreeNode]] = js.undefined
  }
  object TreeTableProps {
    
    inline def apply(): TreeTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeTableProps]
    }
    
    extension [Self <: TreeTableProps](x: Self) {
      
      inline def setAlwaysShowPaginator(value: Boolean): Self = StObject.set(x, "alwaysShowPaginator", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowPaginatorUndefined: Self = StObject.set(x, "alwaysShowPaginator", js.undefined)
      
      inline def setAutoLayout(value: Boolean): Self = StObject.set(x, "autoLayout", value.asInstanceOf[js.Any])
      
      inline def setAutoLayoutUndefined: Self = StObject.set(x, "autoLayout", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnResizeMode(value: String): Self = StObject.set(x, "columnResizeMode", value.asInstanceOf[js.Any])
      
      inline def setColumnResizeModeUndefined: Self = StObject.set(x, "columnResizeMode", js.undefined)
      
      inline def setContextMenuSelectionKey(value: js.Any): Self = StObject.set(x, "contextMenuSelectionKey", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSelectionKeyUndefined: Self = StObject.set(x, "contextMenuSelectionKey", js.undefined)
      
      inline def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      inline def setDefaultSortOrder(value: Double): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      inline def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      inline def setEmptyMessage(value: String): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      inline def setExpandedKeys(value: js.Any): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilterMode(value: String): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
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
      
      inline def setFrozenWidth(value: String): Self = StObject.set(x, "frozenWidth", value.asInstanceOf[js.Any])
      
      inline def setFrozenWidthUndefined: Self = StObject.set(x, "frozenWidth", js.undefined)
      
      inline def setGlobalFilter(value: js.Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
      
      inline def setGlobalFilterUndefined: Self = StObject.set(x, "globalFilter", js.undefined)
      
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
      
      inline def setOnColReorder(value: /* e */ DropIndex => Unit): Self = StObject.set(x, "onColReorder", js.Any.fromFunction1(value))
      
      inline def setOnColReorderUndefined: Self = StObject.set(x, "onColReorder", js.undefined)
      
      inline def setOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = StObject.set(x, "onColumnResizeEnd", js.Any.fromFunction1(value))
      
      inline def setOnColumnResizeEndUndefined: Self = StObject.set(x, "onColumnResizeEnd", js.undefined)
      
      inline def setOnContextMenu(value: /* e */ Node => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnFilter(value: /* filters */ js.Array[js.Any] => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOnPage(value: /* e */ First => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
      
      inline def setOnPageUndefined: Self = StObject.set(x, "onPage", js.undefined)
      
      inline def setOnRowClick(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnSort(value: /* e */ MultiSortMeta => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnToggle(value: /* e */ Value => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      inline def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
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
      
      inline def setPropagateSelectionDown(value: Boolean): Self = StObject.set(x, "propagateSelectionDown", value.asInstanceOf[js.Any])
      
      inline def setPropagateSelectionDownUndefined: Self = StObject.set(x, "propagateSelectionDown", js.undefined)
      
      inline def setPropagateSelectionUp(value: Boolean): Self = StObject.set(x, "propagateSelectionUp", value.asInstanceOf[js.Any])
      
      inline def setPropagateSelectionUpUndefined: Self = StObject.set(x, "propagateSelectionUp", js.undefined)
      
      inline def setReorderableColumns(value: Boolean): Self = StObject.set(x, "reorderableColumns", value.asInstanceOf[js.Any])
      
      inline def setReorderableColumnsUndefined: Self = StObject.set(x, "reorderableColumns", js.undefined)
      
      inline def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
      
      inline def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
      
      inline def setRowClassName(value: /* rowData */ js.Any => js.Object): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      inline def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setSelectionKeys(value: js.Any): Self = StObject.set(x, "selectionKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectionKeysUndefined: Self = StObject.set(x, "selectionKeys", js.undefined)
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      inline def setSortMode(value: String): Self = StObject.set(x, "sortMode", value.asInstanceOf[js.Any])
      
      inline def setSortModeUndefined: Self = StObject.set(x, "sortMode", js.undefined)
      
      inline def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
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
      
      inline def setValue(value: js.Array[TreeNode]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: TreeNode*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
