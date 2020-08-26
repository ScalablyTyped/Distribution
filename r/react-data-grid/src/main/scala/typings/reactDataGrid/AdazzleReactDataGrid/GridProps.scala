package typings.reactDataGrid.AdazzleReactDataGrid

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactDataGrid.anon.EnableShiftSelect
import typings.reactDataGrid.anon.Idx
import typings.reactDataGrid.reactDataGridStrings.ASC
import typings.reactDataGrid.reactDataGridStrings.DESC
import typings.reactDataGrid.reactDataGridStrings.NONE
import typings.reactDataGrid.reactDataGridStrings.changeRow
import typings.reactDataGrid.reactDataGridStrings.loopOverRow
import typings.reactDataGrid.reactDataGridStrings.multi
import typings.reactDataGrid.reactDataGridStrings.none_
import typings.reactDataGrid.reactDataGridStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps[T] extends js.Object {
  /**
    * Controls what happens when the user navigates beyond the first or last cells.
    * 'loopOverRow' will navigate to the beginning/end of the current row.
    * 'changeRow' will navigate to the beginning of the next row or the end of the last.
    * 'none' will do nothing.
    * @default none
    */
  var cellNavigationMode: js.UndefOr[none_ | loopOverRow | changeRow] = js.native
  /**
    * The columns to render.
    */
  var columns: js.UndefOr[js.Array[Column[T]]] = js.native
  /**
    * A context menu to disiplay when the user right-clicks a cell.
    * Consider using "react-contextmenu", included in "react-data-grid/addons".
    */
  var contextMenu: js.UndefOr[ReactElement] = js.native
  /**
    * A component to display when there are no rows to render.
    */
  var emptyRowsView: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
  /**
    * Enables cells to be selected when clicked.
    * @default false
    */
  var enableCellSelect: js.UndefOr[Boolean] = js.native
  /**
    * Enables cells to be dragged and dropped
    * @default false
    */
  var enableDragAndDrop: js.UndefOr[Boolean] = js.native
  /**
    * When set to true or 'multi', enables multiple row select.
    * When set to 'single', enables single row select.
    * When set to false or not set, disables row select.
    * @default false
    */
  var enableRowSelect: js.UndefOr[Boolean | single | multi] = js.native
  var getCellActions: js.UndefOr[
    js.Function2[/* column */ Column[T], /* row */ T, js.Array[ActionButton | ActionMenu]]
  ] = js.native
  var getSubRowDetails: js.UndefOr[js.Function1[/* row */ T, SubRowDetails[_]]] = js.native
  /**
    * Responsible for returning an Array of values that can be used for filtering
    * a column that is column.filterable and using a column.filterRenderer that
    * displays a list of options.
    * @param columnKey the column key that we are looking to pull values from
    */
  var getValidFilterValues: js.UndefOr[js.Function1[/* columnKey */ String, js.Array[_]]] = js.native
  /**
    * The height of the header filter row in pixels.
    * @default 45
    */
  var headerFiltersHeight: js.UndefOr[Double] = js.native
  /**
    * The height of the header row in pixels.
    * @default rowHeight
    */
  var headerRowHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum width of each column in pixels.
    * @default 80
    */
  var minColumnWidth: js.UndefOr[Double] = js.native
  /**
    * The minimum height of the entire grid in pixels.
    * @default 350
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum width of the entire grid in pixels.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Called when the user filters a column by some value.
    * Should restrict the rows in rowGetter to only things that match the filter.
    * @param filter The filter being added
    */
  var onAddFilter: js.UndefOr[js.Function1[/* filter */ Filter, Unit]] = js.native
  /**
    * Invoked when the user copies a value from one cell and pastes it into another (in the same column).
    * Should update the value of the cell in row e.toRow.
    * @param e Information about the event
    */
  var onCellCopyPaste: js.UndefOr[js.Function1[/* e */ CellCopyPasteEvent, Unit]] = js.native
  /**
    * Called when a cell is deselected.
    * @param coordinates The row and column indices of the deselected cell.
    */
  var onCellDeSelected: js.UndefOr[js.Function1[/* coordinates */ Idx, Unit]] = js.native
  /**
    * Invoked when the user clicks on one cell to expand it.
    * @param e Information about the event
    */
  var onCellExpand: js.UndefOr[js.Function1[/* e */ CellExpandEvent[T], Unit]] = js.native
  /**
    * Called when a cell is selected.
    * @param coordinates The row and column indices of the selected cell.
    */
  var onCellSelected: js.UndefOr[js.Function1[/* coordinates */ Idx, Unit]] = js.native
  /**
    * Invoked when the user pulls down the drag handle of an editable cell.
    * Should update the values of the selected cells.
    * @param e Information about the event
    */
  var onCellsDragged: js.UndefOr[js.Function1[/* e */ CellDragEvent, Unit]] = js.native
  /**
    * Called when the user clears all filters.
    * Should restore the rows in rowGetter to their original state.
    */
  var onClearFilters: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Invoked when a column has been resized.
    * @param index The index of the column
    * @param width The new width of the column
    */
  var onColumnResize: js.UndefOr[js.Function2[/* index */ Double, /* width */ Double, Unit]] = js.native
  /**
    * Invoked when the user double clicks on the drag handle of an editable cell.
    * Should update the values of the cells beneath the selected cell.
    * @param e Information about the event
    */
  var onDragHandleDoubleClick: js.UndefOr[js.Function1[/* e */ DragHandleDoubleClickEvent[T], Unit]] = js.native
  /**
    * Invoked after the user updates the grid rows in any way.
    * @param e Information about the event
    */
  var onGridRowsUpdated: js.UndefOr[js.Function1[/* e */ GridRowsUpdatedEvent[T], Unit]] = js.native
  /**
    * Called when the user sorts the grid by some column.
    * Should update the order of the rows returned by rowGetter.
    * @param sortColumn The name of the column being sorted by
    * @param sortDirection The direction to sort ('ASC'/'DESC'/'NONE')
    */
  var onGridSort: js.UndefOr[
    js.Function2[/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE, Unit]
  ] = js.native
  /**
    * An event function called when a row is clicked.
    * Clicking the header row will trigger a call with -1 for the rowIdx.
    * @param rowIdx zero index number of row clicked
    * @param row object behind the row
    */
  var onRowClick: js.UndefOr[js.Function2[/* rowIdx */ Double, /* row */ T, Unit]] = js.native
  /**
    * An event function called when a row is expanded with the toggle
    * @param props OnRowExpandToggle object
    */
  var onRowExpandToggle: js.UndefOr[js.Function1[/* props */ OnRowExpandToggle, Unit]] = js.native
  /**
    * Called when a row is selected.
    * @param rows The (complete) current selection of rows.
    */
  var onRowSelect: js.UndefOr[js.Function1[/* rows */ js.Array[T], Unit]] = js.native
  /**
    * Invoked when the user changes the value of a single cell.
    * Should update that cell's value.
    * @param e Information about the event
    */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ RowUpdateEvent[T], Unit]] = js.native
  /**
    * Called when the grid is scrolled
    */
  var onScroll: js.UndefOr[js.Function1[/* scrollState */ ScrollState, Unit]] = js.native
  /**
    * A custom formatter for select row column
    * @default AdazzleReactDataGridPlugins.Editors.CheckboxEditor
    */
  var rowActionsCell: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
  /**
    * Gets the data to render in each row. Required.
    * Can be an array or a function that takes an index and returns an object.
    */
  var rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]) = js.native
  /**
    * A react component to customize how the grouping header row is rendered
    */
  var rowGroupRenderer: js.UndefOr[ComponentType[js.Object]] = js.native
  /**
    * The height of each individual row in pixels.
    * @default 35
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * A property that's unique to every row.
    * This property is required to enable row selection.
    * @default 'id'
    */
  var rowKey: js.UndefOr[String] = js.native
  /**
    * A react component to customize how rows are rendered.
    * If you want to define your own, consider extending ReactDataGrid.Row.
    */
  var rowRenderer: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
  /**
    * How long to wait before rendering a new row while scrolling in milliseconds.
    * @default 0
    */
  var rowScrollTimeout: js.UndefOr[Double] = js.native
  /**
    * Options object for selecting rows
    */
  var rowSelection: js.UndefOr[EnableShiftSelect[T]] = js.native
  /**
    * The total number of rows to render. Required.
    */
  var rowsCount: Double = js.native
  /**
    * A custom formatter for the select all checkbox cell
    * @default react-data-grid/src/formatters/SelectAll.js
    */
  var selectAllRenderer: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
  /**
    * key of the initial sorted column
    */
  var sortColumn: js.UndefOr[String] = js.native
  /**
    * Initial sorting direction
    */
  var sortDirection: js.UndefOr[ASC | DESC | NONE] = js.native
  /**
    * A toolbar to display above the grid.
    * Consider using the toolbar included in "react-data-grid/addons".
    */
  var toolbar: js.UndefOr[ReactElement] = js.native
}

