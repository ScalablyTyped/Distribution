package typings
package primereactLib.componentsTreetableTreeTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[scala.Boolean] = js.undefined
  var autoLayout: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columnResizeMode: js.UndefOr[java.lang.String] = js.undefined
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.undefined
  var currentPageReportTemplate: js.UndefOr[java.lang.String] = js.undefined
  var defaultSortOrder: js.UndefOr[scala.Double] = js.undefined
  var emptyMessage: js.UndefOr[java.lang.String] = js.undefined
  var expandedKeys: js.UndefOr[js.Any] = js.undefined
  var filterMode: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Object] = js.undefined
  var first: js.UndefOr[scala.Double] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenWidth: js.UndefOr[java.lang.String] = js.undefined
  var globalFilter: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var loadingIcon: js.UndefOr[java.lang.String] = js.undefined
  var metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.undefined
  var onColReorder: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Columns, scala.Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Delta, scala.Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Node, scala.Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], scala.Unit]] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_First, scala.Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_MultiSortMeta, scala.Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onUnselect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[scala.Double] = js.undefined
  var paginator: js.UndefOr[scala.Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[java.lang.String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[java.lang.String] = js.undefined
  var propagateSelectionDown: js.UndefOr[scala.Boolean] = js.undefined
  var propagateSelectionUp: js.UndefOr[scala.Boolean] = js.undefined
  var reorderableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var resizableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scrollHeight: js.UndefOr[java.lang.String] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var selectionKeys: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  var sortMode: js.UndefOr[java.lang.String] = js.undefined
  var sortOrder: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var tableClassName: js.UndefOr[java.lang.String] = js.undefined
  var tableStyle: js.UndefOr[js.Object] = js.undefined
  var totalRecords: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[js.Array[primereactLib.componentsTreenodeTreeNodeMod.TreeNode]] = js.undefined
}

object TreeTableProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[scala.Boolean] = js.undefined,
    autoLayout: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    columnResizeMode: java.lang.String = null,
    contextMenuSelectionKey: js.Any = null,
    currentPageReportTemplate: java.lang.String = null,
    defaultSortOrder: scala.Int | scala.Double = null,
    emptyMessage: java.lang.String = null,
    expandedKeys: js.Any = null,
    filterMode: java.lang.String = null,
    filters: js.Object = null,
    first: scala.Int | scala.Double = null,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenWidth: java.lang.String = null,
    globalFilter: js.Any = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    id: java.lang.String = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    loadingIcon: java.lang.String = null,
    metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ primereactLib.Anon_Columns => scala.Unit = null,
    onCollapse: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onColumnResizeEnd: /* e */ primereactLib.Anon_Delta => scala.Unit = null,
    onContextMenu: /* e */ primereactLib.Anon_Node => scala.Unit = null,
    onContextMenuSelectionChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onExpand: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onFilter: /* filters */ js.Array[_] => scala.Unit = null,
    onPage: /* e */ primereactLib.Anon_First => scala.Unit = null,
    onRowClick: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onSelect: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onSelectionChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onSort: /* e */ primereactLib.Anon_MultiSortMeta => scala.Unit = null,
    onToggle: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onUnselect: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    pageLinkSize: scala.Int | scala.Double = null,
    paginator: js.UndefOr[scala.Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: java.lang.String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: java.lang.String = null,
    propagateSelectionDown: js.UndefOr[scala.Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[scala.Boolean] = js.undefined,
    reorderableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    resizableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rows: scala.Int | scala.Double = null,
    rowsPerPageOptions: js.Array[scala.Double] = null,
    scrollHeight: java.lang.String = null,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: java.lang.String = null,
    sortField: java.lang.String = null,
    sortMode: java.lang.String = null,
    sortOrder: scala.Int | scala.Double = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    tableClassName: java.lang.String = null,
    tableStyle: js.Object = null,
    totalRecords: scala.Int | scala.Double = null,
    value: js.Array[primereactLib.componentsTreenodeTreeNodeMod.TreeNode] = null
  ): TreeTableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator)
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout)
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode)
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey)
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate)
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage)
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup)
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup)
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup)
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth)
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon)
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection)
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta)
    if (onColReorder != null) __obj.updateDynamic("onColReorder")(js.Any.fromFunction1(onColReorder))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onColumnResizeEnd != null) __obj.updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1(onColumnResizeEnd))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator)
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft)
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition)
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight)
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate)
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown)
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp)
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns)
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns)
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName)
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle)
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TreeTableProps]
  }
}

