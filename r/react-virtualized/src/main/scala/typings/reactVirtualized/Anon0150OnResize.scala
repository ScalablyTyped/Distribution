package typings.reactVirtualized

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`150`
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0150OnResize extends js.Object {
  var scrollElement: js.UndefOr[Window_] = js.undefined
  var scrollingResetTimeInterval: `150`
  var serverHeight: `0`
  var serverWidth: `0`
  def onResize(): Unit
  def onScroll(): Unit
}

object Anon0150OnResize {
  @scala.inline
  def apply(
    onResize: () => Unit,
    onScroll: () => Unit,
    scrollingResetTimeInterval: `150`,
    serverHeight: `0`,
    serverWidth: `0`,
    scrollElement: Window_ = null
  ): Anon0150OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], serverHeight = serverHeight.asInstanceOf[js.Any], serverWidth = serverWidth.asInstanceOf[js.Any])
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0150OnResize]
  }
}

