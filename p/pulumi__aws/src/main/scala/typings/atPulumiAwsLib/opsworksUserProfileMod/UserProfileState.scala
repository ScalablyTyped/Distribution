package typings
package atPulumiAwsLib.opsworksUserProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfileState extends js.Object {
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
  val sshUsername: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The user's IAM ARN
    */
  val userArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object UserProfileState {
  @scala.inline
  def apply(
    allowSelfManagement: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    sshPublicKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sshUsername: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    userArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): UserProfileState = {
    val __obj = js.Dynamic.literal()
    if (allowSelfManagement != null) __obj.updateDynamic("allowSelfManagement")(allowSelfManagement.asInstanceOf[js.Any])
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey.asInstanceOf[js.Any])
    if (sshUsername != null) __obj.updateDynamic("sshUsername")(sshUsername.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileState]
  }
}

