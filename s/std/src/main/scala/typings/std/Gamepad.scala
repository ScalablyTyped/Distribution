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
class GamepadCls () extends Gamepad {
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  /* CompleteClass */
  override val buttons: js.Array[GamepadButton] = js.native
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  /* CompleteClass */
  override val hapticActuators: js.Array[GamepadHapticActuator] = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val index: Double = js.native
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  /* CompleteClass */
  override val pose: GamepadPose | Null = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
}

@JSGlobal("Gamepad")
@js.native
object Gamepad extends Instantiable0[Gamepad]

