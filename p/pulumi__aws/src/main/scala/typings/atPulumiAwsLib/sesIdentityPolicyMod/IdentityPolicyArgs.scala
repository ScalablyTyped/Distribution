package typings
package atPulumiAwsLib.sesIdentityPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPolicyArgs extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Name of the policy.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object IdentityPolicyArgs {
  @scala.inline
  def apply(
    identity: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IdentityPolicyArgs = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPolicyArgs]
  }
}

