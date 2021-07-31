package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleKinesis extends StObject {
  
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: String
  
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: String
}
object TopicRuleKinesis {
  
  @scala.inline
  def apply(roleArn: String, streamName: String): TopicRuleKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleKinesis]
  }
  
  @scala.inline
  implicit class TopicRuleKinesisMutableBuilder[Self <: TopicRuleKinesis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
