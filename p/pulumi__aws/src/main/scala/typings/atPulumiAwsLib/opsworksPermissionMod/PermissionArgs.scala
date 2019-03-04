package typings
package atPulumiAwsLib.opsworksPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionArgs extends js.Object {
  /**
    * Whether the user is allowed to use SSH to communicate with the instance
    */
  val allowSsh: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether the user is allowed to use sudo to elevate privileges
    */
  val allowSudo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
    */
  val level: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The stack to set the permissions for
    */
  val stackId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The user's IAM ARN to set permissions for
    */
  val userArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object PermissionArgs {
  @scala.inline
  def apply(
    userArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowSsh: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    allowSudo: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    level: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PermissionArgs = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    if (allowSsh != null) __obj.updateDynamic("allowSsh")(allowSsh.asInstanceOf[js.Any])
    if (allowSudo != null) __obj.updateDynamic("allowSudo")(allowSudo.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionArgs]
  }
}

