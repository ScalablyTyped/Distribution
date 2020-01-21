package typings.reactMotion.mod

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
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueConfig]
  }
}

