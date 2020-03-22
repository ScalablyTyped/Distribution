package typings.reactDevUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWarnings extends js.Object {
  var errors: js.Array[String]
  var warnings: js.Array[String]
}

object AnonWarnings {
  @scala.inline
  def apply(errors: js.Array[String], warnings: js.Array[String]): AnonWarnings = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWarnings]
  }
}

