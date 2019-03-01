package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarPresenceParams extends js.Object {
  var horizontal: scala.Boolean
  var size: scala.Double
  var vertical: scala.Boolean
}

object ScrollbarPresenceParams {
  @scala.inline
  def apply(horizontal: scala.Boolean, size: scala.Double, vertical: scala.Boolean): ScrollbarPresenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("horizontal")(horizontal)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ScrollbarPresenceParams]
  }
}

