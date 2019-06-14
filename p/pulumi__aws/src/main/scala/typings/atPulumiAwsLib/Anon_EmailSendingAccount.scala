package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailSendingAccount extends js.Object {
  var emailSendingAccount: js.UndefOr[java.lang.String] = js.undefined
  var replyToEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  var sourceArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EmailSendingAccount {
  @scala.inline
  def apply(
    emailSendingAccount: java.lang.String = null,
    replyToEmailAddress: java.lang.String = null,
    sourceArn: java.lang.String = null
  ): Anon_EmailSendingAccount = {
    val __obj = js.Dynamic.literal()
    if (emailSendingAccount != null) __obj.updateDynamic("emailSendingAccount")(emailSendingAccount)
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress)
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn)
    __obj.asInstanceOf[Anon_EmailSendingAccount]
  }
}

