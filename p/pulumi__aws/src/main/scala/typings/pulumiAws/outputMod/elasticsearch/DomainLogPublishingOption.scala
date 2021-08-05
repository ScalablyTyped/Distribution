package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainLogPublishingOption extends StObject {
  
  /**
    * ARN of the Cloudwatch log group to which log needs to be published.
    */
  var cloudwatchLogGroupArn: String
  
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS, AUDIT_LOGS
    */
  var logType: String
}
object DomainLogPublishingOption {
  
  inline def apply(cloudwatchLogGroupArn: String, logType: String): DomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainLogPublishingOption]
  }
  
  extension [Self <: DomainLogPublishingOption](x: Self) {
    
    inline def setCloudwatchLogGroupArn(value: String): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
  }
}
