package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType
  def pulse(value: Double, duration: Double): js.Promise[scala.Boolean]
}

object GamepadHapticActuator {
  @scala.inline
  def apply(pulse: (Double, Double) => js.Promise[scala.Boolean], `type`: GamepadHapticActuatorType): GamepadHapticActuator = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadHapticActuator]
  }
}

