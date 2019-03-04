package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketBucketPrefix extends js.Object {
  var bucket: java.lang.String
  var bucketPrefix: java.lang.String
  var enabled: scala.Boolean
  var interval: scala.Double
}

object Anon_BucketBucketPrefix {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    bucketPrefix: java.lang.String,
    enabled: scala.Boolean,
    interval: scala.Double
  ): Anon_BucketBucketPrefix = {
    val __obj = js.Dynamic.literal(bucket = bucket, bucketPrefix = bucketPrefix, enabled = enabled, interval = interval)
  
    __obj.asInstanceOf[Anon_BucketBucketPrefix]
  }
}

