package typings.atPulumiAws.s3BucketPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicyState extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
}

object BucketPolicyState {
  @scala.inline
  def apply(bucket: Input[String] = null, policy: Input[String | PolicyDocument] = null): BucketPolicyState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicyState]
  }
}

