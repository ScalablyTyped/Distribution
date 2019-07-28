package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.distEsGridMod.GridCellRangeRenderer
import typings.reactDashVirtualized.distEsGridMod.OverscanIndicesGetter
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`-1`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`100`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`10`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`30`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`false`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`true`
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
    cellRangeRenderer: GridCellRangeRenderer,
    containerRole: rowgroup,
    estimatedColumnSize: `100`,
    estimatedRowSize: `30`,
    getScrollbarSize: () => Double,
    noContentRenderer: () => ReactNode,
    onScroll: () => Unit,
    onScrollbarPresenceChange: () => Unit,
    onSectionRendered: () => Unit,
    overscanColumnCount: `0`,
    overscanIndicesGetter: OverscanIndicesGetter,
    overscanRowCount: `10`,
    role: grid,
    scrollToAlignment: auto,
    scrollToColumn: `-1`,
    scrollToRow: `-1`,
    scrollingResetTimeInterval: `150`,
    tabIndex: `0`
  ): Anon_01 = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth, autoHeight = autoHeight, autoWidth = autoWidth, cellRangeRenderer = cellRangeRenderer, containerRole = containerRole, estimatedColumnSize = estimatedColumnSize, estimatedRowSize = estimatedRowSize, getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = overscanColumnCount, overscanIndicesGetter = overscanIndicesGetter, overscanRowCount = overscanRowCount, role = role, scrollToAlignment = scrollToAlignment, scrollToColumn = scrollToColumn, scrollToRow = scrollToRow, scrollingResetTimeInterval = scrollingResetTimeInterval, tabIndex = tabIndex)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.updateDynamic("aria-readonly")(`aria-readonly`)
    __obj.asInstanceOf[Anon_01]
  }
}

