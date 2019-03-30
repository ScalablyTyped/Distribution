package typings
package atPulumiAwsLib.cloudwatchMetricAlarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/metricAlarm", "MetricAlarm")
@js.native
class MetricAlarm protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a MetricAlarm resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: MetricAlarmArgs) = this()
  def this(name: java.lang.String, args: MetricAlarmArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
    */
  val actionsEnabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val alarmActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The description for the alarm.
    */
  val alarmDescription: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ARN of the cloudwatch metric alarm.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`.
    */
  val comparisonOperator: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The number of datapoints that must be breaching to trigger the alarm.
    */
  val datapointsToAlarm: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val dimensions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Used only for alarms
    * based on percentiles. If you specify `ignore`, the alarm state will not
    * change during periods with too few data points to be statistically significant.
    * If you specify `evaluate` or omit this parameter, the alarm will always be
    * evaluated and possibly change state no matter how many data points are available.
    * The following values are supported: `ignore`, and `evaluate`.
    */
  val evaluateLowSampleCountPercentiles: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  val evaluationPeriods: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  val extendedStatistic: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val insufficientDataActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val metricName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
    */
  val metricQueries: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Expression]]] = js.native
  /**
    * The descriptive name for the alarm. This name must be unique within the user's AWS account
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val namespace: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  val okActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  val period: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The statistic to apply to the alarm's associated metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  val statistic: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The value against which the specified statistic is compared.
    */
  val threshold: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
    */
  val treatMissingData: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The unit for this metric.
    */
  val unit: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarm = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarmState
  ): atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarm = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarmState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarm = js.native
}

