package typings.reactDashVirtualized.distEsWindowScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowScrollerState extends js.Object {
  var height: Double
  var isScrolling: Boolean
  var scrollLeft: Double
  var scrollTop: Double
  var width: Double
}

object WindowScrollerState {
  @scala.inline
  def apply(height: Double, isScrolling: Boolean, scrollLeft: Double, scrollTop: Double, width: Double): WindowScrollerState = {
    val __obj = js.Dynamic.literal(height = height, isScrolling = isScrolling, scrollLeft = scrollLeft, scrollTop = scrollTop, width = width)
  
    __obj.asInstanceOf[WindowScrollerState]
  }
}

