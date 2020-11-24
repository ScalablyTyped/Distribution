package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOptions[T /* <: SlickData */] extends js.Object {
  
  var addNewRowCssClass: js.UndefOr[String] = js.native
  
  var alwaysAllowHorizontalScroll: js.UndefOr[Boolean] = js.native
  
  var alwaysShowVerticalScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay after which cell editor is loaded. Ignored unless asyncEditorLoading is true.
    **/
  var asyncEditorLoadDelay: js.UndefOr[Double] = js.native
  
  /**
    * Makes cell editors load asynchronously after a small delay. This greatly increases keyboard navigation speed.
    **/
  var asyncEditorLoading: js.UndefOr[Boolean] = js.native
  
  var asyncPostRenderCleanupDelay: js.UndefOr[Double] = js.native
  
  /**
    *
    **/
  var asyncPostRenderDelay: js.UndefOr[Double] = js.native
  
  /**
    * Cell will not automatically go into edit mode when selected.
    **/
  var autoEdit: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * A CSS class to apply to flashing cells via flashCell().
    **/
  var cellFlashingCssClass: js.UndefOr[String] = js.native
  
  /**
    * A CSS class to apply to cells highlighted via setHighlightedCells().
    **/
  var cellHighlightCssClass: js.UndefOr[String] = js.native
  
  var createFooterRow: js.UndefOr[Boolean] = js.native
  
  var createPreHeaderPanel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var dataItemColumnValueExtractor: js.UndefOr[js.Function2[/* item */ js.Any, /* columnDef */ js.Any, _]] = js.native
  
  /**
    *
    **/
  var defaultColumnWidth: js.UndefOr[Double] = js.native
  
  /**
    *
    **/
  var defaultFormatter: js.UndefOr[Formatter[T]] = js.native
  
  var doPaging: js.UndefOr[Boolean] = js.native
  
  /**
    * Not listed as a default under options in slick.grid.js
    **/
  var editCommandHandler: js.UndefOr[js.Any] = js.native
  
  /**
    *
    **/
  var editable: js.UndefOr[Boolean] = js.native
  
  var editorCellNavOnLRKeys: js.UndefOr[Boolean] = js.native
  
   // queueAndExecuteCommand
  /**
    * A factory object responsible to creating an editor for a given cell. Must implement getEditor(column).
    **/
  var editorFactory: js.UndefOr[EditorFactory] = js.native
  
  /**
    * A Slick.EditorLock instance to use for controlling concurrent data edits.
    **/
  var editorLock: js.UndefOr[EditorLock[T]] = js.native
  
  var emulatePagingWhenScrolling: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, a blank row will be displayed at the bottom - typing values in that row will add a new one. Must subscribe to onAddNewRow to save values.
    **/
  var enableAddRow: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, async post rendering will occur and asyncPostRender delegates on columns will be called.
    **/
  var enableAsyncPostRender: js.UndefOr[Boolean] = js.native
  
  var enableAsyncPostRenderCleanup: js.UndefOr[Boolean] = js.native
  
  /**
    * Appears to enable cell virtualisation for optimised speed with large datasets
    **/
  var enableCellNavigation: js.UndefOr[Boolean] = js.native
  
  /**
    * *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
    **/
  var enableCellRangeSelection: js.UndefOr[js.Any] = js.native
  
  /**
    *
    **/
  var enableColumnReorder: js.UndefOr[Boolean] = js.native
  
  /**
    * *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
    **/
  var enableRowReordering: js.UndefOr[js.Any] = js.native
  
  /**
    *
    **/
  var enableTextSelectionOnCells: js.UndefOr[Boolean] = js.native
  
  /**
    * @see Example: Explicit Initialization
    **/
  var explicitInitialization: js.UndefOr[Boolean] = js.native
  
  var footerRowHeight: js.UndefOr[Double] = js.native
  
  /**
    * Force column sizes to fit into the container (preventing horizontal scrolling). Effectively sets column width to be 1/Number of Columns which on small containers may not be desirable
    **/
  var forceFitColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var forceSyncScrolling: js.UndefOr[Boolean] = js.native
  
  /**
    * A factory object responsible to creating a formatter for a given cell. Must implement getFormatter(column).
    **/
  var formatterFactory: js.UndefOr[FormatterFactory[T]] = js.native
  
  var frozenBottom: js.UndefOr[Boolean] = js.native
  
  var frozenColumn: js.UndefOr[Double] = js.native
  
  var frozenRow: js.UndefOr[Double] = js.native
  
  /**
    * Will expand the table row divs to the full width of the container, table cell divs will remain aligned to the left
    **/
  var fullWidthRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var headerRowHeight: js.UndefOr[Double] = js.native
  
  /**
    *
    **/
  var leaveSpaceForNewRows: js.UndefOr[Boolean] = js.native
  
  var minRowBuffer: js.UndefOr[Double] = js.native
  
  /**
    * @see Example: Multi-Column Sort
    **/
  var multiColumnSort: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  var numberedMultiColumnSort: js.UndefOr[Boolean] = js.native
  
  var preHeaderPanelHeight: js.UndefOr[Double] = js.native
  
  var preserveCopiedSelectionOnPaste: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var rowHeight: js.UndefOr[Double] = js.native
  
  /**
    *
    **/
  var selectedCellCssClass: js.UndefOr[String] = js.native
  
  var showCellSelection: js.UndefOr[Boolean] = js.native
  
  var showFooterRow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var showHeaderRow: js.UndefOr[Boolean] = js.native
  
  var showPreHeaderPanel: js.UndefOr[Boolean] = js.native
  
  var showTopPanel: js.UndefOr[Boolean] = js.native
  
  var sortColNumberInSeparateSpan: js.UndefOr[Boolean] = js.native
  
  var suppressActiveCellChangeOnEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the column being resized will change its width as the mouse is dragging the resize handle. If false, the column will resize after mouse drag ends.
    **/
  var syncColumnCellResize: js.UndefOr[Boolean] = js.native
  
  /**
    *
    **/
  var topPanelHeight: js.UndefOr[Double] = js.native
  
  var tristateMultiColumnSort: js.UndefOr[Boolean] = js.native
  
  var viewportClass: js.UndefOr[String] = js.native
}
object GridOptions {
  
