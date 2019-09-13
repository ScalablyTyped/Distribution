package typings.primereact.componentsDatatableDataTableMod

import typings.primereact.Anon_Columns
import typings.primereact.Anon_Data
import typings.primereact.Anon_DataIndex
import typings.primereact.Anon_DataOriginalEvent
import typings.primereact.Anon_DataOriginalEventAny
import typings.primereact.Anon_Delta
import typings.primereact.Anon_DragIndex
import typings.primereact.Anon_First
import typings.primereact.Anon_MultiSortMeta
import typings.primereact.Anon_OriginalEventValue
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
  var autoLayout: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnResizeMode: js.UndefOr[String] = js.undefined
  var compareSelectionBy: js.UndefOr[String] = js.undefined
  var contextMenuSelection: js.UndefOr[js.Any] = js.undefined
  var csvSeparator: js.UndefOr[String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[String] = js.undefined
  var defaultSortOrder: js.UndefOr[Double] = js.undefined
  var editMode: js.UndefOr[String] = js.undefined
  var emptyMessage: js.UndefOr[String] = js.undefined
  var expandedRows: js.UndefOr[js.Array[_]] = js.undefined
  var exportFilename: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Object] = js.undefined
  var first: js.UndefOr[Double] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenValue: js.UndefOr[js.Array[_]] = js.undefined
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
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.undefined
  var onColReorder: js.UndefOr[js.Function1[/* e */ Anon_Columns, Unit]] = js.undefined
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Anon_Delta, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEventAny, Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], Unit]] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ Anon_First, Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function1[/* e */ Anon_DataIndex, Unit]] = js.undefined
  var onRowCollapse: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEventAny, Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ Anon_DataIndex, Unit]] = js.undefined
  var onRowEditCancel: js.UndefOr[js.Function1[/* e */ Anon_DataIndex, Unit]] = js.undefined
  var onRowEditInit: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEventAny, Unit]] = js.undefined
  var onRowEditSave: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEventAny, Unit]] = js.undefined
  var onRowExpand: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEventAny, Unit]] = js.undefined
  var onRowReorder: js.UndefOr[js.Function1[/* e */ Anon_DragIndex, Unit]] = js.undefined
  var onRowSelect: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEvent, Unit]] = js.undefined
  var onRowToggle: js.UndefOr[js.Function1[/* e */ Anon_Data, Unit]] = js.undefined
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ Anon_DataOriginalEvent, Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ Anon_MultiSortMeta, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], Unit]] = js.undefined
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ Anon_First, Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[Double] = js.undefined
  var paginator: js.UndefOr[Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[String] = js.undefined
  var reorderableColumns: js.UndefOr[Boolean] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
  var rowEditorValidator: js.UndefOr[js.Function1[/* rowData */ js.Any, Boolean]] = js.undefined
  var rowExpansionTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
  var rowGroupFooterTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[ReactNode]]] = js.undefined
  var rowGroupHeaderTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[ReactNode]]] = js.undefined
  var rowGroupMode: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
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
  var value: js.UndefOr[js.Array[_]] = js.undefined
  var virtualRowHeight: js.UndefOr[Double] = js.undefined
  var virtualScroll: js.UndefOr[Boolean] = js.undefined
  var virtualScrollDelay: js.UndefOr[Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    autoLayout: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    columnResizeMode: String = null,
    compareSelectionBy: String = null,
    contextMenuSelection: js.Any = null,
    csvSeparator: String = null,
    currentPageReportTemplate: String = null,
    dataKey: String = null,
    defaultSortOrder: Int | Double = null,
    editMode: String = null,
    emptyMessage: String = null,
    expandedRows: js.Array[_] = null,
    exportFilename: String = null,
    filters: js.Object = null,
    first: Int | Double = null,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenValue: js.Array[_] = null,
    frozenWidth: String = null,
    globalFilter: js.Any = null,
    groupField: String = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    id: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ Anon_Columns => Unit = null,
    onColumnResizeEnd: /* e */ Anon_Delta => Unit = null,
    onContextMenu: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onContextMenuSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onFilter: /* filters */ js.Array[_] => Unit = null,
    onPage: /* e */ Anon_First => Unit = null,
    onRowClick: /* e */ Anon_DataIndex => Unit = null,
    onRowCollapse: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowDoubleClick: /* e */ Anon_DataIndex => Unit = null,
    onRowEditCancel: /* e */ Anon_DataIndex => Unit = null,
    onRowEditInit: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowEditSave: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowExpand: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowReorder: /* e */ Anon_DragIndex => Unit = null,
    onRowSelect: /* e */ Anon_DataOriginalEvent => Unit = null,
    onRowToggle: /* e */ Anon_Data => Unit = null,
    onRowUnselect: /* e */ Anon_DataOriginalEvent => Unit = null,
    onSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onSort: /* e */ Anon_MultiSortMeta => Unit = null,
    onValueChange: /* value */ js.Array[_] => Unit = null,
    onVirtualScroll: /* e */ Anon_First => Unit = null,
    pageLinkSize: Int | Double = null,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    reorderableColumns: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rowEditorValidator: /* rowData */ js.Any => Boolean = null,
    rowExpansionTemplate: /* data */ js.Any => js.UndefOr[Element] = null,
    rowGroupFooterTemplate: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode] = null,
    rowGroupHeaderTemplate: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode] = null,
    rowGroupMode: String = null,
    rows: Int | Double = null,
    rowsPerPageOptions: js.Array[Double] = null,
    scrollHeight: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selection: js.Any = null,
    selectionMode: String = null,
    sortField: String = null,
    sortMode: String = null,
    sortOrder: Int | Double = null,
    stateKey: String = null,
    stateStorage: String = null,
    style: js.Object = null,
    tabIndex: String = null,
    tableClassName: String = null,
    tableStyle: js.Object = null,
    totalRecords: Int | Double = null,
    value: js.Array[_] = null,
    virtualRowHeight: Int | Double = null,
    virtualScroll: js.UndefOr[Boolean] = js.undefined,
    virtualScrollDelay: Int | Double = null
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
    if (editMode != null) __obj.updateDynamic("editMode")(editMode)
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
    if (onRowEditCancel != null) __obj.updateDynamic("onRowEditCancel")(js.Any.fromFunction1(onRowEditCancel))
    if (onRowEditInit != null) __obj.updateDynamic("onRowEditInit")(js.Any.fromFunction1(onRowEditInit))
    if (onRowEditSave != null) __obj.updateDynamic("onRowEditSave")(js.Any.fromFunction1(onRowEditSave))
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
    if (rowEditorValidator != null) __obj.updateDynamic("rowEditorValidator")(js.Any.fromFunction1(rowEditorValidator))
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
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage)
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

