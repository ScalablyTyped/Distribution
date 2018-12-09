package typings
package reactDashDatagridLib.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataGridProps
  extends reactLib.reactMod.ReactNs.Props[DataGrid] {
  /**
            * Array - an array of columns that are going to be rendered in the
            * grid.
            */
  var columns: js.Array[Column]
  /**
            * Array/String/Function/Promise - for local data, an array of object
            * to render in the grid. For remote data, a string url, or a function
            * that returns a promise.
            */
  var dataSource: js.Array[_] | java.lang.String | (js.Function1[/* query */ reactDashDatagridLib.Anon_Skip, js.Promise[js.Array[_]]])
  var dataSourceCount: js.UndefOr[scala.Double] = js.undefined
  var defaultPage: js.UndefOr[scala.Double] = js.undefined
  var defaultPageSize: js.UndefOr[scala.Double] = js.undefined
  /**
            * Empty text for no records.
            */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /**
            * Group rows by matching values.
            */
  var groupBy: js.UndefOr[js.Array[_]] = js.undefined
  /**
            * String - the name of the property where the id is found for each
            * object in the data array.
            */
  var idProperty: java.lang.String
  /**
            * To apply the filter while typing.
            */
  var liveFilter: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * If you dont want loadMask over header, specify
            */
  var loadMaskOverHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * Loading grid.
            */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * If you want to enable column reordering, just specify the
            * onColumnOrderChange prop on the grid:
            */
  var onColumnOrderChange: js.UndefOr[js.Function2[/* index */ scala.Double, /* dropIndex */ scala.Double, scala.Unit]] = js.undefined
  /**
            * If you want to enable column resized, just specify the
            * onColumnResize prop on the grid:
            */
  var onColumnResize: js.UndefOr[
    js.Function4[
      /* firstCol */ Column, 
      /* firstSize */ scala.Double, 
      /* secondCol */ Column, 
      /* secondSize */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
            * When a column is shown/hidden, you can be notified using the
            * onColumnVisibilityChange callback prop.
            */
  var onColumnVisibilityChange: js.UndefOr[js.Function2[/* column */ Column, /* visibility */ scala.Boolean, scala.Unit]] = js.undefined
  /**
            * If you want to enable filter, just specify the
            * onFilter prop on the grid:
            */
  var onFilter: js.UndefOr[
    js.Function3[/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_], scala.Unit]
  ] = js.undefined
  /**
            * handle page changes.
            */
  var onPageChange: js.UndefOr[js.Function1[/* page */ scala.Double, scala.Unit]] = js.undefined
  /**
            * handle page size changes.
            */
  var onPageSizeChange: js.UndefOr[js.Function2[/* pageSize */ scala.Double, /* props */ DataGridProps, scala.Unit]] = js.undefined
  /**
            * If you want to enable selection, just specify the
            * onSelectionChange prop on the grid:
            */
  var onSelectionChange: js.UndefOr[js.Function2[/* newSelected */ js.Object, /* data */ js.Any, scala.Unit]] = js.undefined
  /**
            * Sorting the data array is not done by the grid. You can however
            * pass in sort info so the grid renders with sorting icons as needed.
            */
  var onSortChange: js.UndefOr[js.Function1[/* sortInfo */ js.Array[SortInfo], scala.Unit]] = js.undefined
  /**
            * Number - controlled alternative for defaultPage. When page changes,
            * onPageChange(page) is called.
            */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
            * Number - controlled alternative for defaultPageSize. When pageSize
            * changes, onPageSizeChange(pageSize) is called.
            */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
            * When you have remote data, pagination is setup by default. If you
            * want to disable pagination, specify the pagination prop with a false
            * value.
            */
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * Customize the pagination toolbar.
            */
  var paginationToolbarProps: js.UndefOr[PaginationToolbarProps] = js.undefined
  /**
            * Custom row height.
            */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
            * Object/Function - you can specify either a style object to be
            * applied to all rows, or a function. The function is called with
            * (data, props) (so you have access to props.index for example) and
            * is expected to return a style object.
            */
  var rowStyle: js.UndefOr[
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, reactLib.reactMod.ReactNs.CSSProperties])
  ] = js.undefined
  /**
            * The current selection.
            */
  var selected: js.UndefOr[js.Object] = js.undefined
  /**
           * Show cell borders. Other valid values: 'horizontal', 'vertical'.
           */
  var showCellBorders: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
            * Array - an array with sorting information.
            */
  var sortInfo: js.UndefOr[js.Array[SortInfo]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
            * Boolean - show a column menu to show/hide columns.
            */
  var withColumnMenu: js.UndefOr[scala.Boolean] = js.undefined
}

