package typings
package atPulumiAwsLib.iamUserGroupMembershipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGroupMembershipState extends js.Object {
  /**
    * A list of [IAM Groups][1] to add the user to
    */
  val groups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the [IAM User][2] to add to groups
    */
  val user: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object UserGroupMembershipState {
  @scala.inline
  def apply(
    groups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    user: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): UserGroupMembershipState = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupMembershipState]
  }
}

