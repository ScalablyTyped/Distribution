package typings.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ariamodal extends js.Object {
  var `aria-modal`: Boolean = js.native
  var role: String = js.native
  def ref(): Unit = js.native
}

object Ariamodal {
  @scala.inline
  def apply(`aria-modal`: Boolean, ref: () => Unit, role: String): Ariamodal = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariamodal]
  }
  @scala.inline
  implicit class AriamodalOps[Self <: Ariamodal] (val x: Self) extends AnyVal {
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
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: () => Unit): Self = this.set("ref", js.Any.fromFunction0(value))
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
  }
  
}

