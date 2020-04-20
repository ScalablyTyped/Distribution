package typings.prettyQuick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  val errors: js.Array[String]
  val success: Boolean
}

object Results {
  @scala.inline
  def apply(errors: js.Array[String], success: Boolean): Results = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

