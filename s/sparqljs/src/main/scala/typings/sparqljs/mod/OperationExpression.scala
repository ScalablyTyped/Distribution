package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationExpression
  extends BaseExpression
     with _Expression {
  var args: js.Array[Expression]
  var operator: String
  @JSName("type")
  var type_OperationExpression: operation
}

object OperationExpression {
  @scala.inline
  def apply(
    args: js.Array[Expression],
    operator: String,
    `type`: operation,
    distinct: js.UndefOr[Boolean] = js.undefined
  ): OperationExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationExpression]
  }
}

