package typings.atPulumiAws.typesOutputMod.sesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleBounceAction extends js.Object {
  /**
    * The message to send
    */
  var message: String
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
  /**
    * The email address of the sender
    */
  var sender: String
  /**
    * The RFC 5321 SMTP reply code
    */
  var smtpReplyCode: String
  /**
    * The RFC 3463 SMTP enhanced status code
    */
  var statusCode: js.UndefOr[String] = js.undefined
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(message = message, position = position, sender = sender, smtpReplyCode = smtpReplyCode)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[ReceiptRuleBounceAction]
  }
}

