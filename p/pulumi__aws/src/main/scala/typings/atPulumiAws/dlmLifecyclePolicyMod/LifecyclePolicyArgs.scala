package typings.atPulumiAws.dlmLifecyclePolicyMod

import typings.atPulumiAws.typesInputMod.dlmNs.LifecyclePolicyPolicyDetails
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyArgs extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: Input[String]
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: Input[String]
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: Input[LifecyclePolicyPolicyDetails]
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.undefined
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(
    description: Input[String],
    executionRoleArn: Input[String],
    policyDetails: Input[LifecyclePolicyPolicyDetails],
    state: Input[String] = null
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], policyDetails = policyDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

