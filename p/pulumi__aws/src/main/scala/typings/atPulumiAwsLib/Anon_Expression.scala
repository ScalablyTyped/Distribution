package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var metric: js.UndefOr[Anon_DimensionsKey] = js.undefined
  var returnData: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Expression {
  @scala.inline
  def apply(
    id: java.lang.String,
    expression: java.lang.String = null,
    label: java.lang.String = null,
    metric: Anon_DimensionsKey = null,
    returnData: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Expression = {
    val __obj = js.Dynamic.literal(id = id)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (label != null) __obj.updateDynamic("label")(label)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    if (!js.isUndefined(returnData)) __obj.updateDynamic("returnData")(returnData)
    __obj.asInstanceOf[Anon_Expression]
  }
}

