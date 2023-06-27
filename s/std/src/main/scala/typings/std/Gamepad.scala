package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad)
  */
trait Gamepad extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/axes) */
  /* standard dom */
  val axes: js.Array[Double]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/buttons) */
  /* standard dom */
  val buttons: js.Array[GamepadButton]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/connected) */
  /* standard dom */
  val connected: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/hapticActuators) */
  /* standard dom */
  val hapticActuators: js.Array[GamepadHapticActuator]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/id) */
  /* standard dom */
  val id: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/index) */
  /* standard dom */
  val index: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping) */
  /* standard dom */
  val mapping: GamepadMappingType
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/timestamp) */
  /* standard dom */
  val timestamp: DOMHighResTimeStamp
  
  /* standard dom */
  val vibrationActuator: GamepadHapticActuator | Null
}
object Gamepad {
  
  inline def apply(
    axes: js.Array[Double],
    buttons: js.Array[GamepadButton],
    connected: scala.Boolean,
    hapticActuators: js.Array[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: GamepadMappingType,
    timestamp: DOMHighResTimeStamp
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], vibrationActuator = null)
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gamepad] (val x: Self) extends AnyVal {
    
    inline def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setButtons(value: js.Array[GamepadButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: GamepadButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setConnected(value: scala.Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setHapticActuators(value: js.Array[GamepadHapticActuator]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
    
    inline def setHapticActuatorsVarargs(value: GamepadHapticActuator*): Self = StObject.set(x, "hapticActuators", js.Array(value*))
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: GamepadMappingType): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVibrationActuator(value: GamepadHapticActuator): Self = StObject.set(x, "vibrationActuator", value.asInstanceOf[js.Any])
    
    inline def setVibrationActuatorNull: Self = StObject.set(x, "vibrationActuator", null)
  }
}
