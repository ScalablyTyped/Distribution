package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleCloudwatchMetric extends js.Object {
  /**
    * The CloudWatch metric name.
    */
  var metricName: Input[String] = js.native
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: Input[String] = js.native
  /**
    * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
    */
  var metricTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
    */
  var metricUnit: Input[String] = js.native
  /**
    * The CloudWatch metric value.
    */
  var metricValue: Input[String] = js.native
  /**
    * The IAM role ARN that allows access to the CloudWatch metric.
    */
  var roleArn: Input[String] = js.native
}

object TopicRuleCloudwatchMetric {
  @scala.inline
  def apply(
    metricName: Input[String],
    metricNamespace: Input[String],
    metricUnit: Input[String],
    metricValue: Input[String],
    roleArn: Input[String],
    metricTimestamp: Input[String] = null
  ): TopicRuleCloudwatchMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchMetric]
  }
}

