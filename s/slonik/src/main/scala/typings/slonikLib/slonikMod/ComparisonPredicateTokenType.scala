package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparisonPredicateTokenType extends SqlTokenType {
  var leftOperand: ValueExpressionType
  var operator: ComparisonOperatorType
  var rightOperand: ValueExpressionType
  var `type`: js.Symbol
}

object ComparisonPredicateTokenType {
  @scala.inline
  def apply(
    leftOperand: ValueExpressionType,
    operator: ComparisonOperatorType,
    rightOperand: ValueExpressionType,
    `type`: js.Symbol
  ): ComparisonPredicateTokenType = {
    val __obj = js.Dynamic.literal(leftOperand = leftOperand.asInstanceOf[js.Any], operator = operator, rightOperand = rightOperand.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ComparisonPredicateTokenType]
  }
}

