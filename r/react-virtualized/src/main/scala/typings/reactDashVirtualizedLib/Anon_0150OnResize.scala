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
    onResize: js.Function0[scala.Unit],
    onScroll: js.Function0[scala.Unit],
    scrollingResetTimeInterval: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`150`,
    serverHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`,
    serverWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0`,
    scrollElement: stdLib.Window = null
  ): Anon_0150OnResize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onResize")(onResize)
    __obj.updateDynamic("onScroll")(onScroll)
    __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval)
    __obj.updateDynamic("serverHeight")(serverHeight)
    __obj.updateDynamic("serverWidth")(serverWidth)
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement)
    __obj.asInstanceOf[Anon_0150OnResize]
  }
}

