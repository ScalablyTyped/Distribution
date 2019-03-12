package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0150OnResize extends js.Object {
  var scrollElement: js.UndefOr[stdLib.Window]
  var scrollingResetTimeInterval: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`150`
  var serverHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`
  var serverWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`
  def onResize(): scala.Unit
  def onScroll(): scala.Unit
}

object Anon_0150OnResize {
  @scala.inline
  def apply(
    onResize: () => scala.Unit,
    onScroll: () => scala.Unit,
    scrollingResetTimeInterval: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`150`,
    serverHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`,
    serverWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`,
    scrollElement: stdLib.Window = null
  ): Anon_0150OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval, serverHeight = serverHeight, serverWidth = serverWidth)
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement)
    __obj.asInstanceOf[Anon_0150OnResize]
  }
}

