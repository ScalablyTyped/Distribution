package typings.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyArgs extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: Input[String] = js.native
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: Input[String] = js.native
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: Input[LifecyclePolicyPolicyDetails] = js.native
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(
    description: Input[String],
    executionRoleArn: Input[String],
    policyDetails: Input[LifecyclePolicyPolicyDetails],
    state: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], policyDetails = policyDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

