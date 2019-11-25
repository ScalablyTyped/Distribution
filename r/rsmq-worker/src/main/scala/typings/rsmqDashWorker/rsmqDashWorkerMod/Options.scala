package typings.rsmqDashWorker.rsmqDashWorkerMod

import typings.redis.redisMod.ClientOpts
import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autostart: js.UndefOr[Boolean] = js.undefined
  var customExceedCheck: js.UndefOr[CustomExceedCheckCallback] = js.undefined
  var defaultDelay: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var invisibletime: js.UndefOr[Double] = js.undefined
  var maxReceiveCount: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[ClientOpts] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var redis: js.UndefOr[RedisClient] = js.undefined
  var redisPrefix: js.UndefOr[String] = js.undefined
  var rsmq: js.UndefOr[Client] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autostart: js.UndefOr[Boolean] = js.undefined,
    customExceedCheck: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any => Boolean = null,
    defaultDelay: Int | Double = null,
    host: String = null,
    interval: Int | Double = null,
    invisibletime: Int | Double = null,
    maxReceiveCount: Int | Double = null,
    options: ClientOpts = null,
    port: Int | Double = null,
    redis: RedisClient = null,
    redisPrefix: String = null,
    rsmq: Client = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (customExceedCheck != null) __obj.updateDynamic("customExceedCheck")(js.Any.fromFunction1(customExceedCheck))
    if (defaultDelay != null) __obj.updateDynamic("defaultDelay")(defaultDelay.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (invisibletime != null) __obj.updateDynamic("invisibletime")(invisibletime.asInstanceOf[js.Any])
    if (maxReceiveCount != null) __obj.updateDynamic("maxReceiveCount")(maxReceiveCount.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis.asInstanceOf[js.Any])
    if (redisPrefix != null) __obj.updateDynamic("redisPrefix")(redisPrefix.asInstanceOf[js.Any])
    if (rsmq != null) __obj.updateDynamic("rsmq")(rsmq.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

