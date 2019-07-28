package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device. */
trait GamepadButton extends js.Object {
  val pressed: scala.Boolean
  val touched: scala.Boolean
  val value: Double
}

@JSGlobal("GamepadButton")
@js.native
class GamepadButtonCls () extends GamepadButton {
  /* CompleteClass */
  override val pressed: scala.Boolean = js.native
  /* CompleteClass */
  override val touched: scala.Boolean = js.native
  /* CompleteClass */
  override val value: Double = js.native
}

@JSGlobal("GamepadButton")
@js.native
object GamepadButton extends Instantiable0[GamepadButton]

