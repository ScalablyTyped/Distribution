package typings.atPulumiAws.opsworksPermissionMod

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(
    userArn: Input[String],
    allowSsh: Input[Boolean] = null,
    allowSudo: Input[Boolean] = null,
    level: Input[String] = null,
    stackId: Input[String] = null
  ): PermissionArgs = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    if (allowSsh != null) __obj.updateDynamic("allowSsh")(allowSsh.asInstanceOf[js.Any])
    if (allowSudo != null) __obj.updateDynamic("allowSudo")(allowSudo.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionArgs]
  }
}

