package typings.pulumiAws.policyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamGroupMod.Group
import typings.pulumiAws.roleMod.Role
import typings.pulumiAws.userMod.User
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentState extends js.Object {
  /**
    * The group(s) the policy should be applied to
    */
  val groups: js.UndefOr[Input[js.Array[Input[String | Group]]]] = js.native
  /**
    * The name of the attachment. This cannot be an empty string.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * The role(s) the policy should be applied to
    */
  val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.native
  /**
    * The user(s) the policy should be applied to
    */
  val users: js.UndefOr[Input[js.Array[Input[String | User]]]] = js.native
}

object PolicyAttachmentState {
  @scala.inline
  def apply(
    groups: Input[js.Array[Input[String | Group]]] = null,
    name: Input[String] = null,
    policyArn: Input[ARN] = null,
    roles: Input[js.Array[Input[String | Role]]] = null,
    users: Input[js.Array[Input[String | User]]] = null
  ): PolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentState]
  }
}

