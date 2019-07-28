package typings.atPulumiAws.iamPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamGroupMod.Group
import typings.atPulumiAws.iamRoleMod.Role
import typings.atPulumiAws.iamUserMod.User
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentArgs extends js.Object {
  /**
    * The group(s) the policy should be applied to
    */
  val groups: js.UndefOr[Input[js.Array[Input[Group]]]] = js.undefined
  /**
    * The name of the attachment. This cannot be an empty string.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN]
  /**
    * The role(s) the policy should be applied to
    */
  val roles: js.UndefOr[Input[js.Array[Input[Role]]]] = js.undefined
  /**
    * The user(s) the policy should be applied to
    */
  val users: js.UndefOr[Input[js.Array[Input[User]]]] = js.undefined
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(
    policyArn: Input[ARN],
    groups: Input[js.Array[Input[Group]]] = null,
    name: Input[String] = null,
    roles: Input[js.Array[Input[Role]]] = null,
    users: Input[js.Array[Input[User]]] = null
  ): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

