package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraState extends js.Object {
  var isDragging: Boolean
  var isHovering: Boolean
}

object ExtraState {
  @scala.inline
  def apply(isDragging: Boolean, isHovering: Boolean): ExtraState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging, isHovering = isHovering)
  
    __obj.asInstanceOf[ExtraState]
  }
}

