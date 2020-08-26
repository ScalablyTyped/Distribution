package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toastr_ extends js.Object {
  var id: String = js.native
  var message: js.UndefOr[String] = js.native
  var options: BasicToastrOptions | LightToastrOptions = js.native
  var position: positionType = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: toastType = js.native
}

object Toastr_ {
  @scala.inline
  def apply(
    id: String,
    options: BasicToastrOptions | LightToastrOptions,
    position: positionType,
    `type`: toastType
  ): Toastr_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toastr_]
  }
  @scala.inline
  implicit class Toastr_Ops[Self <: Toastr_] (val x: Self) extends AnyVal {
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
    def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: positionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: toastType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

