package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollVelocity extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object NativeScrollVelocity {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): NativeScrollVelocity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[NativeScrollVelocity]
  }
}

