package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedBooleans.`true`
import typings.reactVirtualized.reactVirtualizedNumbers.`-1`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`100`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`30`
import typings.reactVirtualized.reactVirtualizedStrings.auto
import typings.reactVirtualized.reactVirtualizedStrings.grid
import typings.reactVirtualized.reactVirtualizedStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ariareadonly extends js.Object {
  var `aria-label`: grid = js.native
  var `aria-readonly`: `true` = js.native
  var autoContainerWidth: `false` = js.native
  var autoHeight: `false` = js.native
  var autoWidth: `false` = js.native
  var cellRangeRenderer: GridCellRangeRenderer = js.native
  var containerRole: rowgroup = js.native
  var estimatedColumnSize: `100` = js.native
  var estimatedRowSize: `30` = js.native
  var overscanColumnCount: `0` = js.native
  var overscanIndicesGetter: OverscanIndicesGetter = js.native
  var overscanRowCount: `10` = js.native
  var role: grid = js.native
  var scrollToAlignment: auto = js.native
  var scrollToColumn: `-1` = js.native
  var scrollToRow: `-1` = js.native
  var scrollingResetTimeInterval: /* 150 */ Double = js.native
  var tabIndex: `0` = js.native
  def getScrollbarSize(): Double = js.native
  def noContentRenderer(): ReactNode = js.native
  def onScroll(): Unit = js.native
  def onScrollbarPresenceChange(): Unit = js.native
  def onSectionRendered(): Unit = js.native
}

object Ariareadonly {
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
    scrollingResetTimeInterval: /* 150 */ Double,
    tabIndex: `0`
  ): Ariareadonly = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], cellRangeRenderer = js.Any.fromFunction1(cellRangeRenderer), containerRole = containerRole.asInstanceOf[js.Any], estimatedColumnSize = estimatedColumnSize.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = overscanColumnCount.asInstanceOf[js.Any], overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariareadonly]
  }
  @scala.inline
  implicit class AriareadonlyOps[Self <: Ariareadonly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-label`(value: grid): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-readonly`(value: `true`): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoContainerWidth(value: `false`): Self = this.set("autoContainerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoHeight(value: `false`): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoWidth(value: `false`): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactNode]): Self = this.set("cellRangeRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setContainerRole(value: rowgroup): Self = this.set("containerRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimatedColumnSize(value: `100`): Self = this.set("estimatedColumnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimatedRowSize(value: `30`): Self = this.set("estimatedRowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetScrollbarSize(value: () => Double): Self = this.set("getScrollbarSize", js.Any.fromFunction0(value))
    @scala.inline
    def setNoContentRenderer(value: () => ReactNode): Self = this.set("noContentRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScrollbarPresenceChange(value: () => Unit): Self = this.set("onScrollbarPresenceChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSectionRendered(value: () => Unit): Self = this.set("onSectionRendered", js.Any.fromFunction0(value))
    @scala.inline
    def setOverscanColumnCount(value: `0`): Self = this.set("overscanColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = this.set("overscanIndicesGetter", js.Any.fromFunction1(value))
    @scala.inline
    def setOverscanRowCount(value: `10`): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: grid): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToAlignment(value: auto): Self = this.set("scrollToAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToColumn(value: `-1`): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToRow(value: `-1`): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: `0`): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
  
}

