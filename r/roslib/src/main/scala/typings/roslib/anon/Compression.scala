package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compression extends js.Object {
  var compression: js.UndefOr[String] = js.undefined
  var latch: js.UndefOr[Boolean] = js.undefined
  var messageType: String
  var name: String
  var queue_length: js.UndefOr[Double] = js.undefined
  var queue_size: js.UndefOr[Double] = js.undefined
  var ros: typings.roslib.mod.Ros
  var throttle_rate: js.UndefOr[Double] = js.undefined
}

object Compression {
  @scala.inline
  def apply(
    messageType: String,
    name: String,
    ros: typings.roslib.mod.Ros,
    compression: String = null,
    latch: js.UndefOr[Boolean] = js.undefined,
    queue_length: js.UndefOr[Double] = js.undefined,
    queue_size: js.UndefOr[Double] = js.undefined,
    throttle_rate: js.UndefOr[Double] = js.undefined
  ): Compression = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(latch)) __obj.updateDynamic("latch")(latch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queue_length)) __obj.updateDynamic("queue_length")(queue_length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queue_size)) __obj.updateDynamic("queue_size")(queue_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle_rate)) __obj.updateDynamic("throttle_rate")(throttle_rate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
}

