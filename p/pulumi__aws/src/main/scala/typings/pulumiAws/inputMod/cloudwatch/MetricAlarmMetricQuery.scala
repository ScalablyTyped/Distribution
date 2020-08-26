package typings.pulumiAws.inputMod.cloudwatch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAlarmMetricQuery extends js.Object {
  /**
    * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
    */
  var expression: js.UndefOr[Input[String]] = js.native
  /**
    * A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
    */
  var id: Input[String] = js.native
  /**
    * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
    */
  var label: js.UndefOr[Input[String]] = js.native
  /**
    * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
    */
  var metric: js.UndefOr[Input[MetricAlarmMetricQueryMetric]] = js.native
  /**
    * Specify exactly one `metricQuery` to be `true` to use that `metricQuery` result as the alarm.
    */
  var returnData: js.UndefOr[Input[Boolean]] = js.native
}

object MetricAlarmMetricQuery {
  @scala.inline
  def apply(id: Input[String]): MetricAlarmMetricQuery = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarmMetricQuery]
  }
  @scala.inline
  implicit class MetricAlarmMetricQueryOps[Self <: MetricAlarmMetricQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: Input[String]): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setLabel(value: Input[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMetric(value: Input[MetricAlarmMetricQueryMetric]): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setReturnData(value: Input[Boolean]): Self = this.set("returnData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnData: Self = this.set("returnData", js.undefined)
  }
  
}

