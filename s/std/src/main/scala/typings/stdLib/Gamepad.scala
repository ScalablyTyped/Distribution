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
object Gamepad
  extends org.scalablytyped.runtime.Instantiable0[Gamepad]

