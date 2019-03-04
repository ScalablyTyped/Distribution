package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraState extends js.Object {
  var isDragging: scala.Boolean
  var isHovering: scala.Boolean
}

object ExtraState {
  @scala.inline
  def apply(isDragging: scala.Boolean, isHovering: scala.Boolean): ExtraState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging, isHovering = isHovering)
  
    __obj.asInstanceOf[ExtraState]
  }
}

