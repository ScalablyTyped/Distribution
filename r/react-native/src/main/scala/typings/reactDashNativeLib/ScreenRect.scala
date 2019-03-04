package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenRect extends js.Object {
  var height: scala.Double
  var screenX: scala.Double
  var screenY: scala.Double
  var width: scala.Double
}

object ScreenRect {
  @scala.inline
  def apply(height: scala.Double, screenX: scala.Double, screenY: scala.Double, width: scala.Double): ScreenRect = {
    val __obj = js.Dynamic.literal(height = height, screenX = screenX, screenY = screenY, width = width)
  
    __obj.asInstanceOf[ScreenRect]
  }
}

