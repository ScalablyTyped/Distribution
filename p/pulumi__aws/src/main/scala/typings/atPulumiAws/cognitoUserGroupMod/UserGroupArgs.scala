package typings.atPulumiAws.cognitoUserGroupMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGroupArgs extends js.Object {
  /**
    * The description of the user group.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the user group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The precedence of the user group.
    */
  val precedence: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The ARN of the IAM role to be associated with the user group.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The user pool ID.
    */
  val userPoolId: Input[String]
}

object UserGroupArgs {
  @scala.inline
  def apply(
    userPoolId: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    precedence: Input[Double] = null,
    roleArn: Input[String] = null
  ): UserGroupArgs = {
    val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (precedence != null) __obj.updateDynamic("precedence")(precedence.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupArgs]
  }
}

