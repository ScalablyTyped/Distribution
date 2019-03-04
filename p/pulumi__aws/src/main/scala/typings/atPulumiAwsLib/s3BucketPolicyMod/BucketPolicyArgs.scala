package typings
package atPulumiAwsLib.s3BucketPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketPolicyArgs extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The text of the policy. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
}

object BucketPolicyArgs {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  ): BucketPolicyArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketPolicyArgs]
  }
}

