package typings.reactSortableTree.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.esListMod.ListRowProps
import typings.reactVirtualized.esListMod.ListRowRenderer
import typings.reactVirtualized.esListMod.RenderedRows
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-virtualized.react-virtualized.ListProps> */
trait PartialListProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var autoContainerWidth: js.UndefOr[Boolean] = js.undefined
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var containerProps: js.UndefOr[js.Object] = js.undefined
  var containerRole: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.undefined
  var estimatedColumnSize: js.UndefOr[Double] = js.undefined
  var estimatedRowSize: js.UndefOr[Double] = js.undefined
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  var noContentRenderer: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var noRowsRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ RenderedRows, Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.undefined
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, _]] = js.undefined
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.undefined
  var overscanColumnCount: js.UndefOr[Double] = js.undefined
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.undefined
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rowHeight: js.UndefOr[Double | (js.Function1[/* params */ Index, Double])] = js.undefined
  var rowRenderer: js.UndefOr[ListRowRenderer] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollToAlignment: js.UndefOr[Alignment with String] = js.undefined
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  var scrollToIndex: js.UndefOr[Double] = js.undefined
  var scrollToRow: js.UndefOr[Double] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialListProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    autoContainerWidth: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[ReactNode] = null,
    className: String = null,
    containerProps: js.Object = null,
    containerRole: String = null,
    containerStyle: CSSProperties = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    estimatedColumnSize: js.UndefOr[Double] = js.undefined,
    estimatedRowSize: js.UndefOr[Double] = js.undefined,
    getScrollbarSize: () => Double = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: () => ReactNode = null,
    noRowsRenderer: () => Element = null,
    onRowsRendered: /* info */ RenderedRows => Unit = null,
    onScroll: /* params */ ScrollParams => _ = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    overscanColumnCount: js.UndefOr[Double] = js.undefined,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices = null,
    overscanRowCount: js.UndefOr[Double] = js.undefined,
    role: String = null,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]) = null,
    rowRenderer: /* props */ ListRowProps => ReactNode = null,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollToAlignment: Alignment with String = null,
    scrollToColumn: js.UndefOr[Double] = js.undefined,
    scrollToIndex: js.UndefOr[Double] = js.undefined,
    scrollToRow: js.UndefOr[Double] = js.undefined,
    scrollTop: js.UndefOr[Double] = js.undefined,
    scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialListProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoContainerWidth)) __obj.updateDynamic("autoContainerWidth")(autoContainerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.get.asInstanceOf[js.Any])
    if (cellRangeRenderer != null) __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(cellRangeRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (containerRole != null) __obj.updateDynamic("containerRole")(containerRole.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedColumnSize)) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedRowSize)) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.get.asInstanceOf[js.Any])
    if (getScrollbarSize != null) __obj.updateDynamic("getScrollbarSize")(js.Any.fromFunction0(getScrollbarSize))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.get.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(js.Any.fromFunction0(noRowsRenderer))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1(onRowsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(onScrollbarPresenceChange))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (!js.isUndefined(overscanColumnCount)) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.get.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(overscanIndicesGetter))
    if (!js.isUndefined(overscanRowCount)) __obj.updateDynamic("overscanRowCount")(overscanRowCount.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToColumn)) __obj.updateDynamic("scrollToColumn")(scrollToColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToIndex)) __obj.updateDynamic("scrollToIndex")(scrollToIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToRow)) __obj.updateDynamic("scrollToRow")(scrollToRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingResetTimeInterval)) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListProps]
  }
}

