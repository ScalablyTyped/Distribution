package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjvError extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var params: js.Any
  var property: java.lang.String
  var stack: java.lang.String
}

object AjvError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    params: js.Any,
    property: java.lang.String,
    stack: java.lang.String
  ): AjvError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AjvError]
  }
}

