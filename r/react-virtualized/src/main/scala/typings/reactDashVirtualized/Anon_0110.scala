package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowProps
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import typings.reactDashVirtualized.distEsTableMod.TableRowProps
import typings.reactDashVirtualized.distEsTableMod.TableRowRenderer
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`-1`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`10`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`30`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`false`
import typings.reactDashVirtualized.reactDashVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0110 extends js.Object {
  var disableHeader: `false`
  var estimatedRowSize: `30`
  var headerHeight: `0`
  var headerRowRenderer: TableHeaderRowRenderer
  var overscanRowCount: `10`
  var rowRenderer: TableRowRenderer
  var scrollToAlignment: auto
  var scrollToIndex: `-1`
  def noRowsRenderer(): Null
  def onRowsRendered(): Null
  def onScroll(): Null
}

object Anon_0110 {
  @scala.inline
  def apply(
    disableHeader: `false`,
    estimatedRowSize: `30`,
    headerHeight: `0`,
    headerRowRenderer: /* props */ TableHeaderRowProps => ReactNode,
    noRowsRenderer: () => Null,
    onRowsRendered: () => Null,
    onScroll: () => Null,
    overscanRowCount: `10`,
    rowRenderer: /* props */ TableRowProps => ReactNode,
    scrollToAlignment: auto,
    scrollToIndex: `-1`
  ): Anon_0110 = {
    val __obj = js.Dynamic.literal(disableHeader = disableHeader, estimatedRowSize = estimatedRowSize, headerHeight = headerHeight, headerRowRenderer = js.Any.fromFunction1(headerRowRenderer), noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanRowCount = overscanRowCount, rowRenderer = js.Any.fromFunction1(rowRenderer), scrollToAlignment = scrollToAlignment, scrollToIndex = scrollToIndex)
  
    __obj.asInstanceOf[Anon_0110]
  }
}

