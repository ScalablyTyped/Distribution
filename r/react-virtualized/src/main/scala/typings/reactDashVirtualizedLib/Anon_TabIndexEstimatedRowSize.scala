package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_TabIndexEstimatedRowSize extends js.Object {
  /**
       * Removes fixed height from the scrollingContainer so that the total height
       * of rows can stretch the window. Intended for use with WindowScroller
       */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional CSS class name */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var deferredMeasurementCache: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache] = js.undefined
  /**
       * Used to estimate the total height of a List before all of its rows have actually been measured.
       * The estimated total height is adjusted as rows are rendered.
       */
  var estimatedRowSize: js.UndefOr[scala.Double] = js.undefined
  /** Height constraint for list (determines how many actual rows are rendered) */
  var height: scala.Double
  /** Optional renderer to be used in place of rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
       * Callback invoked with information about the slice of rows that were just rendered.
       * ({ startIndex, stopIndex }): void
       */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ Anon_StartIndexOverscanStopIndex, scala.Unit]] = js.undefined
  /**
       * Callback invoked whenever the scroll offset changes within the inner scrollable region.
       * This callback can be used to sync scrolling between lists, tables, or grids.
       * ({ clientHeight, scrollHeight, scrollTop }): void
       */
  var onScroll: js.UndefOr[js.Function1[/* info */ Anon_ClientHeight, scala.Unit]] = js.undefined
  /** See Grid#overscanIndicesGetter */
  var overscanIndicesGetter: js.UndefOr[reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter] = js.undefined
  /**
       * Number of rows to render above/below the visible bounds of the list.
       * These rows can help for smoother scrolling on touch devices.
       */
  var overscanRowCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of rows in list. */
  var rowCount: scala.Double
  /**
       * Either a fixed row height (number) or a function that returns the height of a row given its index.
       * ({ index: number }): number
       */
  var rowHeight: scala.Double | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  /** Responsible for rendering a row given an index; ({ index: number }): node */
  var rowRenderer: reactDashVirtualizedLib.distEsListMod.ListRowRenderer
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[java.lang.String] = js.undefined
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[scala.Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Width of list */
  var width: scala.Double
}

