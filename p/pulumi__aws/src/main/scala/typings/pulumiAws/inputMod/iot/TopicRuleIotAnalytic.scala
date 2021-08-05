package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleIotAnalytic extends StObject {
  
  /**
    * Name of AWS IOT Analytics channel.
    */
  var channelName: Input[String]
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
}
object TopicRuleIotAnalytic {
  
  inline def apply(channelName: Input[String], roleArn: Input[String]): TopicRuleIotAnalytic = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleIotAnalytic]
  }
  
  extension [Self <: TopicRuleIotAnalytic](x: Self) {
    
    inline def setChannelName(value: Input[String]): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