  @scala.inline
  def apply[T /* <: SlickData */](): GridOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions[T]]
  }
  
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions[_], T /* <: SlickData */] (val x: Self with GridOptions[T]) extends AnyVal {
    
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
    def setAddNewRowCssClass(value: String): Self = this.set("addNewRowCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddNewRowCssClass: Self = this.set("addNewRowCssClass", js.undefined)
    
    @scala.inline
    def setAlwaysAllowHorizontalScroll(value: Boolean): Self = this.set("alwaysAllowHorizontalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysAllowHorizontalScroll: Self = this.set("alwaysAllowHorizontalScroll", js.undefined)
    
    @scala.inline
    def setAlwaysShowVerticalScroll(value: Boolean): Self = this.set("alwaysShowVerticalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysShowVerticalScroll: Self = this.set("alwaysShowVerticalScroll", js.undefined)
    
    @scala.inline
    def setAsyncEditorLoadDelay(value: Double): Self = this.set("asyncEditorLoadDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncEditorLoadDelay: Self = this.set("asyncEditorLoadDelay", js.undefined)
    
    @scala.inline
    def setAsyncEditorLoading(value: Boolean): Self = this.set("asyncEditorLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncEditorLoading: Self = this.set("asyncEditorLoading", js.undefined)
    
    @scala.inline
    def setAsyncPostRenderCleanupDelay(value: Double): Self = this.set("asyncPostRenderCleanupDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncPostRenderCleanupDelay: Self = this.set("asyncPostRenderCleanupDelay", js.undefined)
    
    @scala.inline
    def setAsyncPostRenderDelay(value: Double): Self = this.set("asyncPostRenderDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncPostRenderDelay: Self = this.set("asyncPostRenderDelay", js.undefined)
    
    @scala.inline
    def setAutoEdit(value: Boolean): Self = this.set("autoEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEdit: Self = this.set("autoEdit", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setCellFlashingCssClass(value: String): Self = this.set("cellFlashingCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellFlashingCssClass: Self = this.set("cellFlashingCssClass", js.undefined)
    
    @scala.inline
    def setCellHighlightCssClass(value: String): Self = this.set("cellHighlightCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHighlightCssClass: Self = this.set("cellHighlightCssClass", js.undefined)
    
    @scala.inline
    def setCreateFooterRow(value: Boolean): Self = this.set("createFooterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFooterRow: Self = this.set("createFooterRow", js.undefined)
    
    @scala.inline
    def setCreatePreHeaderPanel(value: Boolean): Self = this.set("createPreHeaderPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatePreHeaderPanel: Self = this.set("createPreHeaderPanel", js.undefined)
    
    @scala.inline
    def setDataItemColumnValueExtractor(value: (/* item */ js.Any, /* columnDef */ js.Any) => _): Self = this.set("dataItemColumnValueExtractor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataItemColumnValueExtractor: Self = this.set("dataItemColumnValueExtractor", js.undefined)
    
    @scala.inline
    def setDefaultColumnWidth(value: Double): Self = this.set("defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumnWidth: Self = this.set("defaultColumnWidth", js.undefined)
    
    @scala.inline
    def setDefaultFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = this.set("defaultFormatter", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteDefaultFormatter: Self = this.set("defaultFormatter", js.undefined)
    
    @scala.inline
    def setDoPaging(value: Boolean): Self = this.set("doPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoPaging: Self = this.set("doPaging", js.undefined)
    
    @scala.inline
    def setEditCommandHandler(value: js.Any): Self = this.set("editCommandHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditCommandHandler: Self = this.set("editCommandHandler", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditorCellNavOnLRKeys(value: Boolean): Self = this.set("editorCellNavOnLRKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorCellNavOnLRKeys: Self = this.set("editorCellNavOnLRKeys", js.undefined)
    
    @scala.inline
    def setEditorFactory(value: EditorFactory): Self = this.set("editorFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorFactory: Self = this.set("editorFactory", js.undefined)
    
    @scala.inline
    def setEditorLock(value: EditorLock[T]): Self = this.set("editorLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorLock: Self = this.set("editorLock", js.undefined)
    
    @scala.inline
    def setEmulatePagingWhenScrolling(value: Boolean): Self = this.set("emulatePagingWhenScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulatePagingWhenScrolling: Self = this.set("emulatePagingWhenScrolling", js.undefined)
    
    @scala.inline
    def setEnableAddRow(value: Boolean): Self = this.set("enableAddRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAddRow: Self = this.set("enableAddRow", js.undefined)
    
    @scala.inline
    def setEnableAsyncPostRender(value: Boolean): Self = this.set("enableAsyncPostRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAsyncPostRender: Self = this.set("enableAsyncPostRender", js.undefined)
    
    @scala.inline
    def setEnableAsyncPostRenderCleanup(value: Boolean): Self = this.set("enableAsyncPostRenderCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAsyncPostRenderCleanup: Self = this.set("enableAsyncPostRenderCleanup", js.undefined)
    
    @scala.inline
    def setEnableCellNavigation(value: Boolean): Self = this.set("enableCellNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellNavigation: Self = this.set("enableCellNavigation", js.undefined)
    
    @scala.inline
    def setEnableCellRangeSelection(value: js.Any): Self = this.set("enableCellRangeSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellRangeSelection: Self = this.set("enableCellRangeSelection", js.undefined)
    
    @scala.inline
    def setEnableColumnReorder(value: Boolean): Self = this.set("enableColumnReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnReorder: Self = this.set("enableColumnReorder", js.undefined)
    
    @scala.inline
    def setEnableRowReordering(value: js.Any): Self = this.set("enableRowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowReordering: Self = this.set("enableRowReordering", js.undefined)
    
    @scala.inline
    def setEnableTextSelectionOnCells(value: Boolean): Self = this.set("enableTextSelectionOnCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTextSelectionOnCells: Self = this.set("enableTextSelectionOnCells", js.undefined)
    
    @scala.inline
    def setExplicitInitialization(value: Boolean): Self = this.set("explicitInitialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitInitialization: Self = this.set("explicitInitialization", js.undefined)
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = this.set("footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRowHeight: Self = this.set("footerRowHeight", js.undefined)
    
    @scala.inline
    def setForceFitColumns(value: Boolean): Self = this.set("forceFitColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFitColumns: Self = this.set("forceFitColumns", js.undefined)
    
    @scala.inline
    def setForceSyncScrolling(value: Boolean): Self = this.set("forceSyncScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSyncScrolling: Self = this.set("forceSyncScrolling", js.undefined)
    
    @scala.inline
    def setFormatterFactory(value: FormatterFactory[T]): Self = this.set("formatterFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterFactory: Self = this.set("formatterFactory", js.undefined)
    
    @scala.inline
    def setFrozenBottom(value: Boolean): Self = this.set("frozenBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenBottom: Self = this.set("frozenBottom", js.undefined)
    
    @scala.inline
    def setFrozenColumn(value: Double): Self = this.set("frozenColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenColumn: Self = this.set("frozenColumn", js.undefined)
    
    @scala.inline
    def setFrozenRow(value: Double): Self = this.set("frozenRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenRow: Self = this.set("frozenRow", js.undefined)
    
    @scala.inline
    def setFullWidthRows(value: Boolean): Self = this.set("fullWidthRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidthRows: Self = this.set("fullWidthRows", js.undefined)
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = this.set("headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRowHeight: Self = this.set("headerRowHeight", js.undefined)
    
    @scala.inline
    def setLeaveSpaceForNewRows(value: Boolean): Self = this.set("leaveSpaceForNewRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveSpaceForNewRows: Self = this.set("leaveSpaceForNewRows", js.undefined)
    
    @scala.inline
    def setMinRowBuffer(value: Double): Self = this.set("minRowBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRowBuffer: Self = this.set("minRowBuffer", js.undefined)
    
    @scala.inline
    def setMultiColumnSort(value: Boolean): Self = this.set("multiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiColumnSort: Self = this.set("multiColumnSort", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setNumberedMultiColumnSort(value: Boolean): Self = this.set("numberedMultiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberedMultiColumnSort: Self = this.set("numberedMultiColumnSort", js.undefined)
    
    @scala.inline
    def setPreHeaderPanelHeight(value: Double): Self = this.set("preHeaderPanelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreHeaderPanelHeight: Self = this.set("preHeaderPanelHeight", js.undefined)
    
    @scala.inline
    def setPreserveCopiedSelectionOnPaste(value: Boolean): Self = this.set("preserveCopiedSelectionOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveCopiedSelectionOnPaste: Self = this.set("preserveCopiedSelectionOnPaste", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setSelectedCellCssClass(value: String): Self = this.set("selectedCellCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCellCssClass: Self = this.set("selectedCellCssClass", js.undefined)
    
    @scala.inline
    def setShowCellSelection(value: Boolean): Self = this.set("showCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCellSelection: Self = this.set("showCellSelection", js.undefined)
    
    @scala.inline
    def setShowFooterRow(value: Boolean): Self = this.set("showFooterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooterRow: Self = this.set("showFooterRow", js.undefined)
    
    @scala.inline
    def setShowHeaderRow(value: Boolean): Self = this.set("showHeaderRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeaderRow: Self = this.set("showHeaderRow", js.undefined)
    
    @scala.inline
    def setShowPreHeaderPanel(value: Boolean): Self = this.set("showPreHeaderPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreHeaderPanel: Self = this.set("showPreHeaderPanel", js.undefined)
    
    @scala.inline
    def setShowTopPanel(value: Boolean): Self = this.set("showTopPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTopPanel: Self = this.set("showTopPanel", js.undefined)
    
    @scala.inline
    def setSortColNumberInSeparateSpan(value: Boolean): Self = this.set("sortColNumberInSeparateSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortColNumberInSeparateSpan: Self = this.set("sortColNumberInSeparateSpan", js.undefined)
    
    @scala.inline
    def setSuppressActiveCellChangeOnEdit(value: Boolean): Self = this.set("suppressActiveCellChangeOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressActiveCellChangeOnEdit: Self = this.set("suppressActiveCellChangeOnEdit", js.undefined)
    
    @scala.inline
    def setSyncColumnCellResize(value: Boolean): Self = this.set("syncColumnCellResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncColumnCellResize: Self = this.set("syncColumnCellResize", js.undefined)
    
    @scala.inline
    def setTopPanelHeight(value: Double): Self = this.set("topPanelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopPanelHeight: Self = this.set("topPanelHeight", js.undefined)
    
    @scala.inline
    def setTristateMultiColumnSort(value: Boolean): Self = this.set("tristateMultiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTristateMultiColumnSort: Self = this.set("tristateMultiColumnSort", js.undefined)
    
    @scala.inline
    def setViewportClass(value: String): Self = this.set("viewportClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportClass: Self = this.set("viewportClass", js.undefined)
  }
}
