package typings.atPulumiAws.s3GetBucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketObjectArgs extends js.Object {
  /**
    * The name of the bucket to read the object from
    */
  val bucket: String
  /**
    * The full path to the object inside the bucket
    */
  val key: String
  val range: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Specific version ID of the object returned (defaults to latest version)
    */
  val versionId: js.UndefOr[String] = js.undefined
}

object GetBucketObjectArgs {
  @scala.inline
  def apply(
    bucket: String,
    key: String,
    range: String = null,
    tags: StringDictionary[js.Any] = null,
    versionId: String = null
  ): GetBucketObjectArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket, key = key)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[GetBucketObjectArgs]
  }
}

