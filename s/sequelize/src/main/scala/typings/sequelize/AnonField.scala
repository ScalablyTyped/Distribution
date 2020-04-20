package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: String
  var table: String
}

object AnonField {
  @scala.inline
  def apply(field: String, table: String): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
}

