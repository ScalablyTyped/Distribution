package typings.atPulumiAws.s3GetBucketObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketObjectsResult extends js.Object {
  val bucket: String = js.native
  /**
    * List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
    */
  val commonPrefixes: js.Array[String] = js.native
  val delimiter: js.UndefOr[String] = js.native
  val encodingType: js.UndefOr[String] = js.native
  val fetchOwner: js.UndefOr[Boolean] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * List of strings representing object keys
    */
  val keys: js.Array[String] = js.native
  val maxKeys: js.UndefOr[Double] = js.native
  /**
    * List of strings representing object owner IDs (see `fetchOwner` above)
    */
  val owners: js.Array[String] = js.native
  val prefix: js.UndefOr[String] = js.native
  val startAfter: js.UndefOr[String] = js.native
}

object GetBucketObjectsResult {
  @scala.inline
  def apply(
    bucket: String,
    commonPrefixes: js.Array[String],
    id: String,
    keys: js.Array[String],
    owners: js.Array[String],
    delimiter: String = null,
    encodingType: String = null,
    fetchOwner: js.UndefOr[Boolean] = js.undefined,
    maxKeys: Int | Double = null,
    prefix: String = null,
    startAfter: String = null
  ): GetBucketObjectsResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], commonPrefixes = commonPrefixes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchOwner)) __obj.updateDynamic("fetchOwner")(fetchOwner.asInstanceOf[js.Any])
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketObjectsResult]
  }
}

