package typings.reactVirtualized.esWindowScrollerMod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowScrollerState]
  }
}

