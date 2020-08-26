package typings.pulumiAws.bucketPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicyState extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The text of the policy.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
}

object BucketPolicyState {
  @scala.inline
  def apply(): BucketPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicyState]
  }
  @scala.inline
  implicit class BucketPolicyStateOps[Self <: BucketPolicyState] (val x: Self) extends AnyVal {
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
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

