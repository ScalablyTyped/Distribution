package typings.atPulumiAws.s3GetBucketObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketObjectsResult extends js.Object {
  val bucket: String
  /**
    * List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
    */
  val commonPrefixes: js.Array[String]
  val delimiter: js.UndefOr[String] = js.undefined
  val encodingType: js.UndefOr[String] = js.undefined
  val fetchOwner: js.UndefOr[Boolean] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * List of strings representing object keys
    */
  val keys: js.Array[String]
  val maxKeys: js.UndefOr[Double] = js.undefined
  /**
    * List of strings representing object owner IDs (see `fetchOwner` above)
    */
  val owners: js.Array[String]
  val prefix: js.UndefOr[String] = js.undefined
  val startAfter: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(bucket = bucket, commonPrefixes = commonPrefixes, id = id, keys = keys, owners = owners)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType)
    if (!js.isUndefined(fetchOwner)) __obj.updateDynamic("fetchOwner")(fetchOwner)
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter)
    __obj.asInstanceOf[GetBucketObjectsResult]
  }
}

