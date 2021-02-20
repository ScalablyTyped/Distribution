package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleCloudwatchMetric extends StObject {
  
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
    roleArn: String
  ): TopicRuleCloudwatchMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchMetric]
  }
  
  @scala.inline
  implicit class TopicRuleCloudwatchMetricMutableBuilder[Self <: TopicRuleCloudwatchMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamespace(value: String): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimestamp(value: String): Self = StObject.set(x, "metricTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimestampUndefined: Self = StObject.set(x, "metricTimestamp", js.undefined)
    
    @scala.inline
    def setMetricUnit(value: String): Self = StObject.set(x, "metricUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricValue(value: String): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
