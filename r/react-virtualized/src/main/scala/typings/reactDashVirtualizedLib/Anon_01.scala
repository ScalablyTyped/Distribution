package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var `aria-label`: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid
  var `aria-readonly`: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`true`
  var autoContainerWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  var autoHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  var autoWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  var cellRangeRenderer: reactDashVirtualizedLib.distEsGridMod.GridCellRangeRenderer
  var containerRole: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.rowgroup
  var estimatedColumnSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`100`
  var estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30`
  var overscanColumnCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`
  var overscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter
  var overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10`
  var role: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid
  var scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto
  var scrollToColumn: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`
  var scrollToRow: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`
  var scrollingResetTimeInterval: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`150`
  var tabIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`
  def getScrollbarSize(): scala.Double
  def noContentRenderer(): reactLib.reactMod.ReactNode
  def onScroll(): scala.Unit
  def onScrollbarPresenceChange(): scala.Unit
  def onSectionRendered(): scala.Unit
}

object Anon_01 {
  @scala.inline
  def apply(
    `aria-label`: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid,
    `aria-readonly`: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`true`,
    autoContainerWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    autoHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    autoWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    cellRangeRenderer: reactDashVirtualizedLib.distEsGridMod.GridCellRangeRenderer,
    containerRole: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.rowgroup,
    estimatedColumnSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`100`,
    estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30`,
    getScrollbarSize: () => scala.Double,
    noContentRenderer: () => reactLib.reactMod.ReactNode,
    onScroll: () => scala.Unit,
    onScrollbarPresenceChange: () => scala.Unit,
    onSectionRendered: () => scala.Unit,
    overscanColumnCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`,
    overscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter,
    overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10`,
    role: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid,
    scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto,
    scrollToColumn: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`,
    scrollToRow: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`,
    scrollingResetTimeInterval: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`150`,
    tabIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`
  ): Anon_01 = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth, autoHeight = autoHeight, autoWidth = autoWidth, cellRangeRenderer = cellRangeRenderer, containerRole = containerRole, estimatedColumnSize = estimatedColumnSize, estimatedRowSize = estimatedRowSize, getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = overscanColumnCount, overscanIndicesGetter = overscanIndicesGetter, overscanRowCount = overscanRowCount, role = role, scrollToAlignment = scrollToAlignment, scrollToColumn = scrollToColumn, scrollToRow = scrollToRow, scrollingResetTimeInterval = scrollingResetTimeInterval, tabIndex = tabIndex)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.updateDynamic("aria-readonly")(`aria-readonly`)
    __obj.asInstanceOf[Anon_01]
  }
}

