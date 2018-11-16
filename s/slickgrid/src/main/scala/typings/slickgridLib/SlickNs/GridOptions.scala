package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GridOptions[T /* <: SlickData */] extends js.Object {
  /**
  		* Delay after which cell editor is loaded. Ignored unless asyncEditorLoading is true.
  		**/
  var asyncEditorLoadDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  		* Makes cell editors load asynchronously after a small delay. This greatly increases keyboard navigation speed.
  		**/
  var asyncEditorLoading: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var asyncPostRenderDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  		* Cell will not automatically go into edit mode when selected.
  		**/
  var autoEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* A CSS class to apply to flashing cells via flashCell().
  		**/
  var cellFlashingCssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* A CSS class to apply to cells highlighted via setHighlightedCells().
  		**/
  var cellHighlightCssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  		*
  		**/
  var dataItemColumnValueExtractor: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var defaultColumnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var defaultFormatter: js.UndefOr[Formatter[T]] = js.undefined
  /**
  		* Not listed as a default under options in slick.grid.js
  		**/
  var editCommandHandler: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var editable: js.UndefOr[scala.Boolean] = js.undefined
   // queueAndExecuteCommand
  /**
  		* A factory object responsible to creating an editor for a given cell. Must implement getEditor(column).
  		**/
  var editorFactory: js.UndefOr[EditorFactory] = js.undefined
  /**
  		* A Slick.EditorLock instance to use for controlling concurrent data edits.
  		**/
  var editorLock: js.UndefOr[EditorLock[T]] = js.undefined
  /**
  		* If true, a blank row will be displayed at the bottom - typing values in that row will add a new one. Must subscribe to onAddNewRow to save values.
  		**/
  var enableAddRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If true, async post rendering will occur and asyncPostRender delegates on columns will be called.
  		**/
  var enableAsyncPostRender: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Appears to enable cell virtualisation for optimised speed with large datasets
  		**/
  var enableCellNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableCellRangeSelection: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var enableColumnReorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableRowReordering: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var enableTextSelectionOnCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* @see Example: Explicit Initialization
  		**/
  var explicitInitialization: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Force column sizes to fit into the container (preventing horizontal scrolling). Effectively sets column width to be 1/Number of Columns which on small containers may not be desirable
  		**/
  var forceFitColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var forceSyncScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* A factory object responsible to creating a formatter for a given cell. Must implement getFormatter(column).
  		**/
  var formatterFactory: js.UndefOr[FormatterFactory[T]] = js.undefined
  /**
  		* Will expand the table row divs to the full width of the container, table cell divs will remain aligned to the left
  		**/
  var fullWidthRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var leaveSpaceForNewRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* @see Example: Multi-Column Sort
  		**/
  var multiColumnSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var selectedCellCssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  		*
  		**/
  var showHeaderRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If true, the column being resized will change its width as the mouse is dragging the resize handle. If false, the column will resize after mouse drag ends.
  		**/
  var syncColumnCellResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var topPanelHeight: js.UndefOr[scala.Double] = js.undefined
}

