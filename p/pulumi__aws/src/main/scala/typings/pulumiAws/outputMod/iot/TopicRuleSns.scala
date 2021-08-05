package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleSns extends StObject {
  
  /**
    * The message format of the message to publish. Accepted values are "JSON" and "RAW".
    */
  var messageFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: String
}
object TopicRuleSns {
  
  inline def apply(roleArn: String, targetArn: String): TopicRuleSns = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleSns]
  }
  
  extension [Self <: TopicRuleSns](x: Self) {
    
    inline def setMessageFormat(value: String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArn(value: String): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
