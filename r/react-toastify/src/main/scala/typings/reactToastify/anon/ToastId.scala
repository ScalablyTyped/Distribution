package typings.reactToastify.anon

import typings.reactToastify.reactToastifyStrings.REMOVE
import typings.reactToastify.toastContainerReducerMod.Action
import typings.reactToastify.typesMod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastId extends Action {
  var toastId: js.UndefOr[Id] = js.native
  var `type`: REMOVE = js.native
}

object ToastId {
  @scala.inline
  def apply(`type`: REMOVE): ToastId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastId]
  }
  @scala.inline
  implicit class ToastIdOps[Self <: ToastId] (val x: Self) extends AnyVal {
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
    def setType(value: REMOVE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setToastId(value: Id): Self = this.set("toastId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastId: Self = this.set("toastId", js.undefined)
  }
  
}

