package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

