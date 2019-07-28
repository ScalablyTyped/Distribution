package typings.reactDashVirtualized.distEsScrollSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSyncChildProps extends js.Object {
  var clientHeight: Double
  var clientWidth: Double
  var scrollHeight: Double
  var scrollLeft: Double
  var scrollTop: Double
  var scrollWidth: Double
  def onScroll(params: OnScrollParams): Unit
}

object ScrollSyncChildProps {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    onScroll: OnScrollParams => Unit,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double
  ): ScrollSyncChildProps = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, onScroll = js.Any.fromFunction1(onScroll), scrollHeight = scrollHeight, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollWidth = scrollWidth)
  
    __obj.asInstanceOf[ScrollSyncChildProps]
  }
}

