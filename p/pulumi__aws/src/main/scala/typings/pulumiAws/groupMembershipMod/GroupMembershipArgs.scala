package typings.pulumiAws.groupMembershipMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMembershipArgs extends js.Object {
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: Input[String] = js.native
  /**
    * The name to identify the Group Membership
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: Input[js.Array[Input[String]]] = js.native
}

object GroupMembershipArgs {
  @scala.inline
  def apply(group: Input[String], users: Input[js.Array[Input[String]]]): GroupMembershipArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembershipArgs]
  }
  @scala.inline
  implicit class GroupMembershipArgsOps[Self <: GroupMembershipArgs] (val x: Self) extends AnyVal {
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
    def setGroup(value: Input[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: Input[String]*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: Input[js.Array[Input[String]]]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

