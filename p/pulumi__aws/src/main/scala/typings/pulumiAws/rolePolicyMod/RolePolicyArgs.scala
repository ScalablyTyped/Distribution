package typings.pulumiAws.rolePolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.roleMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePolicyArgs extends js.Object {
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
  val policy: Input[String | PolicyDocument] = js.native
  /**
    * The IAM role to attach to the policy.
    */
  val role: Input[String | Role] = js.native
}

object RolePolicyArgs {
  @scala.inline
  def apply(
    policy: Input[String | PolicyDocument],
    role: Input[String | Role],
    name: Input[String] = null,
    namePrefix: Input[String] = null
  ): RolePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyArgs]
  }
}

