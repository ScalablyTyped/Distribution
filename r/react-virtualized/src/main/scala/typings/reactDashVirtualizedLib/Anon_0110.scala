package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0110 extends js.Object {
  var disableHeader: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  var estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30`
  var headerHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`
  var headerRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer
  var overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10`
  var rowRenderer: reactDashVirtualizedLib.distEsTableMod.TableRowRenderer
  var scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto
  var scrollToIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`
  def noRowsRenderer(): scala.Null
  def onRowsRendered(): scala.Null
  def onScroll(): scala.Null
}

object Anon_0110 {
  @scala.inline
  def apply(
    disableHeader: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30`,
    headerHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`,
    headerRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer,
    noRowsRenderer: () => scala.Null,
    onRowsRendered: () => scala.Null,
    onScroll: () => scala.Null,
    overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10`,
    rowRenderer: reactDashVirtualizedLib.distEsTableMod.TableRowRenderer,
    scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto,
    scrollToIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1`
  ): Anon_0110 = {
    val __obj = js.Dynamic.literal(disableHeader = disableHeader, estimatedRowSize = estimatedRowSize, headerHeight = headerHeight, headerRowRenderer = headerRowRenderer, noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanRowCount = overscanRowCount, rowRenderer = rowRenderer, scrollToAlignment = scrollToAlignment, scrollToIndex = scrollToIndex)
  
    __obj.asInstanceOf[Anon_0110]
  }
}

