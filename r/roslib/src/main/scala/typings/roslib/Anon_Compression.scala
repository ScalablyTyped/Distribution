package typings.roslib

import typings.roslib.roslibMod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compression extends js.Object {
  var compression: js.UndefOr[String] = js.undefined
  var latch: js.UndefOr[Boolean] = js.undefined
  var messageType: String
  var name: String
  var queue_length: js.UndefOr[Double] = js.undefined
  var queue_size: js.UndefOr[Double] = js.undefined
  var ros: Ros
  var throttle_rate: js.UndefOr[Double] = js.undefined
}

object Anon_Compression {
  @scala.inline
  def apply(
    messageType: String,
    name: String,
    ros: Ros,
    compression: String = null,
    latch: js.UndefOr[Boolean] = js.undefined,
    queue_length: Int | Double = null,
    queue_size: Int | Double = null,
    throttle_rate: Int | Double = null
  ): Anon_Compression = {
    val __obj = js.Dynamic.literal(messageType = messageType, name = name, ros = ros)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(latch)) __obj.updateDynamic("latch")(latch)
    if (queue_length != null) __obj.updateDynamic("queue_length")(queue_length.asInstanceOf[js.Any])
    if (queue_size != null) __obj.updateDynamic("queue_size")(queue_size.asInstanceOf[js.Any])
    if (throttle_rate != null) __obj.updateDynamic("throttle_rate")(throttle_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compression]
  }
}

