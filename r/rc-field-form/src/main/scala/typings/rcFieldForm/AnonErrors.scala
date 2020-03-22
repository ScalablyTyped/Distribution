package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[String]
  var name: InternalNamePath
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[String], name: InternalNamePath): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

