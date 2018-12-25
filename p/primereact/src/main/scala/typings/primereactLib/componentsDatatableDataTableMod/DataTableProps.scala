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
  var onContextMenu: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventData, scala.Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEvent, scala.Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], scala.Unit]] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Rows, scala.Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function1[/* e */ reactLib.Event, scala.Unit]] = js.undefined
  var onRowCollapse: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventData, scala.Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventDataIndex, scala.Unit]] = js.undefined
  var onRowExpand: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventData, scala.Unit]] = js.undefined
  var onRowReorder: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventDragIndex, scala.Unit]] = js.undefined
  var onRowSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Type, scala.Unit]] = js.undefined
  var onRowToggle: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Data, scala.Unit]] = js.undefined
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Type, scala.Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEvent, scala.Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_SortField, scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], scala.Unit]] = js.undefined
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Rows, scala.Unit]] = js.undefined
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

