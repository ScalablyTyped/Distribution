package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateLiteralInvocationType[Result] extends js.Object {
  var sql: java.lang.String
  var `type`: js.Symbol
  var values: js.Array[ValueExpressionType]
}

object TaggedTemplateLiteralInvocationType {
  @scala.inline
  def apply[Result](sql: java.lang.String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType[Result] = {
    val __obj = js.Dynamic.literal(sql = sql, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType[Result]]
  }
}

