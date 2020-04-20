package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceTouchGestureHandlerEventExtra extends js.Object {
  var absoluteX: Double
  var absoluteY: Double
  var force: Double
  var x: Double
  var y: Double
}

object ForceTouchGestureHandlerEventExtra {
  @scala.inline
  def apply(absoluteX: Double, absoluteY: Double, force: Double, x: Double, y: Double): ForceTouchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerEventExtra]
  }
}

