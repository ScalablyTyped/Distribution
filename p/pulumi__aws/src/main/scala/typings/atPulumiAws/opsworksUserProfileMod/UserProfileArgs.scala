package typings.atPulumiAws.opsworksUserProfileMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfileArgs extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page
    */
  val allowSelfManagement: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The users public key
    */
  val sshPublicKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ssh username, with witch this user wants to log in
    */
  val sshUsername: Input[String]
  /**
    * The user's IAM ARN
    */
  val userArn: Input[String]
}

object UserProfileArgs {
  @scala.inline
  def apply(
    sshUsername: Input[String],
    userArn: Input[String],
    allowSelfManagement: Input[Boolean] = null,
    sshPublicKey: Input[String] = null
  ): UserProfileArgs = {
    val __obj = js.Dynamic.literal(sshUsername = sshUsername.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (allowSelfManagement != null) __obj.updateDynamic("allowSelfManagement")(allowSelfManagement.asInstanceOf[js.Any])
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileArgs]
  }
}

