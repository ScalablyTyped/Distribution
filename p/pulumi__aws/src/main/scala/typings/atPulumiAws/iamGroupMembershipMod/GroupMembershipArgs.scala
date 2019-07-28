package typings.atPulumiAws.iamGroupMembershipMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMembershipArgs extends js.Object {
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: Input[String]
  /**
    * The name to identify the Group Membership
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: Input[js.Array[Input[String]]]
}

object GroupMembershipArgs {
  @scala.inline
  def apply(group: Input[String], users: Input[js.Array[Input[String]]], name: Input[String] = null): GroupMembershipArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembershipArgs]
  }
}

