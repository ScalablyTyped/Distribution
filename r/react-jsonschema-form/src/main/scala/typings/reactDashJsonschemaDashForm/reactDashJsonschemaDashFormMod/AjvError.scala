package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjvError extends js.Object {
  var message: String
  var name: String
  var params: js.Any
  var property: String
  var stack: String
}

object AjvError {
  @scala.inline
  def apply(message: String, name: String, params: js.Any, property: String, stack: String): AjvError = {
    val __obj = js.Dynamic.literal(message = message, name = name, params = params, property = property, stack = stack)
  
    __obj.asInstanceOf[AjvError]
  }
}

