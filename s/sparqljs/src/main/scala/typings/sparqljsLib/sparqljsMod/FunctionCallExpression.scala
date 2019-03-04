package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallExpression
  extends BaseExpression
     with _Expression {
  var args: js.Array[Expression]
  var function: java.lang.String
  @JSName("type")
  var type_FunctionCallExpression: sparqljsLib.sparqljsLibStrings.functionCall
}

object FunctionCallExpression {
  @scala.inline
  def apply(
    args: js.Array[Expression],
    function: java.lang.String,
    `type`: sparqljsLib.sparqljsLibStrings.functionCall,
    distinct: js.UndefOr[scala.Boolean] = js.undefined
  ): FunctionCallExpression = {
    val __obj = js.Dynamic.literal(args = args, function = function)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    __obj.asInstanceOf[FunctionCallExpression]
  }
}

