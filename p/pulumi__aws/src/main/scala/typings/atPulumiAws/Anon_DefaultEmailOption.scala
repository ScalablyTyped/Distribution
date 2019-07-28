package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultEmailOption extends js.Object {
  var defaultEmailOption: js.UndefOr[String] = js.undefined
  var emailMessage: String
  var emailMessageByLink: String
  var emailSubject: String
  var emailSubjectByLink: String
  var smsMessage: String
}

object Anon_DefaultEmailOption {
  @scala.inline
  def apply(
    emailMessage: String,
    emailMessageByLink: String,
    emailSubject: String,
    emailSubjectByLink: String,
    smsMessage: String,
    defaultEmailOption: String = null
  ): Anon_DefaultEmailOption = {
    val __obj = js.Dynamic.literal(emailMessage = emailMessage, emailMessageByLink = emailMessageByLink, emailSubject = emailSubject, emailSubjectByLink = emailSubjectByLink, smsMessage = smsMessage)
    if (defaultEmailOption != null) __obj.updateDynamic("defaultEmailOption")(defaultEmailOption)
    __obj.asInstanceOf[Anon_DefaultEmailOption]
  }
}

