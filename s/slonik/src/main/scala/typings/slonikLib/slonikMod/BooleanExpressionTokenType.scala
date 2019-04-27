package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanExpressionTokenType extends SqlTokenType {
  var members: js.Array[ValueExpressionType]
  var operator: LogicalBooleanOperatorType
  var `type`: js.Symbol
}

object BooleanExpressionTokenType {
  @scala.inline
  def apply(members: js.Array[ValueExpressionType], operator: LogicalBooleanOperatorType, `type`: js.Symbol): BooleanExpressionTokenType = {
    val __obj = js.Dynamic.literal(members = members, operator = operator)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BooleanExpressionTokenType]
  }
}

