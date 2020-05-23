package typings.rsmqWorker.mod

import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
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
    customExceedCheck: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any => Boolean = null,
    defaultDelay: js.UndefOr[Double] = js.undefined,
    host: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    invisibletime: js.UndefOr[Double] = js.undefined,
    maxReceiveCount: js.UndefOr[Double] = js.undefined,
    options: ClientOpts = null,
    port: js.UndefOr[Double] = js.undefined,
    redis: RedisClient = null,
    redisPrefix: String = null,
    rsmq: Client = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (customExceedCheck != null) __obj.updateDynamic("customExceedCheck")(js.Any.fromFunction1(customExceedCheck))
    if (!js.isUndefined(defaultDelay)) __obj.updateDynamic("defaultDelay")(defaultDelay.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invisibletime)) __obj.updateDynamic("invisibletime")(invisibletime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceiveCount)) __obj.updateDynamic("maxReceiveCount")(maxReceiveCount.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis.asInstanceOf[js.Any])
    if (redisPrefix != null) __obj.updateDynamic("redisPrefix")(redisPrefix.asInstanceOf[js.Any])
    if (rsmq != null) __obj.updateDynamic("rsmq")(rsmq.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

