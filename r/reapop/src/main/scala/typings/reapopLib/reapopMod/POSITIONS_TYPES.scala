package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POSITIONS_TYPES extends js.Object {
  var bottom: reapopLib.BOTTOM
  var bottomCenter: reapopLib.BOTTOM_CENTER
  var bottomLeft: reapopLib.BOTTOM_LEFT_POSITION
  var bottomRight: reapopLib.BOTTOM_RIGHT_POSITION
  var top: reapopLib.TOP
  var topCenter: reapopLib.TOP_CENTER
  var topLeft: reapopLib.TOP_LEFT_POSITION
  var topRight: reapopLib.TOP_RIGHT_POSITION
}

object POSITIONS_TYPES {
  @scala.inline
  def apply(
    bottom: reapopLib.BOTTOM,
    bottomCenter: reapopLib.BOTTOM_CENTER,
    bottomLeft: reapopLib.BOTTOM_LEFT_POSITION,
    bottomRight: reapopLib.BOTTOM_RIGHT_POSITION,
    top: reapopLib.TOP,
    topCenter: reapopLib.TOP_CENTER,
    topLeft: reapopLib.TOP_LEFT_POSITION,
    topRight: reapopLib.TOP_RIGHT_POSITION
  ): POSITIONS_TYPES = {
    val __obj = js.Dynamic.literal(bottom = bottom, bottomCenter = bottomCenter, bottomLeft = bottomLeft, bottomRight = bottomRight, top = top, topCenter = topCenter, topLeft = topLeft, topRight = topRight)
  
    __obj.asInstanceOf[POSITIONS_TYPES]
  }
}

