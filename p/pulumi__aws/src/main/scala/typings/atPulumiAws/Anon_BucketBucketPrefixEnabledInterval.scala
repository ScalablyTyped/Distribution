package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketBucketPrefixEnabledInterval extends js.Object {
  var bucket: Input[String]
  var bucketPrefix: js.UndefOr[Input[String]] = js.undefined
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var interval: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_BucketBucketPrefixEnabledInterval {
  @scala.inline
  def apply(
    bucket: Input[String],
    bucketPrefix: Input[String] = null,
    enabled: Input[Boolean] = null,
    interval: Input[Double] = null
  ): Anon_BucketBucketPrefixEnabledInterval = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketBucketPrefixEnabledInterval]
  }
}

