package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutRectangle extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object LayoutRectangle {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): LayoutRectangle = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[LayoutRectangle]
  }
}

