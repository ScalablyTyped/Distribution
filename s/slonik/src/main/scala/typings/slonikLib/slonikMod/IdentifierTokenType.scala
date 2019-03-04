package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTokenType extends _ValueExpressionType {
  var names: js.Array[java.lang.String]
  var `type`: js.Symbol
}

object IdentifierTokenType {
  @scala.inline
  def apply(names: js.Array[java.lang.String], `type`: js.Symbol): IdentifierTokenType = {
    val __obj = js.Dynamic.literal(names = names)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierTokenType]
  }
}

