package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compression extends js.Object {
  var compression: js.UndefOr[java.lang.String] = js.native
  var latch: js.UndefOr[Boolean] = js.native
  var messageType: java.lang.String = js.native
  var name: java.lang.String = js.native
  var queue_length: js.UndefOr[Double] = js.native
  var queue_size: js.UndefOr[Double] = js.native
  var ros: typings.roslib.mod.Ros = js.native
  var throttle_rate: js.UndefOr[Double] = js.native
}

object Compression {
  @scala.inline
  def apply(messageType: java.lang.String, name: java.lang.String, ros: typings.roslib.mod.Ros): Compression = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessageType(value: java.lang.String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRos(value: typings.roslib.mod.Ros): Self = this.set("ros", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompression(value: java.lang.String): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setLatch(value: Boolean): Self = this.set("latch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatch: Self = this.set("latch", js.undefined)
    @scala.inline
    def setQueue_length(value: Double): Self = this.set("queue_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue_length: Self = this.set("queue_length", js.undefined)
    @scala.inline
    def setQueue_size(value: Double): Self = this.set("queue_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue_size: Self = this.set("queue_size", js.undefined)
    @scala.inline
    def setThrottle_rate(value: Double): Self = this.set("throttle_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle_rate: Self = this.set("throttle_rate", js.undefined)
  }
  
}

