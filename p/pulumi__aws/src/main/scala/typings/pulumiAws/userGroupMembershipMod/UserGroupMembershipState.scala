package typings.pulumiAws.userGroupMembershipMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserGroupMembershipState extends js.Object {
  
  /**
    * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
    */
  val groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
    */
  val user: js.UndefOr[Input[String]] = js.native
}
object UserGroupMembershipState {
  
  @scala.inline
  def apply(): UserGroupMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupMembershipState]
  }
  
  @scala.inline
  implicit class UserGroupMembershipStateOps[Self <: UserGroupMembershipState] (val x: Self) extends AnyVal {
    
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
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
