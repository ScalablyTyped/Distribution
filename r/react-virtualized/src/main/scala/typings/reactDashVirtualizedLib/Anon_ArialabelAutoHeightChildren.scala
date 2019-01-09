package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelAutoHeightChildren extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Removes fixed height from the scrollingContainer so that the total height
    * of rows can stretch the window. Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** One or more Columns describing the data displayed in this row */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Optional CSS class name */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var deferredMeasurementCache: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache] = js.undefined
  /** Disable rendering the header at all */
  var disableHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to estimate the total height of a Table before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[scala.Double] = js.undefined
  /** Optional custom CSS class name to attach to inner Grid element. */
  var gridClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Optional inline style to attach to inner Grid element. */
  var gridStyle: js.UndefOr[js.Any] = js.undefined
  /** Optional CSS class to apply to all column headers */
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Fixed height of header row */
  var headerHeight: scala.Double
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: any[],
    *   style: any
    * }): PropTypes.node
    */
  var headerRowRenderer: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer] = js.undefined
  /** Optional custom inline style to attach to table header columns. */
  var headerStyle: js.UndefOr[js.Any] = js.undefined
  /** Fixed/available height for out DOM element */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Optional id */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Optional renderer to be used in place of table body rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional callback when a column's header is clicked.
    * ({ columnData: any, dataKey: string }): void
    */
  var onHeaderClick: js.UndefOr[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a user clicks on a table row.
    * ({ index: number }): void
    */
  var onRowClick: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a user double-clicks on a table row.
    * ({ index: number }): void
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when the mouse leaves a table row.
    * ({ index: number }): void
    */
  var onRowMouseOut: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a user moves the mouse over a table row.
    * ({ index: number }): void
    */
  var onRowMouseOver: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange with reactDashVirtualizedLib.reactDashVirtualizedMod.OverscanIndexRange, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  var onScroll: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Number of rows to render above/below the visible bounds of the list.
    * These rows can help for smoother scrolling on touch devices.
    */
  var overscanRowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional CSS class to apply to all table rows (including the header row).
    * This property can be a CSS class name (string) or a function that returns a class name.
    * If a function is provided its signature should be: ({ index: number }): string
    */
  var rowClassName: js.UndefOr[
    java.lang.String | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, java.lang.String])
  ] = js.undefined
  /** Number of rows in table. */
  var rowCount: scala.Double
  /**
    * Callback responsible for returning a data row given an index.
    * ({ index: number }): any
    */
  var rowGetter: js.UndefOr[
    js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
  ] = js.undefined
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: scala.Double | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
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
  var rowRenderer: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.TableRowRenderer] = js.undefined
  /** Optional custom inline style to attach to table rows. */
  var rowStyle: js.UndefOr[
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.ReactNs.CSSProperties
    ])
  ] = js.undefined
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[java.lang.String] = js.undefined
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[scala.Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sort function to be called if a sortable header is clicked.
    * ({ sortBy: string, sortDirection: SortDirection }): void
    */
  var sort: js.UndefOr[js.Function1[/* info */ Anon_SortBy, scala.Unit]] = js.undefined
  /** Table data is currently sorted by this :dataKey (if it is sorted at all) */
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  /** Table data is currently sorted in this direction (if it is sorted at all) */
  var sortDirection: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.SortDirectionType] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Width of list */
  var width: js.UndefOr[scala.Double] = js.undefined
}

