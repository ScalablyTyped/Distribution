package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanGestureHandlerEventExtra extends js.Object {
  var absoluteX: Double
  var absoluteY: Double
  var translationX: Double
  var translationY: Double
  var velocityX: Double
  var velocityY: Double
  var x: Double
  var y: Double
}

object PanGestureHandlerEventExtra {
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    translationX: Double,
    translationY: Double,
    velocityX: Double,
    velocityY: Double,
    x: Double,
    y: Double
  ): PanGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX, absoluteY = absoluteY, translationX = translationX, translationY = translationY, velocityX = velocityX, velocityY = velocityY, x = x, y = y)
  
    __obj.asInstanceOf[PanGestureHandlerEventExtra]
  }
}

