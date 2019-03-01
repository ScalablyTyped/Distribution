package typings
package rsmqDashWorkerLib.rsmqDashWorkerMod.RSMQWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
  var customExceedCheck: js.UndefOr[CustomExceedCheckCallback] = js.undefined
  var defaultDelay: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var invisibletime: js.UndefOr[scala.Double] = js.undefined
  var maxReceiveCount: js.UndefOr[scala.Double] = js.undefined
  var options: js.UndefOr[redisLib.redisMod.ClientOpts] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var redis: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var redisPrefix: js.UndefOr[java.lang.String] = js.undefined
  var rsmq: js.UndefOr[rsmqLib.rsmqMod.Client] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autostart: js.UndefOr[scala.Boolean] = js.undefined,
    customExceedCheck: CustomExceedCheckCallback = null,
    defaultDelay: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    invisibletime: scala.Int | scala.Double = null,
    maxReceiveCount: scala.Int | scala.Double = null,
    options: redisLib.redisMod.ClientOpts = null,
    port: scala.Int | scala.Double = null,
    redis: redisLib.redisMod.RedisClient = null,
    redisPrefix: java.lang.String = null,
    rsmq: rsmqLib.rsmqMod.Client = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (customExceedCheck != null) __obj.updateDynamic("customExceedCheck")(customExceedCheck)
    if (defaultDelay != null) __obj.updateDynamic("defaultDelay")(defaultDelay.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (invisibletime != null) __obj.updateDynamic("invisibletime")(invisibletime.asInstanceOf[js.Any])
    if (maxReceiveCount != null) __obj.updateDynamic("maxReceiveCount")(maxReceiveCount.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis)
    if (redisPrefix != null) __obj.updateDynamic("redisPrefix")(redisPrefix)
    if (rsmq != null) __obj.updateDynamic("rsmq")(rsmq)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

