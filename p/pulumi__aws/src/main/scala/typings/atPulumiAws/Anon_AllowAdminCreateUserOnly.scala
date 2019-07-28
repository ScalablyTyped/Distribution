package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowAdminCreateUserOnly extends js.Object {
  var allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.undefined
  var inviteMessageTemplate: js.UndefOr[Anon_EmailMessage] = js.undefined
  var unusedAccountValidityDays: js.UndefOr[Double] = js.undefined
}

object Anon_AllowAdminCreateUserOnly {
  @scala.inline
  def apply(
    allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.undefined,
    inviteMessageTemplate: Anon_EmailMessage = null,
    unusedAccountValidityDays: Int | Double = null
  ): Anon_AllowAdminCreateUserOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdminCreateUserOnly)) __obj.updateDynamic("allowAdminCreateUserOnly")(allowAdminCreateUserOnly)
    if (inviteMessageTemplate != null) __obj.updateDynamic("inviteMessageTemplate")(inviteMessageTemplate)
    if (unusedAccountValidityDays != null) __obj.updateDynamic("unusedAccountValidityDays")(unusedAccountValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowAdminCreateUserOnly]
  }
}

