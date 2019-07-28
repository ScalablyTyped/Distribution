package typings.atPulumiAws.s3BucketPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketPolicyArgs extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: Input[String]
  val policy: Input[String | PolicyDocument]
}

object BucketPolicyArgs {
  @scala.inline
  def apply(bucket: Input[String], policy: Input[String | PolicyDocument]): BucketPolicyArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketPolicyArgs]
  }
}

