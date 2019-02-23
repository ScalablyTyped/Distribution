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

