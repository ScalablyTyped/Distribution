package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focussed extends js.Object {
  var focussed: Boolean = js.native
}

object Focussed {
  @scala.inline
  def apply(focussed: Boolean): Focussed = {
    val __obj = js.Dynamic.literal(focussed = focussed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focussed]
  }
  @scala.inline
  implicit class FocussedOps[Self <: Focussed] (val x: Self) extends AnyVal {
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
    def setFocussed(value: Boolean): Self = this.set("focussed", value.asInstanceOf[js.Any])
  }
  
}

