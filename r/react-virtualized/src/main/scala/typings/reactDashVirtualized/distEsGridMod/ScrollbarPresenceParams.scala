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
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollbarPresenceParams]
  }
}

