package typings.pulumiAws.bucketPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicyArgs extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: Input[String] = js.native
  val policy: Input[String | PolicyDocument] = js.native
}

object BucketPolicyArgs {
  @scala.inline
  def apply(bucket: Input[String], policy: Input[String | PolicyDocument]): BucketPolicyArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketPolicyArgs]
  }
}

