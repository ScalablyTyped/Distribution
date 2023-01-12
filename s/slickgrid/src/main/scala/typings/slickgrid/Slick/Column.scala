package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[T /* <: SlickData */] extends StObject {
  
  /**
    * This accepts a function of the form function(cellNode, row, dataContext, colDef) and is used to post-process the cell's DOM node / nodes
    * @param cellNode
    * @param row
    * @param dataContext
    * @param colDef
    * @return
    **/
  var asyncPostRender: js.UndefOr[
    js.Function4[/* cellNode */ Any, /* row */ Any, /* dataContext */ Any, /* colDef */ Any, Unit]
  ] = js.undefined
  
  /**
    * Used by the the slick.rowMoveManager.js plugin for moving rows. Has no effect without the plugin installed.
    **/
  var behavior: js.UndefOr[Any] = js.undefined
  
  /**
    * In the "Add New" row, determines whether clicking cells in this column can trigger row addition. If true, clicking on the cell in this column in the "Add New" row will not trigger row addition.
    **/
  var cannotTriggerInsert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Accepts a string as a class name, applies that class to every row cell in the column.
    **/
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, the first user click on the header will do a descending sort. When set to false, the first user click on the header will do an ascending sort.
    **/
  var defaultSortAsc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The editor for cell edits {TextEditor, IntegerEditor, DateEditor...} See slick.editors.js
    **/
  var editor: js.UndefOr[Any] = js.undefined
  
  // typeof Editors.Editor<T>;
  /**
    * The property name in the data object to pull content from. (This is assumed to be on the root of the data object.)
    **/
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * When set to false, clicking on a cell in this column will not select the row for that cell. The cells in this column will also be skipped during tab navigation.
    **/
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This accepts a function of the form function(row, cell, value, columnDef, dataContext) and returns a formatted version of the data in each cell of this column. For example, setting formatter to function(r, c, v, cd, dc) { return "Hello!"; } would overwrite every value in the column with "Hello!" See defaultFormatter in slick.grid.js for an example formatter.
    * @param row
    * @param cell
    * @param value
    * @param columnDef
    * @param dataContext
    * @return
    **/
  var formatter: js.UndefOr[Formatter[T]] = js.undefined
  
  var header: js.UndefOr[Header] = js.undefined
  
  /**
    * Accepts a string as a class name, applies that class to the cell for the column header.
    **/
  var headerCssClass: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the column within the grid.
    **/
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Set the maximum allowable width of this column, in pixels.
    **/
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    *  Set the minimum allowable width of this column, in pixels.
    **/
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The text to display on the column heading.
    **/
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, whenever this column is resized, the entire table view will rerender.
    **/
  var rerenderOnResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, column can no longer be resized.
    **/
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, when a row is selected, the CSS class for selected cells ("selected" by default) is not applied to the cell in this column.
    **/
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the column will be sortable by clicking on the header.
    **/
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to a non-empty string, a tooltip will appear on hover containing the string.
    **/
  var toolTip: js.UndefOr[String] = js.undefined
  
  /**
    * Width of the column in pixels. (May often be overridden by things like minWidth, maxWidth, forceFitColumns, etc.)
    **/
  var width: js.UndefOr[Double] = js.undefined
}
object Column {
  
  inline def apply[T /* <: SlickData */](): Column[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column[?], T /* <: SlickData */] (val x: Self & Column[T]) extends AnyVal {
    
    inline def setAsyncPostRender(value: (/* cellNode */ Any, /* row */ Any, /* dataContext */ Any, /* colDef */ Any) => Unit): Self = StObject.set(x, "asyncPostRender", js.Any.fromFunction4(value))
    
    inline def setAsyncPostRenderUndefined: Self = StObject.set(x, "asyncPostRender", js.undefined)
    
    inline def setBehavior(value: Any): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setCannotTriggerInsert(value: Boolean): Self = StObject.set(x, "cannotTriggerInsert", value.asInstanceOf[js.Any])
    
    inline def setCannotTriggerInsertUndefined: Self = StObject.set(x, "cannotTriggerInsert", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDefaultSortAsc(value: Boolean): Self = StObject.set(x, "defaultSortAsc", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortAscUndefined: Self = StObject.set(x, "defaultSortAsc", js.undefined)
    
    inline def setEditor(value: Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderCssClass(value: String): Self = StObject.set(x, "headerCssClass", value.asInstanceOf[js.Any])
    
    inline def setHeaderCssClassUndefined: Self = StObject.set(x, "headerCssClass", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRerenderOnResize(value: Boolean): Self = StObject.set(x, "rerenderOnResize", value.asInstanceOf[js.Any])
    
    inline def setRerenderOnResizeUndefined: Self = StObject.set(x, "rerenderOnResize", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
