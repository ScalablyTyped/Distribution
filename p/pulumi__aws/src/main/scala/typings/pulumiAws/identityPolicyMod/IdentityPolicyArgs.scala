package typings.pulumiAws.identityPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPolicyArgs extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: Input[String] = js.native
  /**
    * Name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * JSON string of the policy.
    */
  val policy: Input[String] = js.native
}

object IdentityPolicyArgs {
  @scala.inline
  def apply(identity: Input[String], policy: Input[String], name: Input[String] = null): IdentityPolicyArgs = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPolicyArgs]
  }
}

