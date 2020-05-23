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
  var emptyMessage: js.UndefOr[js.Any] = js.undefined
  var expandableRowGroups: js.UndefOr[Boolean] = js.undefined
  var expandedRows: js.UndefOr[js.Array[_]] = js.undefined
  var exportFilename: js.UndefOr[String] = js.undefined
  var exportFunction: js.UndefOr[js.Function1[/* e */ DataField, _]] = js.undefined
  var filterLocale: js.UndefOr[String] = js.undefined
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
  var onRowEditInit: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.undefined
  var onRowEditSave: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.undefined
  var onRowExpand: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.undefined
  var onRowReorder: js.UndefOr[js.Function1[/* e */ DragIndex, Unit]] = js.undefined
  var onRowSelect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.undefined
  var onRowToggle: js.UndefOr[js.Function1[/* e */ DataArray, Unit]] = js.undefined
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], Unit]] = js.undefined
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[Double] = js.undefined
  var paginator: js.UndefOr[Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[String] = js.undefined
  var removableSort: js.UndefOr[Boolean] = js.undefined
  var reorderableColumns: js.UndefOr[Boolean] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
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
    defaultSortOrder: js.UndefOr[Double] = js.undefined,
    editMode: String = null,
    emptyMessage: js.Any = null,
    expandableRowGroups: js.UndefOr[Boolean] = js.undefined,
    expandedRows: js.Array[_] = null,
    exportFilename: String = null,
    exportFunction: /* e */ DataField => _ = null,
    filterLocale: String = null,
    filters: js.Object = null,
    first: js.UndefOr[Double] = js.undefined,
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
    onColReorder: /* e */ Columns => Unit = null,
    onColumnResizeEnd: /* e */ Delta => Unit = null,
    onContextMenu: /* e */ DataOriginalEvent => Unit = null,
    onContextMenuSelectionChange: /* e */ Value => Unit = null,
    onFilter: /* e */ Filters => Unit = null,
    onPage: /* e */ First => Unit = null,
    onRowClick: /* e */ DataIndex => Unit = null,
    onRowCollapse: /* e */ DataOriginalEvent => Unit = null,
    onRowDoubleClick: /* e */ DataIndex => Unit = null,
    onRowEditCancel: /* e */ DataIndex => Unit = null,
    onRowEditInit: /* e */ DataOriginalEvent => Unit = null,
    onRowEditSave: /* e */ DataOriginalEvent => Unit = null,
    onRowExpand: /* e */ DataOriginalEvent => Unit = null,
    onRowReorder: /* e */ DragIndex => Unit = null,
    onRowSelect: /* e */ Type => Unit = null,
    onRowToggle: /* e */ DataArray => Unit = null,
    onRowUnselect: /* e */ Type => Unit = null,
    onSelectionChange: /* e */ Value => Unit = null,
    onSort: /* e */ MultiSortMeta => Unit = null,
    onValueChange: /* value */ js.Array[_] => Unit = null,
    onVirtualScroll: /* e */ First => Unit = null,
    pageLinkSize: js.UndefOr[Double] = js.undefined,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    removableSort: js.UndefOr[Boolean] = js.undefined,
    reorderableColumns: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rowEditorValidator: /* rowData */ js.Any => Boolean = null,
    rowExpansionTemplate: /* data */ js.Any => js.UndefOr[Element] = null,
    rowGroupFooterTemplate: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode] = null,
    rowGroupHeaderTemplate: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactNode] = null,
    rowGroupMode: String = null,
    rowHover: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    rowsPerPageOptions: js.Array[Double] = null,
    scrollHeight: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selection: js.Any = null,
    selectionMode: String = null,
    showReorderElement: /* e */ Data => Boolean = null,
    showSelectionElement: /* e */ Data => Boolean = null,
    sortField: String = null,
    sortMode: String = null,
    sortOrder: js.UndefOr[Double] = js.undefined,
    stateKey: String = null,
    stateStorage: String = null,
    style: js.Object = null,
    tabIndex: String = null,
    tableClassName: String = null,
    tableStyle: js.Object = null,
    totalRecords: js.UndefOr[Double] = js.undefined,
    value: js.Array[_] = null,
    virtualRowHeight: js.UndefOr[Double] = js.undefined,
    virtualScroll: js.UndefOr[Boolean] = js.undefined,
    virtualScrollDelay: js.UndefOr[Double] = js.undefined
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    if (compareSelectionBy != null) __obj.updateDynamic("compareSelectionBy")(compareSelectionBy.asInstanceOf[js.Any])
    if (contextMenuSelection != null) __obj.updateDynamic("contextMenuSelection")(contextMenuSelection.asInstanceOf[js.Any])
    if (csvSeparator != null) __obj.updateDynamic("csvSeparator")(csvSeparator.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortOrder)) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.get.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRowGroups)) __obj.updateDynamic("expandableRowGroups")(expandableRowGroups.get.asInstanceOf[js.Any])
    if (expandedRows != null) __obj.updateDynamic("expandedRows")(expandedRows.asInstanceOf[js.Any])
    if (exportFilename != null) __obj.updateDynamic("exportFilename")(exportFilename.asInstanceOf[js.Any])
    if (exportFunction != null) __obj.updateDynamic("exportFunction")(js.Any.fromFunction1(exportFunction))
    if (filterLocale != null) __obj.updateDynamic("filterLocale")(filterLocale.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup.asInstanceOf[js.Any])
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup.asInstanceOf[js.Any])
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup.asInstanceOf[js.Any])
    if (frozenValue != null) __obj.updateDynamic("frozenValue")(frozenValue.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.get.asInstanceOf[js.Any])
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta.asInstanceOf[js.Any])
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
    if (!js.isUndefined(pageLinkSize)) __obj.updateDynamic("pageLinkSize")(pageLinkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator.get.asInstanceOf[js.Any])
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft.asInstanceOf[js.Any])
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition.asInstanceOf[js.Any])
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight.asInstanceOf[js.Any])
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(removableSort)) __obj.updateDynamic("removableSort")(removableSort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (rowEditorValidator != null) __obj.updateDynamic("rowEditorValidator")(js.Any.fromFunction1(rowEditorValidator))
    if (rowExpansionTemplate != null) __obj.updateDynamic("rowExpansionTemplate")(js.Any.fromFunction1(rowExpansionTemplate))
    if (rowGroupFooterTemplate != null) __obj.updateDynamic("rowGroupFooterTemplate")(js.Any.fromFunction2(rowGroupFooterTemplate))
    if (rowGroupHeaderTemplate != null) __obj.updateDynamic("rowGroupHeaderTemplate")(js.Any.fromFunction2(rowGroupHeaderTemplate))
    if (rowGroupMode != null) __obj.updateDynamic("rowGroupMode")(rowGroupMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.get.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showReorderElement != null) __obj.updateDynamic("showReorderElement")(js.Any.fromFunction1(showReorderElement))
    if (showSelectionElement != null) __obj.updateDynamic("showSelectionElement")(js.Any.fromFunction1(showSelectionElement))
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrder)) __obj.updateDynamic("sortOrder")(sortOrder.get.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRecords)) __obj.updateDynamic("totalRecords")(totalRecords.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualRowHeight)) __obj.updateDynamic("virtualRowHeight")(virtualRowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScrollDelay)) __obj.updateDynamic("virtualScrollDelay")(virtualScrollDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
}

