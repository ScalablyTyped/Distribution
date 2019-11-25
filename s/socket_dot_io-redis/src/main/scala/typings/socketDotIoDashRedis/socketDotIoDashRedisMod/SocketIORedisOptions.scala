package typings.socketDotIoDashRedis.socketDotIoDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options to pass to the redis server when creating it
	 */
trait SocketIORedisOptions extends js.Object {
  /**
    * The optional password to connect to redis on
    */
  var auth_pass: js.UndefOr[Double | String] = js.undefined
  /**
  		 * The optional host to connect to redis on
  		 * @default localhost
  		 */
  var host: js.UndefOr[String] = js.undefined
  /**
  		 * The optional name of the key to pub/sub events on as prefix
  		 * @default socket.io
  		 */
  var key: js.UndefOr[String] = js.undefined
  /**
  		 * The optional port to connect to redis on
  		 * @default 6379
  		 */
  var port: js.UndefOr[Double] = js.undefined
  /**
  		 * The optional redis client to publish events on
  		 */
  var pubClient: js.UndefOr[js.Any] = js.undefined
  /**
  		 * The optional redis client to subscribe to events on
  		 */
  var subClient: js.UndefOr[js.Any] = js.undefined
}

object SocketIORedisOptions {
  @scala.inline
  def apply(
    auth_pass: Double | String = null,
    host: String = null,
    key: String = null,
    port: Int | Double = null,
    pubClient: js.Any = null,
    subClient: js.Any = null
  ): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (pubClient != null) __obj.updateDynamic("pubClient")(pubClient.asInstanceOf[js.Any])
    if (subClient != null) __obj.updateDynamic("subClient")(subClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketIORedisOptions]
  }
}

