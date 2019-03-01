package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpressionId extends js.Object {
  var expression: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var id: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var label: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var metric: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DimensionsKeyMetricName]] = js.undefined
  var returnData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_ExpressionId {
  @scala.inline
  def apply(
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    expression: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    label: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    metric: atPulumiPulumiLib.outputMod.Input[Anon_DimensionsKeyMetricName] = null,
    returnData: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_ExpressionId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (returnData != null) __obj.updateDynamic("returnData")(returnData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpressionId]
  }
}

