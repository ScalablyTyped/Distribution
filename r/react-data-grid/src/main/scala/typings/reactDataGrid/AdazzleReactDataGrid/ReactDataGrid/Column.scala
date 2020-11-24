package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactDataGrid.AdazzleReactDataGrid.ColumnEventCallback
import typings.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a specific column to be rendered.
  */
@js.native
trait Column[T] extends js.Object {
  
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
  def apply[T](key: String, name: String): Column[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column[_], T] (val x: Self with Column[T]) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellClass(value: String): Self = this.set("cellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellClass: Self = this.set("cellClass", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditor(
      value: ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps]
    ): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setEvents(value: StringDictionary[ColumnEventCallback]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFilterRenderer(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("filterRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRenderer: Self = this.set("filterRenderer", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setFormatter(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setGetRowMetaData(
      value: (/* rowdata */ T, /* column */ js.UndefOr[typings.reactDataGrid.AdazzleReactDataGrid.Column[T]]) => _
    ): Self = this.set("getRowMetaData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetRowMetaData: Self = this.set("getRowMetaData", js.undefined)
    
    @scala.inline
    def setHeaderRenderer(value: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("headerRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRenderer: Self = this.set("headerRenderer", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
