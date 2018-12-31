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
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string. For more information about building IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html)
    */
  val policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  /**
    * The IAM role to attach to the policy.
    */
  val role: atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iamRoleMod.Role]
}

