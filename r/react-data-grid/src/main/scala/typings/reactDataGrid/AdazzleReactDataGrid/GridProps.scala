package typings.reactDataGrid.AdazzleReactDataGrid

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps[T] extends StObject {
  
  /**
    * Controls what happens when the user navigates beyond the first or last cells.
    * 'loopOverRow' will navigate to the beginning/end of the current row.
    * 'changeRow' will navigate to the beginning of the next row or the end of the last.
    * 'none' will do nothing.
    * @default none
    */
  var cellNavigationMode: js.UndefOr[none_ | loopOverRow | changeRow] = js.undefined
  
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
  var emptyRowsView: js.UndefOr[(ComponentClass[Any, ComponentState]) | FunctionComponent[Any]] = js.undefined
  
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
  
  var getSubRowDetails: js.UndefOr[js.Function1[/* row */ T, SubRowDetails[Any]]] = js.undefined
  
  /**
    * Responsible for returning an Array of values that can be used for filtering
    * a column that is column.filterable and using a column.filterRenderer that
    * displays a list of options.
    * @param columnKey the column key that we are looking to pull values from
    */
  var getValidFilterValues: js.UndefOr[js.Function1[/* columnKey */ String, js.Array[Any]]] = js.undefined
  
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
  var onCellDeSelected: js.UndefOr[js.Function1[/* coordinates */ Idx, Unit]] = js.undefined
  
  /**
    * Invoked when the user clicks on one cell to expand it.
    * @param e Information about the event
    */
  var onCellExpand: js.UndefOr[js.Function1[/* e */ CellExpandEvent[T], Unit]] = js.undefined
  
  /**
    * Called when a cell is selected.
    * @param coordinates The row and column indices of the selected cell.
    */
  var onCellSelected: js.UndefOr[js.Function1[/* coordinates */ Idx, Unit]] = js.undefined
  
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
    * Called when the grid is scrolled
    */
  var onScroll: js.UndefOr[js.Function1[/* scrollState */ ScrollState, Unit]] = js.undefined
  
  /**
    * A custom formatter for select row column
    * @default AdazzleReactDataGridPlugins.Editors.CheckboxEditor
    */
  var rowActionsCell: js.UndefOr[(ComponentClass[Any, ComponentState]) | FunctionComponent[Any]] = js.undefined
  
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
  var rowRenderer: js.UndefOr[ReactElement | (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]] = js.undefined
  
  /**
    * How long to wait before rendering a new row while scrolling in milliseconds.
    * @default 0
    */
  var rowScrollTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Options object for selecting rows
    */
  var rowSelection: js.UndefOr[EnableShiftSelect[T]] = js.undefined
  
  /**
    * The total number of rows to render. Required.
    */
  var rowsCount: Double
  
  /**
    * A custom formatter for the select all checkbox cell
    * @default react-data-grid/src/formatters/SelectAll.js
    */
  var selectAllRenderer: js.UndefOr[(ComponentClass[Any, ComponentState]) | FunctionComponent[Any]] = js.undefined
  
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
  
  inline def apply[T](rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]), rowsCount: Double): GridProps[T] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps[T]]
  }
  
  extension [Self <: GridProps[?], T](x: Self & GridProps[T]) {
    
    inline def setCellNavigationMode(value: none_ | loopOverRow | changeRow): Self = StObject.set(x, "cellNavigationMode", value.asInstanceOf[js.Any])
    
    inline def setCellNavigationModeUndefined: Self = StObject.set(x, "cellNavigationMode", js.undefined)
    
    inline def setColumns(value: js.Array[Column[T]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column[T]*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContextMenu(value: ReactElement): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setEmptyRowsView(value: (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]): Self = StObject.set(x, "emptyRowsView", value.asInstanceOf[js.Any])
    
    inline def setEmptyRowsViewUndefined: Self = StObject.set(x, "emptyRowsView", js.undefined)
    
    inline def setEnableCellSelect(value: Boolean): Self = StObject.set(x, "enableCellSelect", value.asInstanceOf[js.Any])
    
    inline def setEnableCellSelectUndefined: Self = StObject.set(x, "enableCellSelect", js.undefined)
    
    inline def setEnableDragAndDrop(value: Boolean): Self = StObject.set(x, "enableDragAndDrop", value.asInstanceOf[js.Any])
    
    inline def setEnableDragAndDropUndefined: Self = StObject.set(x, "enableDragAndDrop", js.undefined)
    
    inline def setEnableRowSelect(value: Boolean | single | multi): Self = StObject.set(x, "enableRowSelect", value.asInstanceOf[js.Any])
    
    inline def setEnableRowSelectUndefined: Self = StObject.set(x, "enableRowSelect", js.undefined)
    
    inline def setGetCellActions(value: (/* column */ Column[T], /* row */ T) => js.Array[ActionButton | ActionMenu]): Self = StObject.set(x, "getCellActions", js.Any.fromFunction2(value))
    
    inline def setGetCellActionsUndefined: Self = StObject.set(x, "getCellActions", js.undefined)
    
    inline def setGetSubRowDetails(value: /* row */ T => SubRowDetails[Any]): Self = StObject.set(x, "getSubRowDetails", js.Any.fromFunction1(value))
    
    inline def setGetSubRowDetailsUndefined: Self = StObject.set(x, "getSubRowDetails", js.undefined)
    
    inline def setGetValidFilterValues(value: /* columnKey */ String => js.Array[Any]): Self = StObject.set(x, "getValidFilterValues", js.Any.fromFunction1(value))
    
    inline def setGetValidFilterValuesUndefined: Self = StObject.set(x, "getValidFilterValues", js.undefined)
    
    inline def setHeaderFiltersHeight(value: Double): Self = StObject.set(x, "headerFiltersHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderFiltersHeightUndefined: Self = StObject.set(x, "headerFiltersHeight", js.undefined)
    
    inline def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
    
    inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOnAddFilter(value: /* filter */ Filter => Unit): Self = StObject.set(x, "onAddFilter", js.Any.fromFunction1(value))
    
    inline def setOnAddFilterUndefined: Self = StObject.set(x, "onAddFilter", js.undefined)
    
    inline def setOnCellCopyPaste(value: /* e */ CellCopyPasteEvent => Unit): Self = StObject.set(x, "onCellCopyPaste", js.Any.fromFunction1(value))
    
    inline def setOnCellCopyPasteUndefined: Self = StObject.set(x, "onCellCopyPaste", js.undefined)
    
    inline def setOnCellDeSelected(value: /* coordinates */ Idx => Unit): Self = StObject.set(x, "onCellDeSelected", js.Any.fromFunction1(value))
    
    inline def setOnCellDeSelectedUndefined: Self = StObject.set(x, "onCellDeSelected", js.undefined)
    
    inline def setOnCellExpand(value: /* e */ CellExpandEvent[T] => Unit): Self = StObject.set(x, "onCellExpand", js.Any.fromFunction1(value))
    
    inline def setOnCellExpandUndefined: Self = StObject.set(x, "onCellExpand", js.undefined)
    
    inline def setOnCellSelected(value: /* coordinates */ Idx => Unit): Self = StObject.set(x, "onCellSelected", js.Any.fromFunction1(value))
    
    inline def setOnCellSelectedUndefined: Self = StObject.set(x, "onCellSelected", js.undefined)
    
    inline def setOnCellsDragged(value: /* e */ CellDragEvent => Unit): Self = StObject.set(x, "onCellsDragged", js.Any.fromFunction1(value))
    
    inline def setOnCellsDraggedUndefined: Self = StObject.set(x, "onCellsDragged", js.undefined)
    
    inline def setOnClearFilters(value: () => Unit): Self = StObject.set(x, "onClearFilters", js.Any.fromFunction0(value))
    
    inline def setOnClearFiltersUndefined: Self = StObject.set(x, "onClearFilters", js.undefined)
    
    inline def setOnColumnResize(value: (/* index */ Double, /* width */ Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
    
    inline def setOnColumnResizeUndefined: Self = StObject.set(x, "onColumnResize", js.undefined)
    
    inline def setOnDragHandleDoubleClick(value: /* e */ DragHandleDoubleClickEvent[T] => Unit): Self = StObject.set(x, "onDragHandleDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnDragHandleDoubleClickUndefined: Self = StObject.set(x, "onDragHandleDoubleClick", js.undefined)
    
    inline def setOnGridRowsUpdated(value: /* e */ GridRowsUpdatedEvent[T] => Unit): Self = StObject.set(x, "onGridRowsUpdated", js.Any.fromFunction1(value))
    
    inline def setOnGridRowsUpdatedUndefined: Self = StObject.set(x, "onGridRowsUpdated", js.undefined)
    
    inline def setOnGridSort(value: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Unit): Self = StObject.set(x, "onGridSort", js.Any.fromFunction2(value))
    
    inline def setOnGridSortUndefined: Self = StObject.set(x, "onGridSort", js.undefined)
    
    inline def setOnRowClick(value: (/* rowIdx */ Double, /* row */ T) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowExpandToggle(value: /* props */ OnRowExpandToggle => Unit): Self = StObject.set(x, "onRowExpandToggle", js.Any.fromFunction1(value))
    
    inline def setOnRowExpandToggleUndefined: Self = StObject.set(x, "onRowExpandToggle", js.undefined)
    
    inline def setOnRowSelect(value: /* rows */ js.Array[T] => Unit): Self = StObject.set(x, "onRowSelect", js.Any.fromFunction1(value))
    
    inline def setOnRowSelectUndefined: Self = StObject.set(x, "onRowSelect", js.undefined)
    
    inline def setOnRowUpdated(value: /* e */ RowUpdateEvent[T] => Unit): Self = StObject.set(x, "onRowUpdated", js.Any.fromFunction1(value))
    
    inline def setOnRowUpdatedUndefined: Self = StObject.set(x, "onRowUpdated", js.undefined)
    
    inline def setOnScroll(value: /* scrollState */ ScrollState => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setRowActionsCell(value: (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]): Self = StObject.set(x, "rowActionsCell", value.asInstanceOf[js.Any])
    
    inline def setRowActionsCellUndefined: Self = StObject.set(x, "rowActionsCell", js.undefined)
    
    inline def setRowGetter(value: js.Array[T] | (js.Function1[/* rowIdx */ Double, T])): Self = StObject.set(x, "rowGetter", value.asInstanceOf[js.Any])
    
    inline def setRowGetterFunction1(value: /* rowIdx */ Double => T): Self = StObject.set(x, "rowGetter", js.Any.fromFunction1(value))
    
    inline def setRowGetterVarargs(value: T*): Self = StObject.set(x, "rowGetter", js.Array(value*))
    
    inline def setRowGroupRenderer(value: ComponentType[js.Object]): Self = StObject.set(x, "rowGroupRenderer", value.asInstanceOf[js.Any])
    
    inline def setRowGroupRendererUndefined: Self = StObject.set(x, "rowGroupRenderer", js.undefined)
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
    
    inline def setRowRenderer(value: ReactElement | (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]): Self = StObject.set(x, "rowRenderer", value.asInstanceOf[js.Any])
    
    inline def setRowRendererUndefined: Self = StObject.set(x, "rowRenderer", js.undefined)
    
    inline def setRowScrollTimeout(value: Double): Self = StObject.set(x, "rowScrollTimeout", value.asInstanceOf[js.Any])
    
    inline def setRowScrollTimeoutUndefined: Self = StObject.set(x, "rowScrollTimeout", js.undefined)
    
    inline def setRowSelection(value: EnableShiftSelect[T]): Self = StObject.set(x, "rowSelection", value.asInstanceOf[js.Any])
    
    inline def setRowSelectionUndefined: Self = StObject.set(x, "rowSelection", js.undefined)
    
    inline def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
    
    inline def setSelectAllRenderer(value: (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]): Self = StObject.set(x, "selectAllRenderer", value.asInstanceOf[js.Any])
    
    inline def setSelectAllRendererUndefined: Self = StObject.set(x, "selectAllRenderer", js.undefined)
    
    inline def setSortColumn(value: String): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    inline def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
    
    inline def setSortDirection(value: ASC | DESC | NONE): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
    
    inline def setToolbar(value: ReactElement): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
