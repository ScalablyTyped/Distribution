package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketBucketPrefix extends js.Object {
  var bucket: String
  var bucketPrefix: String
  var enabled: Boolean
  var interval: Double
}

object Anon_BucketBucketPrefix {
  @scala.inline
  def apply(bucket: String, bucketPrefix: String, enabled: Boolean, interval: Double): Anon_BucketBucketPrefix = {
    val __obj = js.Dynamic.literal(bucket = bucket, bucketPrefix = bucketPrefix, enabled = enabled, interval = interval)
  
    __obj.asInstanceOf[Anon_BucketBucketPrefix]
  }
}

