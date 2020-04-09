package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleCloudwatchMetric extends js.Object {
  /**
    * The CloudWatch metric name.
    */
  var metricName: String = js.native
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String = js.native
  /**
    * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
    */
  var metricTimestamp: js.UndefOr[String] = js.native
  /**
    * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
    */
  var metricUnit: String = js.native
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String = js.native
  /**
    * The IAM role ARN that allows access to the CloudWatch metric.
    */
  var roleArn: String = js.native
}

object TopicRuleCloudwatchMetric {
  @scala.inline
  def apply(
    metricName: String,
    metricNamespace: String,
    metricUnit: String,
    metricValue: String,
    roleArn: String,
    metricTimestamp: String = null
  ): TopicRuleCloudwatchMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchMetric]
  }
}

