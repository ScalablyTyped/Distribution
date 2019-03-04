package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureState extends js.Object {
  var dx: scala.Double
  var dy: scala.Double
  var moveX: scala.Double
  var moveY: scala.Double
  var numberActiveTouches: scala.Double
  var stateID: scala.Double
  var vx: scala.Double
  var vy: scala.Double
  var x0: scala.Double
  var y0: scala.Double
}

object GestureState {
  @scala.inline
  def apply(
    dx: scala.Double,
    dy: scala.Double,
    moveX: scala.Double,
    moveY: scala.Double,
    numberActiveTouches: scala.Double,
    stateID: scala.Double,
    vx: scala.Double,
    vy: scala.Double,
    x0: scala.Double,
    y0: scala.Double
  ): GestureState = {
    val __obj = js.Dynamic.literal(dx = dx, dy = dy, moveX = moveX, moveY = moveY, numberActiveTouches = numberActiveTouches, stateID = stateID, vx = vx, vy = vy, x0 = x0, y0 = y0)
  
    __obj.asInstanceOf[GestureState]
  }
}

