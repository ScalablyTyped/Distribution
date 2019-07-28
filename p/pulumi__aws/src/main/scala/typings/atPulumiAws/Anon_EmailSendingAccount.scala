package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailSendingAccount extends js.Object {
  var emailSendingAccount: js.UndefOr[String] = js.undefined
  var replyToEmailAddress: js.UndefOr[String] = js.undefined
  var sourceArn: js.UndefOr[String] = js.undefined
}

object Anon_EmailSendingAccount {
  @scala.inline
  def apply(emailSendingAccount: String = null, replyToEmailAddress: String = null, sourceArn: String = null): Anon_EmailSendingAccount = {
    val __obj = js.Dynamic.literal()
    if (emailSendingAccount != null) __obj.updateDynamic("emailSendingAccount")(emailSendingAccount)
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress)
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn)
    __obj.asInstanceOf[Anon_EmailSendingAccount]
  }
}

