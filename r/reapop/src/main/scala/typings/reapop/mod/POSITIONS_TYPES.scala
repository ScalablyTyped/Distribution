package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POSITIONS_TYPES extends js.Object {
  var bottom: BOTTOM
  var bottomCenter: BOTTOM_CENTER
  var bottomLeft: BOTTOM_LEFT_POSITION
  var bottomRight: BOTTOM_RIGHT_POSITION
  var top: TOP
  var topCenter: TOP_CENTER
  var topLeft: TOP_LEFT_POSITION
  var topRight: TOP_RIGHT_POSITION
}

object POSITIONS_TYPES {
  @scala.inline
  def apply(
    bottom: BOTTOM,
    bottomCenter: BOTTOM_CENTER,
    bottomLeft: BOTTOM_LEFT_POSITION,
    bottomRight: BOTTOM_RIGHT_POSITION,
    top: TOP,
    topCenter: TOP_CENTER,
    topLeft: TOP_LEFT_POSITION,
    topRight: TOP_RIGHT_POSITION
  ): POSITIONS_TYPES = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomCenter = bottomCenter.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[POSITIONS_TYPES]
  }
}

