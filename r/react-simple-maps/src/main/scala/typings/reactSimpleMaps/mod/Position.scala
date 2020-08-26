package typings.reactSimpleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var dragging: Boolean = js.native
  var last: Point = js.native
  var x: Double = js.native
  var y: Double = js.native
  var zoom: Double = js.native
  var zooming: Boolean = js.native
}

object Position {
  @scala.inline
  def apply(dragging: Boolean, last: Point, x: Double, y: Double, zoom: Double, zooming: Boolean): Position = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast(value: Point): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setZooming(value: Boolean): Self = this.set("zooming", value.asInstanceOf[js.Any])
  }
  
}

