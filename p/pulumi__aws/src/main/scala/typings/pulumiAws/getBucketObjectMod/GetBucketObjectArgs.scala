package typings.pulumiAws.getBucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketObjectArgs extends js.Object {
  /**
    * The name of the bucket to read the object from
    */
  val bucket: String = js.native
  /**
    * The full path to the object inside the bucket
    */
  val key: String = js.native
  val range: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Specific version ID of the object returned (defaults to latest version)
    */
  val versionId: js.UndefOr[String] = js.native
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
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketObjectArgs]
  }
}

