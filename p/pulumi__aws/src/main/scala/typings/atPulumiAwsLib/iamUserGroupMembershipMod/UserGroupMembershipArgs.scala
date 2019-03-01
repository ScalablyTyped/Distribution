package typings
package atPulumiAwsLib.iamUserGroupMembershipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGroupMembershipArgs extends js.Object {
  /**
    * A list of [IAM Groups][1] to add the user to
    */
  val groups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The name of the [IAM User][2] to add to groups
    */
  val user: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object UserGroupMembershipArgs {
  @scala.inline
  def apply(
    groups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    user: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): UserGroupMembershipArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupMembershipArgs]
  }
}

