package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id. */
trait Gamepad extends js.Object {
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
    timestamp: Double,
    pose: GamepadPose = null
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hand = hand.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
}

