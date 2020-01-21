package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleKinesis extends js.Object {
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: Input[String] = js.native
}

object TopicRuleKinesis {
  @scala.inline
  def apply(roleArn: Input[String], streamName: Input[String], partitionKey: Input[String] = null): TopicRuleKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleKinesis]
  }
}

