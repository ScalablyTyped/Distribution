package typings.reactNativeGestureHandler.mod

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
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerEventExtra]
  }
}

