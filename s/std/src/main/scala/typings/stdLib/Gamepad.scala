package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gamepad extends js.Object {
  val axes: js.Array[scala.Double]
  val buttons: js.Array[GamepadButton]
  val connected: scala.Boolean
  val displayId: scala.Double
  val hand: GamepadHand
  val hapticActuators: js.Array[GamepadHapticActuator]
  val id: java.lang.String
  val index: scala.Double
  val mapping: GamepadMappingType
  val pose: GamepadPose | scala.Null
  val timestamp: scala.Double
}

@JSGlobal("Gamepad")
@js.native
class GamepadCls () extends Gamepad {
  /* CompleteClass */
  override val axes: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override val buttons: js.Array[GamepadButton] = js.native
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  /* CompleteClass */
  override val displayId: scala.Double = js.native
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  /* CompleteClass */
  override val hapticActuators: js.Array[GamepadHapticActuator] = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val index: scala.Double = js.native
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  /* CompleteClass */
  override val pose: GamepadPose | scala.Null = js.native
  /* CompleteClass */
  override val timestamp: scala.Double = js.native
}

@JSGlobal("Gamepad")
@js.native
object Gamepad
  extends org.scalablytyped.runtime.Instantiable0[Gamepad]

