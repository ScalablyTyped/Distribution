package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowAdminCreateUserOnlyInviteMessageTemplate extends js.Object {
  var allowAdminCreateUserOnly: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var inviteMessageTemplate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EmailMessageEmailSubject]] = js.undefined
  var unusedAccountValidityDays: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_AllowAdminCreateUserOnlyInviteMessageTemplate {
  @scala.inline
  def apply(
    allowAdminCreateUserOnly: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    inviteMessageTemplate: atPulumiPulumiLib.outputMod.Input[Anon_EmailMessageEmailSubject] = null,
    unusedAccountValidityDays: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_AllowAdminCreateUserOnlyInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (allowAdminCreateUserOnly != null) __obj.updateDynamic("allowAdminCreateUserOnly")(allowAdminCreateUserOnly.asInstanceOf[js.Any])
    if (inviteMessageTemplate != null) __obj.updateDynamic("inviteMessageTemplate")(inviteMessageTemplate.asInstanceOf[js.Any])
    if (unusedAccountValidityDays != null) __obj.updateDynamic("unusedAccountValidityDays")(unusedAccountValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowAdminCreateUserOnlyInviteMessageTemplate]
  }
}

