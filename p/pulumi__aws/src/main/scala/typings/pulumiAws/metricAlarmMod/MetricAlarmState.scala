package typings.pulumiAws.metricAlarmMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery
import typings.pulumiAws.snsMod.Topic
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAlarmState extends js.Object {
  /**
    * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
    */
  val actionsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val alarmActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.native
  /**
    * The description for the alarm.
    */
  val alarmDescription: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the cloudwatch metric alarm.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
    */
  val comparisonOperator: js.UndefOr[Input[String]] = js.native
  /**
    * The number of datapoints that must be breaching to trigger the alarm.
    */
  val datapointsToAlarm: js.UndefOr[Input[Double]] = js.native
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val dimensions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Used only for alarms
    * based on percentiles. If you specify `ignore`, the alarm state will not
    * change during periods with too few data points to be statistically significant.
    * If you specify `evaluate` or omit this parameter, the alarm will always be
    * evaluated and possibly change state no matter how many data points are available.
    * The following values are supported: `ignore`, and `evaluate`.
    */
  val evaluateLowSampleCountPercentiles: js.UndefOr[Input[String]] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  val evaluationPeriods: js.UndefOr[Input[Double]] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  val extendedStatistic: js.UndefOr[Input[String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val insufficientDataActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.native
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
    */
  val metricQueries: js.UndefOr[Input[js.Array[Input[MetricAlarmMetricQuery]]]] = js.native
  /**
    * The descriptive name for the alarm. This name must be unique within the user's AWS account
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val namespace: js.UndefOr[Input[String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val okActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.native
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  val period: js.UndefOr[Input[Double]] = js.native
  /**
    * The statistic to apply to the alarm's associated metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  val statistic: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
    */
  val threshold: js.UndefOr[Input[Double]] = js.native
  /**
    * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
    */
  val thresholdMetricId: js.UndefOr[Input[String]] = js.native
  /**
    * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
    */
  val treatMissingData: js.UndefOr[Input[String]] = js.native
  /**
    * The unit for this metric.
    */
  val unit: js.UndefOr[Input[String]] = js.native
}

object MetricAlarmState {
  @scala.inline
  def apply(): MetricAlarmState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAlarmState]
  }
  @scala.inline
  implicit class MetricAlarmStateOps[Self <: MetricAlarmState] (val x: Self) extends AnyVal {
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
    def setActionsEnabled(value: Input[Boolean]): Self = this.set("actionsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsEnabled: Self = this.set("actionsEnabled", js.undefined)
    @scala.inline
    def setAlarmActionsVarargs(value: (Input[String | Topic])*): Self = this.set("alarmActions", js.Array(value :_*))
    @scala.inline
    def setAlarmActions(value: Input[js.Array[Input[String | Topic]]]): Self = this.set("alarmActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmActions: Self = this.set("alarmActions", js.undefined)
    @scala.inline
    def setAlarmDescription(value: Input[String]): Self = this.set("alarmDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmDescription: Self = this.set("alarmDescription", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setComparisonOperator(value: Input[String]): Self = this.set("comparisonOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonOperator: Self = this.set("comparisonOperator", js.undefined)
    @scala.inline
    def setDatapointsToAlarm(value: Input[Double]): Self = this.set("datapointsToAlarm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatapointsToAlarm: Self = this.set("datapointsToAlarm", js.undefined)
    @scala.inline
    def setDimensions(value: Input[StringDictionary[Input[String]]]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setEvaluateLowSampleCountPercentiles(value: Input[String]): Self = this.set("evaluateLowSampleCountPercentiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluateLowSampleCountPercentiles: Self = this.set("evaluateLowSampleCountPercentiles", js.undefined)
    @scala.inline
    def setEvaluationPeriods(value: Input[Double]): Self = this.set("evaluationPeriods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationPeriods: Self = this.set("evaluationPeriods", js.undefined)
    @scala.inline
    def setExtendedStatistic(value: Input[String]): Self = this.set("extendedStatistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedStatistic: Self = this.set("extendedStatistic", js.undefined)
    @scala.inline
    def setInsufficientDataActionsVarargs(value: (Input[String | Topic])*): Self = this.set("insufficientDataActions", js.Array(value :_*))
    @scala.inline
    def setInsufficientDataActions(value: Input[js.Array[Input[String | Topic]]]): Self = this.set("insufficientDataActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsufficientDataActions: Self = this.set("insufficientDataActions", js.undefined)
    @scala.inline
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    @scala.inline
    def setMetricQueriesVarargs(value: Input[MetricAlarmMetricQuery]*): Self = this.set("metricQueries", js.Array(value :_*))
    @scala.inline
    def setMetricQueries(value: Input[js.Array[Input[MetricAlarmMetricQuery]]]): Self = this.set("metricQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricQueries: Self = this.set("metricQueries", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOkActionsVarargs(value: (Input[String | Topic])*): Self = this.set("okActions", js.Array(value :_*))
    @scala.inline
    def setOkActions(value: Input[js.Array[Input[String | Topic]]]): Self = this.set("okActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkActions: Self = this.set("okActions", js.undefined)
    @scala.inline
    def setPeriod(value: Input[Double]): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setStatistic(value: Input[String]): Self = this.set("statistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistic: Self = this.set("statistic", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThreshold(value: Input[Double]): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setThresholdMetricId(value: Input[String]): Self = this.set("thresholdMetricId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdMetricId: Self = this.set("thresholdMetricId", js.undefined)
    @scala.inline
    def setTreatMissingData(value: Input[String]): Self = this.set("treatMissingData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatMissingData: Self = this.set("treatMissingData", js.undefined)
    @scala.inline
    def setUnit(value: Input[String]): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

