package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
trait GamepadHapticActuator extends StObject {
  
  /* standard dom */
  val `type`: GamepadHapticActuatorType
}
object GamepadHapticActuator {
  
  inline def apply(`type`: GamepadHapticActuatorType): GamepadHapticActuator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadHapticActuator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GamepadHapticActuator] (val x: Self) extends AnyVal {
    
    inline def setType(value: GamepadHapticActuatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
