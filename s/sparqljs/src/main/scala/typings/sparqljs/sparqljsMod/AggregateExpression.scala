package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.aggregate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateExpression
  extends BaseExpression
     with _Expression {
  var aggregation: String
  var expression: Expression
  var separator: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_AggregateExpression: aggregate
}

object AggregateExpression {
  @scala.inline
  def apply(
    aggregation: String,
    expression: Expression,
    `type`: aggregate,
    distinct: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): AggregateExpression = {
    val __obj = js.Dynamic.literal(aggregation = aggregation, expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[AggregateExpression]
  }
}

