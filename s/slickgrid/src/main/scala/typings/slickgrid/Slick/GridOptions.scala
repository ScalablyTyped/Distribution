package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOptions[T /* <: SlickData */] extends StObject {
  
  var addNewRowCssClass: js.UndefOr[String] = js.undefined
  
  var alwaysAllowHorizontalScroll: js.UndefOr[Boolean] = js.undefined
  
  var alwaysShowVerticalScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Delay after which cell editor is loaded. Ignored unless asyncEditorLoading is true.
    **/
  var asyncEditorLoadDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Makes cell editors load asynchronously after a small delay. This greatly increases keyboard navigation speed.
    **/
  var asyncEditorLoading: js.UndefOr[Boolean] = js.undefined
  
  var asyncPostRenderCleanupDelay: js.UndefOr[Double] = js.undefined
  
  /**
    *
    **/
  var asyncPostRenderDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Cell will not automatically go into edit mode when selected.
    **/
  var autoEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A CSS class to apply to flashing cells via flashCell().
    **/
  var cellFlashingCssClass: js.UndefOr[String] = js.undefined
  
  /**
    * A CSS class to apply to cells highlighted via setHighlightedCells().
    **/
  var cellHighlightCssClass: js.UndefOr[String] = js.undefined
  
  var createFooterRow: js.UndefOr[Boolean] = js.undefined
  
  var createPreHeaderPanel: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var dataItemColumnValueExtractor: js.UndefOr[js.Function2[/* item */ Any, /* columnDef */ Any, Any]] = js.undefined
  
  /**
    *
    **/
  var defaultColumnWidth: js.UndefOr[Double] = js.undefined
  
  /**
    *
    **/
  var defaultFormatter: js.UndefOr[Formatter[T]] = js.undefined
  
  var doPaging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Not listed as a default under options in slick.grid.js
    **/
  var editCommandHandler: js.UndefOr[Any] = js.undefined
  
  /**
    *
    **/
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var editorCellNavOnLRKeys: js.UndefOr[Boolean] = js.undefined
  
  // queueAndExecuteCommand
  /**
    * A factory object responsible to creating an editor for a given cell. Must implement getEditor(column).
    **/
  var editorFactory: js.UndefOr[EditorFactory] = js.undefined
  
  /**
    * A Slick.EditorLock instance to use for controlling concurrent data edits.
    **/
  var editorLock: js.UndefOr[EditorLock[T]] = js.undefined
  
  var emulatePagingWhenScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, a blank row will be displayed at the bottom - typing values in that row will add a new one. Must subscribe to onAddNewRow to save values.
    **/
  var enableAddRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, async post rendering will occur and asyncPostRender delegates on columns will be called.
    **/
  var enableAsyncPostRender: js.UndefOr[Boolean] = js.undefined
  
  var enableAsyncPostRenderCleanup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Appears to enable cell virtualisation for optimised speed with large datasets
    **/
  var enableCellNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
    **/
  var enableCellRangeSelection: js.UndefOr[Any] = js.undefined
  
  /**
    *
    **/
  var enableColumnReorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
    **/
  var enableRowReordering: js.UndefOr[Any] = js.undefined
  
  /**
    *
    **/
  var enableTextSelectionOnCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @see Example: Explicit Initialization
    **/
  var explicitInitialization: js.UndefOr[Boolean] = js.undefined
  
  var footerRowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Force column sizes to fit into the container (preventing horizontal scrolling). Effectively sets column width to be 1/Number of Columns which on small containers may not be desirable
    **/
  var forceFitColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var forceSyncScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A factory object responsible to creating a formatter for a given cell. Must implement getFormatter(column).
    **/
  var formatterFactory: js.UndefOr[FormatterFactory[T]] = js.undefined
  
  var frozenBottom: js.UndefOr[Boolean] = js.undefined
  
  var frozenColumn: js.UndefOr[Double] = js.undefined
  
  var frozenRow: js.UndefOr[Double] = js.undefined
  
  /**
    * Will expand the table row divs to the full width of the container, table cell divs will remain aligned to the left
    **/
  var fullWidthRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var headerRowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    *
    **/
  var leaveSpaceForNewRows: js.UndefOr[Boolean] = js.undefined
  
  var minRowBuffer: js.UndefOr[Double] = js.undefined
  
  /**
    * @see Example: Multi-Column Sort
    **/
  var multiColumnSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  
  var numberedMultiColumnSort: js.UndefOr[Boolean] = js.undefined
  
  var preHeaderPanelHeight: js.UndefOr[Double] = js.undefined
  
  var preserveCopiedSelectionOnPaste: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var rowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    *
    **/
  var selectedCellCssClass: js.UndefOr[String] = js.undefined
  
  var showCellSelection: js.UndefOr[Boolean] = js.undefined
  
  var showFooterRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var showHeaderRow: js.UndefOr[Boolean] = js.undefined
  
  var showPreHeaderPanel: js.UndefOr[Boolean] = js.undefined
  
  var showTopPanel: js.UndefOr[Boolean] = js.undefined
  
  var sortColNumberInSeparateSpan: js.UndefOr[Boolean] = js.undefined
  
  var suppressActiveCellChangeOnEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the column being resized will change its width as the mouse is dragging the resize handle. If false, the column will resize after mouse drag ends.
    **/
  var syncColumnCellResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    **/
  var topPanelHeight: js.UndefOr[Double] = js.undefined
  
  var tristateMultiColumnSort: js.UndefOr[Boolean] = js.undefined
  
  var viewportClass: js.UndefOr[String] = js.undefined
}
object GridOptions {
  
