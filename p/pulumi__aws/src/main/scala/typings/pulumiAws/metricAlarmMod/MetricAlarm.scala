package typings.pulumiAws.metricAlarmMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cloudwatch.MetricAlarmMetricQuery
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/metricAlarm", "MetricAlarm")
@js.native
class MetricAlarm protected () extends CustomResource {
  /**
    * Create a MetricAlarm resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MetricAlarmArgs) = this()
  def this(name: String, args: MetricAlarmArgs, opts: CustomResourceOptions) = this()
  /**
    * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
    */
  val actionsEnabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val alarmActions: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The description for the alarm.
    */
  val alarmDescription: Output_[js.UndefOr[String]] = js.native
  /**
    * The ARN of the cloudwatch metric alarm.
    */
  val arn: Output_[String] = js.native
  /**
    * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
    */
  val comparisonOperator: Output_[String] = js.native
  /**
    * The number of datapoints that must be breaching to trigger the alarm.
    */
  val datapointsToAlarm: Output_[js.UndefOr[Double]] = js.native
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val dimensions: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Used only for alarms
    * based on percentiles. If you specify `ignore`, the alarm state will not
    * change during periods with too few data points to be statistically significant.
    * If you specify `evaluate` or omit this parameter, the alarm will always be
    * evaluated and possibly change state no matter how many data points are available.
    * The following values are supported: `ignore`, and `evaluate`.
    */
  val evaluateLowSampleCountPercentiles: Output_[String] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  val evaluationPeriods: Output_[Double] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  val extendedStatistic: Output_[js.UndefOr[String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val insufficientDataActions: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val metricName: Output_[js.UndefOr[String]] = js.native
  /**
    * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
    */
  val metricQueries: Output_[js.UndefOr[js.Array[MetricAlarmMetricQuery]]] = js.native
  /**
    * The descriptive name for the alarm. This name must be unique within the user's AWS account
    */
  val name: Output_[String] = js.native
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val namespace: Output_[js.UndefOr[String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val okActions: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  val period: Output_[js.UndefOr[Double]] = js.native
  /**
    * The statistic to apply to the alarm's associated metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  val statistic: Output_[js.UndefOr[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
    */
  val threshold: Output_[js.UndefOr[Double]] = js.native
  /**
    * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
    */
  val thresholdMetricId: Output_[js.UndefOr[String]] = js.native
  /**
    * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
    */
  val treatMissingData: Output_[js.UndefOr[String]] = js.native
  /**
    * The unit for this metric.
    */
  val unit: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/metricAlarm", "MetricAlarm")
@js.native
object MetricAlarm extends js.Object {
  /**
    * Get an existing MetricAlarm resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): MetricAlarm = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MetricAlarm = js.native
  def get(name: String, id: Input[ID], state: MetricAlarmState): MetricAlarm = js.native
  def get(name: String, id: Input[ID], state: MetricAlarmState, opts: CustomResourceOptions): MetricAlarm = js.native
  /**
    * Returns true if the given object is an instance of MetricAlarm.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/metricAlarm.MetricAlarm */ Boolean = js.native
}

