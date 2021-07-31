package typings.reactVirtualized.esTableMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.anon.SortBy
import typings.reactVirtualized.esGridMod.GridCoreProps
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.IndexRange
import typings.reactVirtualized.mod.OverscanIndexRange
import typings.reactVirtualized.mod.ScrollEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableProps
  extends StObject
     with GridCoreProps {
  
  /** One or more Columns describing the data displayed in this row */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** Disable rendering the header at all */
  var disableHeader: js.UndefOr[Boolean] = js.undefined
  
  /** Optional custom CSS class name to attach to inner Grid element. */
  var gridClassName: js.UndefOr[String] = js.undefined
  
  /** Optional inline style to attach to inner Grid element. */
  var gridStyle: js.UndefOr[js.Any] = js.undefined
  
  /** Optional CSS class to apply to all column headers */
  var headerClassName: js.UndefOr[String] = js.undefined
  
  /** Fixed height of header row */
  var headerHeight: Double
  
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: any[],
    *   style: any
    * }): PropTypes.node
    */
  var headerRowRenderer: js.UndefOr[TableHeaderRowRenderer] = js.undefined
  
  /** Optional custom inline style to attach to table header columns. */
  var headerStyle: js.UndefOr[js.Any] = js.undefined
  
  /** Fixed/available height for out DOM element */
  @JSName("height")
  var height_TableProps: js.UndefOr[Double] = js.undefined
  
  /** Optional renderer to be used in place of table body rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[Element | Null]] = js.undefined
  
  /**
    * Optional callback when a column's header is clicked.
    * ({ columnData: any, dataKey: string }): void
    */
  var onHeaderClick: js.UndefOr[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]] = js.undefined
  
  /**
    * Callback invoked when a user clicks on a table row.
    * ({ index: number }): void
    */
  var onRowClick: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  /**
    * Callback invoked when a user double-clicks on a table row.
    * ({ index: number }): void
    */
  var onRowDoubleClick: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  /**
    * Callback invoked when the mouse leaves a table row.
    * ({ index: number }): void
    */
  var onRowMouseOut: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  /**
    * Callback invoked when a user moves the mouse over a table row.
    * ({ index: number }): void
    */
  var onRowMouseOver: js.UndefOr[js.Function1[/* info */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ IndexRange & OverscanIndexRange, Unit]] = js.undefined
  
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  @JSName("onScroll")
  var onScroll_TableProps: js.UndefOr[js.Function1[/* info */ ScrollEventData, Unit]] = js.undefined
  
  /**
    * Optional CSS class to apply to all table rows (including the header row).
    * This property can be a CSS class name (string) or a function that returns a class name.
    * If a function is provided its signature should be: ({ index: number }): string
    */
  var rowClassName: js.UndefOr[String | (js.Function1[/* info */ Index, String])] = js.undefined
  
  /**
    * Callback responsible for returning a data row given an index.
    * ({ index: number }): any
    */
  var rowGetter: js.UndefOr[js.Function1[/* info */ Index, js.Any]] = js.undefined
  
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: Array,
    *   index: number,
    *   isScrolling: boolean,
    *   onRowClick: ?Function,
    *   onRowDoubleClick: ?Function,
    *   onRowMouseOver: ?Function,
    *   onRowMouseOut: ?Function,
    *   rowData: any,
    *   style: any
    * }): PropTypes.node
    */
  var rowRenderer: js.UndefOr[TableRowRenderer] = js.undefined
  
  /** Optional custom inline style to attach to table rows. */
  var rowStyle: js.UndefOr[CSSProperties | (js.Function1[/* info */ Index, CSSProperties])] = js.undefined
  
  /** See Grid#scrollToAlignment */
  @JSName("scrollToAlignment")
  var scrollToAlignment_TableProps: js.UndefOr[String] = js.undefined
  
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Sort function to be called if a sortable header is clicked.
    * ({ sortBy: string, sortDirection: SortDirection }): void
    */
  var sort: js.UndefOr[js.Function1[/* info */ SortBy, Unit]] = js.undefined
  
  /** Table data is currently sorted by this :dataKey (if it is sorted at all) */
  var sortBy: js.UndefOr[String] = js.undefined
  
  /** Table data is currently sorted in this direction (if it is sorted at all) */
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
  
  /** Width of list */
  @JSName("width")
  var width_TableProps: js.UndefOr[Double] = js.undefined
}
object TableProps {
  
  @scala.inline
  def apply(
    headerHeight: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double])
  ): TableProps = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisableHeader(value: Boolean): Self = StObject.set(x, "disableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHeaderUndefined: Self = StObject.set(x, "disableHeader", js.undefined)
    
    @scala.inline
    def setGridClassName(value: String): Self = StObject.set(x, "gridClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridClassNameUndefined: Self = StObject.set(x, "gridClassName", js.undefined)
    
    @scala.inline
    def setGridStyle(value: js.Any): Self = StObject.set(x, "gridStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridStyleUndefined: Self = StObject.set(x, "gridStyle", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowRenderer(value: /* props */ TableHeaderRowProps => ReactNode): Self = StObject.set(x, "headerRowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRowRendererUndefined: Self = StObject.set(x, "headerRowRenderer", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: js.Any): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setNoRowsRenderer(value: () => Element | Null): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNoRowsRendererUndefined: Self = StObject.set(x, "noRowsRenderer", js.undefined)
    
    @scala.inline
    def setOnHeaderClick(value: /* params */ HeaderMouseEventHandlerParams => Unit): Self = StObject.set(x, "onHeaderClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeaderClickUndefined: Self = StObject.set(x, "onHeaderClick", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: /* info */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: /* info */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowMouseOut(value: /* info */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowMouseOutUndefined: Self = StObject.set(x, "onRowMouseOut", js.undefined)
    
    @scala.inline
    def setOnRowMouseOver(value: /* info */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowMouseOverUndefined: Self = StObject.set(x, "onRowMouseOver", js.undefined)
    
    @scala.inline
    def setOnRowsRendered(value: /* info */ IndexRange & OverscanIndexRange => Unit): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowsRenderedUndefined: Self = StObject.set(x, "onRowsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* info */ ScrollEventData => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setRowClassName(value: String | (js.Function1[/* info */ Index, String])): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowClassNameFunction1(value: /* info */ Index => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
    
    @scala.inline
    def setRowGetter(value: /* info */ Index => js.Any): Self = StObject.set(x, "rowGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowGetterUndefined: Self = StObject.set(x, "rowGetter", js.undefined)
    
    @scala.inline
    def setRowRenderer(value: /* props */ TableRowProps => ReactNode): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowRendererUndefined: Self = StObject.set(x, "rowRenderer", js.undefined)
    
    @scala.inline
    def setRowStyle(value: CSSProperties | (js.Function1[/* info */ Index, CSSProperties])): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStyleFunction1(value: /* info */ Index => CSSProperties): Self = StObject.set(x, "rowStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
    
    @scala.inline
    def setScrollToAlignment(value: String): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToAlignmentUndefined: Self = StObject.set(x, "scrollToAlignment", js.undefined)
    
    @scala.inline
    def setScrollToIndex(value: Double): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToIndexUndefined: Self = StObject.set(x, "scrollToIndex", js.undefined)
    
    @scala.inline
    def setSort(value: /* info */ SortBy => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
