package typings.reactDashResizable.reactDashResizableMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragCallbackData extends js.Object {
  var deltaX: Double
  var deltaY: Double
  var lastX: Double
  var lastY: Double
  var node: HTMLElement
  var x: Double
  var y: Double
}

object DragCallbackData {
  @scala.inline
  def apply(
    deltaX: Double,
    deltaY: Double,
    lastX: Double,
    lastY: Double,
    node: HTMLElement,
    x: Double,
    y: Double
  ): DragCallbackData = {
    val __obj = js.Dynamic.literal(deltaX = deltaX, deltaY = deltaY, lastX = lastX, lastY = lastY, node = node, x = x, y = y)
  
    __obj.asInstanceOf[DragCallbackData]
  }
}

