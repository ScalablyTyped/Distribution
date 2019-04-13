package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AutoHeight extends js.Object {
  /**
    * Removes fixed height from the scrollingContainer so that the total height
    * of rows can stretch the window. Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.native
  /** Optional CSS class name */
  var className: js.UndefOr[java.lang.String] = js.native
  var deferredMeasurementCache: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache] = js.native
  /**
    * Used to estimate the total height of a List before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[scala.Double] = js.native
  /** Height constraint for list (determines how many actual rows are rendered) */
  var height: scala.Double = js.native
  /** Optional renderer to be used in place of rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.native
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ Anon_OverscanStartIndex, scala.Unit]] = js.native
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  var onScroll: js.UndefOr[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsScrollSyncMod.OnScrollParams, 
      scala.Unit
    ]
  ] = js.native
  /** See Grid#overscanIndicesGetter */
  var overscanIndicesGetter: js.UndefOr[reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter] = js.native
  /**
    * Number of rows to render above/below the visible bounds of the list.
    * These rows can help for smoother scrolling on touch devices.
    */
  var overscanRowCount: js.UndefOr[scala.Double] = js.native
  /** Number of rows in list. */
  var rowCount: scala.Double = js.native
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: scala.Double | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]) = js.native
  /** Responsible for rendering a row given an index; ({ index: number }): node */
  @JSName("rowRenderer")
  var rowRenderer_Original: reactDashVirtualizedLib.distEsListMod.ListRowRenderer = js.native
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[java.lang.String] = js.native
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[scala.Double] = js.native
  /** Vertical offset. */
  var scrollTop: js.UndefOr[scala.Double] = js.native
  /** Optional inline style */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.native
  /** Tab index for focus */
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.native
  /** Width of list */
  var width: scala.Double = js.native
  /** Responsible for rendering a row given an index; ({ index: number }): node */
  def rowRenderer(props: reactDashVirtualizedLib.distEsListMod.ListRowProps): reactLib.reactMod.ReactNode = js.native
}

