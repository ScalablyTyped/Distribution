package typings.reactDashVirtualized

import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0150OnResize extends js.Object {
  var scrollElement: js.UndefOr[Window] = js.undefined
  var scrollingResetTimeInterval: `150`
  var serverHeight: `0`
  var serverWidth: `0`
  def onResize(): Unit
  def onScroll(): Unit
}

object Anon_0150OnResize {
  @scala.inline
  def apply(
    onResize: () => Unit,
    onScroll: () => Unit,
    scrollingResetTimeInterval: `150`,
    serverHeight: `0`,
    serverWidth: `0`,
    scrollElement: Window = null
  ): Anon_0150OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval, serverHeight = serverHeight, serverWidth = serverWidth)
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement)
    __obj.asInstanceOf[Anon_0150OnResize]
  }
}

