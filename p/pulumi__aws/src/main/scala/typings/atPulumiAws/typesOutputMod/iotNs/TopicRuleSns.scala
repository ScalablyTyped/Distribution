package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleSns extends js.Object {
  /**
    * The message format of the message to publish. Accepted values are "JSON" and "RAW".
    */
  var messageFormat: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: String
}

object TopicRuleSns {
  @scala.inline
  def apply(roleArn: String, targetArn: String, messageFormat: String = null): TopicRuleSns = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, targetArn = targetArn)
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat)
    __obj.asInstanceOf[TopicRuleSns]
  }
}

