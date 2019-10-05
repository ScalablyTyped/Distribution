package typings.atPulumiAws.typesOutputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricAlarmMetricQuery extends js.Object {
  /**
    * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
    */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
    */
  var id: String
  /**
    * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
    */
  var metric: js.UndefOr[MetricAlarmMetricQueryMetric] = js.undefined
  /**
    * Specify exactly one `metricQuery` to be `true` to use that `metricQuery` result as the alarm.
    */
  var returnData: js.UndefOr[Boolean] = js.undefined
}

object MetricAlarmMetricQuery {
  @scala.inline
  def apply(
    id: String,
    expression: String = null,
    label: String = null,
    metric: MetricAlarmMetricQueryMetric = null,
    returnData: js.UndefOr[Boolean] = js.undefined
  ): MetricAlarmMetricQuery = {
    val __obj = js.Dynamic.literal(id = id)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (label != null) __obj.updateDynamic("label")(label)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    if (!js.isUndefined(returnData)) __obj.updateDynamic("returnData")(returnData)
    __obj.asInstanceOf[MetricAlarmMetricQuery]
  }
}

