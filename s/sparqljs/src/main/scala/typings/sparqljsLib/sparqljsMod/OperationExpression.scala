package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationExpression
  extends BaseExpression
     with _Expression {
  var args: js.Array[Expression]
  var operator: java.lang.String
  @JSName("type")
  var type_OperationExpression: sparqljsLib.sparqljsLibStrings.operation
}

object OperationExpression {
  @scala.inline
  def apply(
    args: js.Array[Expression],
    operator: java.lang.String,
    `type`: sparqljsLib.sparqljsLibStrings.operation,
    distinct: js.UndefOr[scala.Boolean] = js.undefined
  ): OperationExpression = {
    val __obj = js.Dynamic.literal(args = args, operator = operator)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    __obj.asInstanceOf[OperationExpression]
  }
}

