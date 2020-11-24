package typings.pulumiAws.userGroupMembershipMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserGroupMembershipArgs extends js.Object {
  
  /**
    * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
    */
  val groups: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
    */
  val user: Input[String] = js.native
}
object UserGroupMembershipArgs {
  
  @scala.inline
  def apply(groups: Input[js.Array[Input[String]]], user: Input[String]): UserGroupMembershipArgs = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupMembershipArgs]
  }
  
  @scala.inline
  implicit class UserGroupMembershipArgsOps[Self <: UserGroupMembershipArgs] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: Input[String]*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: Input[js.Array[Input[String]]]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
