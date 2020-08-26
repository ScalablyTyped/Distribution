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
  /**
    * The text of the policy.
    */
  val policy: Input[String | PolicyDocument] = js.native
}

object BucketPolicyArgs {
  @scala.inline
  def apply(bucket: Input[String], policy: Input[String | PolicyDocument]): BucketPolicyArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicyArgs]
  }
  @scala.inline
  implicit class BucketPolicyArgsOps[Self <: BucketPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
  
}

