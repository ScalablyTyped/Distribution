package typings.reactVirtualized

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.esListMod.ListRowProps
import typings.reactVirtualized.esListMod.ListRowRenderer
import typings.reactVirtualized.esScrollSyncMod.OnScrollParams
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHeight extends js.Object {
  /**
    * Removes fixed height from the scrollingContainer so that the total height
    * of rows can stretch the window. Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /** Optional CSS class name */
  var className: js.UndefOr[String] = js.undefined
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.undefined
  /**
    * Used to estimate the total height of a List before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[Double] = js.undefined
  /** Height constraint for list (determines how many actual rows are rendered) */
  var height: Double
  /** Optional renderer to be used in place of rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ AnonOverscanStartIndex, Unit]] = js.undefined
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]] = js.undefined
  /** See Grid#overscanIndicesGetter */
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.undefined
  /**
    * Number of rows to render above/below the visible bounds of the list.
    * These rows can help for smoother scrolling on touch devices.
    */
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  /** Number of rows in list. */
  var rowCount: Double
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: Double | (js.Function1[/* info */ Index, Double])
  /** Responsible for rendering a row given an index; ({ index: number }): node */
  var rowRenderer: ListRowRenderer
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[String] = js.undefined
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[Double | Null] = js.undefined
  /** Width of list */
  var width: Double
}

object AnonAutoHeight {
  @scala.inline
  def apply(
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* info */ Index, Double]),
    rowRenderer: /* props */ ListRowProps => ReactNode,
    width: Double,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    estimatedRowSize: Int | Double = null,
    noRowsRenderer: () => Element = null,
    onRowsRendered: /* info */ AnonOverscanStartIndex => Unit = null,
    onScroll: /* params */ OnScrollParams => Unit = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices = null,
    overscanRowCount: Int | Double = null,
    scrollToAlignment: String = null,
    scrollToIndex: Int | Double = null,
    scrollTop: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null
  ): AnonAutoHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer), width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(js.Any.fromFunction0(noRowsRenderer))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1(onRowsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(overscanIndicesGetter))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoHeight]
  }
}

