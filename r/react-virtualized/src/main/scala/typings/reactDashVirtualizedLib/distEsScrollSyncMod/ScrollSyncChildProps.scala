package typings
package reactDashVirtualizedLib.distEsScrollSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSyncChildProps extends js.Object {
  var clientHeight: scala.Double
  var clientWidth: scala.Double
  var scrollHeight: scala.Double
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var scrollWidth: scala.Double
  def onScroll(params: OnScrollParams): scala.Unit
}

object ScrollSyncChildProps {
  @scala.inline
  def apply(
    clientHeight: scala.Double,
    clientWidth: scala.Double,
    onScroll: js.Function1[OnScrollParams, scala.Unit],
    scrollHeight: scala.Double,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    scrollWidth: scala.Double
  ): ScrollSyncChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientHeight")(clientHeight)
    __obj.updateDynamic("clientWidth")(clientWidth)
    __obj.updateDynamic("onScroll")(onScroll)
    __obj.updateDynamic("scrollHeight")(scrollHeight)
    __obj.updateDynamic("scrollLeft")(scrollLeft)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.updateDynamic("scrollWidth")(scrollWidth)
    __obj.asInstanceOf[ScrollSyncChildProps]
  }
}

