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
    * Boolean which indicates if this criteria is enabled.
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
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleTransition]]]] = js.native
}

object BucketLifecycleRule {
  @scala.inline
  def apply(
    enabled: Input[Boolean],
    abortIncompleteMultipartUploadDays: Input[Double] = null,
    expiration: Input[BucketLifecycleRuleExpiration] = null,
    id: Input[String] = null,
    noncurrentVersionExpiration: Input[BucketLifecycleRuleNoncurrentVersionExpiration] = null,
    noncurrentVersionTransitions: Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]] = null,
    prefix: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    transitions: Input[js.Array[Input[BucketLifecycleRuleTransition]]] = null
  ): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (abortIncompleteMultipartUploadDays != null) __obj.updateDynamic("abortIncompleteMultipartUploadDays")(abortIncompleteMultipartUploadDays.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (noncurrentVersionExpiration != null) __obj.updateDynamic("noncurrentVersionExpiration")(noncurrentVersionExpiration.asInstanceOf[js.Any])
    if (noncurrentVersionTransitions != null) __obj.updateDynamic("noncurrentVersionTransitions")(noncurrentVersionTransitions.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
}

