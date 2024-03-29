package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainLogPublishingOption extends StObject {
  
  /**
    * The CloudWatch Log Group where the logs are published.
    */
  var cloudwatchLogGroupArn: String
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  
  /**
    * The type of Elasticsearch log being published.
    */
  var logType: String
}
object GetDomainLogPublishingOption {
  
  inline def apply(cloudwatchLogGroupArn: String, enabled: Boolean, logType: String): GetDomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainLogPublishingOption]
  }
  
  extension [Self <: GetDomainLogPublishingOption](x: Self) {
    
    inline def setCloudwatchLogGroupArn(value: String): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
  }
}
