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
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MasonryState]
  }
}

