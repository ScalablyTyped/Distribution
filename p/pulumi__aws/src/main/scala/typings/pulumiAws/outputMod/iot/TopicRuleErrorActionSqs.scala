package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionSqs extends StObject {
  
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: String
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Boolean
}
object TopicRuleErrorActionSqs {
  
  inline def apply(queueUrl: String, roleArn: String, useBase64: Boolean): TopicRuleErrorActionSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionSqs]
  }
  
  extension [Self <: TopicRuleErrorActionSqs](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setUseBase64(value: Boolean): Self = StObject.set(x, "useBase64", value.asInstanceOf[js.Any])
  }
}
