package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupVisibilityConfig extends StObject {
  
  /**
    * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
    */
  var cloudwatchMetricsEnabled: Boolean
  
  /**
    * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (_), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
    */
  var metricName: String
  
  /**
    * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
    */
  var sampledRequestsEnabled: Boolean
}
object RuleGroupVisibilityConfig {
  
  inline def apply(cloudwatchMetricsEnabled: Boolean, metricName: String, sampledRequestsEnabled: Boolean): RuleGroupVisibilityConfig = {
    val __obj = js.Dynamic.literal(cloudwatchMetricsEnabled = cloudwatchMetricsEnabled.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], sampledRequestsEnabled = sampledRequestsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupVisibilityConfig]
  }
  
  extension [Self <: RuleGroupVisibilityConfig](x: Self) {
    
    inline def setCloudwatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "cloudwatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSampledRequestsEnabled(value: Boolean): Self = StObject.set(x, "sampledRequestsEnabled", value.asInstanceOf[js.Any])
  }
}
