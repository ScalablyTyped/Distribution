package typings.atPulumiAws.iamUserGroupMembershipMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGroupMembershipState extends js.Object {
  /**
    * A list of [IAM Groups][1] to add the user to
    */
  val groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the [IAM User][2] to add to groups
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object UserGroupMembershipState {
  @scala.inline
  def apply(groups: Input[js.Array[Input[String]]] = null, user: Input[String] = null): UserGroupMembershipState = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupMembershipState]
  }
}

