package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionIotAnalytics extends StObject {
  
  /**
    * Name of AWS IOT Analytics channel.
    */
  var channelName: String
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
}
object TopicRuleErrorActionIotAnalytics {
  
  inline def apply(channelName: String, roleArn: String): TopicRuleErrorActionIotAnalytics = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionIotAnalytics]
  }
  
  extension [Self <: TopicRuleErrorActionIotAnalytics](x: Self) {
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
