package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var client: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var ns: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[redisLib.redisMod.ClientOpts] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    client: redisLib.redisMod.RedisClient = null,
    host: java.lang.String = null,
    ns: java.lang.String = null,
    options: redisLib.redisMod.ClientOpts = null,
    port: scala.Int | scala.Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (host != null) __obj.updateDynamic("host")(host)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (options != null) __obj.updateDynamic("options")(options)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

