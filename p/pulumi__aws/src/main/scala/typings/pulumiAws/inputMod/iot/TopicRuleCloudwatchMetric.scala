package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleCloudwatchMetric extends StObject {
  
  /**
    * The CloudWatch metric name.
    */
  var metricName: Input[String]
  
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: Input[String]
  
  /**
    * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
    */
  var metricTimestamp: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
    */
  var metricUnit: Input[String]
  
  /**
    * The CloudWatch metric value.
    */
  var metricValue: Input[String]
  
  /**
    * The IAM role ARN that allows access to the CloudWatch metric.
    */
  var roleArn: Input[String]
}
object TopicRuleCloudwatchMetric {
  
  inline def apply(
    metricName: Input[String],
    metricNamespace: Input[String],
    metricUnit: Input[String],
    metricValue: Input[String],
    roleArn: Input[String]
  ): TopicRuleCloudwatchMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchMetric]
  }
  
  extension [Self <: TopicRuleCloudwatchMetric](x: Self) {
    
    inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNamespace(value: Input[String]): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    inline def setMetricTimestamp(value: Input[String]): Self = StObject.set(x, "metricTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMetricTimestampUndefined: Self = StObject.set(x, "metricTimestamp", js.undefined)
    
    inline def setMetricUnit(value: Input[String]): Self = StObject.set(x, "metricUnit", value.asInstanceOf[js.Any])
    
    inline def setMetricValue(value: Input[String]): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
