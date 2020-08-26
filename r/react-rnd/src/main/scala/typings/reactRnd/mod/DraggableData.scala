package typings.reactRnd.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  node :std.HTMLElement,   deltaX :number,   deltaY :number,   lastX :number,   lastY :number} & react-rnd.react-rnd.Position */
@js.native
trait DraggableData extends js.Object {
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var lastX: Double = js.native
  var lastY: Double = js.native
  var node: HTMLElement = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object DraggableData {
  @scala.inline
  def apply(
    deltaX: Double,
    deltaY: Double,
    lastX: Double,
    lastY: Double,
    node: HTMLElement,
    x: Double,
    y: Double
  ): DraggableData = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableData]
  }
  @scala.inline
  implicit class DraggableDataOps[Self <: DraggableData] (val x: Self) extends AnyVal {
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
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastX(value: Double): Self = this.set("lastX", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastY(value: Double): Self = this.set("lastY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

