package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType
  def pulse(value: Double, duration: Double): js.Promise[scala.Boolean]
}

@JSGlobal("GamepadHapticActuator")
@js.native
object GamepadHapticActuator extends Instantiable0[GamepadHapticActuator]

