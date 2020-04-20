package typings.scrollbooster.mod

import typings.scrollbooster.AnonBottom
import typings.scrollbooster.RequiredPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollingState extends js.Object {
  var borderCollision: AnonBottom
  var dragOffset: Double
  var isDragging: Boolean
  var isMoving: Boolean
  var position: RequiredPosition
}

object ScrollingState {
  @scala.inline
  def apply(
    borderCollision: AnonBottom,
    dragOffset: Double,
    isDragging: Boolean,
    isMoving: Boolean,
    position: RequiredPosition
  ): ScrollingState = {
    val __obj = js.Dynamic.literal(borderCollision = borderCollision.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isMoving = isMoving.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingState]
  }
}

