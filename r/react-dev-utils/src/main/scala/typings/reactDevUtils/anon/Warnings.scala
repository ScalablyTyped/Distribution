package typings.reactDevUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warnings extends js.Object {
  var errors: js.Array[String]
  var warnings: js.Array[String]
}

object Warnings {
  @scala.inline
  def apply(errors: js.Array[String], warnings: js.Array[String]): Warnings = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warnings]
  }
}

