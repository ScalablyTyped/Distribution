package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollParams extends js.Object {
  var clientHeight: scala.Double
  var clientWidth: scala.Double
  var scrollHeight: scala.Double
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var scrollWidth: scala.Double
}

object ScrollParams {
  @scala.inline
  def apply(
    clientHeight: scala.Double,
    clientWidth: scala.Double,
    scrollHeight: scala.Double,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    scrollWidth: scala.Double
  ): ScrollParams = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, scrollHeight = scrollHeight, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollWidth = scrollWidth)
  
    __obj.asInstanceOf[ScrollParams]
  }
}

