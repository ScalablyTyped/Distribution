package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultEmailOptionEmailMessage extends js.Object {
  var defaultEmailOption: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var emailMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var emailMessageByLink: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var emailSubject: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var emailSubjectByLink: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var smsMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DefaultEmailOptionEmailMessage {
  @scala.inline
  def apply(
    defaultEmailOption: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    emailMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    emailMessageByLink: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    emailSubject: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    emailSubjectByLink: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    smsMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

