package typings.atPulumiAws.typesInputMod.sesNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleBounceAction extends js.Object {
  /**
    * The message to send
    */
  var message: Input[String]
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double]
  /**
    * The email address of the sender
    */
  var sender: Input[String]
  /**
    * The RFC 5321 SMTP reply code
    */
  var smtpReplyCode: Input[String]
  /**
    * The RFC 3463 SMTP enhanced status code
    */
  var statusCode: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object ReceiptRuleBounceAction {
  @scala.inline
  def apply(
    message: Input[String],
    position: Input[Double],
    sender: Input[String],
    smtpReplyCode: Input[String],
    statusCode: Input[String] = null,
    topicArn: Input[String] = null
  ): ReceiptRuleBounceAction = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleBounceAction]
  }
}

