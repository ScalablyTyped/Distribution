package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailMessage extends js.Object {
  var emailMessage: js.UndefOr[java.lang.String] = js.undefined
  var emailSubject: js.UndefOr[java.lang.String] = js.undefined
  var smsMessage: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EmailMessage {
  @scala.inline
  def apply(
    emailMessage: java.lang.String = null,
    emailSubject: java.lang.String = null,
    smsMessage: java.lang.String = null
  ): Anon_EmailMessage = {
    val __obj = js.Dynamic.literal()
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage)
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject)
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage)
    __obj.asInstanceOf[Anon_EmailMessage]
  }
}

