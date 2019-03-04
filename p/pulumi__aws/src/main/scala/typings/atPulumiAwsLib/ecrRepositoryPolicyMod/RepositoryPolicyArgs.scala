package typings
package atPulumiAwsLib.ecrRepositoryPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryPolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string. For more information about building IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html)
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Name of the repository to apply the policy.
    */
  val repository: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RepositoryPolicyArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    repository: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): RepositoryPolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepositoryPolicyArgs]
  }
}

