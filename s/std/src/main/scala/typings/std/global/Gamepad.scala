package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.GamepadHand
import typings.std.GamepadMappingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Gamepad")
@js.native
class Gamepad ()
  extends typings.std.Gamepad {
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  /* CompleteClass */
  override val buttons: js.Array[typings.std.GamepadButton] = js.native
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  /* CompleteClass */
  override val hapticActuators: js.Array[typings.std.GamepadHapticActuator] = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val index: Double = js.native
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  /* CompleteClass */
  override val pose: typings.std.GamepadPose | Null = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
}

@JSGlobal("Gamepad")
@js.native
object Gamepad
  extends Instantiable0[typings.std.Gamepad]

