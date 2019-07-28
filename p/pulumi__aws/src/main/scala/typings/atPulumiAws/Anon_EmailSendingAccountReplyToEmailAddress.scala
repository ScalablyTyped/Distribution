package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailSendingAccountReplyToEmailAddress extends js.Object {
  var emailSendingAccount: js.UndefOr[Input[String]] = js.undefined
  var replyToEmailAddress: js.UndefOr[Input[String]] = js.undefined
  var sourceArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EmailSendingAccountReplyToEmailAddress {
  @scala.inline
  def apply(
    emailSendingAccount: Input[String] = null,
    replyToEmailAddress: Input[String] = null,
    sourceArn: Input[String] = null
  ): Anon_EmailSendingAccountReplyToEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (emailSendingAccount != null) __obj.updateDynamic("emailSendingAccount")(emailSendingAccount.asInstanceOf[js.Any])
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress.asInstanceOf[js.Any])
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmailSendingAccountReplyToEmailAddress]
  }
}

