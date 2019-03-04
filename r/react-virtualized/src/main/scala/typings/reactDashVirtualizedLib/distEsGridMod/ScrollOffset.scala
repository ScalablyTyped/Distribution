package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOffset extends js.Object {
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
}

object ScrollOffset {
  @scala.inline
  def apply(scrollLeft: scala.Double, scrollTop: scala.Double): ScrollOffset = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[ScrollOffset]
  }
}

