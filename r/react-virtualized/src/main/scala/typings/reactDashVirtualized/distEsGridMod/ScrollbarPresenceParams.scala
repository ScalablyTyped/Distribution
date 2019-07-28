package typings.reactDashVirtualized.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarPresenceParams extends js.Object {
  var horizontal: Boolean
  var size: Double
  var vertical: Boolean
}

object ScrollbarPresenceParams {
  @scala.inline
  def apply(horizontal: Boolean, size: Double, vertical: Boolean): ScrollbarPresenceParams = {
    val __obj = js.Dynamic.literal(horizontal = horizontal, size = size, vertical = vertical)
  
    __obj.asInstanceOf[ScrollbarPresenceParams]
  }
}

