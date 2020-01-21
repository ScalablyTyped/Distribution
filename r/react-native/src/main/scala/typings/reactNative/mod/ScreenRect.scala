package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenRect extends js.Object {
  var height: Double
  var screenX: Double
  var screenY: Double
  var width: Double
}

object ScreenRect {
  @scala.inline
  def apply(height: Double, screenX: Double, screenY: Double, width: Double): ScreenRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScreenRect]
  }
}

