package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleCloudwatchMetric extends js.Object {
  /**
    * The CloudWatch metric name.
    */
  var metricName: String
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String
  /**
    * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
    */
  var metricTimestamp: js.UndefOr[String] = js.undefined
  /**
    * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
    */
  var metricUnit: String
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
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
    val __obj = js.Dynamic.literal(metricName = metricName, metricNamespace = metricNamespace, metricUnit = metricUnit, metricValue = metricValue, roleArn = roleArn)
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp)
    __obj.asInstanceOf[TopicRuleCloudwatchMetric]
  }
}

