package typings.reactDashVirtualized.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollPosition extends js.Object {
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollPosition {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollPosition = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[ScrollPosition]
  }
}

