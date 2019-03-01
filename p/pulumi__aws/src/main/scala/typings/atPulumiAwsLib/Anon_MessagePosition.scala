package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessagePosition extends js.Object {
  var message: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var sender: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var smtpReplyCode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var statusCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_MessagePosition {
  @scala.inline
  def apply(
    message: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    position: atPulumiPulumiLib.outputMod.Input[scala.Double],
    sender: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    smtpReplyCode: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_MessagePosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.updateDynamic("smtpReplyCode")(smtpReplyCode.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessagePosition]
  }
}

