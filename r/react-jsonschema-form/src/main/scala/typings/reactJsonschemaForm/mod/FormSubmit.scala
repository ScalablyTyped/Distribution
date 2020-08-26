package typings.reactJsonschemaForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSubmit[T] extends js.Object {
  var formData: T = js.native
}

object FormSubmit {
  @scala.inline
  def apply[T](formData: T): FormSubmit[T] = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSubmit[T]]
  }
  @scala.inline
  implicit class FormSubmitOps[Self <: FormSubmit[_], T] (val x: Self with FormSubmit[T]) extends AnyVal {
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
    def setFormData(value: T): Self = this.set("formData", value.asInstanceOf[js.Any])
  }
  
}

