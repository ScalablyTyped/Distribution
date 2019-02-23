package typings
package atPulumiAwsLib.sqsQueuePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePolicyArgs extends js.Object {
  /**
    * The JSON policy for the SQS queue. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

