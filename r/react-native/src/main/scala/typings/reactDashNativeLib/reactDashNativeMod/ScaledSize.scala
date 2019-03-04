package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaledSize extends js.Object {
  var fontScale: scala.Double
  var height: scala.Double
  var scale: scala.Double
  var width: scala.Double
}

object ScaledSize {
  @scala.inline
  def apply(fontScale: scala.Double, height: scala.Double, scale: scala.Double, width: scala.Double): ScaledSize = {
    val __obj = js.Dynamic.literal(fontScale = fontScale, height = height, scale = scale, width = width)
  
    __obj.asInstanceOf[ScaledSize]
  }
}

