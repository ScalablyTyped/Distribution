package typings.atPulumiAws.typesInputMod.iot

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleKinesis extends js.Object {
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: Input[String]
}

object TopicRuleKinesis {
  @scala.inline
  def apply(roleArn: Input[String], streamName: Input[String], partitionKey: Input[String] = null): TopicRuleKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleKinesis]
  }
}

