package typings
package primereactLib.componentsDatatableDataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[scala.Boolean] = js.undefined
  var autoLayout: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columnResizeMode: js.UndefOr[java.lang.String] = js.undefined
  var compareSelectionBy: js.UndefOr[java.lang.String] = js.undefined
  var contextMenuSelection: js.UndefOr[js.Any] = js.undefined
  var csvSeparator: js.UndefOr[java.lang.String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: js.UndefOr[java.lang.String] = js.undefined
  var defaultSortOrder: js.UndefOr[scala.Double] = js.undefined
  var emptyMessage: js.UndefOr[java.lang.String] = js.undefined
  var expandedRows: js.UndefOr[js.Array[_]] = js.undefined
  var exportFilename: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Object] = js.undefined
  var first: js.UndefOr[scala.Double] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenValue: js.UndefOr[js.Array[_]] = js.undefined
  var frozenWidth: js.UndefOr[java.lang.String] = js.undefined
  var globalFilter: js.UndefOr[js.Any] = js.undefined
  var groupField: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var loadingIcon: js.UndefOr[java.lang.String] = js.undefined
  var metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.undefined
  var onColReorder: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Columns, scala.Unit]] = js.undefined
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Delta, scala.Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataOriginalEventAny, scala.Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], scala.Unit]] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_First, scala.Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataIndex, scala.Unit]] = js.undefined
  var onRowCollapse: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataOriginalEventAny, scala.Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataIndex, scala.Unit]] = js.undefined
  var onRowExpand: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataOriginalEventAny, scala.Unit]] = js.undefined
  var onRowReorder: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DragIndex, scala.Unit]] = js.undefined
  var onRowSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataOriginalEvent, scala.Unit]] = js.undefined
  var onRowToggle: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Data, scala.Unit]] = js.undefined
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_DataOriginalEvent, scala.Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_MultiSortMeta, scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], scala.Unit]] = js.undefined
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_First, scala.Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[scala.Double] = js.undefined
  var paginator: js.UndefOr[scala.Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[java.lang.String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[java.lang.String] = js.undefined
  var reorderableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var resizableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
  var rowExpansionTemplate: js.UndefOr[
    js.Function1[/* data */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var rowGroupFooterTemplate: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      js.UndefOr[reactLib.reactMod.ReactNs.ReactNode]
    ]
  ] = js.undefined
  var rowGroupHeaderTemplate: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      js.UndefOr[reactLib.reactMod.ReactNs.ReactNode]
    ]
  ] = js.undefined
  var rowGroupMode: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scrollHeight: js.UndefOr[java.lang.String] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  var sortMode: js.UndefOr[java.lang.String] = js.undefined
  var sortOrder: js.UndefOr[scala.Double] = js.undefined
  var stateKey: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var tableClassName: js.UndefOr[java.lang.String] = js.undefined
  var tableStyle: js.UndefOr[js.Object] = js.undefined
  var totalRecords: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
  var virtualRowHeight: js.UndefOr[scala.Double] = js.undefined
  var virtualScroll: js.UndefOr[scala.Boolean] = js.undefined
  var virtualScrollDelay: js.UndefOr[scala.Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[scala.Boolean] = js.undefined,
    autoLayout: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    columnResizeMode: java.lang.String = null,
    compareSelectionBy: java.lang.String = null,
    contextMenuSelection: js.Any = null,
    csvSeparator: java.lang.String = null,
    currentPageReportTemplate: java.lang.String = null,
    dataKey: java.lang.String = null,
    defaultSortOrder: scala.Int | scala.Double = null,
    emptyMessage: java.lang.String = null,
    expandedRows: js.Array[_] = null,
    exportFilename: java.lang.String = null,
    filters: js.Object = null,
    first: scala.Int | scala.Double = null,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenValue: js.Array[_] = null,
    frozenWidth: java.lang.String = null,
    globalFilter: js.Any = null,
    groupField: java.lang.String = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    id: java.lang.String = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    loadingIcon: java.lang.String = null,
    metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ primereactLib.Anon_Columns => scala.Unit = null,
    onColumnResizeEnd: /* e */ primereactLib.Anon_Delta => scala.Unit = null,
    onContextMenu: /* e */ primereactLib.Anon_DataOriginalEventAny => scala.Unit = null,
    onContextMenuSelectionChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onFilter: /* filters */ js.Array[_] => scala.Unit = null,
    onPage: /* e */ primereactLib.Anon_First => scala.Unit = null,
    onRowClick: /* e */ primereactLib.Anon_DataIndex => scala.Unit = null,
    onRowCollapse: /* e */ primereactLib.Anon_DataOriginalEventAny => scala.Unit = null,
    onRowDoubleClick: /* e */ primereactLib.Anon_DataIndex => scala.Unit = null,
    onRowExpand: /* e */ primereactLib.Anon_DataOriginalEventAny => scala.Unit = null,
    onRowReorder: /* e */ primereactLib.Anon_DragIndex => scala.Unit = null,
    onRowSelect: /* e */ primereactLib.Anon_DataOriginalEvent => scala.Unit = null,
    onRowToggle: /* e */ primereactLib.Anon_Data => scala.Unit = null,
    onRowUnselect: /* e */ primereactLib.Anon_DataOriginalEvent => scala.Unit = null,
    onSelectionChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onSort: /* e */ primereactLib.Anon_MultiSortMeta => scala.Unit = null,
    onValueChange: /* value */ js.Array[_] => scala.Unit = null,
    onVirtualScroll: /* e */ primereactLib.Anon_First => scala.Unit = null,
    pageLinkSize: scala.Int | scala.Double = null,
    paginator: js.UndefOr[scala.Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: java.lang.String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: java.lang.String = null,
    reorderableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    resizableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rowExpansionTemplate: /* data */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    rowGroupFooterTemplate: (/* data */ js.Any, /* index */ scala.Double) => js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = null,
    rowGroupHeaderTemplate: (/* data */ js.Any, /* index */ scala.Double) => js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = null,
    rowGroupMode: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    rowsPerPageOptions: js.Array[scala.Double] = null,
    scrollHeight: java.lang.String = null,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    selection: js.Any = null,
    selectionMode: java.lang.String = null,
    sortField: java.lang.String = null,
    sortMode: java.lang.String = null,
    sortOrder: scala.Int | scala.Double = null,
    stateKey: java.lang.String = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    tableClassName: java.lang.String = null,
    tableStyle: js.Object = null,
    totalRecords: scala.Int | scala.Double = null,
    value: js.Array[_] = null,
    virtualRowHeight: scala.Int | scala.Double = null,
    virtualScroll: js.UndefOr[scala.Boolean] = js.undefined,
    virtualScrollDelay: scala.Int | scala.Double = null
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator)
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout)
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode)
    if (compareSelectionBy != null) __obj.updateDynamic("compareSelectionBy")(compareSelectionBy)
    if (contextMenuSelection != null) __obj.updateDynamic("contextMenuSelection")(contextMenuSelection)
    if (csvSeparator != null) __obj.updateDynamic("csvSeparator")(csvSeparator)
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage)
    if (expandedRows != null) __obj.updateDynamic("expandedRows")(expandedRows)
    if (exportFilename != null) __obj.updateDynamic("exportFilename")(exportFilename)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup)
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup)
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup)
    if (frozenValue != null) __obj.updateDynamic("frozenValue")(frozenValue)
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth)
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon)
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection)
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta)
    if (onColReorder != null) __obj.updateDynamic("onColReorder")(js.Any.fromFunction1(onColReorder))
    if (onColumnResizeEnd != null) __obj.updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1(onColumnResizeEnd))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onRowCollapse != null) __obj.updateDynamic("onRowCollapse")(js.Any.fromFunction1(onRowCollapse))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(onRowDoubleClick))
    if (onRowExpand != null) __obj.updateDynamic("onRowExpand")(js.Any.fromFunction1(onRowExpand))
    if (onRowReorder != null) __obj.updateDynamic("onRowReorder")(js.Any.fromFunction1(onRowReorder))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1(onRowSelect))
    if (onRowToggle != null) __obj.updateDynamic("onRowToggle")(js.Any.fromFunction1(onRowToggle))
    if (onRowUnselect != null) __obj.updateDynamic("onRowUnselect")(js.Any.fromFunction1(onRowUnselect))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (onVirtualScroll != null) __obj.updateDynamic("onVirtualScroll")(js.Any.fromFunction1(onVirtualScroll))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator)
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft)
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition)
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight)
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate)
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns)
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (rowExpansionTemplate != null) __obj.updateDynamic("rowExpansionTemplate")(js.Any.fromFunction1(rowExpansionTemplate))
    if (rowGroupFooterTemplate != null) __obj.updateDynamic("rowGroupFooterTemplate")(js.Any.fromFunction2(rowGroupFooterTemplate))
    if (rowGroupHeaderTemplate != null) __obj.updateDynamic("rowGroupHeaderTemplate")(js.Any.fromFunction2(rowGroupHeaderTemplate))
    if (rowGroupMode != null) __obj.updateDynamic("rowGroupMode")(rowGroupMode)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName)
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle)
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (virtualRowHeight != null) __obj.updateDynamic("virtualRowHeight")(virtualRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll)
    if (virtualScrollDelay != null) __obj.updateDynamic("virtualScrollDelay")(virtualScrollDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
}

