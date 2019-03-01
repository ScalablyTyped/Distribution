package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: java.lang.String
  var position: scala.Double
  var sender: java.lang.String
  var smtpReplyCode: java.lang.String
  var statusCode: js.UndefOr[java.lang.String] = js.undefined
  var topicArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: java.lang.String,
    position: scala.Double,
    sender: java.lang.String,
    smtpReplyCode: java.lang.String,
    statusCode: java.lang.String = null,
    topicArn: java.lang.String = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("smtpReplyCode")(smtpReplyCode)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_Message]
  }
}

