package typings
package atPulumiAwsLib.cognitoUserGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGroupArgs extends js.Object {
  /**
    * The description of the user group.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the user group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The precedence of the user group.
    */
  val precedence: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN of the IAM role to be associated with the user group.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The user pool ID.
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object UserGroupArgs {
  @scala.inline
  def apply(
    userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    precedence: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): UserGroupArgs = {
    val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (precedence != null) __obj.updateDynamic("precedence")(precedence.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupArgs]
  }
}

