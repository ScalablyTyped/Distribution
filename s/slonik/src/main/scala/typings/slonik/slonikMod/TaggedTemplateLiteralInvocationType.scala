package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateLiteralInvocationType[Result] extends js.Object {
  var sql: String
  var `type`: js.Symbol
  var values: js.Array[ValueExpressionType]
}

object TaggedTemplateLiteralInvocationType {
  @scala.inline
  def apply[Result](sql: String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType[Result] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType[Result]]
  }
}

