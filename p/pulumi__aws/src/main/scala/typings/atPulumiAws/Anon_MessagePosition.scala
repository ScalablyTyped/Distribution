package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessagePosition extends js.Object {
  var message: Input[String]
  var position: Input[Double]
  var sender: Input[String]
  var smtpReplyCode: Input[String]
  var statusCode: js.UndefOr[Input[String]] = js.undefined
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_MessagePosition {
  @scala.inline
  def apply(
    message: Input[String],
    position: Input[Double],
    sender: Input[String],
    smtpReplyCode: Input[String],
    statusCode: Input[String] = null,
    topicArn: Input[String] = null
  ): Anon_MessagePosition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessagePosition]
  }
}

