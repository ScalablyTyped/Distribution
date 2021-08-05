package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionDynamodbv2 extends StObject {
  
  /**
    * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
    */
  var putItem: js.UndefOr[Input[TopicRuleErrorActionDynamodbv2PutItem]] = js.undefined
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: Input[String]
}
object TopicRuleErrorActionDynamodbv2 {
  
  inline def apply(roleArn: Input[String]): TopicRuleErrorActionDynamodbv2 = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionDynamodbv2]
  }
  
  extension [Self <: TopicRuleErrorActionDynamodbv2](x: Self) {
    
    inline def setPutItem(value: Input[TopicRuleErrorActionDynamodbv2PutItem]): Self = StObject.set(x, "putItem", value.asInstanceOf[js.Any])
    
    inline def setPutItemUndefined: Self = StObject.set(x, "putItem", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
