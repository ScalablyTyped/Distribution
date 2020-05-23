package typings.rsmq.mod

import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var client: js.UndefOr[RedisClient] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var ns: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[ClientOpts] = js.undefined
  var password: js.UndefOr[String] = js.undefined
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
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    realtime: js.UndefOr[Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

