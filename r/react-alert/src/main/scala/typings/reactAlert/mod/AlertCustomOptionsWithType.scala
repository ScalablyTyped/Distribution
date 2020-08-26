package typings.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertCustomOptionsWithType extends AlertCustomOptions {
  var `type`: js.UndefOr[AlertType] = js.native
}

object AlertCustomOptionsWithType {
  @scala.inline
  def apply(): AlertCustomOptionsWithType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertCustomOptionsWithType]
  }
  @scala.inline
  implicit class AlertCustomOptionsWithTypeOps[Self <: AlertCustomOptionsWithType] (val x: Self) extends AnyVal {
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
    def setType(value: AlertType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

