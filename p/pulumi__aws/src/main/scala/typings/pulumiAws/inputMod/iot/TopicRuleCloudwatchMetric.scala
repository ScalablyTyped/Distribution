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
    roleArn: Input[String]
  ): TopicRuleCloudwatchMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchMetric]
  }
  @scala.inline
  implicit class TopicRuleCloudwatchMetricOps[Self <: TopicRuleCloudwatchMetric] (val x: Self) extends AnyVal {
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
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricNamespace(value: Input[String]): Self = this.set("metricNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricUnit(value: Input[String]): Self = this.set("metricUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricValue(value: Input[String]): Self = this.set("metricValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricTimestamp(value: Input[String]): Self = this.set("metricTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricTimestamp: Self = this.set("metricTimestamp", js.undefined)
  }
  
}

