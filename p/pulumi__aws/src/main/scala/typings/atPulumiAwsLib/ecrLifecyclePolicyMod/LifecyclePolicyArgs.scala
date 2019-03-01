package typings
package atPulumiAwsLib.ecrLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. For more information about building IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Name of the repository to apply the policy.
    */
  val repository: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    repository: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

