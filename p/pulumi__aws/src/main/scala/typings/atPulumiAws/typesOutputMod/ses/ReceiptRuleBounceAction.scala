package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleBounceAction extends js.Object {
  /**
    * The message to send
    */
  var message: String = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  /**
    * The email address of the sender
    */
  var sender: String = js.native
  /**
    * The RFC 5321 SMTP reply code
    */
  var smtpReplyCode: String = js.native
  /**
    * The RFC 3463 SMTP enhanced status code
    */
  var statusCode: js.UndefOr[String] = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}

object ReceiptRuleBounceAction {
  @scala.inline
  def apply(
    message: String,
    position: Double,
    sender: String,
    smtpReplyCode: String,
    statusCode: String = null,
    topicArn: String = null
  ): ReceiptRuleBounceAction = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleBounceAction]
  }
}

