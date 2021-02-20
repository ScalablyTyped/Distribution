package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainLogPublishingOption extends StObject {
  
  /**
    * The CloudWatch Log Group where the logs are published.
    */
  var cloudwatchLogGroupArn: String = js.native
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * The type of Elasticsearch log being published.
    */
  var logType: String = js.native
}
object GetDomainLogPublishingOption {
  
  @scala.inline
  def apply(cloudwatchLogGroupArn: String, enabled: Boolean, logType: String): GetDomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainLogPublishingOption]
  }
  
  @scala.inline
  implicit class GetDomainLogPublishingOptionMutableBuilder[Self <: GetDomainLogPublishingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLogGroupArn(value: String): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
  }
}
