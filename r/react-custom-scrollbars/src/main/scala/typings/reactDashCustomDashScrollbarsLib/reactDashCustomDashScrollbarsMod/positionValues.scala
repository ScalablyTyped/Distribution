package typings
package reactDashCustomDashScrollbarsLib.reactDashCustomDashScrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait positionValues extends js.Object {
  var clientHeight: scala.Double
  var clientWidth: scala.Double
  var left: scala.Double
  var scrollHeight: scala.Double
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var scrollWidth: scala.Double
  var top: scala.Double
}

object positionValues {
  @scala.inline
  def apply(
    clientHeight: scala.Double,
    clientWidth: scala.Double,
    left: scala.Double,
    scrollHeight: scala.Double,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    scrollWidth: scala.Double,
    top: scala.Double
  ): positionValues = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, left = left, scrollHeight = scrollHeight, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollWidth = scrollWidth, top = top)
  
    __obj.asInstanceOf[positionValues]
  }
}

