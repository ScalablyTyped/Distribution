package typings
package atPulumiAwsLib.dlmLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyState extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * See the `policy_details` configuration block. Max of 1.
    */
  val policyDetails: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyResourceTypesSchedules]] = js.undefined
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LifecyclePolicyState {
  @scala.inline
  def apply(
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    executionRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyDetails: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyResourceTypesSchedules] = null,
    state: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn.asInstanceOf[js.Any])
    if (policyDetails != null) __obj.updateDynamic("policyDetails")(policyDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyState]
  }
}

