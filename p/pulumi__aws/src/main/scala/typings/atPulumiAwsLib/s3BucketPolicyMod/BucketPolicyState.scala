package typings
package atPulumiAwsLib.s3BucketPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketPolicyState extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The text of the policy. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  ] = js.undefined
}

