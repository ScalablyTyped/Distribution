package typings.atPulumiAws.dlmLifecyclePolicyMod

import typings.atPulumiAws.Anon_KeyResourceTypesSchedules
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyState extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: js.UndefOr[Input[Anon_KeyResourceTypesSchedules]] = js.undefined
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.undefined
}

object LifecyclePolicyState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    executionRoleArn: Input[String] = null,
    policyDetails: Input[Anon_KeyResourceTypesSchedules] = null,
    state: Input[String] = null
  ): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn.asInstanceOf[js.Any])
    if (policyDetails != null) __obj.updateDynamic("policyDetails")(policyDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyState]
  }
}