  inline def apply[T /* <: SlickData */](): GridOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions[T]]
  }
  
  extension [Self <: GridOptions[?], T /* <: SlickData */](x: Self & GridOptions[T]) {
    
    inline def setAddNewRowCssClass(value: String): Self = StObject.set(x, "addNewRowCssClass", value.asInstanceOf[js.Any])
    
    inline def setAddNewRowCssClassUndefined: Self = StObject.set(x, "addNewRowCssClass", js.undefined)
    
    inline def setAlwaysAllowHorizontalScroll(value: Boolean): Self = StObject.set(x, "alwaysAllowHorizontalScroll", value.asInstanceOf[js.Any])
    
    inline def setAlwaysAllowHorizontalScrollUndefined: Self = StObject.set(x, "alwaysAllowHorizontalScroll", js.undefined)
    
    inline def setAlwaysShowVerticalScroll(value: Boolean): Self = StObject.set(x, "alwaysShowVerticalScroll", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowVerticalScrollUndefined: Self = StObject.set(x, "alwaysShowVerticalScroll", js.undefined)
    
    inline def setAsyncEditorLoadDelay(value: Double): Self = StObject.set(x, "asyncEditorLoadDelay", value.asInstanceOf[js.Any])
    
    inline def setAsyncEditorLoadDelayUndefined: Self = StObject.set(x, "asyncEditorLoadDelay", js.undefined)
    
    inline def setAsyncEditorLoading(value: Boolean): Self = StObject.set(x, "asyncEditorLoading", value.asInstanceOf[js.Any])
    
    inline def setAsyncEditorLoadingUndefined: Self = StObject.set(x, "asyncEditorLoading", js.undefined)
    
    inline def setAsyncPostRenderCleanupDelay(value: Double): Self = StObject.set(x, "asyncPostRenderCleanupDelay", value.asInstanceOf[js.Any])
    
    inline def setAsyncPostRenderCleanupDelayUndefined: Self = StObject.set(x, "asyncPostRenderCleanupDelay", js.undefined)
    
    inline def setAsyncPostRenderDelay(value: Double): Self = StObject.set(x, "asyncPostRenderDelay", value.asInstanceOf[js.Any])
    
    inline def setAsyncPostRenderDelayUndefined: Self = StObject.set(x, "asyncPostRenderDelay", js.undefined)
    
    inline def setAutoEdit(value: Boolean): Self = StObject.set(x, "autoEdit", value.asInstanceOf[js.Any])
    
    inline def setAutoEditUndefined: Self = StObject.set(x, "autoEdit", js.undefined)
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    inline def setCellFlashingCssClass(value: String): Self = StObject.set(x, "cellFlashingCssClass", value.asInstanceOf[js.Any])
    
    inline def setCellFlashingCssClassUndefined: Self = StObject.set(x, "cellFlashingCssClass", js.undefined)
    
    inline def setCellHighlightCssClass(value: String): Self = StObject.set(x, "cellHighlightCssClass", value.asInstanceOf[js.Any])
    
    inline def setCellHighlightCssClassUndefined: Self = StObject.set(x, "cellHighlightCssClass", js.undefined)
    
    inline def setCreateFooterRow(value: Boolean): Self = StObject.set(x, "createFooterRow", value.asInstanceOf[js.Any])
    
    inline def setCreateFooterRowUndefined: Self = StObject.set(x, "createFooterRow", js.undefined)
    
    inline def setCreatePreHeaderPanel(value: Boolean): Self = StObject.set(x, "createPreHeaderPanel", value.asInstanceOf[js.Any])
    
    inline def setCreatePreHeaderPanelUndefined: Self = StObject.set(x, "createPreHeaderPanel", js.undefined)
    
    inline def setDataItemColumnValueExtractor(value: (/* item */ Any, /* columnDef */ Any) => Any): Self = StObject.set(x, "dataItemColumnValueExtractor", js.Any.fromFunction2(value))
    
    inline def setDataItemColumnValueExtractorUndefined: Self = StObject.set(x, "dataItemColumnValueExtractor", js.undefined)
    
    inline def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
    
    inline def setDefaultFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = StObject.set(x, "defaultFormatter", js.Any.fromFunction5(value))
    
    inline def setDefaultFormatterUndefined: Self = StObject.set(x, "defaultFormatter", js.undefined)
    
    inline def setDoPaging(value: Boolean): Self = StObject.set(x, "doPaging", value.asInstanceOf[js.Any])
    
    inline def setDoPagingUndefined: Self = StObject.set(x, "doPaging", js.undefined)
    
    inline def setEditCommandHandler(value: Any): Self = StObject.set(x, "editCommandHandler", value.asInstanceOf[js.Any])
    
    inline def setEditCommandHandlerUndefined: Self = StObject.set(x, "editCommandHandler", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditorCellNavOnLRKeys(value: Boolean): Self = StObject.set(x, "editorCellNavOnLRKeys", value.asInstanceOf[js.Any])
    
    inline def setEditorCellNavOnLRKeysUndefined: Self = StObject.set(x, "editorCellNavOnLRKeys", js.undefined)
    
    inline def setEditorFactory(value: EditorFactory): Self = StObject.set(x, "editorFactory", value.asInstanceOf[js.Any])
    
    inline def setEditorFactoryUndefined: Self = StObject.set(x, "editorFactory", js.undefined)
    
    inline def setEditorLock(value: EditorLock[T]): Self = StObject.set(x, "editorLock", value.asInstanceOf[js.Any])
    
    inline def setEditorLockUndefined: Self = StObject.set(x, "editorLock", js.undefined)
    
    inline def setEmulatePagingWhenScrolling(value: Boolean): Self = StObject.set(x, "emulatePagingWhenScrolling", value.asInstanceOf[js.Any])
    
    inline def setEmulatePagingWhenScrollingUndefined: Self = StObject.set(x, "emulatePagingWhenScrolling", js.undefined)
    
    inline def setEnableAddRow(value: Boolean): Self = StObject.set(x, "enableAddRow", value.asInstanceOf[js.Any])
    
    inline def setEnableAddRowUndefined: Self = StObject.set(x, "enableAddRow", js.undefined)
    
    inline def setEnableAsyncPostRender(value: Boolean): Self = StObject.set(x, "enableAsyncPostRender", value.asInstanceOf[js.Any])
    
    inline def setEnableAsyncPostRenderCleanup(value: Boolean): Self = StObject.set(x, "enableAsyncPostRenderCleanup", value.asInstanceOf[js.Any])
    
    inline def setEnableAsyncPostRenderCleanupUndefined: Self = StObject.set(x, "enableAsyncPostRenderCleanup", js.undefined)
    
    inline def setEnableAsyncPostRenderUndefined: Self = StObject.set(x, "enableAsyncPostRender", js.undefined)
    
    inline def setEnableCellNavigation(value: Boolean): Self = StObject.set(x, "enableCellNavigation", value.asInstanceOf[js.Any])
    
    inline def setEnableCellNavigationUndefined: Self = StObject.set(x, "enableCellNavigation", js.undefined)
    
    inline def setEnableCellRangeSelection(value: Any): Self = StObject.set(x, "enableCellRangeSelection", value.asInstanceOf[js.Any])
    
    inline def setEnableCellRangeSelectionUndefined: Self = StObject.set(x, "enableCellRangeSelection", js.undefined)
    
    inline def setEnableColumnReorder(value: Boolean): Self = StObject.set(x, "enableColumnReorder", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnReorderUndefined: Self = StObject.set(x, "enableColumnReorder", js.undefined)
    
    inline def setEnableRowReordering(value: Any): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
    
    inline def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
    
    inline def setEnableTextSelectionOnCells(value: Boolean): Self = StObject.set(x, "enableTextSelectionOnCells", value.asInstanceOf[js.Any])
    
    inline def setEnableTextSelectionOnCellsUndefined: Self = StObject.set(x, "enableTextSelectionOnCells", js.undefined)
    
    inline def setExplicitInitialization(value: Boolean): Self = StObject.set(x, "explicitInitialization", value.asInstanceOf[js.Any])
    
    inline def setExplicitInitializationUndefined: Self = StObject.set(x, "explicitInitialization", js.undefined)
    
    inline def setFooterRowHeight(value: Double): Self = StObject.set(x, "footerRowHeight", value.asInstanceOf[js.Any])
    
    inline def setFooterRowHeightUndefined: Self = StObject.set(x, "footerRowHeight", js.undefined)
    
    inline def setForceFitColumns(value: Boolean): Self = StObject.set(x, "forceFitColumns", value.asInstanceOf[js.Any])
    
    inline def setForceFitColumnsUndefined: Self = StObject.set(x, "forceFitColumns", js.undefined)
    
    inline def setForceSyncScrolling(value: Boolean): Self = StObject.set(x, "forceSyncScrolling", value.asInstanceOf[js.Any])
    
    inline def setForceSyncScrollingUndefined: Self = StObject.set(x, "forceSyncScrolling", js.undefined)
    
    inline def setFormatterFactory(value: FormatterFactory[T]): Self = StObject.set(x, "formatterFactory", value.asInstanceOf[js.Any])
    
    inline def setFormatterFactoryUndefined: Self = StObject.set(x, "formatterFactory", js.undefined)
    
    inline def setFrozenBottom(value: Boolean): Self = StObject.set(x, "frozenBottom", value.asInstanceOf[js.Any])
    
    inline def setFrozenBottomUndefined: Self = StObject.set(x, "frozenBottom", js.undefined)
    
    inline def setFrozenColumn(value: Double): Self = StObject.set(x, "frozenColumn", value.asInstanceOf[js.Any])
    
    inline def setFrozenColumnUndefined: Self = StObject.set(x, "frozenColumn", js.undefined)
    
    inline def setFrozenRow(value: Double): Self = StObject.set(x, "frozenRow", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowUndefined: Self = StObject.set(x, "frozenRow", js.undefined)
    
    inline def setFullWidthRows(value: Boolean): Self = StObject.set(x, "fullWidthRows", value.asInstanceOf[js.Any])
    
    inline def setFullWidthRowsUndefined: Self = StObject.set(x, "fullWidthRows", js.undefined)
    
    inline def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
    
    inline def setLeaveSpaceForNewRows(value: Boolean): Self = StObject.set(x, "leaveSpaceForNewRows", value.asInstanceOf[js.Any])
    
    inline def setLeaveSpaceForNewRowsUndefined: Self = StObject.set(x, "leaveSpaceForNewRows", js.undefined)
    
    inline def setMinRowBuffer(value: Double): Self = StObject.set(x, "minRowBuffer", value.asInstanceOf[js.Any])
    
    inline def setMinRowBufferUndefined: Self = StObject.set(x, "minRowBuffer", js.undefined)
    
    inline def setMultiColumnSort(value: Boolean): Self = StObject.set(x, "multiColumnSort", value.asInstanceOf[js.Any])
    
    inline def setMultiColumnSortUndefined: Self = StObject.set(x, "multiColumnSort", js.undefined)
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    inline def setNumberedMultiColumnSort(value: Boolean): Self = StObject.set(x, "numberedMultiColumnSort", value.asInstanceOf[js.Any])
    
    inline def setNumberedMultiColumnSortUndefined: Self = StObject.set(x, "numberedMultiColumnSort", js.undefined)
    
    inline def setPreHeaderPanelHeight(value: Double): Self = StObject.set(x, "preHeaderPanelHeight", value.asInstanceOf[js.Any])
    
    inline def setPreHeaderPanelHeightUndefined: Self = StObject.set(x, "preHeaderPanelHeight", js.undefined)
    
    inline def setPreserveCopiedSelectionOnPaste(value: Boolean): Self = StObject.set(x, "preserveCopiedSelectionOnPaste", value.asInstanceOf[js.Any])
    
    inline def setPreserveCopiedSelectionOnPasteUndefined: Self = StObject.set(x, "preserveCopiedSelectionOnPaste", js.undefined)
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setSelectedCellCssClass(value: String): Self = StObject.set(x, "selectedCellCssClass", value.asInstanceOf[js.Any])
    
    inline def setSelectedCellCssClassUndefined: Self = StObject.set(x, "selectedCellCssClass", js.undefined)
    
    inline def setShowCellSelection(value: Boolean): Self = StObject.set(x, "showCellSelection", value.asInstanceOf[js.Any])
    
    inline def setShowCellSelectionUndefined: Self = StObject.set(x, "showCellSelection", js.undefined)
    
    inline def setShowFooterRow(value: Boolean): Self = StObject.set(x, "showFooterRow", value.asInstanceOf[js.Any])
    
    inline def setShowFooterRowUndefined: Self = StObject.set(x, "showFooterRow", js.undefined)
    
    inline def setShowHeaderRow(value: Boolean): Self = StObject.set(x, "showHeaderRow", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderRowUndefined: Self = StObject.set(x, "showHeaderRow", js.undefined)
    
    inline def setShowPreHeaderPanel(value: Boolean): Self = StObject.set(x, "showPreHeaderPanel", value.asInstanceOf[js.Any])
    
    inline def setShowPreHeaderPanelUndefined: Self = StObject.set(x, "showPreHeaderPanel", js.undefined)
    
    inline def setShowTopPanel(value: Boolean): Self = StObject.set(x, "showTopPanel", value.asInstanceOf[js.Any])
    
    inline def setShowTopPanelUndefined: Self = StObject.set(x, "showTopPanel", js.undefined)
    
    inline def setSortColNumberInSeparateSpan(value: Boolean): Self = StObject.set(x, "sortColNumberInSeparateSpan", value.asInstanceOf[js.Any])
    
    inline def setSortColNumberInSeparateSpanUndefined: Self = StObject.set(x, "sortColNumberInSeparateSpan", js.undefined)
    
    inline def setSuppressActiveCellChangeOnEdit(value: Boolean): Self = StObject.set(x, "suppressActiveCellChangeOnEdit", value.asInstanceOf[js.Any])
    
    inline def setSuppressActiveCellChangeOnEditUndefined: Self = StObject.set(x, "suppressActiveCellChangeOnEdit", js.undefined)
    
    inline def setSyncColumnCellResize(value: Boolean): Self = StObject.set(x, "syncColumnCellResize", value.asInstanceOf[js.Any])
    
    inline def setSyncColumnCellResizeUndefined: Self = StObject.set(x, "syncColumnCellResize", js.undefined)
    
    inline def setTopPanelHeight(value: Double): Self = StObject.set(x, "topPanelHeight", value.asInstanceOf[js.Any])
    
    inline def setTopPanelHeightUndefined: Self = StObject.set(x, "topPanelHeight", js.undefined)
    
    inline def setTristateMultiColumnSort(value: Boolean): Self = StObject.set(x, "tristateMultiColumnSort", value.asInstanceOf[js.Any])
    
    inline def setTristateMultiColumnSortUndefined: Self = StObject.set(x, "tristateMultiColumnSort", js.undefined)
    
    inline def setViewportClass(value: String): Self = StObject.set(x, "viewportClass", value.asInstanceOf[js.Any])
    
    inline def setViewportClassUndefined: Self = StObject.set(x, "viewportClass", js.undefined)
  }
}
