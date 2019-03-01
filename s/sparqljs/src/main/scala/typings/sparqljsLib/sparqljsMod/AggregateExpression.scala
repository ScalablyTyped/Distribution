package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateExpression
  extends BaseExpression
     with _Expression {
  var aggregation: java.lang.String
  var expression: Expression
  var separator: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_AggregateExpression: sparqljsLib.sparqljsLibStrings.aggregate
}

object AggregateExpression {
  @scala.inline
  def apply(
    aggregation: java.lang.String,
    expression: Expression,
    `type`: sparqljsLib.sparqljsLibStrings.aggregate,
    distinct: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null
  ): AggregateExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[AggregateExpression]
  }
}

