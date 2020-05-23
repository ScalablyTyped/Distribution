package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: String
  var table: String
}

object Field {
  @scala.inline
  def apply(field: String, table: String): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

