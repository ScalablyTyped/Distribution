package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOptions[T /* <: SlickData */] extends StObject {
  
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
  implicit class GridOptionsMutableBuilder[Self <: GridOptions[_], T /* <: SlickData */] (val x: Self with GridOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAddNewRowCssClass(value: String): Self = StObject.set(x, "addNewRowCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNewRowCssClassUndefined: Self = StObject.set(x, "addNewRowCssClass", js.undefined)
    
    @scala.inline
    def setAlwaysAllowHorizontalScroll(value: Boolean): Self = StObject.set(x, "alwaysAllowHorizontalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysAllowHorizontalScrollUndefined: Self = StObject.set(x, "alwaysAllowHorizontalScroll", js.undefined)
    
    @scala.inline
    def setAlwaysShowVerticalScroll(value: Boolean): Self = StObject.set(x, "alwaysShowVerticalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysShowVerticalScrollUndefined: Self = StObject.set(x, "alwaysShowVerticalScroll", js.undefined)
    
    @scala.inline
    def setAsyncEditorLoadDelay(value: Double): Self = StObject.set(x, "asyncEditorLoadDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncEditorLoadDelayUndefined: Self = StObject.set(x, "asyncEditorLoadDelay", js.undefined)
    
    @scala.inline
    def setAsyncEditorLoading(value: Boolean): Self = StObject.set(x, "asyncEditorLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncEditorLoadingUndefined: Self = StObject.set(x, "asyncEditorLoading", js.undefined)
    
    @scala.inline
    def setAsyncPostRenderCleanupDelay(value: Double): Self = StObject.set(x, "asyncPostRenderCleanupDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncPostRenderCleanupDelayUndefined: Self = StObject.set(x, "asyncPostRenderCleanupDelay", js.undefined)
    
    @scala.inline
    def setAsyncPostRenderDelay(value: Double): Self = StObject.set(x, "asyncPostRenderDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncPostRenderDelayUndefined: Self = StObject.set(x, "asyncPostRenderDelay", js.undefined)
    
    @scala.inline
    def setAutoEdit(value: Boolean): Self = StObject.set(x, "autoEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEditUndefined: Self = StObject.set(x, "autoEdit", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    @scala.inline
    def setCellFlashingCssClass(value: String): Self = StObject.set(x, "cellFlashingCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFlashingCssClassUndefined: Self = StObject.set(x, "cellFlashingCssClass", js.undefined)
    
    @scala.inline
    def setCellHighlightCssClass(value: String): Self = StObject.set(x, "cellHighlightCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHighlightCssClassUndefined: Self = StObject.set(x, "cellHighlightCssClass", js.undefined)
    
    @scala.inline
    def setCreateFooterRow(value: Boolean): Self = StObject.set(x, "createFooterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFooterRowUndefined: Self = StObject.set(x, "createFooterRow", js.undefined)
    
    @scala.inline
    def setCreatePreHeaderPanel(value: Boolean): Self = StObject.set(x, "createPreHeaderPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePreHeaderPanelUndefined: Self = StObject.set(x, "createPreHeaderPanel", js.undefined)
    
    @scala.inline
    def setDataItemColumnValueExtractor(value: (/* item */ js.Any, /* columnDef */ js.Any) => _): Self = StObject.set(x, "dataItemColumnValueExtractor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataItemColumnValueExtractorUndefined: Self = StObject.set(x, "dataItemColumnValueExtractor", js.undefined)
    
    @scala.inline
    def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
    
    @scala.inline
    def setDefaultFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = StObject.set(x, "defaultFormatter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDefaultFormatterUndefined: Self = StObject.set(x, "defaultFormatter", js.undefined)
    
    @scala.inline
    def setDoPaging(value: Boolean): Self = StObject.set(x, "doPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoPagingUndefined: Self = StObject.set(x, "doPaging", js.undefined)
    
    @scala.inline
    def setEditCommandHandler(value: js.Any): Self = StObject.set(x, "editCommandHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditCommandHandlerUndefined: Self = StObject.set(x, "editCommandHandler", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditorCellNavOnLRKeys(value: Boolean): Self = StObject.set(x, "editorCellNavOnLRKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorCellNavOnLRKeysUndefined: Self = StObject.set(x, "editorCellNavOnLRKeys", js.undefined)
    
    @scala.inline
    def setEditorFactory(value: EditorFactory): Self = StObject.set(x, "editorFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorFactoryUndefined: Self = StObject.set(x, "editorFactory", js.undefined)
    
    @scala.inline
    def setEditorLock(value: EditorLock[T]): Self = StObject.set(x, "editorLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorLockUndefined: Self = StObject.set(x, "editorLock", js.undefined)
    
    @scala.inline
    def setEmulatePagingWhenScrolling(value: Boolean): Self = StObject.set(x, "emulatePagingWhenScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulatePagingWhenScrollingUndefined: Self = StObject.set(x, "emulatePagingWhenScrolling", js.undefined)
    
    @scala.inline
    def setEnableAddRow(value: Boolean): Self = StObject.set(x, "enableAddRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAddRowUndefined: Self = StObject.set(x, "enableAddRow", js.undefined)
    
    @scala.inline
    def setEnableAsyncPostRender(value: Boolean): Self = StObject.set(x, "enableAsyncPostRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAsyncPostRenderCleanup(value: Boolean): Self = StObject.set(x, "enableAsyncPostRenderCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAsyncPostRenderCleanupUndefined: Self = StObject.set(x, "enableAsyncPostRenderCleanup", js.undefined)
    
    @scala.inline
    def setEnableAsyncPostRenderUndefined: Self = StObject.set(x, "enableAsyncPostRender", js.undefined)
    
    @scala.inline
    def setEnableCellNavigation(value: Boolean): Self = StObject.set(x, "enableCellNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellNavigationUndefined: Self = StObject.set(x, "enableCellNavigation", js.undefined)
    
    @scala.inline
    def setEnableCellRangeSelection(value: js.Any): Self = StObject.set(x, "enableCellRangeSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellRangeSelectionUndefined: Self = StObject.set(x, "enableCellRangeSelection", js.undefined)
    
    @scala.inline
    def setEnableColumnReorder(value: Boolean): Self = StObject.set(x, "enableColumnReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnReorderUndefined: Self = StObject.set(x, "enableColumnReorder", js.undefined)
    
    @scala.inline
    def setEnableRowReordering(value: js.Any): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
    
    @scala.inline
    def setEnableTextSelectionOnCells(value: Boolean): Self = StObject.set(x, "enableTextSelectionOnCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTextSelectionOnCellsUndefined: Self = StObject.set(x, "enableTextSelectionOnCells", js.undefined)
    
    @scala.inline
    def setExplicitInitialization(value: Boolean): Self = StObject.set(x, "explicitInitialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitInitializationUndefined: Self = StObject.set(x, "explicitInitialization", js.undefined)
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = StObject.set(x, "footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRowHeightUndefined: Self = StObject.set(x, "footerRowHeight", js.undefined)
    
    @scala.inline
    def setForceFitColumns(value: Boolean): Self = StObject.set(x, "forceFitColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFitColumnsUndefined: Self = StObject.set(x, "forceFitColumns", js.undefined)
    
    @scala.inline
    def setForceSyncScrolling(value: Boolean): Self = StObject.set(x, "forceSyncScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSyncScrollingUndefined: Self = StObject.set(x, "forceSyncScrolling", js.undefined)
    
    @scala.inline
    def setFormatterFactory(value: FormatterFactory[T]): Self = StObject.set(x, "formatterFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterFactoryUndefined: Self = StObject.set(x, "formatterFactory", js.undefined)
    
    @scala.inline
    def setFrozenBottom(value: Boolean): Self = StObject.set(x, "frozenBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenBottomUndefined: Self = StObject.set(x, "frozenBottom", js.undefined)
    
    @scala.inline
    def setFrozenColumn(value: Double): Self = StObject.set(x, "frozenColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenColumnUndefined: Self = StObject.set(x, "frozenColumn", js.undefined)
    
    @scala.inline
    def setFrozenRow(value: Double): Self = StObject.set(x, "frozenRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenRowUndefined: Self = StObject.set(x, "frozenRow", js.undefined)
    
    @scala.inline
    def setFullWidthRows(value: Boolean): Self = StObject.set(x, "fullWidthRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthRowsUndefined: Self = StObject.set(x, "fullWidthRows", js.undefined)
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
    
    @scala.inline
    def setLeaveSpaceForNewRows(value: Boolean): Self = StObject.set(x, "leaveSpaceForNewRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveSpaceForNewRowsUndefined: Self = StObject.set(x, "leaveSpaceForNewRows", js.undefined)
    
    @scala.inline
    def setMinRowBuffer(value: Double): Self = StObject.set(x, "minRowBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowBufferUndefined: Self = StObject.set(x, "minRowBuffer", js.undefined)
    
    @scala.inline
    def setMultiColumnSort(value: Boolean): Self = StObject.set(x, "multiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiColumnSortUndefined: Self = StObject.set(x, "multiColumnSort", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    @scala.inline
    def setNumberedMultiColumnSort(value: Boolean): Self = StObject.set(x, "numberedMultiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberedMultiColumnSortUndefined: Self = StObject.set(x, "numberedMultiColumnSort", js.undefined)
    
    @scala.inline
    def setPreHeaderPanelHeight(value: Double): Self = StObject.set(x, "preHeaderPanelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreHeaderPanelHeightUndefined: Self = StObject.set(x, "preHeaderPanelHeight", js.undefined)
    
    @scala.inline
    def setPreserveCopiedSelectionOnPaste(value: Boolean): Self = StObject.set(x, "preserveCopiedSelectionOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveCopiedSelectionOnPasteUndefined: Self = StObject.set(x, "preserveCopiedSelectionOnPaste", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setSelectedCellCssClass(value: String): Self = StObject.set(x, "selectedCellCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCellCssClassUndefined: Self = StObject.set(x, "selectedCellCssClass", js.undefined)
    
    @scala.inline
    def setShowCellSelection(value: Boolean): Self = StObject.set(x, "showCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCellSelectionUndefined: Self = StObject.set(x, "showCellSelection", js.undefined)
    
    @scala.inline
    def setShowFooterRow(value: Boolean): Self = StObject.set(x, "showFooterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooterRowUndefined: Self = StObject.set(x, "showFooterRow", js.undefined)
    
    @scala.inline
    def setShowHeaderRow(value: Boolean): Self = StObject.set(x, "showHeaderRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeaderRowUndefined: Self = StObject.set(x, "showHeaderRow", js.undefined)
    
    @scala.inline
    def setShowPreHeaderPanel(value: Boolean): Self = StObject.set(x, "showPreHeaderPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPreHeaderPanelUndefined: Self = StObject.set(x, "showPreHeaderPanel", js.undefined)
    
    @scala.inline
    def setShowTopPanel(value: Boolean): Self = StObject.set(x, "showTopPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTopPanelUndefined: Self = StObject.set(x, "showTopPanel", js.undefined)
    
    @scala.inline
    def setSortColNumberInSeparateSpan(value: Boolean): Self = StObject.set(x, "sortColNumberInSeparateSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColNumberInSeparateSpanUndefined: Self = StObject.set(x, "sortColNumberInSeparateSpan", js.undefined)
    
    @scala.inline
    def setSuppressActiveCellChangeOnEdit(value: Boolean): Self = StObject.set(x, "suppressActiveCellChangeOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressActiveCellChangeOnEditUndefined: Self = StObject.set(x, "suppressActiveCellChangeOnEdit", js.undefined)
    
    @scala.inline
    def setSyncColumnCellResize(value: Boolean): Self = StObject.set(x, "syncColumnCellResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncColumnCellResizeUndefined: Self = StObject.set(x, "syncColumnCellResize", js.undefined)
    
    @scala.inline
    def setTopPanelHeight(value: Double): Self = StObject.set(x, "topPanelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopPanelHeightUndefined: Self = StObject.set(x, "topPanelHeight", js.undefined)
    
    @scala.inline
    def setTristateMultiColumnSort(value: Boolean): Self = StObject.set(x, "tristateMultiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTristateMultiColumnSortUndefined: Self = StObject.set(x, "tristateMultiColumnSort", js.undefined)
    
    @scala.inline
    def setViewportClass(value: String): Self = StObject.set(x, "viewportClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportClassUndefined: Self = StObject.set(x, "viewportClass", js.undefined)
  }
}
