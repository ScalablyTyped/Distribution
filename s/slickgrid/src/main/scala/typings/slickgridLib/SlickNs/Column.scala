package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[T /* <: SlickData */] extends js.Object {
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
      scala.Unit
    ]
  ] = js.undefined
  /**
  		* Used by the the slick.rowMoveManager.js plugin for moving rows. Has no effect without the plugin installed.
  		**/
  var behavior: js.UndefOr[js.Any] = js.undefined
  /**
  		* In the "Add New" row, determines whether clicking cells in this column can trigger row addition. If true, clicking on the cell in this column in the "Add New" row will not trigger row addition.
  		**/
  var cannotTriggerInsert: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Accepts a string as a class name, applies that class to every row cell in the column.
  		**/
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* When set to true, the first user click on the header will do a descending sort. When set to false, the first user click on the header will do an ascending sort.
  		**/
  var defaultSortAsc: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* The editor for cell edits {TextEditor, IntegerEditor, DateEditor...} See slick.editors.js
  		**/
  var editor: js.UndefOr[js.Any] = js.undefined
   // typeof Editors.Editor<T>;
  /**
  		* The property name in the data object to pull content from. (This is assumed to be on the root of the data object.)
  		**/
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* When set to false, clicking on a cell in this column will not select the row for that cell. The cells in this column will also be skipped during tab navigation.
  		**/
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
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
  var headerCssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* A unique identifier for the column within the grid.
  		**/
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* Set the maximum allowable width of this column, in pixels.
  		**/
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  		*  Set the minimum allowable width of this column, in pixels.
  		**/
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  		* The text to display on the column heading.
  		**/
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* If set to true, whenever this column is resized, the entire table view will rerender.
  		**/
  var rerenderOnResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If false, column can no longer be resized.
  		**/
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If false, when a row is selected, the CSS class for selected cells ("selected" by default) is not applied to the cell in this column.
  		**/
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If true, the column will be sortable by clicking on the header.
  		**/
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If set to a non-empty string, a tooltip will appear on hover containing the string.
  		**/
  var toolTip: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* Width of the column in pixels. (May often be overridden by things like minWidth, maxWidth, forceFitColumns, etc.)
  		**/
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Column {
  @scala.inline
  def apply[T /* <: SlickData */](
    asyncPostRender: js.Function4[
      /* cellNode */ js.Any, 
      /* row */ js.Any, 
      /* dataContext */ js.Any, 
      /* colDef */ js.Any, 
      scala.Unit
    ] = null,
    behavior: js.Any = null,
    cannotTriggerInsert: js.UndefOr[scala.Boolean] = js.undefined,
    cssClass: java.lang.String = null,
    defaultSortAsc: js.UndefOr[scala.Boolean] = js.undefined,
    editor: js.Any = null,
    field: java.lang.String = null,
    focusable: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: Formatter[T] = null,
    header: Header = null,
    headerCssClass: java.lang.String = null,
    id: java.lang.String = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    rerenderOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    toolTip: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Column[T] = {
    val __obj = js.Dynamic.literal()
    if (asyncPostRender != null) __obj.updateDynamic("asyncPostRender")(asyncPostRender)
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (!js.isUndefined(cannotTriggerInsert)) __obj.updateDynamic("cannotTriggerInsert")(cannotTriggerInsert)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(defaultSortAsc)) __obj.updateDynamic("defaultSortAsc")(defaultSortAsc)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerCssClass != null) __obj.updateDynamic("headerCssClass")(headerCssClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(rerenderOnResize)) __obj.updateDynamic("rerenderOnResize")(rerenderOnResize)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
}

