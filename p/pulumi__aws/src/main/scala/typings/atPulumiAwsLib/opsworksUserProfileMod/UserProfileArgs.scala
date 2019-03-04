package typings
package atPulumiAwsLib.opsworksUserProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfileArgs extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page
    */
  val allowSelfManagement: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The users public key
    */
  val sshPublicKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ssh username, with witch this user wants to log in
    */
  val sshUsername: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The user's IAM ARN
    */
  val userArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object UserProfileArgs {
  @scala.inline
  def apply(
    sshUsername: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowSelfManagement: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    sshPublicKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): UserProfileArgs = {
    val __obj = js.Dynamic.literal(sshUsername = sshUsername.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (allowSelfManagement != null) __obj.updateDynamic("allowSelfManagement")(allowSelfManagement.asInstanceOf[js.Any])
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileArgs]
  }
}

