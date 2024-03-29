package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionIotEvents extends StObject {
  
  /**
    * The name of the AWS IoT Events input.
    */
  var inputName: Input[String]
  
  /**
    * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
    */
  var messageId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
}
object TopicRuleErrorActionIotEvents {
  
  inline def apply(inputName: Input[String], roleArn: Input[String]): TopicRuleErrorActionIotEvents = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionIotEvents]
  }
  
  extension [Self <: TopicRuleErrorActionIotEvents](x: Self) {
    
    inline def setInputName(value: Input[String]): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: Input[String]): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
