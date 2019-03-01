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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ScreenRect]
  }
}

