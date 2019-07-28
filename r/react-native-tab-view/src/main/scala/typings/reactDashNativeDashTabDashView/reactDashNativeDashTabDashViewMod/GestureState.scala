package typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureState extends js.Object {
  var dx: Double
  var dy: Double
  var moveX: Double
  var moveY: Double
  var numberActiveTouches: Double
  var stateID: Double
  var vx: Double
  var vy: Double
  var x0: Double
  var y0: Double
}

object GestureState {
  @scala.inline
  def apply(
    dx: Double,
    dy: Double,
    moveX: Double,
    moveY: Double,
    numberActiveTouches: Double,
    stateID: Double,
    vx: Double,
    vy: Double,
    x0: Double,
    y0: Double
  ): GestureState = {
    val __obj = js.Dynamic.literal(dx = dx, dy = dy, moveX = moveX, moveY = moveY, numberActiveTouches = numberActiveTouches, stateID = stateID, vx = vx, vy = vy, x0 = x0, y0 = y0)
  
    __obj.asInstanceOf[GestureState]
  }
}

