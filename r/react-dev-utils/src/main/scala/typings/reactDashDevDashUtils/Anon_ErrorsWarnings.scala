package typings.reactDashDevDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorsWarnings extends js.Object {
  var errors: js.Array[String]
  var warnings: js.Array[String]
}

object Anon_ErrorsWarnings {
  @scala.inline
  def apply(errors: js.Array[String], warnings: js.Array[String]): Anon_ErrorsWarnings = {
    val __obj = js.Dynamic.literal(errors = errors, warnings = warnings)
  
    __obj.asInstanceOf[Anon_ErrorsWarnings]
  }
}

