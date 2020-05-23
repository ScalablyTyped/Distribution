package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.functionCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallExpression
  extends BaseExpression
     with _Expression {
  var args: js.Array[Expression]
  var function: String
  @JSName("type")
  var type_FunctionCallExpression: functionCall
}

object FunctionCallExpression {
  @scala.inline
  def apply(
    args: js.Array[Expression],
    function: String,
    `type`: functionCall,
    distinct: js.UndefOr[Boolean] = js.undefined
  ): FunctionCallExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCallExpression]
  }
}

