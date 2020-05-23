package typings.slickgrid.Slick

import typings.slickgrid.DOMEvent
import typings.slickgrid.Slick.Editors.Editor
import typings.slickgrid.anon.CancelCurrentEdit
import typings.slickgrid.anon.ColumnId
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid[T /* <: SlickData */] extends js.Object {
  var onActiveCellChanged: Event[OnActiveCellChangedEventArgs[T]] = js.native
  var onActiveCellPositionChanged: Event[OnActiveCellPositionChangedEventArgs[T]] = js.native
  var onAddNewRow: Event[OnAddNewRowEventArgs[T]] = js.native
  var onBeforeCellEditorDestroy: Event[OnBeforeCellEditorDestroyEventArgs[T]] = js.native
  var onBeforeDestroy: Event[OnBeforeDestroyEventArgs[T]] = js.native
  var onBeforeEditCell: Event[OnBeforeEditCellEventArgs[T]] = js.native
  var onBeforeHeaderCellDestroy: Event[OnBeforeHeaderCellDestroyEventArgs[T]] = js.native
  var onBeforeHeaderRowCellDestroy: Event[OnBeforeHeaderRowCellDestroyEventArgs[T]] = js.native
  var onCellChange: Event[OnCellChangeEventArgs[T]] = js.native
  var onCellCssStylesChanged: Event[OnCellCssStylesChangedEventArgs[T]] = js.native
  var onClick: Event[OnClickEventArgs[T]] = js.native
  var onColumnsReordered: Event[OnColumnsReorderedEventArgs[T]] = js.native
  var onColumnsResized: Event[OnColumnsResizedEventArgs[T]] = js.native
  var onContextMenu: Event[OnContextMenuEventArgs[T]] = js.native
  var onDblClick: Event[OnDblClickEventArgs[T]] = js.native
  var onDrag: Event[OnDragEventArgs[T]] = js.native
  var onDragEnd: Event[OnDragEndEventArgs[T]] = js.native
  var onDragInit: Event[OnDragInitEventArgs[T]] = js.native
  var onDragStart: Event[OnDragStartEventArgs[T]] = js.native
  var onHeaderCellRendered: Event[OnHeaderCellRenderedEventArgs[T]] = js.native
  var onHeaderClick: Event[OnHeaderClickEventArgs[T]] = js.native
  var onHeaderContextMenu: Event[OnHeaderContextMenuEventArgs[T]] = js.native
  var onHeaderMouseEnter: Event[OnHeaderMouseEventArgs[T]] = js.native
  var onHeaderMouseLeave: Event[OnHeaderMouseEventArgs[T]] = js.native
  var onHeaderRowCellRendered: Event[OnHeaderRowCellRenderedEventArgs[T]] = js.native
  var onKeyDown: Event[OnKeyDownEventArgs[T]] = js.native
  var onMouseEnter: Event[OnMouseEnterEventArgs[T]] = js.native
  var onMouseLeave: Event[OnMouseLeaveEventArgs[T]] = js.native
  // #endregion Cells
  // #region Events
  var onScroll: Event[OnScrollEventArgs[T]] = js.native
  var onSelectedRowsChanged: Event[OnSelectedRowsChangedEventArgs[T]] = js.native
  var onSort: Event[OnSortEventArgs[T]] = js.native
  var onValidationError: Event[OnValidationErrorEventArgs[T]] = js.native
  var onViewportChanged: Event[OnViewportChangedEventArgs[T]] = js.native
  // #endregion Columns
  // #region Cells
  /**
    * Adds an "overlay" of CSS classes to cell DOM elements. SlickGrid can have many such overlays associated with different keys and they are frequently used by plugins. For example, SlickGrid uses this method internally to decorate selected cells with selectedCellCssClass (see options).
    * @param key A unique key you can use in calls to setCellCssStyles and removeCellCssStyles. If a hash with that key has already been set, an exception will be thrown.
    * @param hash A hash of additional cell CSS classes keyed by row number and then by column id. Multiple CSS classes can be specified and separated by space.
    * @example
    * {
    *     0:    {
    *         "number_column":    "cell-bold",
    *         "title_column":     "cell-title cell-highlighted"
    *     },
    *     4:    {
    *         "percent_column":    "cell-highlighted"
    *     }
    * }
    **/
  def addCellCssStyles(key: String, hash: CellCssStylesHash): Unit = js.native
          // todo: don't know the type of the event data type
  // #endregion Core
  // #region Columns
  /**
    * Proportionately resizes all columns to fill available horizontal space. This does not take the cell contents into consideration.
    **/
  def autosizeColumns(): Unit = js.native
  /**
    * Returns true if you can click on a given cell and make it the active focus.
    * @param row A row index.
    * @param col A column index.
    * @return
    **/
  def canCellBeActive(row: Double, col: Double): Boolean = js.native
  /**
    * Returns true if selecting the row causes this particular cell to have the selectedCellCssClass applied to it. A cell can be selected if it exists and if it isn't on an empty / "Add New" row and if it is not marked as "unselectable" in the column definition.
    * @param row A row index.
    * @param col A column index.
    * @return
    **/
  def canCellBeSelected(row: Double, col: Double): Boolean = js.native
  /**
    * todo: no docs
    **/
  def destroy(): Unit = js.native
  /**
    * Attempts to switch the active cell into edit mode. Will throw an error if the cell is set to be not editable. Uses the specified editor, otherwise defaults to any default editor for that given cell.
    * @param editor A SlickGrid editor (see examples in slick.editors.js).
    **/
  def editActiveCell(editor: Editor[T]): Unit = js.native
  /**
    * Flashes the cell twice by toggling the CSS class 4 times.
    * @param row A row index.
    * @param cell A column index.
    * @param speed (optional) - The milliseconds delay between the toggling calls. Defaults to 100 ms.
    **/
  def flashCell(row: Double, cell: Double): Unit = js.native
  def flashCell(row: Double, cell: Double, speed: Double): Unit = js.native
  def focus(): Unit = js.native
  /**
    * Returns an object representing the coordinates of the currently active cell:
    * @example
    *     {
    *       row: activeRow,
    *       cell: activeCell
    *     }
    * @return
    **/
  def getActiveCell(): Cell = js.native
  /**
    * Returns the DOM element containing the currently active cell. If no cell is active, null is returned.
    * @return
    **/
  def getActiveCellNode(): HTMLElement = js.native
  /**
    * Returns an object representing information about the active cell's position. All coordinates are absolute and take into consideration the visibility and scrolling position of all ancestors.
    * @return
    **/
  def getActiveCellPosition(): CellPosition = js.native
  def getCanvasNode(): HTMLCanvasElement = js.native
  /**
    * Accepts a key name, returns the group of CSS styles defined under that name. See setCellCssStyles for more info.
    * @param key A string.
    * @return
    **/
  def getCellCssStyles(key: String): CellCssStylesHash = js.native
  /**
    * Returns the active cell editor. If there is no actively edited cell, null is returned.
    * @return
    **/
  def getCellEditor(): Editor[_] = js.native
  /**
    * Returns a hash containing row and cell indexes from a standard W3C/jQuery event.
    * @param e A standard W3C/jQuery event.
    * @return
    **/
  def getCellFromEvent(e: DOMEvent): Cell = js.native
  /**
    * Returns a hash containing row and cell indexes. Coordinates are relative to the top left corner of the grid beginning with the first row (not including the column headers).
    * @param x An x coordinate.
    * @param y A y coordinate.
    * @return
    **/
  def getCellFromPoint(x: Double, y: Double): Cell = js.native
  /**
    * Returns a DOM element containing a cell at a given row and cell.
    * @param row A row index.
    * @param cell A column index.
    * @return
    **/
  def getCellNode(row: Double, cell: Double): HTMLElement = js.native
  /**
    * Returns an object representing information about a cell's position. All coordinates are absolute and take into consideration the visibility and scrolling position of all ancestors.
    * @param row A row index.
    * @param cell A column index.
    * @return
    **/
  def getCellNodeBox(row: Double, cell: Double): CellPosition = js.native
  /**
    * Returns the index of a column with a given id. Since columns can be reordered by the user, this can be used to get the column definition independent of the order:
    * @param id A column id.
    * @return
    **/
  def getColumnIndex(id: String): Double = js.native
  /**
    * Returns an array of column definitions, containing the option settings for each individual column.
    * @return
    **/
  def getColumns(): js.Array[Column[T]] = js.native
  /**
    * Returns container's HTML node (the element passed into Grid constructor).
    */
  def getContainerNode(): HTMLElement = js.native
  /**
    * Returns an array of every data object, unless you're using DataView in which case it returns a DataView object.
    * @return
    **/
  def getData(): js.Any = js.native
  //public getData(): T[];
  // Issue: typescript limitation, cannot differentiate calls by return type only, so need to cast to DataView or T[].
  //public getData(): DataView;
  /**
    * Returns the databinding item at a given position.
    * @param index Item index.
    * @return
    **/
  def getDataItem(index: Double): T = js.native
  /**
    * Returns the size of the databinding source.
    * @return
    **/
  def getDataLength(): Double = js.native
  def getEditController(): CancelCurrentEdit = js.native
  // #endregion Rendering
  // #region Editors
  def getEditorLock(): EditorLock[_] = js.native
  /**
    * todo: no docs
    * @return
    **/
  def getGridPosition(): CellPosition = js.native
  /**
    * todo: no docs
    * @return
    **/
  def getHeaderRow(): HTMLElement = js.native
  /**
    * todo: no docs, return type is probably wrong -> "return $header && $header[0]"
    * @param columnId
    * @return
    **/
  def getHeaderRowColumn(columnId: String): Column[_] = js.native
  /**
    * Returns an object containing all of the Grid options set on the grid. See a list of Grid Options here.
    * @return
    **/
  def getOptions(): GridOptions[_] = js.native
  def getRenderedRange(): Viewport = js.native
  def getRenderedRange(viewportTop: Double): Viewport = js.native
  def getRenderedRange(viewportTop: Double, viewportLeft: Double): Viewport = js.native
  /**
    * Returns an array of row indices corresponding to the currently selected rows.
    * @return
    **/
  def getSelectedRows(): js.Array[Double] = js.native
  /**
    * Returns the current SelectionModel. See here for more information about SelectionModels.
    * @return
    **/
  def getSelectionModel(): SelectionModel[_, _] = js.native
  /**
    * todo: no docs or comments available
    * @return
    **/
  def getSortColumns(): js.Array[ColumnId] = js.native
  /**
    * todo: no docs
    * @return
    **/
  def getTopPanel(): HTMLElement = js.native
  def getViewport(): Viewport = js.native
  def getViewport(viewportTop: Double): Viewport = js.native
  def getViewport(viewportTop: Double, viewportLeft: Double): Viewport = js.native
  /**
    * Accepts a row integer and a cell integer, scrolling the view to the row where row is its row index, and cell is its cell index. Optionally accepts a forceEdit boolean which, if true, will attempt to initiate the edit dialogue for the field in the specified cell.
    * Unlike setActiveCell, this scrolls the row into the viewport and sets the keyboard focus.
    * @param row A row index.
    * @param cell A column index.
    * @param forceEdit If true, will attempt to initiate the edit dialogue for the field in the specified cell.
    * @return
    **/
  def gotoCell(row: Double, cell: Double): Unit = js.native
  def gotoCell(row: Double, cell: Double, forceEdit: Boolean): Unit = js.native
  // #region Core
  /**
    * Initializes the grid. Called after plugins are registered. Normally, this is called by the constructor, so you don't need to call it. However, in certain cases you may need to delay the initialization until some other process has finished. In that case, set the explicitInitialization option to true and call the grid.init() manually.
    **/
  def init(): Unit = js.native
  def invalidate(): Unit = js.native
  def invalidateAllRows(): Unit = js.native
  def invalidateRow(row: Double): Unit = js.native
  def invalidateRows(rows: js.Array[Double]): Unit = js.native
  /**
    * Switches the active cell one row down skipping unselectable cells. Returns a boolean saying whether it was able to complete or not.
    * @return
    **/
  def navigateDown(): Boolean = js.native
  /**
    * Switches the active cell one cell left skipping unselectable cells. Unline navigatePrev, navigateLeft stops at the first cell of the row. Returns a boolean saying whether it was able to complete or not.
    * @return
    **/
  def navigateLeft(): Boolean = js.native
  /**
    * Tabs over active cell to the next selectable cell. Returns a boolean saying whether it was able to complete or not.
    * @return
    **/
  def navigateNext(): Boolean = js.native
  /**
    * Tabs over active cell to the previous selectable cell. Returns a boolean saying whether it was able to complete or not.
    * @return
    **/
  def navigatePrev(): Boolean = js.native
  /**
    * Switches the active cell one cell right skipping unselectable cells. Unline navigateNext, navigateRight stops at the last cell of the row. Returns a boolean saying whether it was able to complete or not.
    * @return
    **/
  def navigateRight(): Boolean = js.native
  /**
    * Switches the active cell one row up skipping unselectable cells. Returns a boolean saying whether it was able to complete or not.
    * @return
    **/
  def navigateUp(): Boolean = js.native
  // #endregion Events
  // #region Plugins
  def registerPlugin(plugin: Plugin[T]): Unit = js.native
  /**
    * Removes an "overlay" of CSS classes from cell DOM elements. See setCellCssStyles for more.
    * @param key A string key.
    **/
  def removeCellCssStyles(key: String): Unit = js.native
  // #endregion Plugins
  // #region Rendering
  def render(): Unit = js.native
  /**
    * Resets active cell.
    **/
  def resetActiveCell(): Unit = js.native
  def resizeCanvas(): Unit = js.native
  def scrollCellIntoView(row: Double, cell: Double, doPaging: Boolean): Unit = js.native
  def scrollRowIntoView(row: Double, doPaging: Boolean): Unit = js.native
  def scrollRowToTop(row: Double): Unit = js.native
  /**
    * Sets an active cell.
    * @param row A row index.
    * @param cell A column index.
    **/
  def setActiveCell(row: Double, cell: Double): Unit = js.native
  /**
    * Sets CSS classes to specific grid cells by calling removeCellCssStyles(key) followed by addCellCssStyles(key, hash). key is name for this set of styles so you can reference it later - to modify it or remove it, for example. hash is a per-row-index, per-column-name nested hash of CSS classes to apply.
    * Suppose you have a grid with columns:
    * ["login", "name", "birthday", "age", "likes_icecream", "favorite_cake"]
    * ...and you'd like to highlight the "birthday" and "age" columns for people whose birthday is today, in this case, rows at index 0 and 9. (The first and tenth row in the grid).
    * @param key A string key. Will overwrite any data already associated with this key.
    * @param hash A hash of additional cell CSS classes keyed by row number and then by column id. Multiple CSS classes can be specified and separated by space.
    **/
  def setCellCssStyles(key: String, hash: CellCssStylesHash): Unit = js.native
  /**
    * Sets grid columns. Column headers will be recreated and all rendered rows will be removed. To rerender the grid (if necessary), call render().
    * @param columnDefinitions An array of column definitions.
    **/
  def setColumns(columnDefinitions: js.Array[Column[T]]): Unit = js.native
  /**
    * Sets a new source for databinding and removes all rendered rows. Note that this doesn't render the new rows - you can follow it with a call to render() to do that.
    * @param newData New databinding source using a regular JavaScript array..
    * @param scrollToTop If true, the grid will reset the vertical scroll position to the top of the grid.
    **/
  def setData(newData: js.Array[T], scrollToTop: Boolean): Unit = js.native
  /**
    * Sets a new source for databinding and removes all rendered rows. Note that this doesn't render the new rows - you can follow it with a call to render() to do that.
    * @param newData New databinding source using a custom object exposing getItem(index) and getLength() functions.
    * @param scrollToTop If true, the grid will reset the vertical scroll position to the top of the grid.
    **/
  def setData(newData: DataProvider[T], scrollToTop: Boolean): Unit = js.native
  /**
    * todo: no docs
    * @param visible
    **/
  def setHeaderRowVisibility(visible: Boolean): Unit = js.native
  /**
    * Extends grid options with a given hash. If an there is an active edit, the grid will attempt to commit the changes and only continue if the attempt succeeds.
    * @options An object with configuration options.
    **/
  def setOptions(options: GridOptions[T]): Unit = js.native
  /**
    * Accepts an array of row indices and applies the current selectedCellCssClass to the cells in the row, respecting whether cells have been flagged as selectable.
    * @param rowsArray An array of row numbers.
    **/
  def setSelectedRows(rowsArray: js.Array[Double]): Unit = js.native
  /**
    * Unregisters a current selection model and registers a new one. See the definition of SelectionModel for more information.
    * @selectionModel A SelectionModel.
    **/
  def setSelectionModel(selectionModel: SelectionModel[T, _]): Unit = js.native
  /**
    * Accepts a columnId string and an ascending boolean. Applies a sort glyph in either ascending or descending form to the header of the column. Note that this does not actually sort the column. It only adds the sort glyph to the header.
    * @param columnId
    * @param ascending
    **/
  def setSortColumn(columnId: String, ascending: Boolean): Unit = js.native
  /**
    * Accepts an array of objects in the form [ { columnId: [string], sortAsc: [boolean] }, ... ]. When called, this will apply a sort glyph in either ascending or descending form to the header of each column specified in the array. Note that this does not actually sort the column. It only adds the sort glyph to the header
    * @param cols
    **/
  def setSortColumns(cols: js.Array[ColumnId]): Unit = js.native
  /**
    * todo: no docs
    * @param visible
    **/
  def setTopPanelVisibility(visible: Boolean): Unit = js.native
  def unregisterPlugin(plugin: Plugin[T]): Unit = js.native
  def updateCell(row: Double, cell: Double): Unit = js.native
  /**
    * Updates an existing column definition and a corresponding header DOM element with the new title and tooltip.
    * @param columnId Column id.
    * @param title New column name.
    * @param toolTip New column tooltip.
    **/
  def updateColumnHeader(columnId: String): Unit = js.native
  def updateColumnHeader(columnId: String, title: String): Unit = js.native
  def updateColumnHeader(columnId: String, title: String, toolTip: String): Unit = js.native
  def updateRow(row: Double): Unit = js.native
  def updateRowCount(): Unit = js.native
}

