package typings.slonik.slonikMod

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
    val __obj = js.Dynamic.literal(names = names)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierSqlTokenType]
  }
}

