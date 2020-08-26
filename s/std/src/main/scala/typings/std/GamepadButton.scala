package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device. */
@js.native
trait GamepadButton extends js.Object {
  val pressed: scala.Boolean = js.native
  val touched: scala.Boolean = js.native
  val value: Double = js.native
}

object GamepadButton {
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: Double): GamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButton]
  }
  @scala.inline
  implicit class GamepadButtonOps[Self <: GamepadButton] (val x: Self) extends AnyVal {
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
    def setPressed(value: scala.Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouched(value: scala.Boolean): Self = this.set("touched", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

