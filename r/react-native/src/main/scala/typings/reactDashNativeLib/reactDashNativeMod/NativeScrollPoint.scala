package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object NativeScrollPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): NativeScrollPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[NativeScrollPoint]
  }
}

