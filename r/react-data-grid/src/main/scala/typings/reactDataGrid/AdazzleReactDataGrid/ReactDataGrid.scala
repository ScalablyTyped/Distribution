package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.react.mod.SyntheticEvent
import typings.reactDataGrid.anon.Width
import typings.reactDataGrid.reactDataGridStrings.cellDrag
import typings.reactDataGrid.reactDataGridStrings.cellUpdate
import typings.reactDataGrid.reactDataGridStrings.columnFill
import typings.reactDataGrid.reactDataGridStrings.copyPaste
import typings.std.Element
import typings.std.Event
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactDataGrid[T]
  extends Component[GridProps[T], js.Object, js.Any] {
  
  /**
    * Opens the editor for the cell (idx) in the given row (rowIdx). If the column is not editable then nothing will happen.
    */
  def openCellEditor(rowIdx: Double, idx: Double): Unit = js.native
}
object ReactDataGrid {
  
  type Cell = Component[js.Any, js.Object, js.Any]
  
  /**
    * Information about a copy paste
    */
  @js.native
  trait CellCopyPasteEvent extends StObject {
    
    /**
      * The key of the column where the copy paste occurred.
      */
    var cellKey: String = js.native
    
    /**
      * The row that was copied from.
      */
    var fromRow: Double = js.native
    
    /**
      * The row that was pasted to.
      */
    var rowIdx: Double = js.native
    
    /**
      * The row that was pasted to.
      */
    var toRow: Double = js.native
    
    /**
      * The value that was pasted.
      */
    var value: js.Any = js.native
  }
  object CellCopyPasteEvent {
    
