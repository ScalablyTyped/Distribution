package typings
package atPulumiAwsLib.s3BucketMetricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketMetricState extends js.Object {
  /**
    * The name of the bucket to put metric configuration.
    */
  val bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
    */
  val filter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyPrefixTags]] = js.undefined
  /**
    * Unique identifier of the metrics configuration for the bucket.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

