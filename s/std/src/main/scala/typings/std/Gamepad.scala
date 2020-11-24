package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id. */
@js.native
trait Gamepad extends js.Object {
  
  val axes: js.Array[Double] = js.native
  
  val buttons: js.Array[GamepadButton] = js.native
  
  val connected: scala.Boolean = js.native
  
  val hand: GamepadHand = js.native
  
  val hapticActuators: js.Array[GamepadHapticActuator] = js.native
  
  val id: java.lang.String = js.native
  
  val index: Double = js.native
  
  val mapping: GamepadMappingType = js.native
  
  val pose: GamepadPose | Null = js.native
  
  val timestamp: Double = js.native
}
object Gamepad {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hand = hand.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit class GamepadOps[Self <: Gamepad] (val x: Self) extends AnyVal {
    
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
    def setAxesVarargs(value: Double*): Self = this.set("axes", js.Array(value :_*))
    
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: GamepadButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[GamepadButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected(value: scala.Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHand(value: GamepadHand): Self = this.set("hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuatorsVarargs(value: GamepadHapticActuator*): Self = this.set("hapticActuators", js.Array(value :_*))
    
    @scala.inline
    def setHapticActuators(value: js.Array[GamepadHapticActuator]): Self = this.set("hapticActuators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: GamepadMappingType): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPose(value: GamepadPose): Self = this.set("pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoseNull: Self = this.set("pose", null)
  }
}
