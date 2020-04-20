package typings.reactVirtualized

import typings.react.mod.ReactNode
import typings.reactVirtualized.esTableMod.TableHeaderRowProps
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowProps
import typings.reactVirtualized.esTableMod.TableRowRenderer
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`-1`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`30`
import typings.reactVirtualized.reactVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisableHeader extends js.Object {
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

object AnonDisableHeader {
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
  ): AnonDisableHeader = {
    val __obj = js.Dynamic.literal(disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerRowRenderer = js.Any.fromFunction1(headerRowRenderer), noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer), scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisableHeader]
  }
}

