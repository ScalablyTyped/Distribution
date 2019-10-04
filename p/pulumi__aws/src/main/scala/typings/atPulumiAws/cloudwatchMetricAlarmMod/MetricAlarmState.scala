package typings.atPulumiAws.cloudwatchMetricAlarmMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.snsTopicMod.Topic
import typings.atPulumiAws.typesInputMod.cloudwatchNs.MetricAlarmMetricQuery
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricAlarmState extends js.Object {
  /**
    * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
    */
  val actionsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val alarmActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
  /**
    * The description for the alarm.
    */
  val alarmDescription: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the cloudwatch metric alarm.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`.
    */
  val comparisonOperator: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of datapoints that must be breaching to trigger the alarm.
    */
  val datapointsToAlarm: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val dimensions: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Used only for alarms
    * based on percentiles. If you specify `ignore`, the alarm state will not
    * change during periods with too few data points to be statistically significant.
    * If you specify `evaluate` or omit this parameter, the alarm will always be
    * evaluated and possibly change state no matter how many data points are available.
    * The following values are supported: `ignore`, and `evaluate`.
    */
  val evaluateLowSampleCountPercentiles: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  val evaluationPeriods: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  val extendedStatistic: js.UndefOr[Input[String]] = js.undefined
  /**
    * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val insufficientDataActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val metricName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
    */
  val metricQueries: js.UndefOr[Input[js.Array[Input[MetricAlarmMetricQuery]]]] = js.undefined
  /**
    * The descriptive name for the alarm. This name must be unique within the user's AWS account
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val okActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  val period: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The statistic to apply to the alarm's associated metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  val statistic: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The value against which the specified statistic is compared.
    */
  val threshold: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
    */
  val treatMissingData: js.UndefOr[Input[String]] = js.undefined
  /**
    * The unit for this metric.
    */
  val unit: js.UndefOr[Input[String]] = js.undefined
}

object MetricAlarmState {
  @scala.inline
  def apply(
    actionsEnabled: Input[Boolean] = null,
    alarmActions: Input[js.Array[Input[String | Topic]]] = null,
    alarmDescription: Input[String] = null,
    arn: Input[String] = null,
    comparisonOperator: Input[String] = null,
    datapointsToAlarm: Input[Double] = null,
    dimensions: Input[StringDictionary[_]] = null,
    evaluateLowSampleCountPercentiles: Input[String] = null,
    evaluationPeriods: Input[Double] = null,
    extendedStatistic: Input[String] = null,
    insufficientDataActions: Input[js.Array[Input[String | Topic]]] = null,
    metricName: Input[String] = null,
    metricQueries: Input[js.Array[Input[MetricAlarmMetricQuery]]] = null,
    name: Input[String] = null,
    namespace: Input[String] = null,
    okActions: Input[js.Array[Input[String | Topic]]] = null,
    period: Input[Double] = null,
    statistic: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    threshold: Input[Double] = null,
    treatMissingData: Input[String] = null,
    unit: Input[String] = null
  ): MetricAlarmState = {
    val __obj = js.Dynamic.literal()
    if (actionsEnabled != null) __obj.updateDynamic("actionsEnabled")(actionsEnabled.asInstanceOf[js.Any])
    if (alarmActions != null) __obj.updateDynamic("alarmActions")(alarmActions.asInstanceOf[js.Any])
    if (alarmDescription != null) __obj.updateDynamic("alarmDescription")(alarmDescription.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (comparisonOperator != null) __obj.updateDynamic("comparisonOperator")(comparisonOperator.asInstanceOf[js.Any])
    if (datapointsToAlarm != null) __obj.updateDynamic("datapointsToAlarm")(datapointsToAlarm.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (evaluateLowSampleCountPercentiles != null) __obj.updateDynamic("evaluateLowSampleCountPercentiles")(evaluateLowSampleCountPercentiles.asInstanceOf[js.Any])
    if (evaluationPeriods != null) __obj.updateDynamic("evaluationPeriods")(evaluationPeriods.asInstanceOf[js.Any])
    if (extendedStatistic != null) __obj.updateDynamic("extendedStatistic")(extendedStatistic.asInstanceOf[js.Any])
    if (insufficientDataActions != null) __obj.updateDynamic("insufficientDataActions")(insufficientDataActions.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricQueries != null) __obj.updateDynamic("metricQueries")(metricQueries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (okActions != null) __obj.updateDynamic("okActions")(okActions.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (statistic != null) __obj.updateDynamic("statistic")(statistic.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (treatMissingData != null) __obj.updateDynamic("treatMissingData")(treatMissingData.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarmState]
  }
}

