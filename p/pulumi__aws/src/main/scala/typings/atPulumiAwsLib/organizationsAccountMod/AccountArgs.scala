package typings
package atPulumiAwsLib.organizationsAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountArgs extends js.Object {
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
    */
  val email: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
    */
  val iamUserAccessToBilling: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A friendly name for the member account.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account.
    */
  val roleName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object AccountArgs {
  @scala.inline
  def apply(
    email: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    iamUserAccessToBilling: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    roleName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): AccountArgs = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (iamUserAccessToBilling != null) __obj.updateDynamic("iamUserAccessToBilling")(iamUserAccessToBilling.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountArgs]
  }
}

