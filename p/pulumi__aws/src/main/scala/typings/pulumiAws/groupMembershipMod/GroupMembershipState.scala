package typings.pulumiAws.groupMembershipMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMembershipState extends js.Object {
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: js.UndefOr[Input[String]] = js.native
  /**
    * The name to identify the Group Membership
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object GroupMembershipState {
  @scala.inline
  def apply(): GroupMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMembershipState]
  }
  @scala.inline
  implicit class GroupMembershipStateOps[Self <: GroupMembershipState] (val x: Self) extends AnyVal {
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
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUsersVarargs(value: Input[String]*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: Input[js.Array[Input[String]]]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

