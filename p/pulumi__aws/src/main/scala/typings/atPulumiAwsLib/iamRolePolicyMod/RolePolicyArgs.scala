package typings
package atPulumiAwsLib.iamRolePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePolicyArgs extends js.Object {
  /**
    * The name of the role policy. If omitted, Terraform will
    * assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string. For more information about building IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html)
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  /**
    * The IAM role to attach to the policy.
    */
  val role: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamRoleMod.Role]
}

object RolePolicyArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument],
    role: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamRoleMod.Role],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RolePolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyArgs]
  }
}

