package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.distEsGridMod.GridCellRangeProps
import typings.reactDashVirtualized.distEsGridMod.GridCellRangeRenderer
import typings.reactDashVirtualized.distEsGridMod.OverscanIndices
import typings.reactDashVirtualized.distEsGridMod.OverscanIndicesGetter
import typings.reactDashVirtualized.distEsGridMod.OverscanIndicesGetterParams
import typings.reactDashVirtualized.reactDashVirtualizedBooleans.`false`
import typings.reactDashVirtualized.reactDashVirtualizedBooleans.`true`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`-1`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`100`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`10`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`30`
import typings.reactDashVirtualized.reactDashVirtualizedStrings.auto
import typings.reactDashVirtualized.reactDashVirtualizedStrings.grid
import typings.reactDashVirtualized.reactDashVirtualizedStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var `aria-label`: grid
  var `aria-readonly`: `true`
  var autoContainerWidth: `false`
  var autoHeight: `false`
  var autoWidth: `false`
  var cellRangeRenderer: GridCellRangeRenderer
  var containerRole: rowgroup
  var estimatedColumnSize: `100`
  var estimatedRowSize: `30`
  var overscanColumnCount: `0`
  var overscanIndicesGetter: OverscanIndicesGetter
  var overscanRowCount: `10`
  var role: grid
  var scrollToAlignment: auto
  var scrollToColumn: `-1`
  var scrollToRow: `-1`
  var scrollingResetTimeInterval: `150`
  var tabIndex: `0`
  def getScrollbarSize(): Double
  def noContentRenderer(): ReactNode
  def onScroll(): Unit
  def onScrollbarPresenceChange(): Unit
  def onSectionRendered(): Unit
}

object Anon_01 {
  @scala.inline
  def apply(
    `aria-label`: grid,
    `aria-readonly`: `true`,
    autoContainerWidth: `false`,
    autoHeight: `false`,
    autoWidth: `false`,
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[ReactNode],
    containerRole: rowgroup,
    estimatedColumnSize: `100`,
    estimatedRowSize: `30`,
    getScrollbarSize: () => Double,
    noContentRenderer: () => ReactNode,
    onScroll: () => Unit,
    onScrollbarPresenceChange: () => Unit,
    onSectionRendered: () => Unit,
    overscanColumnCount: `0`,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices,
    overscanRowCount: `10`,
    role: grid,
    scrollToAlignment: auto,
    scrollToColumn: `-1`,
    scrollToRow: `-1`,
    scrollingResetTimeInterval: `150`,
    tabIndex: `0`
  ): Anon_01 = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], cellRangeRenderer = js.Any.fromFunction1(cellRangeRenderer), containerRole = containerRole.asInstanceOf[js.Any], estimatedColumnSize = estimatedColumnSize.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = overscanColumnCount.asInstanceOf[js.Any], overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01]
  }
}

