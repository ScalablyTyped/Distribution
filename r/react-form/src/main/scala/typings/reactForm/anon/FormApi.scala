package typings.reactForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormApi extends js.Object {
  var formApi: typings.reactForm.mod.FormApi = js.native
}

object FormApi {
  @scala.inline
  def apply(formApi: typings.reactForm.mod.FormApi): FormApi = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormApi]
  }
  @scala.inline
  implicit class FormApiOps[Self <: FormApi] (val x: Self) extends AnyVal {
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
    def setFormApi(value: typings.reactForm.mod.FormApi): Self = this.set("formApi", value.asInstanceOf[js.Any])
  }
  
}

