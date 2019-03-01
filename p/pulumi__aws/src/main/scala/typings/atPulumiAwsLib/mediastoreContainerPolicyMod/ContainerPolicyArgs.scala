package typings
package atPulumiAwsLib.mediastoreContainerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerPolicyArgs extends js.Object {
  /**
    * The name of the container.
    */
  val containerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The contents of the policy. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ContainerPolicyArgs {
  @scala.inline
  def apply(
    containerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ContainerPolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPolicyArgs]
  }
}

