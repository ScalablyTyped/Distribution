package typings.reactReduxToastr.anon

import typings.reactReduxToastr.mod.ConfirmToastrCustomOptions
import typings.reactReduxToastr.mod.ConfirmToastrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var id: String = js.native
  var message: String = js.native
  var options: ConfirmToastrOptions | ConfirmToastrCustomOptions = js.native
  var show: Boolean = js.native
}

object Id {
  @scala.inline
  def apply(
    id: String,
    message: String,
    options: ConfirmToastrOptions | ConfirmToastrCustomOptions,
    show: Boolean
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: ConfirmToastrOptions | ConfirmToastrCustomOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

