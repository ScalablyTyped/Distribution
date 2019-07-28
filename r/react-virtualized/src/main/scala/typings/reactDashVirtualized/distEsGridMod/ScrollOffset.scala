package typings.reactDashVirtualized.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOffset extends js.Object {
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollOffset {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollOffset = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[ScrollOffset]
  }
}

