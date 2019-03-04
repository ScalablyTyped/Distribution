package typings
package atPulumiCloudLib.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketHandlerArgs extends js.Object {
  /**
    * The time (in ISO-8601 format) when the [put] or [delete] was completed.
    */
  var eventTime: java.lang.String
  /**
    * The key that was updated or deleted by the operation.
    */
  var key: java.lang.String
  /**
    * The size, in bytes, of the blob that was [put].
    */
  var size: scala.Double
}

object BucketHandlerArgs {
  @scala.inline
  def apply(eventTime: java.lang.String, key: java.lang.String, size: scala.Double): BucketHandlerArgs = {
    val __obj = js.Dynamic.literal(eventTime = eventTime, key = key, size = size)
  
    __obj.asInstanceOf[BucketHandlerArgs]
  }
}

