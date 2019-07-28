package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValidation extends js.Object {
  var __errors: js.Array[FieldError]
  def addError(message: String): Unit
}

object FieldValidation {
  @scala.inline
  def apply(__errors: js.Array[FieldError], addError: String => Unit): FieldValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors, addError = js.Any.fromFunction1(addError))
  
    __obj.asInstanceOf[FieldValidation]
  }
}

