package typings
package atPulumiAwsLib.snsTopicPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicPolicyArgs extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  val arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

