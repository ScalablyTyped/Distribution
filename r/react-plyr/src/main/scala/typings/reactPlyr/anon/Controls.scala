package typings.reactPlyr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controls extends js.Object {
  var controls: js.UndefOr[Boolean] = js.native
  var seek: js.UndefOr[Boolean] = js.native
}

object Controls {
  @scala.inline
  def apply(): Controls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Controls]
  }
  @scala.inline
  implicit class ControlsOps[Self <: Controls] (val x: Self) extends AnyVal {
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
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setSeek(value: Boolean): Self = this.set("seek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeek: Self = this.set("seek", js.undefined)
  }
  
}

