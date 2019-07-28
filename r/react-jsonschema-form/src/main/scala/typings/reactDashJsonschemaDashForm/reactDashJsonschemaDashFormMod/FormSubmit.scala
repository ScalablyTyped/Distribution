package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSubmit[T] extends js.Object {
  var formData: T
}

object FormSubmit {
  @scala.inline
  def apply[T](formData: T): FormSubmit[T] = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormSubmit[T]]
  }
}

