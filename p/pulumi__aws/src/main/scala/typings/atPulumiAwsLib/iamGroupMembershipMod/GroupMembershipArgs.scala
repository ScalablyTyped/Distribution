package typings
package atPulumiAwsLib.iamGroupMembershipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMembershipArgs extends js.Object {
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name to identify the Group Membership
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object GroupMembershipArgs {
  @scala.inline
  def apply(
    group: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    users: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): GroupMembershipArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembershipArgs]
  }
}

