package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsMasonryMod.emptyObject
import typings.reactDashVirtualized.distEsMasonryMod.identity
import typings.reactDashVirtualized.distEsMasonryMod.noop
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`20`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`false`
import typings.reactDashVirtualized.reactDashVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0150 extends js.Object {
  var autoHeight: `false`
  var keyMapper: identity
  var onCellsRendered: noop
  var onScroll: noop
  var overscanByPixels: `20`
  var role: grid
  var scrollingResetTimeInterval: `150`
  var style: emptyObject
  var tabIndex: `0`
}

object Anon_0150 {
  @scala.inline
  def apply(
    autoHeight: `false`,
    keyMapper: /* value */ js.Any => js.Any,
    onCellsRendered: () => Unit,
    onScroll: () => Unit,
    overscanByPixels: `20`,
    role: grid,
    scrollingResetTimeInterval: `150`,
    style: emptyObject,
    tabIndex: `0`
  ): Anon_0150 = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, keyMapper = js.Any.fromFunction1(keyMapper), onCellsRendered = js.Any.fromFunction0(onCellsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanByPixels = overscanByPixels, role = role, scrollingResetTimeInterval = scrollingResetTimeInterval, style = style, tabIndex = tabIndex)
  
    __obj.asInstanceOf[Anon_0150]
  }
}

