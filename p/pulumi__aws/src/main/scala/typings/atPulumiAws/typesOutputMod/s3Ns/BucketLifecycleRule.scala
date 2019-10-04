package typings.atPulumiAws.typesOutputMod.s3Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleRule extends js.Object {
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Double] = js.undefined
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Boolean
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[BucketLifecycleRuleExpiration] = js.undefined
  /**
    * Unique identifier for the rule.
    */
  var id: String
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[BucketLifecycleRuleNoncurrentVersionExpiration] = js.undefined
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[js.Array[BucketLifecycleRuleNoncurrentVersionTransition]] = js.undefined
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[js.Array[BucketLifecycleRuleTransition]] = js.undefined
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
    val __obj = js.Dynamic.literal(enabled = enabled, id = id)
    if (abortIncompleteMultipartUploadDays != null) __obj.updateDynamic("abortIncompleteMultipartUploadDays")(abortIncompleteMultipartUploadDays.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (noncurrentVersionExpiration != null) __obj.updateDynamic("noncurrentVersionExpiration")(noncurrentVersionExpiration)
    if (noncurrentVersionTransitions != null) __obj.updateDynamic("noncurrentVersionTransitions")(noncurrentVersionTransitions)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[BucketLifecycleRule]
  }
}

