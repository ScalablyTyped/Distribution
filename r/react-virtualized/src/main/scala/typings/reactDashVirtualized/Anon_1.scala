package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsGridMod.OverscanIndices
import typings.reactDashVirtualized.distEsGridMod.OverscanIndicesGetter
import typings.reactDashVirtualized.distEsGridMod.OverscanIndicesGetterParams
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`-1`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`10`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`30`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`false`
import typings.reactDashVirtualized.reactDashVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var autoHeight: `false`
  var estimatedRowSize: `30`
  var overscanIndicesGetter: OverscanIndicesGetter
  var overscanRowCount: `10`
  var scrollToAlignment: auto
  var scrollToIndex: `-1`
  def noRowsRenderer(): Null
  def onRowsRendered(): Unit
  def onScroll(): Unit
}

object Anon_1 {
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
  ): Anon_1 = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_1]
  }
}