    @scala.inline
    def apply(cellKey: String, fromRow: Double, rowIdx: Double, toRow: Double, value: js.Any): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellCopyPasteEvent = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellCopyPasteEvent]
    }
    
    @scala.inline
    implicit class CellCopyPasteEventMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellCopyPasteEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about a cell drag
    */
  @js.native
  trait CellDragEvent extends StObject {
    
    /**
      * The name of the column that was dragged.
      */
    var cellKey: String = js.native
    
    /**
      * The row where the drag began.
      */
    var fromRow: Double = js.native
    
    /**
      * The row where the drag ended.
      */
    var toRow: Double = js.native
    
    /**
      * The value of the cell that was dragged.
      */
    var value: js.Any = js.native
  }
  object CellDragEvent {
    
    @scala.inline
    def apply(cellKey: String, fromRow: Double, toRow: Double, value: js.Any): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellDragEvent = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellDragEvent]
    }
    
    @scala.inline
    implicit class CellDragEventMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellDragEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *   Information about a cell expanded.
    */
  @js.native
  trait CellExpandEvent[T] extends StObject {
    
    /**
      * Expand data.
      */
    var expandArgs: js.Any = js.native
    
    /**
      * The column index where the cell is being expanded.
      */
    var idx: Double = js.native
    
    /**
      * The values of the row.
      */
    var rowData: T = js.native
    
    /**
      * The row index where the cell is being expanded.
      */
    var rowIdx: Double = js.native
  }
  object CellExpandEvent {
    
    @scala.inline
    def apply[T](expandArgs: js.Any, idx: Double, rowData: T, rowIdx: Double): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[T] = {
      val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[T]]
    }
    
    @scala.inline
    implicit class CellExpandEventMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[_], T] (val x: Self with typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[T]) extends AnyVal {
      
      @scala.inline
      def setExpandArgs(value: js.Any): Self = StObject.set(x, "expandArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about a specific column to be rendered.
    */
  @js.native
  trait Column[T] extends StObject {
    
    /**
      * A class name to be applied to the cells in the column
      */
    var cellClass: js.UndefOr[String] = js.native
    
    /**
      * Whether this column can be dragged (re-arranged).
      * @default false
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether this column can be edited.
      * @default false
      */
    var editable: js.UndefOr[Boolean] = js.native
    
    /**
      * The editor for this column. Several editors are available in "react-data-grid/addons".
      * @default A simple text editor
      */
    var editor: js.UndefOr[
        ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps]
      ] = js.native
    
    /**
      * Events to be bound to the cells in this specific column.
      * Each event must respect this standard in order to work correctly:
      * @example
      * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
      */
    var events: js.UndefOr[StringDictionary[ColumnEventCallback]] = js.native
    
    /**
      * A custom formatter for this column's filter.
      */
    var filterRenderer: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
    
    /**
      * Whether the rows in the grid can be filtered by this column.
      * @default false
      */
    var filterable: js.UndefOr[Boolean] = js.native
    
    /**
      * A custom read-only formatter for this column. An image formatter is available in "react-data-grid/addons".
      */
    var formatter: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
    
    /**
      * Retrieve meta data about the row, optionally provide column as a second argument
      */
    var getRowMetaData: js.UndefOr[
        js.Function2[
          /* rowdata */ T, 
          /* column */ js.UndefOr[typings.reactDataGrid.AdazzleReactDataGrid.Column[T]], 
          _
        ]
      ] = js.native
    
    /**
      * A custom formatter for this column's header.
      */
    var headerRenderer: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
    
    /**
      * A unique key for this column. Required.
      * Each row should have a property with this name, which contains this column's value.
      */
    var key: String = js.native
    
    /**
      * Whether this column should stay fixed on the left as the user scrolls horizontally.
      * @default false
      */
    var locked: js.UndefOr[Boolean] = js.native
    
    /**
      * This column's display name. Required.
      */
    var name: String = js.native
    
    /**
      * Whether this column can be resized by the user.
      * @default false
      */
    var resizable: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the rows in the grid can be sorted by this column.
      * @default false
      */
    var sortable: js.UndefOr[Boolean] = js.native
    
    /**
      * A custom width for this specific column.
      * @default minColumnWidth from the ReactDataGrid
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Column {
    
    @scala.inline
    def apply[T](key: String, name: String): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[T]]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[_], T] (val x: Self with typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[T]) extends AnyVal {
      
      @scala.inline
      def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEditor(
        value: ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps]
      ): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setEvents(value: StringDictionary[ColumnEventCallback]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setFilterRenderer(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRendererUndefined: Self = StObject.set(x, "filterRenderer", js.undefined)
      
      @scala.inline
      def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      @scala.inline
      def setFormatter(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setGetRowMetaData(
        value: (/* rowdata */ T, /* column */ js.UndefOr[typings.reactDataGrid.AdazzleReactDataGrid.Column[T]]) => _
      ): Self = StObject.set(x, "getRowMetaData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetRowMetaDataUndefined: Self = StObject.set(x, "getRowMetaData", js.undefined)
      
      @scala.inline
      def setHeaderRenderer(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
    * @default T = any
    */
  @js.native
  trait DragHandleDoubleClickEvent[T] extends StObject {
    
    /**
      * The double click event.
      */
    var e: SyntheticEvent[_, Event] = js.native
    
    /**
      * The column where the double click occurred.
      */
    var idx: Double = js.native
    
    /**
      * The values of the row.
      */
    var rowData: T = js.native
    
    /**
      * The row where the double click occurred.
      */
    var rowIdx: Double = js.native
  }
  object DragHandleDoubleClickEvent {
    
    @scala.inline
    def apply[T](e: SyntheticEvent[_, Event], idx: Double, rowData: T, rowIdx: Double): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[T] = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[T]]
    }
    
    @scala.inline
    implicit class DragHandleDoubleClickEventMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[_], T] (val x: Self with typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[T]) extends AnyVal {
      
      @scala.inline
      def setE(value: SyntheticEvent[_, Event]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Some filter to be applied to the grid's contents
    */
  @js.native
  trait Filter extends StObject {
    
    /**
      * The key of the column being filtered.
      */
    var columnKey: String = js.native
    
    /**
      * The term to filter by.
      */
    var filterTerm: String = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(columnKey: String, filterTerm: String): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Filter = {
      val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], filterTerm = filterTerm.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTerm(value: String): Self = StObject.set(x, "filterTerm", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about some update to the grid's contents. Generic event type returns untyped row, use parameterized type with the row type as the parameter
    * @default T = any
    */
  @js.native
  trait GridRowsUpdatedEvent[T] extends StObject {
    
    /**
      * The action that occurred to trigger this event.
      * One of 'cellUpdate', 'cellDrag', 'columnFill', or 'copyPaste'.
      */
    var action: cellUpdate | cellDrag | columnFill | copyPaste = js.native
    
    /**
      * The key of the column where the event occurred.
      */
    var cellKey: String = js.native
    
    /**
      * The top row affected by the event.
      */
    var fromRow: Double = js.native
    
    /**
      * The bottom row affected by the event.
      */
    var toRow: Double = js.native
    
    /**
      * The columns that were updated and their values.
      */
    var updated: T = js.native
  }
  object GridRowsUpdatedEvent {
    
    @scala.inline
    def apply[T](
      action: cellUpdate | cellDrag | columnFill | copyPaste,
      cellKey: String,
      fromRow: Double,
      toRow: Double,
      updated: T
    ): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[T]]
    }
    
    @scala.inline
    implicit class GridRowsUpdatedEventMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[_], T] (val x: Self with typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[T]) extends AnyVal {
      
      @scala.inline
      def setAction(value: cellUpdate | cellDrag | columnFill | copyPaste): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: T): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about the row toggler
    */
  @js.native
  trait OnRowExpandToggle extends StObject {
    
    /**
      * The name of the column group the row is in
      */
    var columnGroupName: String = js.native
    
    /**
      * The name of the expanded row
      */
    var name: String = js.native
    
    /**
      * If it should expand or not
      */
    var shouldExpand: Boolean = js.native
  }
  object OnRowExpandToggle {
    
    @scala.inline
    def apply(columnGroupName: String, name: String, shouldExpand: Boolean): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.OnRowExpandToggle = {
      val __obj = js.Dynamic.literal(columnGroupName = columnGroupName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shouldExpand = shouldExpand.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.OnRowExpandToggle]
    }
    
    @scala.inline
    implicit class OnRowExpandToggleMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.OnRowExpandToggle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnGroupName(value: String): Self = StObject.set(x, "columnGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldExpand(value: Boolean): Self = StObject.set(x, "shouldExpand", value.asInstanceOf[js.Any])
    }
  }
  
  type Row = Component[js.Any, js.Object, js.Any]
  
  /**
    * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
    * @default T = any
    */
  @js.native
  trait RowUpdateEvent[T] extends StObject {
    
    /**
      * The name of the column that was updated.
      */
    var cellKey: String = js.native
    
    /**
      * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
      */
    var key: String = js.native
    
    /**
      * The index of the updated row.
      */
    var rowIdx: Double = js.native
    
    /**
      * The columns that were updated and their values.
      */
    var updated: T = js.native
  }
  object RowUpdateEvent {
    
    @scala.inline
    def apply[T](cellKey: String, key: String, rowIdx: Double, updated: T): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[T] = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[T]]
    }
    
    @scala.inline
    implicit class RowUpdateEventMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[_], T] (val x: Self with typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[T]) extends AnyVal {
      
      @scala.inline
      def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: T): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectionParams[T] extends StObject {
    
    var row: T = js.native
    
    var rowIdx: Double = js.native
  }
  object SelectionParams {
    
    @scala.inline
    def apply[T](row: T, rowIdx: Double): typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[T] = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[T]]
    }
    
    @scala.inline
    implicit class SelectionParamsMutableBuilder[Self <: typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[_], T] (val x: Self with typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[T]) extends AnyVal {
      
      @scala.inline
      def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  object editors {
    
    @js.native
    trait EditorBase[P, S]
      extends Component[P with EditorBaseProps, S, js.Any] {
      
      def getInputNode(): Element | Null | Text = js.native
      
      def getStyle(): Width = js.native
      
      def getValue(): js.Any = js.native
      
      def inheritContainerStyles(): Boolean = js.native
    }
  }
}
