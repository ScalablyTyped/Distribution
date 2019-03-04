package typings
package reactDashVirtualizedLib.distEsWindowScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowScrollerState extends js.Object {
  var height: scala.Double
  var isScrolling: scala.Boolean
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var width: scala.Double
}

object WindowScrollerState {
  @scala.inline
  def apply(
    height: scala.Double,
    isScrolling: scala.Boolean,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    width: scala.Double
  ): WindowScrollerState = {
    val __obj = js.Dynamic.literal(height = height, isScrolling = isScrolling, scrollLeft = scrollLeft, scrollTop = scrollTop, width = width)
  
    __obj.asInstanceOf[WindowScrollerState]
  }
}

