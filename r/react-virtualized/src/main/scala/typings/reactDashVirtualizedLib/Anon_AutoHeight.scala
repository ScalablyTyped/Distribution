package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHeight extends js.Object {
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
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ Anon_OverscanStartIndex, scala.Unit]] = js.undefined
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
  ] = js.undefined
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
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Width of list */
  var width: scala.Double
}

object Anon_AutoHeight {
  @scala.inline
  def apply(
    height: scala.Double,
    rowCount: scala.Double,
    rowHeight: scala.Double | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]),
    rowRenderer: reactDashVirtualizedLib.distEsListMod.ListRowRenderer,
    width: scala.Double,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    deferredMeasurementCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache = null,
    estimatedRowSize: scala.Int | scala.Double = null,
    noRowsRenderer: () => reactLib.reactMod.Global.JSXNs.Element = null,
    onRowsRendered: /* info */ Anon_OverscanStartIndex => scala.Unit = null,
    onScroll: /* params */ reactDashVirtualizedLib.distEsScrollSyncMod.OnScrollParams => scala.Unit = null,
    overscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter = null,
    overscanRowCount: scala.Int | scala.Double = null,
    scrollToAlignment: java.lang.String = null,
    scrollToIndex: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null
  ): Anon_AutoHeight = {
    val __obj = js.Dynamic.literal(height = height, rowCount = rowCount, rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = rowRenderer, width = width)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (className != null) __obj.updateDynamic("className")(className)
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache)
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(js.Any.fromFunction0(noRowsRenderer))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1(onRowsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(overscanIndicesGetter)
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment)
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoHeight]
  }
}

