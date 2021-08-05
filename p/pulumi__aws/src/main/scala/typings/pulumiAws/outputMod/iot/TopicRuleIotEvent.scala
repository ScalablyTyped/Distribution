package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleIotEvent extends StObject {
  
  /**
    * The name of the AWS IoT Events input.
    */
  var inputName: String
  
  /**
    * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
}
object TopicRuleIotEvent {
  
  inline def apply(inputName: String, roleArn: String): TopicRuleIotEvent = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleIotEvent]
  }
  
  extension [Self <: TopicRuleIotEvent](x: Self) {
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
