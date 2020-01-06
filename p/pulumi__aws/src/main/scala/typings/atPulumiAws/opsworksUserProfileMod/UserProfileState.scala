package typings.atPulumiAws.opsworksUserProfileMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileState extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page
    */
  val allowSelfManagement: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The users public key
    */
  val sshPublicKey: js.UndefOr[Input[String]] = js.native
  /**
    * The ssh username, with witch this user wants to log in
    */
  val sshUsername: js.UndefOr[Input[String]] = js.native
  /**
    * The user's IAM ARN
    */
  val userArn: js.UndefOr[Input[String]] = js.native
}

object UserProfileState {
  @scala.inline
  def apply(
    allowSelfManagement: Input[Boolean] = null,
    sshPublicKey: Input[String] = null,
    sshUsername: Input[String] = null,
    userArn: Input[String] = null
  ): UserProfileState = {
    val __obj = js.Dynamic.literal()
    if (allowSelfManagement != null) __obj.updateDynamic("allowSelfManagement")(allowSelfManagement.asInstanceOf[js.Any])
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey.asInstanceOf[js.Any])
    if (sshUsername != null) __obj.updateDynamic("sshUsername")(sshUsername.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileState]
  }
}

