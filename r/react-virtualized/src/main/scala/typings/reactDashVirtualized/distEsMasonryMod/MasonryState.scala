package typings.reactDashVirtualized.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryState extends js.Object {
  var isScrolling: Boolean
  var scrollTop: Double
}

object MasonryState {
  @scala.inline
  def apply(isScrolling: Boolean, scrollTop: Double): MasonryState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling, scrollTop = scrollTop)
  
    __obj.asInstanceOf[MasonryState]
  }
}

