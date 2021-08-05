package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a specific column to be rendered.
  */
trait Column[T] extends StObject {
  
  /**
    * A class name to be applied to the cells in the column
    */
  var cellClass: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this column can be dragged (re-arranged).
    * @default false
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this column can be edited.
    * @default false
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The editor for this column. Several editors are available in "react-data-grid/addons".
    * @default A simple text editor
    */
  var editor: js.UndefOr[
    ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps]
  ] = js.undefined
  
  /**
    * Events to be bound to the cells in this specific column.
    * Each event must respect this standard in order to work correctly:
    * @example
    * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
    */
  var events: js.UndefOr[StringDictionary[ColumnEventCallback]] = js.undefined
  
  /**
    * A custom formatter for this column's filter.
    */
  var filterRenderer: js.UndefOr[
    ReactElement | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]
  ] = js.undefined
  
  /**
    * Whether the rows in the grid can be filtered by this column.
    * @default false
    */
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom read-only formatter for this column. An image formatter is available in "react-data-grid/addons".
    */
  var formatter: js.UndefOr[
    ReactElement | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]
  ] = js.undefined
  
  /**
    * Retrieve meta data about the row, optionally provide column as a second argument
    */
  var getRowMetaData: js.UndefOr[js.Function2[/* rowdata */ T, /* column */ js.UndefOr[Column[T]], js.Any]] = js.undefined
  
  /**
    * A custom formatter for this column's header.
    */
  var headerRenderer: js.UndefOr[
    ReactElement | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]
  ] = js.undefined
  
  /**
    * A unique key for this column. Required.
    * Each row should have a property with this name, which contains this column's value.
    */
  var key: String
  
  /**
    * Whether this column should stay fixed on the left as the user scrolls horizontally.
    * @default false
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This column's display name. Required.
    */
  var name: String
  
  /**
    * Whether this column can be resized by the user.
    * @default false
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the rows in the grid can be sorted by this column.
    * @default false
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom width for this specific column.
    * @default minColumnWidth from the ReactDataGrid
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Column {
  
  inline def apply[T](key: String, name: String): Column[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  extension [Self <: Column[?], T](x: Self & Column[T]) {
    
    inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    inline def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditor(
      value: ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps]
    ): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEvents(value: StringDictionary[ColumnEventCallback]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFilterRenderer(value: ReactElement | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
    
    inline def setFilterRendererUndefined: Self = StObject.set(x, "filterRenderer", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setFormatter(value: ReactElement | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setGetRowMetaData(value: (/* rowdata */ T, /* column */ js.UndefOr[Column[T]]) => js.Any): Self = StObject.set(x, "getRowMetaData", js.Any.fromFunction2(value))
    
    inline def setGetRowMetaDataUndefined: Self = StObject.set(x, "getRowMetaData", js.undefined)
    
    inline def setHeaderRenderer(value: ReactElement | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
    
    inline def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
