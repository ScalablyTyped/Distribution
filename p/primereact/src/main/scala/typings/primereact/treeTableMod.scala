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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait TreeTableProps extends StObject {
    
    var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
    
    var autoLayout: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var columnResizeMode: js.UndefOr[String] = js.native
    
    var contextMenuSelectionKey: js.UndefOr[js.Any] = js.native
    
    var currentPageReportTemplate: js.UndefOr[String] = js.native
    
    var defaultSortOrder: js.UndefOr[Double] = js.native
    
    var emptyMessage: js.UndefOr[String] = js.native
    
    var expandedKeys: js.UndefOr[js.Any] = js.native
    
    var filterLocale: js.UndefOr[String] = js.native
    
    var filterMode: js.UndefOr[String] = js.native
    
    var filters: js.UndefOr[js.Object] = js.native
    
    var first: js.UndefOr[Double] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var footerColumnGroup: js.UndefOr[js.Any] = js.native
    
    var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.native
    
    var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.native
    
    var frozenWidth: js.UndefOr[String] = js.native
    
    var globalFilter: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    var headerColumnGroup: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var loadingIcon: js.UndefOr[String] = js.native
    
    var metaKeySelection: js.UndefOr[Boolean] = js.native
    
    var multiSortMeta: js.UndefOr[js.Array[_]] = js.native
    
    var onColReorder: js.UndefOr[js.Function1[/* e */ DropIndex, Unit]] = js.native
    
    var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
    
    var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.native
    
    var onContextMenu: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.native
    
    var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
    
    var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], Unit]] = js.native
    
    var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
    
    var onRowClick: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.native
    
    var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
    
    var pageLinkSize: js.UndefOr[Double] = js.native
    
    var paginator: js.UndefOr[Boolean] = js.native
    
    var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.native
    
    var paginatorLeft: js.UndefOr[js.Any] = js.native
    
    var paginatorPosition: js.UndefOr[String] = js.native
    
    var paginatorRight: js.UndefOr[js.Any] = js.native
    
    var paginatorTemplate: js.UndefOr[String] = js.native
    
    var propagateSelectionDown: js.UndefOr[Boolean] = js.native
    
    var propagateSelectionUp: js.UndefOr[Boolean] = js.native
    
    var reorderableColumns: js.UndefOr[Boolean] = js.native
    
    var resizableColumns: js.UndefOr[Boolean] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
    
    var scrollHeight: js.UndefOr[String] = js.native
    
    var scrollable: js.UndefOr[Boolean] = js.native
    
    var selectionKeys: js.UndefOr[js.Any] = js.native
    
    var selectionMode: js.UndefOr[String] = js.native
    
    var sortField: js.UndefOr[String] = js.native
    
    var sortMode: js.UndefOr[String] = js.native
    
    var sortOrder: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabIndex: js.UndefOr[String] = js.native
    
    var tableClassName: js.UndefOr[String] = js.native
    
    var tableStyle: js.UndefOr[js.Object] = js.native
    
    var totalRecords: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[js.Array[TreeNode]] = js.native
  }
  object TreeTableProps {
    
    @scala.inline
    def apply(): TreeTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeTableProps]
    }
    
    @scala.inline
    implicit class TreeTablePropsMutableBuilder[Self <: TreeTableProps] (val x: Self) extends AnyVal {
      
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
      def setContextMenuSelectionKey(value: js.Any): Self = StObject.set(x, "contextMenuSelectionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSelectionKeyUndefined: Self = StObject.set(x, "contextMenuSelectionKey", js.undefined)
      
      @scala.inline
      def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      @scala.inline
      def setDefaultSortOrder(value: Double): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
      
      @scala.inline
      def setEmptyMessage(value: String): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: js.Any): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      @scala.inline
      def setFilterMode(value: String): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
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
      def setFrozenWidth(value: String): Self = StObject.set(x, "frozenWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenWidthUndefined: Self = StObject.set(x, "frozenWidth", js.undefined)
      
      @scala.inline
      def setGlobalFilter(value: js.Any): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalFilterUndefined: Self = StObject.set(x, "globalFilter", js.undefined)
      
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
      def setOnColReorder(value: /* e */ DropIndex => Unit): Self = StObject.set(x, "onColReorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColReorderUndefined: Self = StObject.set(x, "onColReorder", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = StObject.set(x, "onColumnResizeEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnResizeEndUndefined: Self = StObject.set(x, "onColumnResizeEnd", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* e */ Node => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filters */ js.Array[_] => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOnPage(value: /* e */ First => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageUndefined: Self = StObject.set(x, "onPage", js.undefined)
      
      @scala.inline
      def setOnRowClick(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnSort(value: /* e */ MultiSortMeta => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* e */ Value => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
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
      def setPropagateSelectionDown(value: Boolean): Self = StObject.set(x, "propagateSelectionDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateSelectionDownUndefined: Self = StObject.set(x, "propagateSelectionDown", js.undefined)
      
      @scala.inline
      def setPropagateSelectionUp(value: Boolean): Self = StObject.set(x, "propagateSelectionUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateSelectionUpUndefined: Self = StObject.set(x, "propagateSelectionUp", js.undefined)
      
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
      def setSelectionKeys(value: js.Any): Self = StObject.set(x, "selectionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionKeysUndefined: Self = StObject.set(x, "selectionKeys", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
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
      def setValue(value: js.Array[TreeNode]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: TreeNode*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
