package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
    js.Function4[
      /* cellNode */ js.Any, 
      /* row */ js.Any, 
      /* dataContext */ js.Any, 
      /* colDef */ js.Any, 
      Unit
    ]
  ] = js.native
  
  /**
    * Used by the the slick.rowMoveManager.js plugin for moving rows. Has no effect without the plugin installed.
    **/
  var behavior: js.UndefOr[js.Any] = js.native
  
  /**
    * In the "Add New" row, determines whether clicking cells in this column can trigger row addition. If true, clicking on the cell in this column in the "Add New" row will not trigger row addition.
    **/
  var cannotTriggerInsert: js.UndefOr[Boolean] = js.native
  
  /**
    * Accepts a string as a class name, applies that class to every row cell in the column.
    **/
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * When set to true, the first user click on the header will do a descending sort. When set to false, the first user click on the header will do an ascending sort.
    **/
  var defaultSortAsc: js.UndefOr[Boolean] = js.native
  
  /**
    * The editor for cell edits {TextEditor, IntegerEditor, DateEditor...} See slick.editors.js
    **/
  var editor: js.UndefOr[js.Any] = js.native
  
  // typeof Editors.Editor<T>;
  /**
    * The property name in the data object to pull content from. (This is assumed to be on the root of the data object.)
    **/
  var field: js.UndefOr[String] = js.native
  
  /**
    * When set to false, clicking on a cell in this column will not select the row for that cell. The cells in this column will also be skipped during tab navigation.
    **/
  var focusable: js.UndefOr[Boolean] = js.native
  
  /**
    * This accepts a function of the form function(row, cell, value, columnDef, dataContext) and returns a formatted version of the data in each cell of this column. For example, setting formatter to function(r, c, v, cd, dc) { return "Hello!"; } would overwrite every value in the column with "Hello!" See defaultFormatter in slick.grid.js for an example formatter.
    * @param row
    * @param cell
    * @param value
    * @param columnDef
    * @param dataContext
    * @return
    **/
  var formatter: js.UndefOr[Formatter[T]] = js.native
  
  var header: js.UndefOr[Header] = js.native
  
  /**
    * Accepts a string as a class name, applies that class to the cell for the column header.
    **/
  var headerCssClass: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the column within the grid.
    **/
  var id: js.UndefOr[String] = js.native
  
  /**
    * Set the maximum allowable width of this column, in pixels.
    **/
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    *  Set the minimum allowable width of this column, in pixels.
    **/
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * The text to display on the column heading.
    **/
  var name: js.UndefOr[String] = js.native
  
  /**
    * If set to true, whenever this column is resized, the entire table view will rerender.
    **/
  var rerenderOnResize: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, column can no longer be resized.
    **/
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, when a row is selected, the CSS class for selected cells ("selected" by default) is not applied to the cell in this column.
    **/
  var selectable: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the column will be sortable by clicking on the header.
    **/
  var sortable: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to a non-empty string, a tooltip will appear on hover containing the string.
    **/
  var toolTip: js.UndefOr[String] = js.native
  
  /**
    * Width of the column in pixels. (May often be overridden by things like minWidth, maxWidth, forceFitColumns, etc.)
    **/
  var width: js.UndefOr[Double] = js.native
}
object Column {
  
  @scala.inline
  def apply[T /* <: SlickData */](): Column[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column[_], T /* <: SlickData */] (val x: Self with Column[T]) extends AnyVal {
    
    @scala.inline
    def setAsyncPostRender(
      value: (/* cellNode */ js.Any, /* row */ js.Any, /* dataContext */ js.Any, /* colDef */ js.Any) => Unit
    ): Self = StObject.set(x, "asyncPostRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAsyncPostRenderUndefined: Self = StObject.set(x, "asyncPostRender", js.undefined)
    
    @scala.inline
    def setBehavior(value: js.Any): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    @scala.inline
    def setCannotTriggerInsert(value: Boolean): Self = StObject.set(x, "cannotTriggerInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannotTriggerInsertUndefined: Self = StObject.set(x, "cannotTriggerInsert", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setDefaultSortAsc(value: Boolean): Self = StObject.set(x, "defaultSortAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortAscUndefined: Self = StObject.set(x, "defaultSortAsc", js.undefined)
    
    @scala.inline
    def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCssClass(value: String): Self = StObject.set(x, "headerCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCssClassUndefined: Self = StObject.set(x, "headerCssClass", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRerenderOnResize(value: Boolean): Self = StObject.set(x, "rerenderOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRerenderOnResizeUndefined: Self = StObject.set(x, "rerenderOnResize", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
