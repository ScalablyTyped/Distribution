package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEventInit extends EventModifierInit {
  var button: js.UndefOr[Double] = js.native
  var buttons: js.UndefOr[Double] = js.native
  var clientX: js.UndefOr[Double] = js.native
  var clientY: js.UndefOr[Double] = js.native
  var movementX: js.UndefOr[Double] = js.native
  var movementY: js.UndefOr[Double] = js.native
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
  var screenX: js.UndefOr[Double] = js.native
  var screenY: js.UndefOr[Double] = js.native
}

object MouseEventInit {
  @scala.inline
  def apply(): MouseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventInit]
  }
  @scala.inline
  implicit class MouseEventInitOps[Self <: MouseEventInit] (val x: Self) extends AnyVal {
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
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientX: Self = this.set("clientX", js.undefined)
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientY: Self = this.set("clientY", js.undefined)
    @scala.inline
    def setMovementX(value: Double): Self = this.set("movementX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovementX: Self = this.set("movementX", js.undefined)
    @scala.inline
    def setMovementY(value: Double): Self = this.set("movementY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovementY: Self = this.set("movementY", js.undefined)
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
    @scala.inline
    def setRelatedTargetNull: Self = this.set("relatedTarget", null)
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenX: Self = this.set("screenX", js.undefined)
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenY: Self = this.set("screenY", js.undefined)
  }
  
}

