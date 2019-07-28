package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpressionId extends js.Object {
  var expression: js.UndefOr[Input[String]] = js.undefined
  var id: Input[String]
  var label: js.UndefOr[Input[String]] = js.undefined
  var metric: js.UndefOr[Input[Anon_DimensionsKeyMetricName]] = js.undefined
  var returnData: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_ExpressionId {
  @scala.inline
  def apply(
    id: Input[String],
    expression: Input[String] = null,
    label: Input[String] = null,
    metric: Input[Anon_DimensionsKeyMetricName] = null,
    returnData: Input[Boolean] = null
  ): Anon_ExpressionId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (returnData != null) __obj.updateDynamic("returnData")(returnData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpressionId]
  }
}

