package typings.pulumiAws.userProfileMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileArgs extends js.Object {
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
  val sshUsername: Input[String] = js.native
  /**
    * The user's IAM ARN
    */
  val userArn: Input[String] = js.native
}

object UserProfileArgs {
  @scala.inline
  def apply(sshUsername: Input[String], userArn: Input[String]): UserProfileArgs = {
    val __obj = js.Dynamic.literal(sshUsername = sshUsername.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileArgs]
  }
  @scala.inline
  implicit class UserProfileArgsOps[Self <: UserProfileArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSshUsername(value: Input[String]): Self = this.set("sshUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserArn(value: Input[String]): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowSelfManagement(value: Input[Boolean]): Self = this.set("allowSelfManagement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelfManagement: Self = this.set("allowSelfManagement", js.undefined)
    @scala.inline
    def setSshPublicKey(value: Input[String]): Self = this.set("sshPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKey: Self = this.set("sshPublicKey", js.undefined)
  }
  
}

