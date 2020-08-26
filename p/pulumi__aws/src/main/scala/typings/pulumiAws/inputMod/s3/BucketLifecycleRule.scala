package typings.pulumiAws.inputMod.s3

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRule extends js.Object {
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies lifecycle rule status.
    */
  var enabled: Input[Boolean] = js.native
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[Input[BucketLifecycleRuleExpiration]] = js.native
  /**
    * Unique identifier for the rule.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[Input[BucketLifecycleRuleNoncurrentVersionExpiration]] = js.native
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]]] = js.native
  /**
    * Object key prefix identifying one or more objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies object tags key and value.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleTransition]]]] = js.native
}

object BucketLifecycleRule {
  @scala.inline
  def apply(enabled: Input[Boolean]): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
  @scala.inline
  implicit class BucketLifecycleRuleOps[Self <: BucketLifecycleRule] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbortIncompleteMultipartUploadDays(value: Input[Double]): Self = this.set("abortIncompleteMultipartUploadDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortIncompleteMultipartUploadDays: Self = this.set("abortIncompleteMultipartUploadDays", js.undefined)
    @scala.inline
    def setExpiration(value: Input[BucketLifecycleRuleExpiration]): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNoncurrentVersionExpiration(value: Input[BucketLifecycleRuleNoncurrentVersionExpiration]): Self = this.set("noncurrentVersionExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoncurrentVersionExpiration: Self = this.set("noncurrentVersionExpiration", js.undefined)
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: Input[BucketLifecycleRuleNoncurrentVersionTransition]*): Self = this.set("noncurrentVersionTransitions", js.Array(value :_*))
    @scala.inline
    def setNoncurrentVersionTransitions(value: Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]]): Self = this.set("noncurrentVersionTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoncurrentVersionTransitions: Self = this.set("noncurrentVersionTransitions", js.undefined)
    @scala.inline
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTransitionsVarargs(value: Input[BucketLifecycleRuleTransition]*): Self = this.set("transitions", js.Array(value :_*))
    @scala.inline
    def setTransitions(value: Input[js.Array[Input[BucketLifecycleRuleTransition]]]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
  
}

