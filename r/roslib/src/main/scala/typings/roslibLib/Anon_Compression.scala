package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compression extends js.Object {
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var latch: js.UndefOr[scala.Boolean] = js.undefined
  var messageType: java.lang.String
  var name: java.lang.String
  var queue_length: js.UndefOr[scala.Double] = js.undefined
  var queue_size: js.UndefOr[scala.Double] = js.undefined
  var ros: roslibLib.roslibMod.ROSLIBNs.Ros
  var throttle_rate: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Compression {
  @scala.inline
  def apply(
    messageType: java.lang.String,
    name: java.lang.String,
    ros: roslibLib.roslibMod.ROSLIBNs.Ros,
    compression: java.lang.String = null,
    latch: js.UndefOr[scala.Boolean] = js.undefined,
    queue_length: scala.Int | scala.Double = null,
    queue_size: scala.Int | scala.Double = null,
    throttle_rate: scala.Int | scala.Double = null
  ): Anon_Compression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ros")(ros)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(latch)) __obj.updateDynamic("latch")(latch)
    if (queue_length != null) __obj.updateDynamic("queue_length")(queue_length.asInstanceOf[js.Any])
    if (queue_size != null) __obj.updateDynamic("queue_size")(queue_size.asInstanceOf[js.Any])
    if (throttle_rate != null) __obj.updateDynamic("throttle_rate")(throttle_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compression]
  }
}

