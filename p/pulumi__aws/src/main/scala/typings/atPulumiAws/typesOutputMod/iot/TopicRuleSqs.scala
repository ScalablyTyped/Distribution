package typings.atPulumiAws.typesOutputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleSqs extends js.Object {
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: String
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Boolean
}

object TopicRuleSqs {
  @scala.inline
  def apply(queueUrl: String, roleArn: String, useBase64: Boolean): TopicRuleSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl, roleArn = roleArn, useBase64 = useBase64)
  
    __obj.asInstanceOf[TopicRuleSqs]
  }
}

