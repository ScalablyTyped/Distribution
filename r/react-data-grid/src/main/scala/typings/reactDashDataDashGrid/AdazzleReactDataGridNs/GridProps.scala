package typings.reactDashDataDashGrid.AdazzleReactDataGridNs

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import typings.reactDashDataDashGrid.Anon_EnableShiftSelect
import typings.reactDashDataDashGrid.Anon_Idx
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.ASC
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.DESC
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.NONE
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.changeRow
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.loopOverRow
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.multi
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.none
import typings.reactDashDataDashGrid.reactDashDataDashGridStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps[T] extends js.Object {
  /**
    * Controls what happens when the user navigates beyond the first or last cells.
    * 'loopOverRow' will navigate to the beginning/end of the current row.
    * 'changeRow' will navigate to the beginning of the next row or the end of the last.
    * 'none' will do nothing.
    * @default none
    */
  var cellNavigationMode: js.UndefOr[none | loopOverRow | changeRow] = js.undefined
  /**
    * The columns to render.
    */
  var columns: js.UndefOr[js.Array[Column[T]]] = js.undefined
  /**
    * A context menu to disiplay when the user right-clicks a cell.
    * Consider using "react-contextmenu", included in "react-data-grid/addons".
    */
  var contextMenu: js.UndefOr[ReactElement] = js.undefined
  /**
    * A component to display when there are no rows to render.
    */
  var emptyRowsView: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * Enables cells to be selected when clicked.
    * @default false
    */
  var enableCellSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables cells to be dragged and dropped
    * @default false
    */
  var enableDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to true or 'multi', enables multiple row select.
    * When set to 'single', enables single row select.
    * When set to false or not set, disables row select.
    * @default false
    */
  var enableRowSelect: js.UndefOr[Boolean | single | multi] = js.undefined
  var getCellActions: js.UndefOr[
    js.Function2[/* column */ Column[T], /* row */ T, js.Array[ActionButton | ActionMenu]]
  ] = js.undefined
  /**
    * Responsible for returning an Array of values that can be used for filtering
    * a column that is column.filterable and using a column.filterRenderer that
    * displays a list of options.
    * @param columnKey the column key that we are looking to pull values from
    */
  var getValidFilterValues: js.UndefOr[js.Function1[/* columnKey */ String, js.Array[_]]] = js.undefined
  /**
    * The height of the header filter row in pixels.
    * @default 45
    */
  var headerFiltersHeight: js.UndefOr[Double] = js.undefined
  /**
    * The height of the header row in pixels.
    * @default rowHeight
    */
  var headerRowHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum width of each column in pixels.
    * @default 80
    */
  var minColumnWidth: js.UndefOr[Double] = js.undefined
  /**
    * The minimum height of the entire grid in pixels.
    * @default 350
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum width of the entire grid in pixels.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Called when the user filters a column by some value.
    * Should restrict the rows in rowGetter to only things that match the filter.
    * @param filter The filter being added
    */
  var onAddFilter: js.UndefOr[js.Function1[/* filter */ Filter, Unit]] = js.undefined
  /**
    * Invoked when the user copies a value from one cell and pastes it into another (in the same column).
    * Should update the value of the cell in row e.toRow.
    * @param e Information about the event
    */
  var onCellCopyPaste: js.UndefOr[js.Function1[/* e */ CellCopyPasteEvent, Unit]] = js.undefined
  /**
    * Called when a cell is deselected.
    * @param coordinates The row and column indices of the deselected cell.
    */
  var onCellDeSelected: js.UndefOr[js.Function1[/* coordinates */ Anon_Idx, Unit]] = js.undefined
  /**
    * Called when a cell is selected.
    * @param coordinates The row and column indices of the selected cell.
    */
  var onCellSelected: js.UndefOr[js.Function1[/* coordinates */ Anon_Idx, Unit]] = js.undefined
  /**
    * Invoked when the user pulls down the drag handle of an editable cell.
    * Should update the values of the selected cells.
    * @param e Information about the event
    */
  var onCellsDragged: js.UndefOr[js.Function1[/* e */ CellDragEvent, Unit]] = js.undefined
  /**
    * Called when the user clears all filters.
    * Should restore the rows in rowGetter to their original state.
    */
  var onClearFilters: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Invoked when a column has been resized.
    * @param index The index of the column
    * @param width The new width of the column
    */
  var onColumnResize: js.UndefOr[js.Function2[/* index */ Double, /* width */ Double, Unit]] = js.undefined
  /**
    * Invoked when the user double clicks on the drag handle of an editable cell.
    * Should update the values of the cells beneath the selected cell.
    * @param e Information about the event
    */
  var onDragHandleDoubleClick: js.UndefOr[js.Function1[/* e */ DragHandleDoubleClickEvent[T], Unit]] = js.undefined
  /**
    * Invoked after the user updates the grid rows in any way.
    * @param e Information about the event
    */
  var onGridRowsUpdated: js.UndefOr[js.Function1[/* e */ GridRowsUpdatedEvent[T], Unit]] = js.undefined
  /**
    * Called when the user sorts the grid by some column.
    * Should update the order of the rows returned by rowGetter.
    * @param sortColumn The name of the column being sorted by
    * @param sortDirection The direction to sort ('ASC'/'DESC'/'NONE')
    */
  var onGridSort: js.UndefOr[
    js.Function2[/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE, Unit]
  ] = js.undefined
  /**
    * An event function called when a row is clicked.
    * Clicking the header row will trigger a call with -1 for the rowIdx.
    * @param rowIdx zero index number of row clicked
    * @param row object behind the row
    */
  var onRowClick: js.UndefOr[js.Function2[/* rowIdx */ Double, /* row */ T, Unit]] = js.undefined
  /**
    * An event function called when a row is expanded with the toggle
    * @param props OnRowExpandToggle object
    */
  var onRowExpandToggle: js.UndefOr[js.Function1[/* props */ OnRowExpandToggle, Unit]] = js.undefined
  /**
    * Called when a row is selected.
    * @param rows The (complete) current selection of rows.
    */
  var onRowSelect: js.UndefOr[js.Function1[/* rows */ js.Array[T], Unit]] = js.undefined
  /**
    * Invoked when the user changes the value of a single cell.
    * Should update that cell's value.
    * @param e Information about the event
    */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ RowUpdateEvent[T], Unit]] = js.undefined
  /**
    * A custom formatter for select row column
    * @default AdazzleReactDataGridPlugins.Editors.CheckboxEditor
    */
  var rowActionsCell: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * Gets the data to render in each row. Required.
    * Can be an array or a function that takes an index and returns an object.
    */
  var rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T])
  /**
    * A react component to customize how the grouping header row is rendered
    */
  var rowGroupRenderer: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /**
    * The height of each individual row in pixels.
    * @default 35
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * A property that's unique to every row.
    * This property is required to enable row selection.
    * @default 'id'
    */
  var rowKey: js.UndefOr[String] = js.undefined
  /**
    * A react component to customize how rows are rendered.
    * If you want to define your own, consider extending ReactDataGrid.Row.
    */
  var rowRenderer: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * How long to wait before rendering a new row while scrolling in milliseconds.
    * @default 0
    */
  var rowScrollTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Options object for selecting rows
    */
  var rowSelection: js.UndefOr[Anon_EnableShiftSelect[T]] = js.undefined
  /**
    * The total number of rows to render. Required.
    */
  var rowsCount: Double
  /**
    * A custom formatter for the select all checkbox cell
    * @default react-data-grid/src/formatters/SelectAll.js
    */
  var selectAllRenderer: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * key of the initial sorted column
    */
  var sortColumn: js.UndefOr[String] = js.undefined
  /**
    * Initial sorting direction
    */
  var sortDirection: js.UndefOr[ASC | DESC | NONE] = js.undefined
  /**
    * A toolbar to display above the grid.
    * Consider using the toolbar included in "react-data-grid/addons".
    */
  var toolbar: js.UndefOr[ReactElement] = js.undefined
}

