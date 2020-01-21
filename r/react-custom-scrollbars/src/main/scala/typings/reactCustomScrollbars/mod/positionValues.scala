package typings.reactCustomScrollbars.mod

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
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[positionValues]
  }
}

