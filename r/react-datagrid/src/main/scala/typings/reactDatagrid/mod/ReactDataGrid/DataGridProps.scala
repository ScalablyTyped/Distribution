package typings.reactDatagrid.mod.ReactDataGrid

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.reactDatagrid.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataGridProps extends Props[DataGrid] {
  
  /**
    * Array - an array of columns that are going to be rendered in the
    * grid.
    */
  var columns: js.Array[Column] = js.native
  
  /**
    * Array/String/Function/Promise - for local data, an array of object
    * to render in the grid. For remote data, a string url, or a function
    * that returns a promise.
    */
  var dataSource: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]]) = js.native
  
  var dataSourceCount: js.UndefOr[Double] = js.native
  
  var defaultPage: js.UndefOr[Double] = js.native
  
  var defaultPageSize: js.UndefOr[Double] = js.native
  
  /**
    * Empty text for no records.
    */
  var emptyText: js.UndefOr[String] = js.native
  
  /**
    * Group rows by matching values.
    */
  var groupBy: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * String - the name of the property where the id is found for each
    * object in the data array.
    */
  var idProperty: String = js.native
  
  /**
    * To apply the filter while typing.
    */
  var liveFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * If you dont want loadMask over header, specify
    */
  var loadMaskOverHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Loading grid.
    */
  var loading: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want to enable column reordering, just specify the
    * onColumnOrderChange prop on the grid:
    */
  var onColumnOrderChange: js.UndefOr[js.Function2[/* index */ Double, /* dropIndex */ Double, Unit]] = js.native
  
  /**
    * If you want to enable column resized, just specify the
    * onColumnResize prop on the grid:
    */
  var onColumnResize: js.UndefOr[
    js.Function4[
      /* firstCol */ Column, 
      /* firstSize */ Double, 
      /* secondCol */ Column, 
      /* secondSize */ Double, 
      Unit
    ]
  ] = js.native
  
  /**
    * When a column is shown/hidden, you can be notified using the
    * onColumnVisibilityChange callback prop.
    */
  var onColumnVisibilityChange: js.UndefOr[js.Function2[/* column */ Column, /* visibility */ Boolean, Unit]] = js.native
  
  /**
    * If you want to enable filter, just specify the
    * onFilter prop on the grid:
    */
  var onFilter: js.UndefOr[
    js.Function3[/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_], Unit]
  ] = js.native
  
  /**
    * handle page changes.
    */
  var onPageChange: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
  
  /**
    * handle page size changes.
    */
  var onPageSizeChange: js.UndefOr[js.Function2[/* pageSize */ Double, /* props */ this.type, Unit]] = js.native
  
  /**
    * If you want to enable selection, just specify the
    * onSelectionChange prop on the grid:
    */
  var onSelectionChange: js.UndefOr[js.Function2[/* newSelected */ js.Object, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Sorting the data array is not done by the grid. You can however
    * pass in sort info so the grid renders with sorting icons as needed.
    */
  var onSortChange: js.UndefOr[js.Function1[/* sortInfo */ js.Array[SortInfo], Unit]] = js.native
  
  /**
    * Number - controlled alternative for defaultPage. When page changes,
    * onPageChange(page) is called.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Number - controlled alternative for defaultPageSize. When pageSize
    * changes, onPageSizeChange(pageSize) is called.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * When you have remote data, pagination is setup by default. If you
    * want to disable pagination, specify the pagination prop with a false
    * value.
    */
  var pagination: js.UndefOr[Boolean] = js.native
  
  /**
    * Customize the pagination toolbar.
    */
  var paginationToolbarProps: js.UndefOr[PaginationToolbarProps] = js.native
  
  /**
    * Custom row height.
    */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /**
    * Object/Function - you can specify either a style object to be
    * applied to all rows, or a function. The function is called with
    * (data, props) (so you have access to props.index for example) and
    * is expected to return a style object.
    */
  var rowStyle: js.UndefOr[
    CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])
  ] = js.native
  
  /**
    * The current selection.
    */
  var selected: js.UndefOr[js.Object] = js.native
  
  /**
    * Show cell borders. Other valid values: 'horizontal', 'vertical'.
    */
  var showCellBorders: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Array - an array with sorting information.
    */
  var sortInfo: js.UndefOr[js.Array[SortInfo]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Boolean - show a column menu to show/hide columns.
    */
  var withColumnMenu: js.UndefOr[Boolean] = js.native
}
object DataGridProps {
  
