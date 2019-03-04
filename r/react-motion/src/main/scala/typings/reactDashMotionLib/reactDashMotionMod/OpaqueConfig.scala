package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueConfig extends js.Object {
  var damping: scala.Double
  var precision: scala.Double
  var stiffness: scala.Double
  var `val`: scala.Double
}

object OpaqueConfig {
  @scala.inline
  def apply(damping: scala.Double, precision: scala.Double, stiffness: scala.Double, `val`: scala.Double): OpaqueConfig = {
    val __obj = js.Dynamic.literal(damping = damping, precision = precision, stiffness = stiffness)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[OpaqueConfig]
  }
}

