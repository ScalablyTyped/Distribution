package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleFirehose extends js.Object {
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: String
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[String] = js.undefined
}

object TopicRuleFirehose {
  @scala.inline
  def apply(deliveryStreamName: String, roleArn: String, separator: String = null): TopicRuleFirehose = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName, roleArn = roleArn)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[TopicRuleFirehose]
  }
}

