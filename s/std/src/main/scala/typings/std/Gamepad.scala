package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("Gamepad")
@js.native
object Gamepad extends Instantiable0[Gamepad]

