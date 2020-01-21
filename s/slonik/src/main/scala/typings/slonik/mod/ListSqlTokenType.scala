package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSqlTokenType extends _SqlTokenType {
  var glue: SqlTokenType
  var members: js.Array[SqlTokenType]
  var `type`: js.Symbol
}

object ListSqlTokenType {
  @scala.inline
  def apply(glue: SqlTokenType, members: js.Array[SqlTokenType], `type`: js.Symbol): ListSqlTokenType = {
    val __obj = js.Dynamic.literal(glue = glue.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSqlTokenType]
  }
}

