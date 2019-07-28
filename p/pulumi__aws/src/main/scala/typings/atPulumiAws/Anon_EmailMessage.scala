package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailMessage extends js.Object {
  var emailMessage: js.UndefOr[String] = js.undefined
  var emailSubject: js.UndefOr[String] = js.undefined
  var smsMessage: js.UndefOr[String] = js.undefined
}

object Anon_EmailMessage {
  @scala.inline
  def apply(emailMessage: String = null, emailSubject: String = null, smsMessage: String = null): Anon_EmailMessage = {
    val __obj = js.Dynamic.literal()
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage)
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject)
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage)
    __obj.asInstanceOf[Anon_EmailMessage]
  }
}