  @scala.inline
  def apply(
    columns: js.Array[Column],
    dataSource: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]]),
    idProperty: String
  ): DataGridProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGridProps]
  }
  
  @scala.inline
  implicit class DataGridPropsOps[Self <: DataGridProps] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceFunction1(value: /* query */ PageSize => js.Promise[js.Array[_]]): Self = this.set("dataSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataSource(value: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]])): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdProperty(value: String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceCount(value: Double): Self = this.set("dataSourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceCount: Self = this.set("dataSourceCount", js.undefined)
    
    @scala.inline
    def setDefaultPage(value: Double): Self = this.set("defaultPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPage: Self = this.set("defaultPage", js.undefined)
    
    @scala.inline
    def setDefaultPageSize(value: Double): Self = this.set("defaultPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPageSize: Self = this.set("defaultPageSize", js.undefined)
    
    @scala.inline
    def setEmptyText(value: String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: js.Any*): Self = this.set("groupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupBy(value: js.Array[_]): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setLiveFilter(value: Boolean): Self = this.set("liveFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveFilter: Self = this.set("liveFilter", js.undefined)
    
    @scala.inline
    def setLoadMaskOverHeader(value: Boolean): Self = this.set("loadMaskOverHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMaskOverHeader: Self = this.set("loadMaskOverHeader", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOnColumnOrderChange(value: (/* index */ Double, /* dropIndex */ Double) => Unit): Self = this.set("onColumnOrderChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnOrderChange: Self = this.set("onColumnOrderChange", js.undefined)
    
    @scala.inline
    def setOnColumnResize(
      value: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Unit
    ): Self = this.set("onColumnResize", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnColumnResize: Self = this.set("onColumnResize", js.undefined)
    
    @scala.inline
    def setOnColumnVisibilityChange(value: (/* column */ Column, /* visibility */ Boolean) => Unit): Self = this.set("onColumnVisibilityChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnVisibilityChange: Self = this.set("onColumnVisibilityChange", js.undefined)
    
    @scala.inline
    def setOnFilter(value: (/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_]) => Unit): Self = this.set("onFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    
    @scala.inline
    def setOnPageChange(value: /* page */ Double => Unit): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    
    @scala.inline
    def setOnPageSizeChange(value: (/* pageSize */ Double, DataGridProps) => Unit): Self = this.set("onPageSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPageSizeChange: Self = this.set("onPageSizeChange", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: (/* newSelected */ js.Object, /* data */ js.Any) => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnSortChange(value: /* sortInfo */ js.Array[SortInfo] => Unit): Self = this.set("onSortChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSortChange: Self = this.set("onSortChange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPaginationToolbarProps(value: PaginationToolbarProps): Self = this.set("paginationToolbarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationToolbarProps: Self = this.set("paginationToolbarProps", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setRowStyleFunction2(value: (/* data */ js.Any, /* props */ RowProps) => CSSProperties): Self = this.set("rowStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowStyle(value: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])): Self = this.set("rowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowStyle: Self = this.set("rowStyle", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Object): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShowCellBorders(value: Boolean | String): Self = this.set("showCellBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCellBorders: Self = this.set("showCellBorders", js.undefined)
    
    @scala.inline
    def setSortInfoVarargs(value: SortInfo*): Self = this.set("sortInfo", js.Array(value :_*))
    
    @scala.inline
    def setSortInfo(value: js.Array[SortInfo]): Self = this.set("sortInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortInfo: Self = this.set("sortInfo", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWithColumnMenu(value: Boolean): Self = this.set("withColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithColumnMenu: Self = this.set("withColumnMenu", js.undefined)
  }
}
