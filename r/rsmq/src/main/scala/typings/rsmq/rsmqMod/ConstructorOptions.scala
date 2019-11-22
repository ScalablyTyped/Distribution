package typings.rsmq.rsmqMod

import typings.redis.redisMod.ClientOpts
import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var client: js.UndefOr[RedisClient] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var ns: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[ClientOpts] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    client: RedisClient = null,
    host: String = null,
    ns: String = null,
    options: ClientOpts = null,
    port: Int | Double = null,
    realtime: js.UndefOr[Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (host != null) __obj.updateDynamic("host")(host)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (options != null) __obj.updateDynamic("options")(options)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

