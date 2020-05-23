package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device. */
trait GamepadButton extends js.Object {
  val pressed: scala.Boolean
  val touched: scala.Boolean
  val value: Double
}

object GamepadButton {
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: Double): GamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButton]
  }
}

