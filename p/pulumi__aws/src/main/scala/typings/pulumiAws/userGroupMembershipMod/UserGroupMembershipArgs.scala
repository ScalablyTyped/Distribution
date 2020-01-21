package typings.pulumiAws.userGroupMembershipMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGroupMembershipArgs extends js.Object {
  /**
    * A list of [IAM Groups][1] to add the user to
    */
  val groups: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the [IAM User][2] to add to groups
    */
  val user: Input[String] = js.native
}

object UserGroupMembershipArgs {
  @scala.inline
  def apply(groups: Input[js.Array[Input[String]]], user: Input[String]): UserGroupMembershipArgs = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserGroupMembershipArgs]
  }
}

