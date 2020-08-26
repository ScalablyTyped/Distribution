package typings.pulumiAws.opsworksPermissionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionArgs extends js.Object {
  /**
    * Whether the user is allowed to use SSH to communicate with the instance
    */
  val allowSsh: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether the user is allowed to use sudo to elevate privileges
    */
  val allowSudo: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
    */
  val level: js.UndefOr[Input[String]] = js.native
  /**
    * The stack to set the permissions for
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * The user's IAM ARN to set permissions for
    */
  val userArn: Input[String] = js.native
}

object PermissionArgs {
  @scala.inline
  def apply(userArn: Input[String]): PermissionArgs = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionArgs]
  }
  @scala.inline
  implicit class PermissionArgsOps[Self <: PermissionArgs] (val x: Self) extends AnyVal {
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
    def setUserArn(value: Input[String]): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowSsh(value: Input[Boolean]): Self = this.set("allowSsh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSsh: Self = this.set("allowSsh", js.undefined)
    @scala.inline
    def setAllowSudo(value: Input[Boolean]): Self = this.set("allowSudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSudo: Self = this.set("allowSudo", js.undefined)
    @scala.inline
    def setLevel(value: Input[String]): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setStackId(value: Input[String]): Self = this.set("stackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
  }
  
}

