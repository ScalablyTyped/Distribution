package typings.atPulumiAws.sesIdentityPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPolicyArgs extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: Input[String]
  /**
    * Name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * JSON string of the policy.
    */
  val policy: Input[String]
}

object IdentityPolicyArgs {
  @scala.inline
  def apply(identity: Input[String], policy: Input[String], name: Input[String] = null): IdentityPolicyArgs = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPolicyArgs]
  }
}

