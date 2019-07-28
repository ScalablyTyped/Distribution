package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: String
  var position: Double
  var sender: String
  var smtpReplyCode: String
  var statusCode: js.UndefOr[String] = js.undefined
  var topicArn: js.UndefOr[String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: String,
    position: Double,
    sender: String,
    smtpReplyCode: String,
    statusCode: String = null,
    topicArn: String = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message, position = position, sender = sender, smtpReplyCode = smtpReplyCode)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_Message]
  }
}

