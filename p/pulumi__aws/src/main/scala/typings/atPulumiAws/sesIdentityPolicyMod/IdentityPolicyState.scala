package typings.atPulumiAws.sesIdentityPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPolicyState extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * JSON string of the policy.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
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

