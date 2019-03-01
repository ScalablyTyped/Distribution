package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollEventData extends js.Object {
  var clientHeight: scala.Double
  var scrollHeight: scala.Double
  var scrollTop: scala.Double
}

object ScrollEventData {
  @scala.inline
  def apply(clientHeight: scala.Double, scrollHeight: scala.Double, scrollTop: scala.Double): ScrollEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientHeight")(clientHeight)
    __obj.updateDynamic("scrollHeight")(scrollHeight)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.asInstanceOf[ScrollEventData]
  }
}

