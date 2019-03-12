package typings
package reactDashRndLib.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableData extends js.Object {
  var deltaX: scala.Double
  var deltaY: scala.Double
  var lastX: scala.Double
  var lastY: scala.Double
  var node: stdLib.HTMLElement
  var x: scala.Double
  var y: scala.Double
}

object DraggableData {
  @scala.inline
  def apply(
    deltaX: scala.Double,
    deltaY: scala.Double,
    lastX: scala.Double,
    lastY: scala.Double,
    node: stdLib.HTMLElement,
    x: scala.Double,
    y: scala.Double
  ): DraggableData = {
    val __obj = js.Dynamic.literal(deltaX = deltaX, deltaY = deltaY, lastX = lastX, lastY = lastY, node = node, x = x, y = y)
  
    __obj.asInstanceOf[DraggableData]
  }
}

