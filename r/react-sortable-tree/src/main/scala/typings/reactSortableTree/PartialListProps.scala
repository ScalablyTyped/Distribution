package typings.reactSortableTree

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.reactVirtualized.AnonOverscanStartIndex
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
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ AnonOverscanStartIndex, Unit]] = js.undefined
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
    estimatedColumnSize: Int | Double = null,
    estimatedRowSize: Int | Double = null,
    getScrollbarSize: () => Double = null,
    height: Int | Double = null,
    id: String = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: () => ReactNode = null,
    noRowsRenderer: () => Element = null,
    onRowsRendered: /* info */ AnonOverscanStartIndex => Unit = null,
    onScroll: /* params */ ScrollParams => _ = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    overscanColumnCount: Int | Double = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices = null,
    overscanRowCount: Int | Double = null,
    role: String = null,
    rowCount: Int | Double = null,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]) = null,
    rowRenderer: /* props */ ListRowProps => ReactNode = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment with String = null,
    scrollToColumn: Int | Double = null,
    scrollToIndex: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollingResetTimeInterval: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    width: Int | Double = null
  ): PartialListProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoContainerWidth)) __obj.updateDynamic("autoContainerWidth")(autoContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (cellRangeRenderer != null) __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(cellRangeRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (containerRole != null) __obj.updateDynamic("containerRole")(containerRole.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (estimatedColumnSize != null) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (getScrollbarSize != null) __obj.updateDynamic("getScrollbarSize")(js.Any.fromFunction0(getScrollbarSize))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(js.Any.fromFunction0(noRowsRenderer))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1(onRowsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(onScrollbarPresenceChange))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(overscanIndicesGetter))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListProps]
  }
}

