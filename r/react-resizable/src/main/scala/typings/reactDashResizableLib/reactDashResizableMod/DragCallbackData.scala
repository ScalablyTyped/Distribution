package typings
package reactDashResizableLib.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragCallbackData extends js.Object {
  var deltaX: scala.Double
  var deltaY: scala.Double
  var lastX: scala.Double
  var lastY: scala.Double
  var node: reactLib.HTMLElement
  var x: scala.Double
  var y: scala.Double
}

object DragCallbackData {
  @scala.inline
  def apply(
    deltaX: scala.Double,
    deltaY: scala.Double,
    lastX: scala.Double,
    lastY: scala.Double,
    node: reactLib.HTMLElement,
    x: scala.Double,
    y: scala.Double
  ): DragCallbackData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deltaX")(deltaX)
    __obj.updateDynamic("deltaY")(deltaY)
    __obj.updateDynamic("lastX")(lastX)
    __obj.updateDynamic("lastY")(lastY)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[DragCallbackData]
  }
}