object GridProps {
  @scala.inline
  def apply[T](rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]), rowsCount: Double): GridProps[T] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps[T]]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps[_], T] (val x: Self with GridProps[T]) extends AnyVal {
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
    def setRowGetterVarargs(value: T*): Self = this.set("rowGetter", js.Array(value :_*))
    @scala.inline
    def setRowGetterFunction1(value: /* rowIdx */ Double => T): Self = this.set("rowGetter", js.Any.fromFunction1(value))
    @scala.inline
    def setRowGetter(value: js.Array[T] | (js.Function1[/* rowIdx */ Double, T])): Self = this.set("rowGetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsCount(value: Double): Self = this.set("rowsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellNavigationMode(value: none_ | loopOverRow | changeRow): Self = this.set("cellNavigationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellNavigationMode: Self = this.set("cellNavigationMode", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column[T]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column[T]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContextMenu(value: ReactElement): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setEmptyRowsView(value: (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("emptyRowsView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyRowsView: Self = this.set("emptyRowsView", js.undefined)
    @scala.inline
    def setEnableCellSelect(value: Boolean): Self = this.set("enableCellSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCellSelect: Self = this.set("enableCellSelect", js.undefined)
    @scala.inline
    def setEnableDragAndDrop(value: Boolean): Self = this.set("enableDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDragAndDrop: Self = this.set("enableDragAndDrop", js.undefined)
    @scala.inline
    def setEnableRowSelect(value: Boolean | single | multi): Self = this.set("enableRowSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowSelect: Self = this.set("enableRowSelect", js.undefined)
    @scala.inline
    def setGetCellActions(value: (/* column */ Column[T], /* row */ T) => js.Array[ActionButton | ActionMenu]): Self = this.set("getCellActions", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetCellActions: Self = this.set("getCellActions", js.undefined)
    @scala.inline
    def setGetSubRowDetails(value: /* row */ T => SubRowDetails[_]): Self = this.set("getSubRowDetails", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSubRowDetails: Self = this.set("getSubRowDetails", js.undefined)
    @scala.inline
    def setGetValidFilterValues(value: /* columnKey */ String => js.Array[_]): Self = this.set("getValidFilterValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetValidFilterValues: Self = this.set("getValidFilterValues", js.undefined)
    @scala.inline
    def setHeaderFiltersHeight(value: Double): Self = this.set("headerFiltersHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFiltersHeight: Self = this.set("headerFiltersHeight", js.undefined)
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = this.set("headerRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRowHeight: Self = this.set("headerRowHeight", js.undefined)
    @scala.inline
    def setMinColumnWidth(value: Double): Self = this.set("minColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinColumnWidth: Self = this.set("minColumnWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnAddFilter(value: /* filter */ Filter => Unit): Self = this.set("onAddFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAddFilter: Self = this.set("onAddFilter", js.undefined)
    @scala.inline
    def setOnCellCopyPaste(value: /* e */ CellCopyPasteEvent => Unit): Self = this.set("onCellCopyPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellCopyPaste: Self = this.set("onCellCopyPaste", js.undefined)
    @scala.inline
    def setOnCellDeSelected(value: /* coordinates */ Idx => Unit): Self = this.set("onCellDeSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellDeSelected: Self = this.set("onCellDeSelected", js.undefined)
    @scala.inline
    def setOnCellExpand(value: /* e */ CellExpandEvent[T] => Unit): Self = this.set("onCellExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellExpand: Self = this.set("onCellExpand", js.undefined)
    @scala.inline
    def setOnCellSelected(value: /* coordinates */ Idx => Unit): Self = this.set("onCellSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellSelected: Self = this.set("onCellSelected", js.undefined)
    @scala.inline
    def setOnCellsDragged(value: /* e */ CellDragEvent => Unit): Self = this.set("onCellsDragged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellsDragged: Self = this.set("onCellsDragged", js.undefined)
    @scala.inline
    def setOnClearFilters(value: () => Unit): Self = this.set("onClearFilters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClearFilters: Self = this.set("onClearFilters", js.undefined)
    @scala.inline
    def setOnColumnResize(value: (/* index */ Double, /* width */ Double) => Unit): Self = this.set("onColumnResize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnResize: Self = this.set("onColumnResize", js.undefined)
    @scala.inline
    def setOnDragHandleDoubleClick(value: /* e */ DragHandleDoubleClickEvent[T] => Unit): Self = this.set("onDragHandleDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragHandleDoubleClick: Self = this.set("onDragHandleDoubleClick", js.undefined)
    @scala.inline
    def setOnGridRowsUpdated(value: /* e */ GridRowsUpdatedEvent[T] => Unit): Self = this.set("onGridRowsUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGridRowsUpdated: Self = this.set("onGridRowsUpdated", js.undefined)
    @scala.inline
    def setOnGridSort(value: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Unit): Self = this.set("onGridSort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnGridSort: Self = this.set("onGridSort", js.undefined)
    @scala.inline
    def setOnRowClick(value: (/* rowIdx */ Double, /* row */ T) => Unit): Self = this.set("onRowClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    @scala.inline
    def setOnRowExpandToggle(value: /* props */ OnRowExpandToggle => Unit): Self = this.set("onRowExpandToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowExpandToggle: Self = this.set("onRowExpandToggle", js.undefined)
    @scala.inline
    def setOnRowSelect(value: /* rows */ js.Array[T] => Unit): Self = this.set("onRowSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowSelect: Self = this.set("onRowSelect", js.undefined)
    @scala.inline
    def setOnRowUpdated(value: /* e */ RowUpdateEvent[T] => Unit): Self = this.set("onRowUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowUpdated: Self = this.set("onRowUpdated", js.undefined)
    @scala.inline
    def setOnScroll(value: /* scrollState */ ScrollState => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setRowActionsCell(value: (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("rowActionsCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowActionsCell: Self = this.set("rowActionsCell", js.undefined)
    @scala.inline
    def setRowGroupRenderer(value: ComponentType[js.Object]): Self = this.set("rowGroupRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowGroupRenderer: Self = this.set("rowGroupRenderer", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setRowKey(value: String): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    @scala.inline
    def setRowRenderer(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("rowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowRenderer: Self = this.set("rowRenderer", js.undefined)
    @scala.inline
    def setRowScrollTimeout(value: Double): Self = this.set("rowScrollTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowScrollTimeout: Self = this.set("rowScrollTimeout", js.undefined)
    @scala.inline
    def setRowSelection(value: EnableShiftSelect[T]): Self = this.set("rowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelection: Self = this.set("rowSelection", js.undefined)
    @scala.inline
    def setSelectAllRenderer(value: (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("selectAllRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllRenderer: Self = this.set("selectAllRenderer", js.undefined)
    @scala.inline
    def setSortColumn(value: String): Self = this.set("sortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumn: Self = this.set("sortColumn", js.undefined)
    @scala.inline
    def setSortDirection(value: ASC | DESC | NONE): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
    @scala.inline
    def setToolbar(value: ReactElement): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
  
}

