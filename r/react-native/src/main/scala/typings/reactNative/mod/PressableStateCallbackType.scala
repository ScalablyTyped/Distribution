package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  pressed :boolean}> */
@js.native
trait PressableStateCallbackType extends js.Object {
  val pressed: Boolean = js.native
}

object PressableStateCallbackType {
  @scala.inline
  def apply(pressed: Boolean): PressableStateCallbackType = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressableStateCallbackType]
  }
  @scala.inline
  implicit class PressableStateCallbackTypeOps[Self <: PressableStateCallbackType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPressed(value: Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
  }
  
}

