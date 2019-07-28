package typings.atPulumiAws.iamGroupMembershipMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMembershipState extends js.Object {
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name to identify the Group Membership
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object GroupMembershipState {
  @scala.inline
  def apply(
    group: Input[String] = null,
    name: Input[String] = null,
    users: Input[js.Array[Input[String]]] = null
  ): GroupMembershipState = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembershipState]
  }
}

