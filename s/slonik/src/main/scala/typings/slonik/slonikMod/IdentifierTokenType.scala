package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTokenType extends _SqlTokenType {
  var names: js.Array[String]
  var `type`: js.Symbol
}

object IdentifierTokenType {
  @scala.inline
  def apply(names: js.Array[String], `type`: js.Symbol): IdentifierTokenType = {
    val __obj = js.Dynamic.literal(names = names)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierTokenType]
  }
}

