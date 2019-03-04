package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketBucketPrefixEnabled extends js.Object {
  var bucket: java.lang.String
  var bucketPrefix: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BucketBucketPrefixEnabled {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    bucketPrefix: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null
  ): Anon_BucketBucketPrefixEnabled = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketBucketPrefixEnabled]
  }
}

