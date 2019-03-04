package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableExpression extends js.Object {
  var expression: Expression
  var variable: Term
}

object VariableExpression {
  @scala.inline
  def apply(expression: Expression, variable: Term): VariableExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable)
  
    __obj.asInstanceOf[VariableExpression]
  }
}

