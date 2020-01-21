package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapGestureHandlerEventExtra extends js.Object {
  var absoluteX: Double
  var absoluteY: Double
  var x: Double
  var y: Double
}

object TapGestureHandlerEventExtra {
  @scala.inline
  def apply(absoluteX: Double, absoluteY: Double, x: Double, y: Double): TapGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TapGestureHandlerEventExtra]
  }
}

