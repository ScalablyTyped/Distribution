package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType
  def pulse(value: scala.Double, duration: scala.Double): Promise[scala.Boolean]
}

@JSGlobal("GamepadHapticActuator")
@js.native
object GamepadHapticActuator
  extends org.scalablytyped.runtime.Instantiable0[GamepadHapticActuator]

