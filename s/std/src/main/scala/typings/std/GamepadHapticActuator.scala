package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
@js.native
trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType = js.native
  def pulse(value: Double, duration: Double): js.Promise[scala.Boolean] = js.native
}

object GamepadHapticActuator {
  @scala.inline
  def apply(pulse: (Double, Double) => js.Promise[scala.Boolean], `type`: GamepadHapticActuatorType): GamepadHapticActuator = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadHapticActuator]
  }
  @scala.inline
  implicit class GamepadHapticActuatorOps[Self <: GamepadHapticActuator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPulse(value: (Double, Double) => js.Promise[scala.Boolean]): Self = this.set("pulse", js.Any.fromFunction2(value))
    @scala.inline
    def setType(value: GamepadHapticActuatorType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

