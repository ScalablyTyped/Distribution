package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierListTokenType extends _SqlTokenType {
  var identifiers: js.Array[IdentifierListMemberType]
  var `type`: js.Symbol
}

object IdentifierListTokenType {
  @scala.inline
  def apply(identifiers: js.Array[IdentifierListMemberType], `type`: js.Symbol): IdentifierListTokenType = {
    val __obj = js.Dynamic.literal(identifiers = identifiers)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierListTokenType]
  }
}

