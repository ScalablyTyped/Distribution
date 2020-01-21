package typings.pulumiAws.identityPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPolicyState extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
}

object IdentityPolicyState {
  @scala.inline
  def apply(identity: Input[String] = null, name: Input[String] = null, policy: Input[String] = null): IdentityPolicyState = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPolicyState]
  }
}

