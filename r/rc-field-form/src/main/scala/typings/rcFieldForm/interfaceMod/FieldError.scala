package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldError extends js.Object {
  var errors: js.Array[String]
  var name: InternalNamePath
}

object FieldError {
  @scala.inline
  def apply(errors: js.Array[String], name: InternalNamePath): FieldError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldError]
  }
}

