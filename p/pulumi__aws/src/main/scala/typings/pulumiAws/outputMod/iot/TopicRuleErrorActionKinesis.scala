package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionKinesis extends js.Object {
  
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: String = js.native
  
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: String = js.native
}
object TopicRuleErrorActionKinesis {
  
  @scala.inline
  def apply(roleArn: String, streamName: String): TopicRuleErrorActionKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionKinesis]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionKinesisOps[Self <: TopicRuleErrorActionKinesis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: String): Self = this.set("streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKey: Self = this.set("partitionKey", js.undefined)
  }
}
