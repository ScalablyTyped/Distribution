package typings.reactDashNative.reactDashNativeMod

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
    val __obj = js.Dynamic.literal(height = height, screenX = screenX, screenY = screenY, width = width)
  
    __obj.asInstanceOf[ScreenRect]
  }
}

