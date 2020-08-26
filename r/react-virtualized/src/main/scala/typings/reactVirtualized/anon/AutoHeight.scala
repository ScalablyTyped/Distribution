package typings.reactVirtualized.anon

import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`-1`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`30`
import typings.reactVirtualized.reactVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoHeight extends js.Object {
  var autoHeight: `false` = js.native
  var estimatedRowSize: `30` = js.native
  var overscanIndicesGetter: OverscanIndicesGetter = js.native
  var overscanRowCount: `10` = js.native
  var scrollToAlignment: auto = js.native
  var scrollToIndex: `-1` = js.native
  def noRowsRenderer(): Null = js.native
  def onRowsRendered(): Unit = js.native
  def onScroll(): Unit = js.native
}

object AutoHeight {
  @scala.inline
  def apply(
    autoHeight: `false`,
    estimatedRowSize: `30`,
    noRowsRenderer: () => Null,
    onRowsRendered: () => Unit,
    onScroll: () => Unit,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices,
    overscanRowCount: `10`,
    scrollToAlignment: auto,
    scrollToIndex: `-1`
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
  @scala.inline
  implicit class AutoHeightOps[Self <: AutoHeight] (val x: Self) extends AnyVal {
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
    def setAutoHeight(value: `false`): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimatedRowSize(value: `30`): Self = this.set("estimatedRowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoRowsRenderer(value: () => Null): Self = this.set("noRowsRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def setOnRowsRendered(value: () => Unit): Self = this.set("onRowsRendered", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = this.set("overscanIndicesGetter", js.Any.fromFunction1(value))
    @scala.inline
    def setOverscanRowCount(value: `10`): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToAlignment(value: auto): Self = this.set("scrollToAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToIndex(value: `-1`): Self = this.set("scrollToIndex", value.asInstanceOf[js.Any])
  }
  
}

