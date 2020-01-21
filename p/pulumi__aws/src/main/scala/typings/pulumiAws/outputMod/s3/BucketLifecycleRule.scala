package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRule extends js.Object {
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Double] = js.native
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Boolean = js.native
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[BucketLifecycleRuleExpiration] = js.native
  /**
    * Unique identifier for the rule.
    */
  var id: String = js.native
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[BucketLifecycleRuleNoncurrentVersionExpiration] = js.native
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[js.Array[BucketLifecycleRuleNoncurrentVersionTransition]] = js.native
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[js.Array[BucketLifecycleRuleTransition]] = js.native
}

object BucketLifecycleRule {
  @scala.inline
  def apply(
    enabled: Boolean,
    id: String,
    abortIncompleteMultipartUploadDays: Int | Double = null,
    expiration: BucketLifecycleRuleExpiration = null,
    noncurrentVersionExpiration: BucketLifecycleRuleNoncurrentVersionExpiration = null,
    noncurrentVersionTransitions: js.Array[BucketLifecycleRuleNoncurrentVersionTransition] = null,
    prefix: String = null,
    tags: StringDictionary[js.Any] = null,
    transitions: js.Array[BucketLifecycleRuleTransition] = null
  ): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (abortIncompleteMultipartUploadDays != null) __obj.updateDynamic("abortIncompleteMultipartUploadDays")(abortIncompleteMultipartUploadDays.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (noncurrentVersionExpiration != null) __obj.updateDynamic("noncurrentVersionExpiration")(noncurrentVersionExpiration.asInstanceOf[js.Any])
    if (noncurrentVersionTransitions != null) __obj.updateDynamic("noncurrentVersionTransitions")(noncurrentVersionTransitions.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
}

