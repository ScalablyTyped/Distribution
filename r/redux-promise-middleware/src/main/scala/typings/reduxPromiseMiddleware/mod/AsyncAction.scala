package typings.reduxPromiseMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncAction extends FluxStandardAction {
  @JSName("payload")
  var payload_AsyncAction: js.UndefOr[AsyncPayload] = js.native
}

object AsyncAction {
  @scala.inline
  def apply(`type`: js.Any): AsyncAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction]
  }
  @scala.inline
  implicit class AsyncActionOps[Self <: AsyncAction] (val x: Self) extends AnyVal {
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
    def setPayloadFunction0(value: () => js.Promise[js.Any]): Self = this.set("payload", js.Any.fromFunction0(value))
    @scala.inline
    def setPayload(value: AsyncPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

