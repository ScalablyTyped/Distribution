package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var autoHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  var estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30`
  var overscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter
  var overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10`
  var scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto
  var scrollToIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`
  def noRowsRenderer(): scala.Null
  def onRowsRendered(): scala.Unit
  def onScroll(): scala.Unit
}

object Anon_1 {
  @scala.inline
  def apply(
    autoHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30`,
    noRowsRenderer: () => scala.Null,
    onRowsRendered: () => scala.Unit,
    onScroll: () => scala.Unit,
    overscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter,
    overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10`,
    scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto,
    scrollToIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`
  ): Anon_1 = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, estimatedRowSize = estimatedRowSize, noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanIndicesGetter = overscanIndicesGetter, overscanRowCount = overscanRowCount, scrollToAlignment = scrollToAlignment, scrollToIndex = scrollToIndex)
  
    __obj.asInstanceOf[Anon_1]
  }
}

