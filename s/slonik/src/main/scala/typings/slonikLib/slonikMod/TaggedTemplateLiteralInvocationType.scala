package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateLiteralInvocationType extends js.Object {
  var sql: java.lang.String
  var `type`: js.Symbol
  var values: js.Array[ValueExpressionType]
}

object TaggedTemplateLiteralInvocationType {
  @scala.inline
  def apply(sql: java.lang.String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("sql")(sql)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType]
  }
}

