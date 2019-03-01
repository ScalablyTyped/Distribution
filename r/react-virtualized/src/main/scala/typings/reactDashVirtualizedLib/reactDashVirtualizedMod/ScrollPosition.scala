package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollPosition extends js.Object {
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
}

object ScrollPosition {
  @scala.inline
  def apply(scrollLeft: scala.Double, scrollTop: scala.Double): ScrollPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scrollLeft")(scrollLeft)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.asInstanceOf[ScrollPosition]
  }
}

