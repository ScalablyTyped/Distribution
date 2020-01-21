package typings.pulumiAws.rolePolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.roleMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePolicyState extends js.Object {
  /**
    * The name of the role policy. If omitted, this provider will
    * assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * The IAM role to attach to the policy.
    */
  val role: js.UndefOr[Input[String | Role]] = js.native
}

object RolePolicyState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    policy: Input[String | PolicyDocument] = null,
    role: Input[String | Role] = null
  ): RolePolicyState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyState]
  }
}

