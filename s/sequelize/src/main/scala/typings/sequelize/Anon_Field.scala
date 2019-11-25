package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: String
  var table: String
}

object Anon_Field {
  @scala.inline
  def apply(field: String, table: String): Anon_Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Field]
  }
}

