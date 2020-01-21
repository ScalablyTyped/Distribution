package typings.pulumiAws.bucketMetricMod

import typings.pulumiAws.inputMod.s3.BucketMetricFilter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketMetricArgs extends js.Object {
  /**
    * The name of the bucket to put metric configuration.
    */
  val bucket: Input[String] = js.native
  /**
    * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
    */
  val filter: js.UndefOr[Input[BucketMetricFilter]] = js.native
  /**
    * Unique identifier of the metrics configuration for the bucket.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object BucketMetricArgs {
  @scala.inline
  def apply(bucket: Input[String], filter: Input[BucketMetricFilter] = null, name: Input[String] = null): BucketMetricArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketMetricArgs]
  }
}

