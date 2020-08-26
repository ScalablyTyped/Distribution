package typings.pulumiCloud.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketHandlerArgs extends js.Object {
  /**
    * The time (in ISO-8601 format) when the [put] or [delete] was completed.
    */
  var eventTime: String = js.native
  /**
    * The key that was updated or deleted by the operation.
    */
  var key: String = js.native
  /**
    * The size, in bytes, of the blob that was [put].
    */
  var size: Double = js.native
}

object BucketHandlerArgs {
  @scala.inline
  def apply(eventTime: String, key: String, size: Double): BucketHandlerArgs = {
    val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketHandlerArgs]
  }
  @scala.inline
  implicit class BucketHandlerArgsOps[Self <: BucketHandlerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

