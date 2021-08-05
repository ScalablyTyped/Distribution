package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleKinesis extends StObject {
  
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: Input[String]
  
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: Input[String]
}
object TopicRuleKinesis {
  
  inline def apply(roleArn: Input[String], streamName: Input[String]): TopicRuleKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleKinesis]
  }
  
  extension [Self <: TopicRuleKinesis](x: Self) {
    
    inline def setPartitionKey(value: Input[String]): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: Input[String]): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
