package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryState extends js.Object {
  var isScrolling: scala.Boolean
  var scrollTop: scala.Double
}

object MasonryState {
  @scala.inline
  def apply(isScrolling: scala.Boolean, scrollTop: scala.Double): MasonryState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.asInstanceOf[MasonryState]
  }
}

