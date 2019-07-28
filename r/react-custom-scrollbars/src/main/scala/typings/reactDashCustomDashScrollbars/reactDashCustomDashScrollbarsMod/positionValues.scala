package typings.reactDashCustomDashScrollbars.reactDashCustomDashScrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait positionValues extends js.Object {
  var clientHeight: Double
  var clientWidth: Double
  var left: Double
  var scrollHeight: Double
  var scrollLeft: Double
  var scrollTop: Double
  var scrollWidth: Double
  var top: Double
}

object positionValues {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    left: Double,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double,
    top: Double
  ): positionValues = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, left = left, scrollHeight = scrollHeight, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollWidth = scrollWidth, top = top)
  
    __obj.asInstanceOf[positionValues]
  }
}

