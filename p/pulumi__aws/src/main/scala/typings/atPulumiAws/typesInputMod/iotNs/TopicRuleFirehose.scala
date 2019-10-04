package typings.atPulumiAws.typesInputMod.iotNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleFirehose extends js.Object {
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: Input[String]
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
  /**
    * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[Input[String]] = js.undefined
}

object TopicRuleFirehose {
  @scala.inline
  def apply(deliveryStreamName: Input[String], roleArn: Input[String], separator: Input[String] = null): TopicRuleFirehose = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleFirehose]
  }
}

