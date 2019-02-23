package typings
package atPulumiAwsLib.iamUserPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyState extends js.Object {
  /**
    * The name of the policy. If omitted, Terraform will assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  ] = js.undefined
  /**
    * IAM user to which to attach this policy.
    */
  val user: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

