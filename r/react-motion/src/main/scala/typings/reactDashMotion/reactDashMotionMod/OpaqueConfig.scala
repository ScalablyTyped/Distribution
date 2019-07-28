package typings.reactDashMotion.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueConfig extends js.Object {
  var damping: Double
  var precision: Double
  var stiffness: Double
  var `val`: Double
}

object OpaqueConfig {
  @scala.inline
  def apply(damping: Double, precision: Double, stiffness: Double, `val`: Double): OpaqueConfig = {
    val __obj = js.Dynamic.literal(damping = damping, precision = precision, stiffness = stiffness)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[OpaqueConfig]
  }
}

