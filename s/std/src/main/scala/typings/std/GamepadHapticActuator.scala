package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
@js.native
trait GamepadHapticActuator extends StObject {
  
  def pulse(value: Double, duration: Double): js.Promise[scala.Boolean] = js.native
  
  val `type`: GamepadHapticActuatorType = js.native
}
object GamepadHapticActuator {
  
  @scala.inline
  def apply(pulse: (Double, Double) => js.Promise[scala.Boolean], `type`: GamepadHapticActuatorType): GamepadHapticActuator = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadHapticActuator]
  }
  
  @scala.inline
  implicit class GamepadHapticActuatorMutableBuilder[Self <: GamepadHapticActuator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPulse(value: (Double, Double) => js.Promise[scala.Boolean]): Self = StObject.set(x, "pulse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: GamepadHapticActuatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
