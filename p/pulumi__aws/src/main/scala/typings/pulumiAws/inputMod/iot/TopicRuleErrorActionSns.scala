package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionSns extends StObject {
  
  /**
    * The message format of the message to publish. Accepted values are "JSON" and "RAW".
    */
  var messageFormat: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
  
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: Input[String]
}
object TopicRuleErrorActionSns {
  
  inline def apply(roleArn: Input[String], targetArn: Input[String]): TopicRuleErrorActionSns = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionSns]
  }
  
  extension [Self <: TopicRuleErrorActionSns](x: Self) {
    
    inline def setMessageFormat(value: Input[String]): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
