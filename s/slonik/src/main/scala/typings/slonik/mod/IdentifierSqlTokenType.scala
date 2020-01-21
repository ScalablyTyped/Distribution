package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierSqlTokenType extends _SqlTokenType {
  var names: js.Array[String]
  var `type`: js.Symbol
}

object IdentifierSqlTokenType {
  @scala.inline
  def apply(names: js.Array[String], `type`: js.Symbol): IdentifierSqlTokenType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierSqlTokenType]
  }
}

