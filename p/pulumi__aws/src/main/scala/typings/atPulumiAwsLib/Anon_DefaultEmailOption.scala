package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultEmailOption extends js.Object {
  var defaultEmailOption: js.UndefOr[java.lang.String] = js.undefined
  var emailMessage: java.lang.String
  var emailMessageByLink: java.lang.String
  var emailSubject: java.lang.String
  var emailSubjectByLink: java.lang.String
  var smsMessage: java.lang.String
}

object Anon_DefaultEmailOption {
  @scala.inline
  def apply(
    emailMessage: java.lang.String,
    emailMessageByLink: java.lang.String,
    emailSubject: java.lang.String,
    emailSubjectByLink: java.lang.String,
    smsMessage: java.lang.String,
    defaultEmailOption: java.lang.String = null
  ): Anon_DefaultEmailOption = {
    val __obj = js.Dynamic.literal(emailMessage = emailMessage, emailMessageByLink = emailMessageByLink, emailSubject = emailSubject, emailSubjectByLink = emailSubjectByLink, smsMessage = smsMessage)
    if (defaultEmailOption != null) __obj.updateDynamic("defaultEmailOption")(defaultEmailOption)
    __obj.asInstanceOf[Anon_DefaultEmailOption]
  }
}

