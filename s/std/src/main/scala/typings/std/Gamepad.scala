package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id. */
trait Gamepad extends StObject {
  
  val axes: js.Array[Double]
  
  val buttons: js.Array[GamepadButton]
  
  val connected: scala.Boolean
  
  val hand: GamepadHand
  
  val hapticActuators: js.Array[GamepadHapticActuator]
  
  val id: java.lang.String
  
  val index: Double
  
  val mapping: GamepadMappingType
  
  val pose: GamepadPose | Null
  
  val timestamp: Double
}
object Gamepad {
  
  inline def apply(
    axes: js.Array[Double],
    buttons: js.Array[GamepadButton],
    connected: scala.Boolean,
    hand: GamepadHand,
    hapticActuators: js.Array[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: GamepadMappingType,
    timestamp: Double
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hand = hand.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], pose = null)
    __obj.asInstanceOf[Gamepad]
  }
  
  extension [Self <: Gamepad](x: Self) {
    
    inline def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    inline def setButtons(value: js.Array[GamepadButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: GamepadButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setConnected(value: scala.Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setHand(value: GamepadHand): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
    
    inline def setHapticActuators(value: js.Array[GamepadHapticActuator]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
    
    inline def setHapticActuatorsVarargs(value: GamepadHapticActuator*): Self = StObject.set(x, "hapticActuators", js.Array(value :_*))
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: GamepadMappingType): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setPose(value: GamepadPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    inline def setPoseNull: Self = StObject.set(x, "pose", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
