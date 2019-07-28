package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultEmailOptionEmailMessage extends js.Object {
  var defaultEmailOption: js.UndefOr[Input[String]] = js.undefined
  var emailMessage: js.UndefOr[Input[String]] = js.undefined
  var emailMessageByLink: js.UndefOr[Input[String]] = js.undefined
  var emailSubject: js.UndefOr[Input[String]] = js.undefined
  var emailSubjectByLink: js.UndefOr[Input[String]] = js.undefined
  var smsMessage: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DefaultEmailOptionEmailMessage {
  @scala.inline
  def apply(
    defaultEmailOption: Input[String] = null,
    emailMessage: Input[String] = null,
    emailMessageByLink: Input[String] = null,
    emailSubject: Input[String] = null,
    emailSubjectByLink: Input[String] = null,
    smsMessage: Input[String] = null
  ): Anon_DefaultEmailOptionEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (defaultEmailOption != null) __obj.updateDynamic("defaultEmailOption")(defaultEmailOption.asInstanceOf[js.Any])
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (emailMessageByLink != null) __obj.updateDynamic("emailMessageByLink")(emailMessageByLink.asInstanceOf[js.Any])
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject.asInstanceOf[js.Any])
    if (emailSubjectByLink != null) __obj.updateDynamic("emailSubjectByLink")(emailSubjectByLink.asInstanceOf[js.Any])
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultEmailOptionEmailMessage]
  }
}

