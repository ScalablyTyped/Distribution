package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleFirehose extends js.Object {
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: Input[String] = js.native
  /**
    * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: Input[String] = js.native
  /**
    * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[Input[String]] = js.native
}

object TopicRuleFirehose {
  @scala.inline
  def apply(deliveryStreamName: Input[String], roleArn: Input[String], separator: Input[String] = null): TopicRuleFirehose = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleFirehose]
  }
}

