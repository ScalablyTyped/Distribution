package typings
package atPulumiAwsLib.iamPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentState extends js.Object {
  /**
    * The group(s) the policy should be applied to
    */
  val groups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamGroupMod.Group]]]
  ] = js.undefined
  /**
    * The name of the attachment. This cannot be an empty string.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The role(s) the policy should be applied to
    */
  val roles: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamRoleMod.Role]]]
  ] = js.undefined
  /**
    * The user(s) the policy should be applied to
    */
  val users: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamUserMod.User]]]
  ] = js.undefined
}

object PolicyAttachmentState {
  @scala.inline
  def apply(
    groups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamGroupMod.Group]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null,
    roles: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamRoleMod.Role]]] = null,
    users: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamUserMod.User]]] = null
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

