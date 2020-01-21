package typings.reactDevUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorsWarnings extends js.Object {
  var errors: js.Array[String]
  var warnings: js.Array[String]
}

object AnonErrorsWarnings {
  @scala.inline
  def apply(errors: js.Array[String], warnings: js.Array[String]): AnonErrorsWarnings = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorsWarnings]
  }
}

