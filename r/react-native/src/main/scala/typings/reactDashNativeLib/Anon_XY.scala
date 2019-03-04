package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  var x: scala.Double | reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue
  var y: scala.Double | reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue
}

object Anon_XY {
  @scala.inline
  def apply(
    x: scala.Double | reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue,
    y: scala.Double | reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue
  ): Anon_XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_XY]
  }
}

