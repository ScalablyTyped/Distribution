package typings.pulumiAws.getBucketObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketObjectsArgs extends js.Object {
  /**
    * Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
    */
  val bucket: String = js.native
  /**
    * A character used to group keys (Default: none)
    */
  val delimiter: js.UndefOr[String] = js.native
  /**
    * Encodes keys using this method (Default: none; besides none, only "url" can be used)
    */
  val encodingType: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether to populate the owner list (Default: false)
    */
  val fetchOwner: js.UndefOr[Boolean] = js.native
  /**
    * Maximum object keys to return (Default: 1000)
    */
  val maxKeys: js.UndefOr[Double] = js.native
  /**
    * Limits results to object keys with this prefix (Default: none)
    */
  val prefix: js.UndefOr[String] = js.native
  /**
    * Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
    */
  val startAfter: js.UndefOr[String] = js.native
}

object GetBucketObjectsArgs {
  @scala.inline
  def apply(
    bucket: String,
    delimiter: String = null,
    encodingType: String = null,
    fetchOwner: js.UndefOr[Boolean] = js.undefined,
    maxKeys: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    startAfter: String = null
  ): GetBucketObjectsArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchOwner)) __obj.updateDynamic("fetchOwner")(fetchOwner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxKeys)) __obj.updateDynamic("maxKeys")(maxKeys.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketObjectsArgs]
  }
}

