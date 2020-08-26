package typings.scrollbooster.mod

import typings.scrollbooster.anon.Bottom
import typings.scrollbooster.anon.RequiredPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollingState extends js.Object {
  var borderCollision: Bottom = js.native
  var dragOffset: Double = js.native
  var isDragging: Boolean = js.native
  var isMoving: Boolean = js.native
  var position: RequiredPosition = js.native
}

object ScrollingState {
  @scala.inline
  def apply(
    borderCollision: Bottom,
    dragOffset: Double,
    isDragging: Boolean,
    isMoving: Boolean,
    position: RequiredPosition
  ): ScrollingState = {
    val __obj = js.Dynamic.literal(borderCollision = borderCollision.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isMoving = isMoving.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingState]
  }
  @scala.inline
  implicit class ScrollingStateOps[Self <: ScrollingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBorderCollision(value: Bottom): Self = this.set("borderCollision", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOffset(value: Double): Self = this.set("dragOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMoving(value: Boolean): Self = this.set("isMoving", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: RequiredPosition): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

