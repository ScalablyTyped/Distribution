package typings.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: js.UndefOr[Input[LifecyclePolicyPolicyDetails]] = js.native
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LifecyclePolicyState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    executionRoleArn: Input[String] = null,
    policyDetails: Input[LifecyclePolicyPolicyDetails] = null,
    state: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn.asInstanceOf[js.Any])
    if (policyDetails != null) __obj.updateDynamic("policyDetails")(policyDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyState]
  }
}

