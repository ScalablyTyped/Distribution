package typings.primereact.treeTableMod

import typings.primereact.anon.Delta
import typings.primereact.anon.DropIndex
import typings.primereact.anon.First
import typings.primereact.anon.MultiSortMeta
import typings.primereact.anon.Node
import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeTableProps extends js.Object {
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
  implicit class TreeTablePropsOps[Self <: TreeTableProps] (val x: Self) extends AnyVal {
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
    def setContextMenuSelectionKey(value: js.Any): Self = this.set("contextMenuSelectionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuSelectionKey: Self = this.set("contextMenuSelectionKey", js.undefined)
    @scala.inline
    def setCurrentPageReportTemplate(value: String): Self = this.set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageReportTemplate: Self = this.set("currentPageReportTemplate", js.undefined)
    @scala.inline
    def setDefaultSortOrder(value: Double): Self = this.set("defaultSortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortOrder: Self = this.set("defaultSortOrder", js.undefined)
    @scala.inline
    def setEmptyMessage(value: String): Self = this.set("emptyMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyMessage: Self = this.set("emptyMessage", js.undefined)
    @scala.inline
    def setExpandedKeys(value: js.Any): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedKeys: Self = this.set("expandedKeys", js.undefined)
    @scala.inline
    def setFilterLocale(value: String): Self = this.set("filterLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterLocale: Self = this.set("filterLocale", js.undefined)
    @scala.inline
    def setFilterMode(value: String): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
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
    def setFrozenWidth(value: String): Self = this.set("frozenWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenWidth: Self = this.set("frozenWidth", js.undefined)
    @scala.inline
    def setGlobalFilter(value: js.Any): Self = this.set("globalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalFilter: Self = this.set("globalFilter", js.undefined)
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
    def setOnColReorder(value: /* e */ DropIndex => Unit): Self = this.set("onColReorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColReorder: Self = this.set("onColReorder", js.undefined)
    @scala.inline
    def setOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    @scala.inline
    def setOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = this.set("onColumnResizeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnResizeEnd: Self = this.set("onColumnResizeEnd", js.undefined)
    @scala.inline
    def setOnContextMenu(value: /* e */ Node => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = this.set("onContextMenuSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenuSelectionChange: Self = this.set("onContextMenuSelectionChange", js.undefined)
    @scala.inline
    def setOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    @scala.inline
    def setOnFilter(value: /* filters */ js.Array[_] => Unit): Self = this.set("onFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setOnPage(value: /* e */ First => Unit): Self = this.set("onPage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPage: Self = this.set("onPage", js.undefined)
    @scala.inline
    def setOnRowClick(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onRowClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    @scala.inline
    def setOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectionChange(value: /* e */ Value => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    @scala.inline
    def setOnSort(value: /* e */ MultiSortMeta => Unit): Self = this.set("onSort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    @scala.inline
    def setOnToggle(value: /* e */ Value => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = this.set("onUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnselect: Self = this.set("onUnselect", js.undefined)
    @scala.inline
    def setPageLinkSize(value: Double): Self = this.set("pageLinkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLinkSize: Self = this.set("pageLinkSize", js.undefined)
    @scala.inline
    def setPaginator(value: Boolean): Self = this.set("paginator", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginator: Self = this.set("paginator", js.undefined)
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
    def setPropagateSelectionDown(value: Boolean): Self = this.set("propagateSelectionDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagateSelectionDown: Self = this.set("propagateSelectionDown", js.undefined)
    @scala.inline
    def setPropagateSelectionUp(value: Boolean): Self = this.set("propagateSelectionUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagateSelectionUp: Self = this.set("propagateSelectionUp", js.undefined)
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
    def setSelectionKeys(value: js.Any): Self = this.set("selectionKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionKeys: Self = this.set("selectionKeys", js.undefined)
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
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
    def setValueVarargs(value: TreeNode*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[TreeNode]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

