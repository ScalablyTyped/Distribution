package typings.atPulumiAws.typesInputMod.iot

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleSqs extends js.Object {
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: Input[String]
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Input[Boolean]
}

object TopicRuleSqs {
  @scala.inline
  def apply(queueUrl: Input[String], roleArn: Input[String], useBase64: Input[Boolean]): TopicRuleSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicRuleSqs]
  }
}

