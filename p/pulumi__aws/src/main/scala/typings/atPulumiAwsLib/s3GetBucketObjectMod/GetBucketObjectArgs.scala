package typings
package atPulumiAwsLib.s3GetBucketObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketObjectArgs extends js.Object {
  /**
    * The name of the bucket to read the object from
    */
  val bucket: java.lang.String
  /**
    * The full path to the object inside the bucket
    */
  val key: java.lang.String
  val range: js.UndefOr[java.lang.String] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Specific version ID of the object returned (defaults to latest version)
    */
  val versionId: js.UndefOr[java.lang.String] = js.undefined
}

object GetBucketObjectArgs {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    key: java.lang.String,
    range: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    versionId: java.lang.String = null
  ): GetBucketObjectArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket, key = key)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[GetBucketObjectArgs]
  }
}