object GridProps {
  @scala.inline
  def apply[T](
    rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]),
    rowsCount: Double,
    cellNavigationMode: none | loopOverRow | changeRow = null,
    columns: js.Array[Column[T]] = null,
    contextMenu: ReactElement = null,
    emptyRowsView: (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    enableCellSelect: js.UndefOr[Boolean] = js.undefined,
    enableDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    enableRowSelect: Boolean | single | multi = null,
    getCellActions: (/* column */ Column[T], /* row */ T) => js.Array[ActionButton | ActionMenu] = null,
    getValidFilterValues: /* columnKey */ String => js.Array[_] = null,
    headerFiltersHeight: Int | Double = null,
    headerRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onAddFilter: /* filter */ Filter => Unit = null,
    onCellCopyPaste: /* e */ CellCopyPasteEvent => Unit = null,
    onCellDeSelected: /* coordinates */ Anon_Idx => Unit = null,
    onCellSelected: /* coordinates */ Anon_Idx => Unit = null,
    onCellsDragged: /* e */ CellDragEvent => Unit = null,
    onClearFilters: () => Unit = null,
    onColumnResize: (/* index */ Double, /* width */ Double) => Unit = null,
    onDragHandleDoubleClick: /* e */ DragHandleDoubleClickEvent[T] => Unit = null,
    onGridRowsUpdated: /* e */ GridRowsUpdatedEvent[T] => Unit = null,
    onGridSort: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Unit = null,
    onRowClick: (/* rowIdx */ Double, /* row */ T) => Unit = null,
    onRowExpandToggle: /* props */ OnRowExpandToggle => Unit = null,
    onRowSelect: /* rows */ js.Array[T] => Unit = null,
    onRowUpdated: /* e */ RowUpdateEvent[T] => Unit = null,
    rowActionsCell: (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    rowGroupRenderer: ComponentType[js.Object] = null,
    rowHeight: Int | Double = null,
    rowKey: String = null,
    rowRenderer: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    rowScrollTimeout: Int | Double = null,
    rowSelection: Anon_EnableShiftSelect[T] = null,
    selectAllRenderer: (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    sortColumn: String = null,
    sortDirection: ASC | DESC | NONE = null,
    toolbar: ReactElement = null
  ): GridProps[T] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount)
    if (cellNavigationMode != null) __obj.updateDynamic("cellNavigationMode")(cellNavigationMode.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (emptyRowsView != null) __obj.updateDynamic("emptyRowsView")(emptyRowsView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellSelect)) __obj.updateDynamic("enableCellSelect")(enableCellSelect)
    if (!js.isUndefined(enableDragAndDrop)) __obj.updateDynamic("enableDragAndDrop")(enableDragAndDrop)
    if (enableRowSelect != null) __obj.updateDynamic("enableRowSelect")(enableRowSelect.asInstanceOf[js.Any])
    if (getCellActions != null) __obj.updateDynamic("getCellActions")(js.Any.fromFunction2(getCellActions))
    if (getValidFilterValues != null) __obj.updateDynamic("getValidFilterValues")(js.Any.fromFunction1(getValidFilterValues))
    if (headerFiltersHeight != null) __obj.updateDynamic("headerFiltersHeight")(headerFiltersHeight.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAddFilter != null) __obj.updateDynamic("onAddFilter")(js.Any.fromFunction1(onAddFilter))
    if (onCellCopyPaste != null) __obj.updateDynamic("onCellCopyPaste")(js.Any.fromFunction1(onCellCopyPaste))
    if (onCellDeSelected != null) __obj.updateDynamic("onCellDeSelected")(js.Any.fromFunction1(onCellDeSelected))
    if (onCellSelected != null) __obj.updateDynamic("onCellSelected")(js.Any.fromFunction1(onCellSelected))
    if (onCellsDragged != null) __obj.updateDynamic("onCellsDragged")(js.Any.fromFunction1(onCellsDragged))
    if (onClearFilters != null) __obj.updateDynamic("onClearFilters")(js.Any.fromFunction0(onClearFilters))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction2(onColumnResize))
    if (onDragHandleDoubleClick != null) __obj.updateDynamic("onDragHandleDoubleClick")(js.Any.fromFunction1(onDragHandleDoubleClick))
    if (onGridRowsUpdated != null) __obj.updateDynamic("onGridRowsUpdated")(js.Any.fromFunction1(onGridRowsUpdated))
    if (onGridSort != null) __obj.updateDynamic("onGridSort")(js.Any.fromFunction2(onGridSort))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowExpandToggle != null) __obj.updateDynamic("onRowExpandToggle")(js.Any.fromFunction1(onRowExpandToggle))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1(onRowSelect))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1(onRowUpdated))
    if (rowActionsCell != null) __obj.updateDynamic("rowActionsCell")(rowActionsCell.asInstanceOf[js.Any])
    if (rowGroupRenderer != null) __obj.updateDynamic("rowGroupRenderer")(rowGroupRenderer.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(rowRenderer.asInstanceOf[js.Any])
    if (rowScrollTimeout != null) __obj.updateDynamic("rowScrollTimeout")(rowScrollTimeout.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection)
    if (selectAllRenderer != null) __obj.updateDynamic("selectAllRenderer")(selectAllRenderer.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[GridProps[T]]
  }
}

