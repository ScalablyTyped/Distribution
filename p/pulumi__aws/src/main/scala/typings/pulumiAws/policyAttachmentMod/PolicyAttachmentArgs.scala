package typings.pulumiAws.policyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Group
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.iamMod.User
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentArgs extends js.Object {
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
  val policyArn: Input[ARN] = js.native
  /**
    * The role(s) the policy should be applied to
    */
  val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.native
  /**
    * The user(s) the policy should be applied to
    */
  val users: js.UndefOr[Input[js.Array[Input[String | User]]]] = js.native
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(policyArn: Input[ARN]): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
  @scala.inline
  implicit class PolicyAttachmentArgsOps[Self <: PolicyAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setPolicyArn(value: Input[ARN]): Self = this.set("policyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: (Input[String | Group])*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: Input[js.Array[Input[String | Group]]]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRolesVarargs(value: (Input[String | Role])*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: Input[js.Array[Input[String | Role]]]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    @scala.inline
    def setUsersVarargs(value: (Input[String | User])*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: Input[js.Array[Input[String | User]]]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

