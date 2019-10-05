package typings.atPulumiAws.typesOutputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleKinesis extends js.Object {
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: String
}

object TopicRuleKinesis {
  @scala.inline
  def apply(roleArn: String, streamName: String, partitionKey: String = null): TopicRuleKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, streamName = streamName)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey)
    __obj.asInstanceOf[TopicRuleKinesis]
  }
}

