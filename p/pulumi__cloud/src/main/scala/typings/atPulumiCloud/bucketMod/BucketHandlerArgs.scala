package typings.atPulumiCloud.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketHandlerArgs extends js.Object {
  /**
    * The time (in ISO-8601 format) when the [put] or [delete] was completed.
    */
  var eventTime: String
  /**
    * The key that was updated or deleted by the operation.
    */
  var key: String
  /**
    * The size, in bytes, of the blob that was [put].
    */
  var size: Double
}

object BucketHandlerArgs {
  @scala.inline
  def apply(eventTime: String, key: String, size: Double): BucketHandlerArgs = {
    val __obj = js.Dynamic.literal(eventTime = eventTime, key = key, size = size)
  
    __obj.asInstanceOf[BucketHandlerArgs]
  }
}

